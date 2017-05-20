package tools.vitruv.framework.change.processing

import java.util.Map
import java.util.List
import java.util.HashMap
import java.util.ArrayList
import tools.vitruv.framework.domains.VitruvDomain

class ChangePropagationSpecificationRepository implements ChangePropagationSpecificationProvider {
	var Map<VitruvDomain, List<ChangePropagationSpecification>> metamodelToPropagationSpecifications

	new() {
		metamodelToPropagationSpecifications = new HashMap<VitruvDomain, List<ChangePropagationSpecification>>
	}

	override List<ChangePropagationSpecification> getChangePropagationSpecifications(VitruvDomain sourceDomain) {
		val result = new ArrayList<ChangePropagationSpecification>
		if (metamodelToPropagationSpecifications.containsKey(sourceDomain)) {
			result.addAll(metamodelToPropagationSpecifications.get(sourceDomain))
		}
		result
	}

	def void putChangePropagationSpecification(ChangePropagationSpecification changePropagationSpecification) {
		val changedDomain = changePropagationSpecification.sourceDomain
		if (!metamodelToPropagationSpecifications.containsKey(changedDomain)) {
			metamodelToPropagationSpecifications.put(changedDomain, new ArrayList<ChangePropagationSpecification>)
		}
		val propagationSpecifications = metamodelToPropagationSpecifications.get(changedDomain)
		propagationSpecifications.add(changePropagationSpecification)
	}

	override iterator() {
		metamodelToPropagationSpecifications.values.flatten.toList.iterator
	}

}
