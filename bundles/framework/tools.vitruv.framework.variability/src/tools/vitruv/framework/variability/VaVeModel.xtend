package tools.vitruv.framework.variability

import tools.vitruv.framework.change.description.PropagatedChange
import java.util.List

interface VaVeModel {

	def public addVersion(List<PropagatedChange> propagatedChange) {
	}
	
	def public addVariationPoint(String variationpoint) {
	}
	
	def public addVariant(List<PropagatedChange> propagatedChange) {	
	}

}
	

