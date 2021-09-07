package inf.mit.bme.hu.research.cps.tosca.codegen

import org.open.oasis.docs.tosca.tosca.DocumentRoot
import org.open.oasis.docs.tosca.tosca.TRelationshipTemplate
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import java.util.Map
import java.util.HashMap
import java.io.File
import org.open.oasis.docs.tosca.tosca.TNodeTemplate
import org.eclipse.core.resources.ResourcesPlugin
import java.nio.file.Paths
import java.nio.file.Files
import java.io.BufferedReader
import java.io.InputStreamReader

class CpsGenerator {
	DocumentRoot model

	new(DocumentRoot model) {
		this.model = model
	}

	def generateCps() {

		var serviceTemplate = model.definitions.serviceTemplate.get(0);
		var nodeTemplates = serviceTemplate.topologyTemplate.nodeTemplate;
		var relationshipTemplates = serviceTemplate.topologyTemplate.relationshipTemplate;

		var NodesOutputTopics = new HashMap<String, ArrayList<String>>();
		var NodesInputTopics = new HashMap<String, ArrayList<String>>();
		
		var IDLTopicPairs = new HashMap<String, ArrayList<String>>();
		var topicIDLPairs = new HashMap<String, String>();
			
		var allTopics = new ArrayList<String>();
		
		collectConnections(relationshipTemplates, NodesOutputTopics, NodesInputTopics, allTopics);
		
		collectIDLTopicPairs(IDLTopicPairs, topicIDLPairs, allTopics, nodeTemplates);

		for (nodeTemplate : nodeTemplates) {

			var nodeName = nodeTemplate.id;

			var outputTopics = NodesOutputTopics.get(nodeName);
			var inputTopics = NodesInputTopics.get(nodeName);

			if(outputTopics === null) outputTopics = new ArrayList<String>();
			if(inputTopics === null) inputTopics = new ArrayList<String>();

			if (nodeTemplate.type.localPart.equals("time_based_dds_app") || nodeTemplate.type.localPart.equals("event_based_dds_app")) {

				IDLTopicPairs = new HashMap<String, ArrayList<String>>();	

				// Generate subscriber classes
				for (topic : inputTopics) {
					CodeGeneratorHelper.createFile(model.eResource, topic + "_subscriber", "py", nodeName,
						createSubscriber(topic));

				}

				// Generate publisher classes
				for (topic : outputTopics) {
					CodeGeneratorHelper.createFile(model.eResource, topic + "_publisher", "py", nodeName,
						createPublisher(topic));
				}

				collectIDLTopicPairs(IDLTopicPairs, topicIDLPairs, inputTopics, nodeTemplates);
				collectIDLTopicPairs(IDLTopicPairs, topicIDLPairs, outputTopics, nodeTemplates);

				// Generate XML file
				CodeGeneratorHelper.createFile(model.eResource, "ParticipantDescriptor", "xml", nodeName,
					XMLBuilderHelper.createXML(nodeName, model.eResource, inputTopics, outputTopics, IDLTopicPairs));

				// Generate main.py
				CodeGeneratorHelper.createFile(model.eResource, "main", "py", nodeName,
					createDDSApp(nodeName, inputTopics, outputTopics));

				// Generate Dockerfile
				CodeGeneratorHelper.createFile(model.eResource, "Dockerfile", "", nodeName,
					generateDockerfile(inputTopics, outputTopics));

				// Generate Kubernetes deployment
				CodeGeneratorHelper.createFile(model.eResource, nodeName + "-deployment", "yaml", nodeName,
					generateKubernetesDeployment(nodeName));

				// Copy dds_threads.py
				CodeGeneratorHelper.copyDDSThreads(model.eResource, nodeName);

			}

		if (nodeTemplate.type.localPart.equals("fabric_client")) {

		  	var project = ResourcesPlugin.getWorkspace().getRoot().getProject(model.eResource.getURI().segment(1));

		 	var outputFolder = project.getFolder("output");
		  	var dstPath = outputFolder.getLocationURI().getPath().substring(1);

		  	var path = Paths.get(dstPath + "/" + nodeName);
		  	Files.createDirectories(path);

		  	var command = "yo fabric:client -- --name \""+nodeName+"\" --channel \"myChannel\" --networkConfigPath \"testconfig_path\" --identityPath \"test_identity_path\" --identity \"test_identity\" --pubContracts \""+outputTopics.toString()+"\" --subContracts \""+inputTopics.toString()+"\"";

		 	var builder = new ProcessBuilder("cmd.exe", "/c",
		  		command);
		  	builder = builder.directory(new File(path.toString()));
		 	builder.redirectErrorStream(true);
		  	var p = builder.start();
		  	var r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		  	var line = "";

		  	var run = true;

		  	while (run) {
		  		line = r.readLine();
		  		if (line == null) {
		  			run = false;
		 		}
		  		System.out.println(line);
		  	}

		 }
		}
		
		System.out.println(topicIDLPairs);
		System.out.println(allTopics);
		generateTopicContracts(allTopics, topicIDLPairs);

	}

