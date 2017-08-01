/**
 * generated by Xtext 2.12.0
 */
package tools.vitruv.dsls.mappings.mappingsLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tools.vitruv.dsls.mappings.mappingsLanguage.*;

import tools.vitruv.dsls.mirbase.mirBase.MirBaseFile;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.mappings.mappingsLanguage.MappingsLanguagePackage
 * @generated
 */
public class MappingsLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MappingsLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MappingsLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MappingsLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MappingsLanguagePackage.MAPPINGS_FILE:
      {
        MappingsFile mappingsFile = (MappingsFile)theEObject;
        T result = caseMappingsFile(mappingsFile);
        if (result == null) result = caseMirBaseFile(mappingsFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.MAPPINGS_SEGMENT:
      {
        MappingsSegment mappingsSegment = (MappingsSegment)theEObject;
        T result = caseMappingsSegment(mappingsSegment);
        if (result == null) result = caseDocumentable(mappingsSegment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.MAPPING:
      {
        Mapping mapping = (Mapping)theEObject;
        T result = caseMapping(mapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.DEPENDENCY:
      {
        Dependency dependency = (Dependency)theEObject;
        T result = caseDependency(dependency);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.SINGLE_SIDED_CONDITION:
      {
        SingleSidedCondition singleSidedCondition = (SingleSidedCondition)theEObject;
        T result = caseSingleSidedCondition(singleSidedCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.ENFORCEABLE_CONDITION:
      {
        EnforceableCondition enforceableCondition = (EnforceableCondition)theEObject;
        T result = caseEnforceableCondition(enforceableCondition);
        if (result == null) result = caseSingleSidedCondition(enforceableCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.FEATURE_CONDITION:
      {
        FeatureCondition featureCondition = (FeatureCondition)theEObject;
        T result = caseFeatureCondition(featureCondition);
        if (result == null) result = caseEnforceableCondition(featureCondition);
        if (result == null) result = caseSingleSidedCondition(featureCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.FEATURE_REFERENCE:
      {
        FeatureReference featureReference = (FeatureReference)theEObject;
        T result = caseFeatureReference(featureReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.DEPENDENT_FEATURE_REFERENCE:
      {
        DependentFeatureReference dependentFeatureReference = (DependentFeatureReference)theEObject;
        T result = caseDependentFeatureReference(dependentFeatureReference);
        if (result == null) result = caseFeatureReference(dependentFeatureReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.SINGLE_VALUE_CONDITION:
      {
        SingleValueCondition singleValueCondition = (SingleValueCondition)theEObject;
        T result = caseSingleValueCondition(singleValueCondition);
        if (result == null) result = caseFeatureCondition(singleValueCondition);
        if (result == null) result = caseEnforceableCondition(singleValueCondition);
        if (result == null) result = caseSingleSidedCondition(singleValueCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.VALUE_CONDITION:
      {
        ValueCondition valueCondition = (ValueCondition)theEObject;
        T result = caseValueCondition(valueCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.VALUE_EXPRESSION:
      {
        ValueExpression valueExpression = (ValueExpression)theEObject;
        T result = caseValueExpression(valueExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.INDEX_CONDITION:
      {
        IndexCondition indexCondition = (IndexCondition)theEObject;
        T result = caseIndexCondition(indexCondition);
        if (result == null) result = caseSingleValueCondition(indexCondition);
        if (result == null) result = caseFeatureCondition(indexCondition);
        if (result == null) result = caseEnforceableCondition(indexCondition);
        if (result == null) result = caseSingleSidedCondition(indexCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.NUM_COMPARE_CONDITION:
      {
        NumCompareCondition numCompareCondition = (NumCompareCondition)theEObject;
        T result = caseNumCompareCondition(numCompareCondition);
        if (result == null) result = caseSingleValueCondition(numCompareCondition);
        if (result == null) result = caseFeatureCondition(numCompareCondition);
        if (result == null) result = caseEnforceableCondition(numCompareCondition);
        if (result == null) result = caseSingleSidedCondition(numCompareCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.MULTI_VALUE_CONDITION:
      {
        MultiValueCondition multiValueCondition = (MultiValueCondition)theEObject;
        T result = caseMultiValueCondition(multiValueCondition);
        if (result == null) result = caseFeatureCondition(multiValueCondition);
        if (result == null) result = caseEnforceableCondition(multiValueCondition);
        if (result == null) result = caseSingleSidedCondition(multiValueCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.ELEMENT_CONDITION:
      {
        ElementCondition elementCondition = (ElementCondition)theEObject;
        T result = caseElementCondition(elementCondition);
        if (result == null) result = caseFeatureCondition(elementCondition);
        if (result == null) result = caseEnforceableCondition(elementCondition);
        if (result == null) result = caseSingleSidedCondition(elementCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.ELEMENT_EXPRESSION:
      {
        ElementExpression elementExpression = (ElementExpression)theEObject;
        T result = caseElementExpression(elementExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.NOT_EMPTY_CONDITION:
      {
        NotEmptyCondition notEmptyCondition = (NotEmptyCondition)theEObject;
        T result = caseNotEmptyCondition(notEmptyCondition);
        if (result == null) result = caseFeatureCondition(notEmptyCondition);
        if (result == null) result = caseEnforceableCondition(notEmptyCondition);
        if (result == null) result = caseSingleSidedCondition(notEmptyCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.RESOURCE_CONDITION:
      {
        ResourceCondition resourceCondition = (ResourceCondition)theEObject;
        T result = caseResourceCondition(resourceCondition);
        if (result == null) result = caseEnforceableCondition(resourceCondition);
        if (result == null) result = caseSingleSidedCondition(resourceCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.CHECK_AND_ENFORCE_CONDITION:
      {
        CheckAndEnforceCondition checkAndEnforceCondition = (CheckAndEnforceCondition)theEObject;
        T result = caseCheckAndEnforceCondition(checkAndEnforceCondition);
        if (result == null) result = caseSingleSidedCondition(checkAndEnforceCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.CHECK_EXPRESSION:
      {
        CheckExpression checkExpression = (CheckExpression)theEObject;
        T result = caseCheckExpression(checkExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.ENFORCE_EXPRESSION:
      {
        EnforceExpression enforceExpression = (EnforceExpression)theEObject;
        T result = caseEnforceExpression(enforceExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.BIDIRECTIONALIZABLE_CONDITION:
      {
        BidirectionalizableCondition bidirectionalizableCondition = (BidirectionalizableCondition)theEObject;
        T result = caseBidirectionalizableCondition(bidirectionalizableCondition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.BIDIRECTIONALIZABLE_EXPRESSION:
      {
        BidirectionalizableExpression bidirectionalizableExpression = (BidirectionalizableExpression)theEObject;
        T result = caseBidirectionalizableExpression(bidirectionalizableExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.UNIDIRECTIONAL_EXPRESSION:
      {
        UnidirectionalExpression unidirectionalExpression = (UnidirectionalExpression)theEObject;
        T result = caseUnidirectionalExpression(unidirectionalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.BOOTSTRAPPING:
      {
        Bootstrapping bootstrapping = (Bootstrapping)theEObject;
        T result = caseBootstrapping(bootstrapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.CODE_BLOCK:
      {
        CodeBlock codeBlock = (CodeBlock)theEObject;
        T result = caseCodeBlock(codeBlock);
        if (result == null) result = caseValueExpression(codeBlock);
        if (result == null) result = caseElementExpression(codeBlock);
        if (result == null) result = caseCheckExpression(codeBlock);
        if (result == null) result = caseEnforceExpression(codeBlock);
        if (result == null) result = caseBidirectionalizableExpression(codeBlock);
        if (result == null) result = caseUnidirectionalExpression(codeBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.DOCUMENTABLE:
      {
        Documentable documentable = (Documentable)theEObject;
        T result = caseDocumentable(documentable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MappingsLanguagePackage.METACLASS_FEATURE_REFERENCE:
      {
        MetaclassFeatureReference metaclassFeatureReference = (MetaclassFeatureReference)theEObject;
        T result = caseMetaclassFeatureReference(metaclassFeatureReference);
        if (result == null) result = caseFeatureReference(metaclassFeatureReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mappings File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mappings File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingsFile(MappingsFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mappings Segment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mappings Segment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMappingsSegment(MappingsSegment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapping(Mapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependency(Dependency object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Sided Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Sided Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleSidedCondition(SingleSidedCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enforceable Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enforceable Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnforceableCondition(EnforceableCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureCondition(FeatureCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureReference(FeatureReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dependent Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dependent Feature Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDependentFeatureReference(DependentFeatureReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Value Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Value Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleValueCondition(SingleValueCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueCondition(ValueCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueExpression(ValueExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Index Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Index Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndexCondition(IndexCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Num Compare Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Num Compare Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumCompareCondition(NumCompareCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Value Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Value Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiValueCondition(MultiValueCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementCondition(ElementCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementExpression(ElementExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Empty Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Empty Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotEmptyCondition(NotEmptyCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Resource Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Resource Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseResourceCondition(ResourceCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check And Enforce Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check And Enforce Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckAndEnforceCondition(CheckAndEnforceCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Check Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Check Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCheckExpression(CheckExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enforce Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enforce Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnforceExpression(EnforceExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bidirectionalizable Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bidirectionalizable Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBidirectionalizableCondition(BidirectionalizableCondition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bidirectionalizable Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bidirectionalizable Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBidirectionalizableExpression(BidirectionalizableExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unidirectional Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unidirectional Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnidirectionalExpression(UnidirectionalExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bootstrapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bootstrapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBootstrapping(Bootstrapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCodeBlock(CodeBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Documentable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Documentable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDocumentable(Documentable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Metaclass Feature Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Metaclass Feature Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMetaclassFeatureReference(MetaclassFeatureReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMirBaseFile(MirBaseFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MappingsLanguageSwitch
