package tools.vitruv.dsls.reactions.codegen.typesbuilder

import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList
import org.eclipse.xtext.common.types.JvmTypeReference
import tools.vitruv.framework.userinteraction.UserInteracting
import tools.vitruv.dsls.mirbase.mirBase.NamedJavaElement
import tools.vitruv.dsls.reactions.reactionsLanguage.Trigger
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState
import org.eclipse.emf.ecore.EClass
import tools.vitruv.dsls.reactions.reactionsLanguage.inputTypes.InputTypesPackage
import tools.vitruv.framework.change.echange.EChange
import tools.vitruv.framework.util.command.ChangePropagationResult
import tools.vitruv.dsls.mirbase.mirBase.MetaclassReference
import static extension tools.vitruv.dsls.reactions.codegen.helper.ReactionsLanguageHelper.*;
import tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference
import tools.vitruv.dsls.reactions.reactionsLanguage.ConcreteModelChange
import static extension tools.vitruv.dsls.reactions.codegen.changetyperepresentation.ChangeTypeRepresentationExtractor.*
import tools.vitruv.dsls.reactions.codegen.helper.AccessibleElement

class ParameterGenerator {
	package static val CHANGE_PARAMETER_NAME = "change";
	package static val BLACKBOARD_PARAMETER_NAME = "blackboard";
	package static val TRANSFORMATION_RESULT_PARAMETER_NAME = "transformationResult";
	package static val USER_INTERACTING_PARAMETER_NAME = "userInteracting";
	package static val REACTION_EXECUTION_STATE_PARAMETER_NAME = "reactionExecutionState";
	
	protected final extension JvmTypeReferenceBuilder _typeReferenceBuilder;
	protected final extension JvmTypesBuilderWithoutAssociations _typesBuilder;	
	
	new (JvmTypeReferenceBuilder typeReferenceBuilder, JvmTypesBuilderWithoutAssociations typesBuilder) {
		_typeReferenceBuilder = typeReferenceBuilder;
		_typesBuilder = typesBuilder;
	}
	
	public def JvmFormalParameter generateModelElementParameter(EObject parameterContext, MetaclassReference metaclassReference, String elementName) {
		if (metaclassReference?.metaclass !== null) {
			return parameterContext.generateParameter(elementName, typeRef(metaclassReference.javaClassName))
		}	
		return null;
	}
	
	public def JvmFormalParameter generateReactionExecutionStateParameter(EObject parameterContext) {
		return generateParameter(parameterContext, REACTION_EXECUTION_STATE_PARAMETER_NAME, ReactionExecutionState);
	}
	
	public def JvmFormalParameter generateTransformationResultParameter(EObject parameterContext) {
		return generateParameter(parameterContext, TRANSFORMATION_RESULT_PARAMETER_NAME, ChangePropagationResult);
	}
	
	public def JvmFormalParameter generateUserInteractingParameter(EObject parameterContext) {
		return generateParameter(parameterContext, USER_INTERACTING_PARAMETER_NAME, UserInteracting);
	}
	
	public def generateParameter(EObject context, String parameterName, JvmTypeReference parameterType) {
		if (parameterType === null) {
			return null;
		}
		return context.toParameter(parameterName, parameterType);
	}

		
	public def generateParameterFromClasses(EObject context, String parameterName, Class<?> parameterClass, Iterable<String> typeParameterClasses) {
		return generateParameter(context, parameterName, parameterClass, typeParameterClasses);
	}
	
	public def generateParameter(EObject context, String parameterName, Class<?> parameterClass, String... typeParameterClassNames) {
		if (parameterClass === null) {
			return null;
		}
		val typeParameters = new ArrayList<JvmTypeReference>(typeParameterClassNames.size);
		for (typeParameterClassName : typeParameterClassNames.filter[!nullOrEmpty]) {
			typeParameters.add(typeRef(typeParameterClassName));
		}		
		val changeType = typeRef(parameterClass, typeParameters);
		return context.toParameter(parameterName, changeType);
	}
	
	public def Iterable<AccessibleElement> getInputElements(EObject contextObject, Iterable<NamedMetaclassReference> metaclassReferences, Iterable<NamedJavaElement> javaElements) {
		return metaclassReferences.map[new AccessibleElement(it.name, it.metaclass.mappedInstanceClassCanonicalName)]
			+ javaElements.map[new AccessibleElement(it.name, it.type.qualifiedName)];
	}
	
	public def Iterable<JvmFormalParameter> generateMethodInputParameters(EObject contextObject, Iterable<NamedMetaclassReference> metaclassReferences, Iterable<NamedJavaElement> javaElements) {
		return contextObject.getInputElements(metaclassReferences, javaElements).map[
			toParameter(contextObject, it.name, typeRef(it.fullyQualifiedType))
		];
	}
	
	private def getMappedInstanceClassCanonicalName(EClass eClass) {
		switch eClass {
			case InputTypesPackage.Literals.STRING: String.name
			case InputTypesPackage.Literals.INTEGER: Integer.name
			case InputTypesPackage.Literals.LONG: Long.name
			case InputTypesPackage.Literals.SHORT: Short.name
			case InputTypesPackage.Literals.BOOLEAN: Boolean.name
			case InputTypesPackage.Literals.CHARACTER: Character.name
			case InputTypesPackage.Literals.BYTE: Byte.name
			case InputTypesPackage.Literals.FLOAT: Float.name
			case InputTypesPackage.Literals.DOUBLE: Double.name
			default: eClass.javaClassName
		}
	}
	
	public def JvmFormalParameter generateUntypedChangeParameter(EObject parameterContext) {
		return parameterContext.generateParameter(CHANGE_PARAMETER_NAME, EChange);
	}
	
	public def JvmFormalParameter generateChangeParameter(EObject parameterContext, Trigger trigger) {
		val changeRepresentation = extractChangeTypeRepresentation(trigger);
		var Iterable<String> changeTypeParameters = new ArrayList<String>
		if (trigger instanceof ConcreteModelChange) {
			changeTypeParameters = changeRepresentation.genericTypeParameters	
		}
		val changeParameter = parameterContext.generateParameterFromClasses(CHANGE_PARAMETER_NAME, changeRepresentation.changeType, changeTypeParameters);
		if (changeParameter !== null) {
			return changeParameter;
		}
	}
}
							