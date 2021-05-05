package inf.mit.bme.hu.research.cps.tosca.codegen

import org.open.oasis.docs.tosca.tosca.DocumentRoot

class CpsGenerator {
	DocumentRoot model

	new(DocumentRoot model) {
		this.model = model
	}

	def generateCps() {

		var serviceTemplate = model.definitions.serviceTemplate.get(0);

		for (nodeTemplate : serviceTemplate.topologyTemplate.nodeTemplate) {
			System.out.println(nodeTemplate.type +": " + nodeTemplate.name + "\n");
		}
	}
}