	def generateTopicContracts(ArrayList<String> topics, HashMap<String, String> topicIDLPairs) {

		for (topic : topics) {
			var project = ResourcesPlugin.getWorkspace().getRoot().getProject(model.eResource.getURI().segment(1));
			var outputFolder = project.getFolder("output");
			var dstPath = outputFolder.getLocationURI().getPath().substring(1);

			var path = Paths.get(dstPath + "/" + topic);
			Files.createDirectories(path);

			var idlFolder = project.getFolder("idl");
			var idlPath = idlFolder.getLocationURI().getPath().substring(1);
			
			var idl = idlPath+"/"+topicIDLPairs.get(topic);

			var command = " yo fabric:contract -- --contractType default --language typescript --name " + topic +
				"-contract --version 0.0.1 --description \"Smart contract of " + topic +
				"\" --author \"Lengyel Nándor\" --license Apache-2.0 --asset \"" + topic + "\" --idl \"" + idl + "\"";
			var builder = new ProcessBuilder("cmd.exe", "/c", command);
			builder = builder.directory(new File(path.toString()));
			builder.redirectErrorStream(true);
			var p = builder.start();
			var r = new BufferedReader(new InputStreamReader(p.getInputStream()));
			var line = "";

			var run = true;

			while (run) {
				line = r.readLine();
				if (line == null) {
					run = false;
				}
				System.out.println(line);
			}
		}

	}

	def collectConnections(EList<TRelationshipTemplate> relationshipTemplates,
		Map<String, ArrayList<String>> NodesOutputTopics, Map<String, ArrayList<String>> NodesInputTopics, ArrayList<String> allTopic) {

		for (relationshipTemplate : relationshipTemplates) {

			var sourceElementId = relationshipTemplate.sourceElement.ref;
			var targetElementId = relationshipTemplate.targetElement.ref;

			if (relationshipTemplate.name.equals("PublishTo")) {

				if (!NodesOutputTopics.containsKey(sourceElementId)) {
					NodesOutputTopics.put(sourceElementId, new ArrayList<String>());
				}
				NodesOutputTopics.get(sourceElementId).add(targetElementId);
				if(!allTopic.contains(targetElementId))allTopic.add(targetElementId);
			}
			if (relationshipTemplate.name.equals("SubscribeTo")) {

				if (!NodesInputTopics.containsKey(sourceElementId)) {
					NodesInputTopics.put(sourceElementId, new ArrayList<String>());
				}
				NodesInputTopics.get(sourceElementId).add(targetElementId);
				if(!allTopic.contains(targetElementId))allTopic.add(targetElementId);
				
			}
		}
	}

	def collectIDLTopicPairs(Map<String, ArrayList<String>> IDLTopicPairs, Map<String, String> topicIDLPairs,
		ArrayList<String> topics, EList<TNodeTemplate> nodeTemplates) {
		for (nodeTemplate : nodeTemplates) {

			var nodeName = nodeTemplate.id;

			if (topics.contains(nodeName)) {
				var deploymentArtifacts = nodeTemplate.deploymentArtifacts.deploymentArtifact;
				for (deploymentArtifact : deploymentArtifacts) {

					var deploymentArtifactRef = deploymentArtifact.artifactRef.localPart.toString();

					if (!IDLTopicPairs.containsKey(deploymentArtifactRef)) {
						IDLTopicPairs.put(deploymentArtifactRef, new ArrayList<String>());
					}
					IDLTopicPairs.get(deploymentArtifactRef).add(nodeName);

					topicIDLPairs.put(nodeName, deploymentArtifactRef);
				}
			}
		}

	}

