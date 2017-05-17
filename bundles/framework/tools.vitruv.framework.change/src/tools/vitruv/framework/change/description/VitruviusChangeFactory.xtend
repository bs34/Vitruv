package tools.vitruv.framework.change.description

import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.change.ChangeDescription
import org.eclipse.emf.ecore.resource.Resource
import tools.vitruv.framework.change.description.impl.CompositeContainerChangeImpl
import tools.vitruv.framework.change.description.impl.CompositeTransactionalChangeImpl
import tools.vitruv.framework.change.description.impl.ConcreteChangeImpl
import tools.vitruv.framework.change.description.impl.EMFModelChangeImpl
import tools.vitruv.framework.change.description.impl.EmptyChangeImpl
import tools.vitruv.framework.change.echange.EChange
import tools.vitruv.framework.change.echange.TypeInferringCompoundEChangeFactory
import tools.vitruv.framework.util.datatypes.VURI

class VitruviusChangeFactory {
	static val logger = Logger::getLogger(VitruviusChangeFactory)
	static VitruviusChangeFactory instance

	enum FileChangeKind {
		Create,
		Delete
	}

	private new() {
	}

	static def VitruviusChangeFactory getInstance() {
		if (instance === null) {
			instance = new VitruviusChangeFactory
		}
		instance
	}

	/**
	 * Generates a change from the given {@link ChangeDescription}. This factory method has to be called when the model
	 * is in the state right before the change described by the recorded {@link ChangeDescription}.
	 */
	def TransactionalChange createEMFModelChange(ChangeDescription changeDescription, VURI vuri) {
		new EMFModelChangeImpl(changeDescription, vuri)
	}

	def ConcreteChange createConcreteChange(EChange change, VURI vuri) {
		new ConcreteChangeImpl(change, vuri)
	}

	def ConcreteChange createFileChange(FileChangeKind kind, Resource changedFileResource) {
		val vuri = VURI::getInstance(changedFileResource)
		val EChange eChange = if (kind == FileChangeKind::Create)
				generateFileCreateChange(changedFileResource)
			else
				generateFileDeleteChange(changedFileResource)
		new ConcreteChangeImpl(eChange, vuri)
	}

	def CompositeContainerChange createCompositeContainerChange() {
		new CompositeContainerChangeImpl
	}

	def CompositeTransactionalChange createCompositeTransactionalChange() {
		new CompositeTransactionalChangeImpl
	}

	def TransactionalChange createEmptyChange(VURI vuri) {
		new EmptyChangeImpl(vuri)
	}

	def CompositeContainerChange createCompositeChange(Iterable<? extends VitruviusChange> innerChanges) {
		val compositeChange = new CompositeContainerChangeImpl
		innerChanges.forEach[innerChange|compositeChange.addChange(innerChange)]
		compositeChange
	}

	private def EChange generateFileCreateChange(Resource resource) {
		var EObject rootElement = null
		var index = 0
		if (1 == resource.contents.size) {
			rootElement = resource.getContents.get(0)
		} else if (1 < resource.contents.size) {
			throw new RuntimeException(
				'''The requested model instance resource '«resource»' has to contain at most one 
				root element in order to be added to the VSUM without an explicit import!''')
		} else { // resource.contents.size == null --> no element in newModelInstance
			logger.info('''Empty model file created: «VURI::getInstance(resource)». 
			Propagation of 'root element created' not triggered.''')
			return null
		}
		TypeInferringCompoundEChangeFactory::instance.createCreateAndInsertRootChange(rootElement, resource, index)
	}

	private def EChange generateFileDeleteChange(Resource resource) {
		if (0 < resource.contents.size) {
			val index = 0
			val rootElement = resource.getContents.get(index)
			TypeInferringCompoundEChangeFactory::instance.createRemoveAndDeleteRootChange(rootElement, resource, index)
		} else {
			logger.info('''Deleted resource «VURI::getInstance(resource)» did not contain any EObject''')
			null
		}

	}
}
