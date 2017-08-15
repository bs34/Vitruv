/**
 */
package tools.vitruv.framework.change.echange.feature.single;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import tools.vitruv.framework.change.echange.AdditiveEChange;
import tools.vitruv.framework.change.echange.SubtractiveEChange;

import tools.vitruv.framework.change.echange.feature.UpdateSingleValuedFeatureEChange;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace Single Valued Feature EChange</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Abstract EChange which replaces a single valued attribute or reference.
 * <!-- end-model-doc -->
 *
 *
 * @see tools.vitruv.framework.change.echange.feature.single.SinglePackage#getReplaceSingleValuedFeatureEChange()
 * @model abstract="true" TBounds="org.eclipse.emf.ecore.EJavaObject"
 * @generated
 */
public interface ReplaceSingleValuedFeatureEChange<A extends EObject, F extends EStructuralFeature, T extends Object> extends UpdateSingleValuedFeatureEChange<A, F>, AdditiveEChange<T>, SubtractiveEChange<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The change don't replace the default value.
	 * @return The change don't replace the default value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='T _oldValue = this.getOldValue();\nF _affectedFeature = this.getAffectedFeature();\n&lt;%java.lang.Object%&gt; _defaultValue = _affectedFeature.getDefaultValue();\nboolean _equals = &lt;%java.util.Objects%&gt;.equals(_oldValue, _defaultValue);\nreturn (!_equals);'"
	 * @generated
	 */
	boolean isFromNonDefaultValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The change don't replaces a value with the default value.
	 * @return The change don't replaces a value with the default value.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='T _newValue = this.getNewValue();\nF _affectedFeature = this.getAffectedFeature();\n&lt;%java.lang.Object%&gt; _defaultValue = _affectedFeature.getDefaultValue();\nboolean _equals = &lt;%java.util.Objects%&gt;.equals(_newValue, _defaultValue);\nreturn (!_equals);'"
	 * @generated
	 */
	boolean isToNonDefaultValue();

} // ReplaceSingleValuedFeatureEChange