	def createDDSApp(String nodeName, ArrayList<String> inputTopics, ArrayList<String> outputTopics) {
		var importCounter = 0
		var threadCounter = 0

		'''		
			#!/usr/bin/python3
			«FOR topic : inputTopics»	
				import «topic»_subscriber as sub_«importCounter» 
				«{importCounter++; null}»
			«ENDFOR»
			«{importCounter = 0; null}»
			«FOR topic : outputTopics»	
				import «topic»_publisher as pub_«importCounter»
				«{importCounter++; null}»
			«ENDFOR»
			
			import rticonnextdds_connector as rti
			import threading, queue
			import os
			from time import sleep
			
			connector = rti.Connector("«nodeName»ParticipantLibrary::«nodeName»Participant", "ParticipantDescriptor.xml")
			lock = threading.RLock()
			
			q = queue.Queue()
			
			«FOR topic : inputTopics»	
				«topic»_sub_thread = sub_«threadCounter».«topic»Reader("«topic»", lock, connector, q)
				«topic»_sub_thread.start()
				«{threadCounter++; null}»
			«ENDFOR»
			«{threadCounter = 0; null}»
			«FOR topic : outputTopics»	
				«topic»_pub_thread = pub_«threadCounter».«topic»Writer("«topic»", lock, 100, connector, q)
				«topic»_pub_thread.start()
				«{threadCounter++; null}»
			«ENDFOR»
			
			while True:
				pass
		'''
	}

	def createPublisher(String topic) {
		'''	
			from dds_threads import WriterThread
			
			class «topic»Writer(WriterThread):
				def produce_data(self, output):
				
					# IMPORTANT: Implement logic here, i.e.:
					
					# if self.queue.qsize() >= 2:
					#	print("cache: ", self.cache)							
					#	output.instance.set_dictionary({"x":1,  "y":2})
					# 	print(self.topic_name + " data sent")
					# 	output.write()
		'''
	}

	def createSubscriber(String topic) {
		'''	
			from dds_threads import ReaderThread
			
			class «topic»Reader(ReaderThread):
				def process_data(self, sample):
					print(self.topic_name + " data received: ", sample.get_dictionary())
					sample_dict = sample.get_dictionary()
					self.queue.put({"«topic»":sample_dict})	
		'''
	}

	def generateDockerfile(ArrayList<String> inputTopics, ArrayList<String> outputTopics) {
		'''	
			FROM library/ubuntu:bionic
			ENV PYTHONUNBUFFERED=1
			«FOR topic : inputTopics»	
				ADD ./«topic»_subscriber.py «topic»_subscriber.py
			«ENDFOR»
			«FOR topic : outputTopics»	
				ADD ./«topic»_publisher.py «topic»_publisher.py
			«ENDFOR»
			ADD ./main.py main.py
			ADD ./ParticipantDescriptor.xml ParticipantDescriptor.xml
			ADD ./dds_threads.py dds_threads.py
			RUN apt -y update && \
			    apt -y upgrade && \
			    apt -y install python3-pip && \
			    pip3 install rticonnextdds_connector && \
			    chmod +x ./*.py
			CMD ["./main.py"]		
		'''
	}

	def generateKubernetesDeployment(String rawNodeName) {
		
		var nodeName = rawNodeName.replace("_","-");
		
		'''
			---
			apiVersion: "apps/v1"
			kind: "Deployment"
			metadata:
			  annotations: {}
			  labels:
			    app: "«nodeName»"
			  name: "«nodeName»"
			spec:
			  replicas: 1
			  selector:
			    matchLabels:
			      app: "«nodeName»"
			  template:
			    metadata:
			      annotations: {}
			      labels:
			        app: "«nodeName»"
			      name: "«nodeName»"
			    spec:
			      containers:
			      - env:
			        image: "«nodeName»:latest"
			        imagePullPolicy: "Never"
			        name: "«nodeName»"
			      nodeSelector: {}
		'''
	}

}
