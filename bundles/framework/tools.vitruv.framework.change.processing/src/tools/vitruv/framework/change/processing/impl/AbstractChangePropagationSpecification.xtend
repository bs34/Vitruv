package tools.vitruv.framework.change.processing.impl

import tools.vitruv.framework.userinteraction.UserInteracting
import tools.vitruv.framework.change.processing.ChangePropagationSpecification
import tools.vitruv.framework.domains.VitruvDomain
import tools.vitruv.framework.change.processing.ChangePropagationObserver
import java.util.List
import org.eclipse.emf.ecore.EObject

abstract class AbstractChangePropagationSpecification implements ChangePropagationSpecification {
	private val List<ChangePropagationObserver> propagationObserver;
	private var UserInteracting userInteracting;
	private var VitruvDomain sourceDomain;
	private var VitruvDomain targetDomain;
	
	new(VitruvDomain sourceDomain, VitruvDomain targetDomain) {
		setVitruvDomains(sourceDomain, targetDomain);
		this.propagationObserver = newArrayList();
	}
	
	protected def UserInteracting getUserInteracting() {
		return userInteracting;
	}
	
	private def setVitruvDomains(VitruvDomain sourceDomain, VitruvDomain targetDomain) {
		this.sourceDomain = sourceDomain;
		this.targetDomain = targetDomain;
	}
	
	override getSourceDomain() {
		return sourceDomain;
	}
	
	override getTargetDomain() {
		return targetDomain;
	}
	
	override setUserInteracting(UserInteracting userInteracting) {
		this.userInteracting = userInteracting;
	}
	
	override registerObserver(ChangePropagationObserver observer) {
		if (observer !== null) {
			this.propagationObserver += observer;
		}
	}

	override deregisterObserver(ChangePropagationObserver observer) {
		this.propagationObserver -= observer;
	}
	
	override notifyObjectCreated(EObject createdObject) {
		this.propagationObserver.forEach[it.objectCreated(createdObject)];
	}
	
}
