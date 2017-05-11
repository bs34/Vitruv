/**
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package tools.vitruv.dsls.mirbase.mirBase.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tools.vitruv.dsls.mirbase.mirBase.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.mirbase.mirBase.MirBasePackage
 * @generated
 */
public class MirBaseAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MirBasePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MirBaseAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MirBasePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MirBaseSwitch<Adapter> modelSwitch =
    new MirBaseSwitch<Adapter>()
    {
      @Override
      public Adapter caseDummyEntryRule(DummyEntryRule object)
      {
        return createDummyEntryRuleAdapter();
      }
      @Override
      public Adapter caseMirBaseFile(MirBaseFile object)
      {
        return createMirBaseFileAdapter();
      }
      @Override
      public Adapter caseMetamodelImport(MetamodelImport object)
      {
        return createMetamodelImportAdapter();
      }
      @Override
      public Adapter caseNamedJavaElement(NamedJavaElement object)
      {
        return createNamedJavaElementAdapter();
      }
      @Override
      public Adapter caseMetaclassReference(MetaclassReference object)
      {
        return createMetaclassReferenceAdapter();
      }
      @Override
      public Adapter caseNamedMetaclassReference(NamedMetaclassReference object)
      {
        return createNamedMetaclassReferenceAdapter();
      }
      @Override
      public Adapter caseMetaclassFeatureReference(MetaclassFeatureReference object)
      {
        return createMetaclassFeatureReferenceAdapter();
      }
      @Override
      public Adapter caseMetaclassEAttributeReference(MetaclassEAttributeReference object)
      {
        return createMetaclassEAttributeReferenceAdapter();
      }
      @Override
      public Adapter caseMetaclassEReferenceReference(MetaclassEReferenceReference object)
      {
        return createMetaclassEReferenceReferenceAdapter();
      }
      @Override
      public Adapter caseMetamodelReference(MetamodelReference object)
      {
        return createMetamodelReferenceAdapter();
      }
      @Override
      public Adapter caseDomainReference(DomainReference object)
      {
        return createDomainReferenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.DummyEntryRule <em>Dummy Entry Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.DummyEntryRule
   * @generated
   */
  public Adapter createDummyEntryRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MirBaseFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MirBaseFile
   * @generated
   */
  public Adapter createMirBaseFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MetamodelImport <em>Metamodel Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MetamodelImport
   * @generated
   */
  public Adapter createMetamodelImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.NamedJavaElement <em>Named Java Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.NamedJavaElement
   * @generated
   */
  public Adapter createNamedJavaElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MetaclassReference <em>Metaclass Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MetaclassReference
   * @generated
   */
  public Adapter createMetaclassReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference <em>Named Metaclass Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference
   * @generated
   */
  public Adapter createNamedMetaclassReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MetaclassFeatureReference <em>Metaclass Feature Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MetaclassFeatureReference
   * @generated
   */
  public Adapter createMetaclassFeatureReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MetaclassEAttributeReference <em>Metaclass EAttribute Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MetaclassEAttributeReference
   * @generated
   */
  public Adapter createMetaclassEAttributeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MetaclassEReferenceReference <em>Metaclass EReference Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MetaclassEReferenceReference
   * @generated
   */
  public Adapter createMetaclassEReferenceReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.MetamodelReference <em>Metamodel Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.MetamodelReference
   * @generated
   */
  public Adapter createMetamodelReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tools.vitruv.dsls.mirbase.mirBase.DomainReference <em>Domain Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tools.vitruv.dsls.mirbase.mirBase.DomainReference
   * @generated
   */
  public Adapter createDomainReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MirBaseAdapterFactory
