package inf.mit.bme.hu.research.cps.tosca.codegen

import org.open.oasis.docs.tosca.tosca.DocumentRoot
import org.open.oasis.docs.tosca.tosca.TRelationshipTemplate
import org.eclipse.emf.common.util.EList
import java.util.ArrayList
import java.util.Map
import java.util.HashMap

class CpsGenerator {
	DocumentRoot model

	new(DocumentRoot model) {
		this.model = model
	}

	def generateCps() {

		var serviceTemplate = model.definitions.serviceTemplate.get(0);
		var nodeTemplates = serviceTemplate.topologyTemplate.nodeTemplate;
		var relationshipTemplates = serviceTemplate.topologyTemplate.relationshipTemplate;
		var publishToTopics= new HashMap<String, ArrayList<String>>();
		var subscribeToTopics= new HashMap<String, ArrayList<String>>();

		collectConnections(relationshipTemplates, publishToTopics, subscribeToTopics);
		
		System.out.println(publishToTopics);
		System.out.println(subscribeToTopics);

	}

	def collectConnections(EList<TRelationshipTemplate> relationshipTemplates,
		Map<String, ArrayList<String>> publishToTopics, Map<String, ArrayList<String>> subscribeToTopics) {
		for (relationshipTemplate : relationshipTemplates) {

			var sourceElementId = relationshipTemplate.sourceElement.ref;
			var targetElementId = relationshipTemplate.targetElement.ref;

			if (relationshipTemplate.name.equals("PublishTo")) {

				if (!publishToTopics.containsKey(sourceElementId)) {
					publishToTopics.put(sourceElementId, new ArrayList<String>());
				}
				publishToTopics.get(sourceElementId).add(targetElementId);
			}
			if (relationshipTemplate.name.equals("SubscribeTo")) {

				if (!subscribeToTopics.containsKey(sourceElementId)) {
					subscribeToTopics.put(sourceElementId, new ArrayList<String>());
				}
				subscribeToTopics.get(sourceElementId).add(targetElementId);
			}
		}
	}

}
