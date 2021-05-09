package inf.mit.bme.hu.research.cps.tosca.codegen

import org.open.oasis.docs.tosca.tosca.DocumentRoot
import org.open.oasis.docs.tosca.tosca.TRelationshipTemplate
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import java.util.Map
import java.util.HashMap
import java.io.File
import org.open.oasis.docs.tosca.tosca.TNodeTemplate

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

		collectConnections(relationshipTemplates, NodesOutputTopics, NodesInputTopics);

		for (nodeTemplate : nodeTemplates) {

			var nodeName = nodeTemplate.id;

			if (nodeTemplate.type.localPart.equals("event_based_dds_app") || nodeTemplate.type.localPart.equals("time_based_dds_app") ) {

				var outputTopics = NodesOutputTopics.get(nodeName);
				var inputTopics = NodesInputTopics.get(nodeName);

				var IDLTopicPairs = new HashMap<String, ArrayList<String>>();

				if(outputTopics === null) outputTopics = new ArrayList<String>();
				if(inputTopics === null) inputTopics = new ArrayList<String>();

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

				collectIDLTopicPairs(IDLTopicPairs, inputTopics, nodeTemplates);
				collectIDLTopicPairs(IDLTopicPairs, outputTopics, nodeTemplates);
				
				// Generate Dockerfile
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
				
				//Cpoy dds_threads.py
				CodeGeneratorHelper.copyDDSThreads(model.eResource, nodeName);

			}

			if (nodeTemplate.type.localPart.equals("event_based_dds_app")) {
			}

		// var process = Runtime.getRuntime().exec("ping www.stackabuse.com')", null, new File("C:\\Users\\"));
		// CodeGeneratorHelper.printResults(process);
		}

	}

	def collectConnections(EList<TRelationshipTemplate> relationshipTemplates,
		Map<String, ArrayList<String>> NodesOutputTopics, Map<String, ArrayList<String>> NodesInputTopics) {

		for (relationshipTemplate : relationshipTemplates) {

			var sourceElementId = relationshipTemplate.sourceElement.ref;
			var targetElementId = relationshipTemplate.targetElement.ref;

			if (relationshipTemplate.name.equals("PublishTo")) {

				if (!NodesOutputTopics.containsKey(sourceElementId)) {
					NodesOutputTopics.put(sourceElementId, new ArrayList<String>());
				}
				NodesOutputTopics.get(sourceElementId).add(targetElementId);
			}
			if (relationshipTemplate.name.equals("SubscribeTo")) {

				if (!NodesInputTopics.containsKey(sourceElementId)) {
					NodesInputTopics.put(sourceElementId, new ArrayList<String>());
				}
				NodesInputTopics.get(sourceElementId).add(targetElementId);
			}
		}
	}

	def collectIDLTopicPairs(Map<String, ArrayList<String>> IDLTopicPairs, ArrayList<String> topics,
		EList<TNodeTemplate> nodeTemplates) {
		for (nodeTemplate : nodeTemplates) {

			var nodeName = nodeTemplate.id;

			if (topics.contains(nodeName)) {
				var deploymentArtifacts = nodeTemplate.deploymentArtifacts.deploymentArtifact;
				for (deploymentArtifact : deploymentArtifacts) {

					var deploymentArtifactRef = deploymentArtifact.artifactRef.localPart.toString();

					if (!IDLTopicPairs.containsKey(deploymentArtifactRef)) {
						IDLTopicPairs.put(deploymentArtifactRef, new ArrayList<String>());
					}
					// if (!IDLTopicPairs.values.contains(nodeName)) {
					IDLTopicPairs.get(deploymentArtifactRef).add(nodeName);
				// }
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
			import threading
			import os
			from time import sleep
			
			connector = rti.Connector("«nodeName»ParticipantLibrary::«nodeName»Participant", "ParticipantDescriptor.xml")
			lock = threading.RLock()
			
			«FOR topic : inputTopics»	
				«topic»_sub_thread = sub_«threadCounter».«topic»Reader("«topic»", lock, connector)
				«topic»_sub_thread.start()
				«{threadCounter++; null}»
			«ENDFOR»
			«{threadCounter = 0; null}»
			«FOR topic : outputTopics»	
				«topic»_pub_thread = pub_«threadCounter».«topic»Writer("«topic»", lock, connector)
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
					print(self.topic_name + " data sent")
					
		'''
	}

	def createSubscriber(String topic) {
		'''	
			from dds_threads import ReaderThread
			
			class «topic»Reader(ReaderThread):
			
				def process_data(self, sample):
					print(self.topic_name + " data received: ")
					print(sample.get_dictionary())
			
		'''
	}

	def generateDockerfile(ArrayList<String> inputTopics, ArrayList<String> outputTopics) {
		'''	
			FROM library/ubuntu:bionic
			«FOR topic : inputTopics»	
				ADD ./«topic»_subscriber.py 
			«ENDFOR»
			«FOR topic : outputTopics»	
				ADD ./«topic»_publisher.py
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

	def generateKubernetesDeployment(String nodeName) {
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
			        image: "«nodeName»:latest"
			        imagePullPolicy: "Never"
			        name: "«nodeName»"
			      nodeSelector: {}
		'''
	}

}
