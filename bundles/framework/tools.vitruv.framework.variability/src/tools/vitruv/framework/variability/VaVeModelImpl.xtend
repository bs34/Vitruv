package tools.vitruv.framework.variability

import tools.vitruv.framework.variability.System.System
import org.eclipse.emf.ecore.resource.Resource
import java.io.IOException
import tools.vitruv.framework.util.bridges.EcoreResourceBridge
import static extension tools.vitruv.framework.util.bridges.JavaBridge.*
import tools.vitruv.framework.variability.System.SystemFactory
import tools.vitruv.framework.change.description.VitruviusChange
import tools.vitruv.framework.variability.System.Variant
import tools.vitruv.framework.change.description.PropagatedChange
import java.util.List

class VaVeModelImpl implements VaVeModel {
	
	System root;
	Variant variant; // TODO: als konfiguration speichern

	new(Resource vaveResource) {
		root = loadVaVe(vaveResource)
	}
// VaVe ist dazu da rauszufinden, welche Änderungen man zurückrollen oder anwenden möchte in Abhängigkeit
// einer bestimmten Konfiguration
	def private System loadVaVe(Resource vaveResource) {
		try {
			vaveResource.load(null)
		} catch (IOException e) {
		  }
		var System system = EcoreResourceBridge::getResourceContentRootIfUnique(vaveResource)?.dynamicCast(System,
			"vave model")
		if (system === null) {
			system = SystemFactory::eINSTANCE.createSystem()
			vaveResource.getContents().add(system) // adding root to the vave model
		}
		return system
	}
	
	override public addVersion(List<PropagatedChange> propagatedChange) {
		val version = SystemFactory::eINSTANCE.createVersion
		variant.version += version
	}

}
