/**
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package tools.vitruv.dsls.mirbase.mirBase.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import tools.vitruv.dsls.mirbase.mirBase.DomainReference;
import tools.vitruv.dsls.mirbase.mirBase.DummyEntryRule;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassEAttributeReference;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassEReferenceReference;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassFeatureReference;
import tools.vitruv.dsls.mirbase.mirBase.MetaclassReference;
import tools.vitruv.dsls.mirbase.mirBase.MetamodelImport;
import tools.vitruv.dsls.mirbase.mirBase.MetamodelReference;
import tools.vitruv.dsls.mirbase.mirBase.MirBaseFactory;
import tools.vitruv.dsls.mirbase.mirBase.MirBaseFile;
import tools.vitruv.dsls.mirbase.mirBase.MirBasePackage;
import tools.vitruv.dsls.mirbase.mirBase.NamedJavaElement;
import tools.vitruv.dsls.mirbase.mirBase.NamedMetaclassReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MirBasePackageImpl extends EPackageImpl implements MirBasePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dummyEntryRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mirBaseFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodelImportEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedJavaElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaclassReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedMetaclassReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaclassFeatureReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaclassEAttributeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metaclassEReferenceReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass metamodelReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainReferenceEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see tools.vitruv.dsls.mirbase.mirBase.MirBasePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MirBasePackageImpl()
  {
    super(eNS_URI, MirBaseFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MirBasePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MirBasePackage init()
  {
    if (isInited) return (MirBasePackage)EPackage.Registry.INSTANCE.getEPackage(MirBasePackage.eNS_URI);

    // Obtain or create and register package
    MirBasePackageImpl theMirBasePackage = (MirBasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MirBasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MirBasePackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMirBasePackage.createPackageContents();

    // Initialize created meta-data
    theMirBasePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMirBasePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MirBasePackage.eNS_URI, theMirBasePackage);
    return theMirBasePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDummyEntryRule()
  {
    return dummyEntryRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMirBaseFile()
  {
    return mirBaseFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMirBaseFile_MetamodelImports()
  {
    return (EReference)mirBaseFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetamodelImport()
  {
    return metamodelImportEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodelImport_Package()
  {
    return (EReference)metamodelImportEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetamodelImport_Name()
  {
    return (EAttribute)metamodelImportEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMetamodelImport_UseQualifiedNames()
  {
    return (EAttribute)metamodelImportEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedJavaElement()
  {
    return namedJavaElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamedJavaElement_Type()
  {
    return (EReference)namedJavaElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedJavaElement_Name()
  {
    return (EAttribute)namedJavaElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaclassReference()
  {
    return metaclassReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaclassReference_Metamodel()
  {
    return (EReference)metaclassReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaclassReference_Metaclass()
  {
    return (EReference)metaclassReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedMetaclassReference()
  {
    return namedMetaclassReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedMetaclassReference_Name()
  {
    return (EAttribute)namedMetaclassReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaclassFeatureReference()
  {
    return metaclassFeatureReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaclassFeatureReference_Feature()
  {
    return (EReference)metaclassFeatureReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaclassEAttributeReference()
  {
    return metaclassEAttributeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaclassEAttributeReference_Feature()
  {
    return (EReference)metaclassEAttributeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetaclassEReferenceReference()
  {
    return metaclassEReferenceReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetaclassEReferenceReference_Feature()
  {
    return (EReference)metaclassEReferenceReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMetamodelReference()
  {
    return metamodelReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMetamodelReference_Model()
  {
    return (EReference)metamodelReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainReference()
  {
    return domainReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainReference_Domain()
  {
    return (EAttribute)domainReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MirBaseFactory getMirBaseFactory()
  {
    return (MirBaseFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dummyEntryRuleEClass = createEClass(DUMMY_ENTRY_RULE);

    mirBaseFileEClass = createEClass(MIR_BASE_FILE);
    createEReference(mirBaseFileEClass, MIR_BASE_FILE__METAMODEL_IMPORTS);

    metamodelImportEClass = createEClass(METAMODEL_IMPORT);
    createEReference(metamodelImportEClass, METAMODEL_IMPORT__PACKAGE);
    createEAttribute(metamodelImportEClass, METAMODEL_IMPORT__NAME);
    createEAttribute(metamodelImportEClass, METAMODEL_IMPORT__USE_QUALIFIED_NAMES);

    namedJavaElementEClass = createEClass(NAMED_JAVA_ELEMENT);
    createEReference(namedJavaElementEClass, NAMED_JAVA_ELEMENT__TYPE);
    createEAttribute(namedJavaElementEClass, NAMED_JAVA_ELEMENT__NAME);

    metaclassReferenceEClass = createEClass(METACLASS_REFERENCE);
    createEReference(metaclassReferenceEClass, METACLASS_REFERENCE__METAMODEL);
    createEReference(metaclassReferenceEClass, METACLASS_REFERENCE__METACLASS);

    namedMetaclassReferenceEClass = createEClass(NAMED_METACLASS_REFERENCE);
    createEAttribute(namedMetaclassReferenceEClass, NAMED_METACLASS_REFERENCE__NAME);

    metaclassFeatureReferenceEClass = createEClass(METACLASS_FEATURE_REFERENCE);
    createEReference(metaclassFeatureReferenceEClass, METACLASS_FEATURE_REFERENCE__FEATURE);

    metaclassEAttributeReferenceEClass = createEClass(METACLASS_EATTRIBUTE_REFERENCE);
    createEReference(metaclassEAttributeReferenceEClass, METACLASS_EATTRIBUTE_REFERENCE__FEATURE);

    metaclassEReferenceReferenceEClass = createEClass(METACLASS_EREFERENCE_REFERENCE);
    createEReference(metaclassEReferenceReferenceEClass, METACLASS_EREFERENCE_REFERENCE__FEATURE);

    metamodelReferenceEClass = createEClass(METAMODEL_REFERENCE);
    createEReference(metamodelReferenceEClass, METAMODEL_REFERENCE__MODEL);

    domainReferenceEClass = createEClass(DOMAIN_REFERENCE);
    createEAttribute(domainReferenceEClass, DOMAIN_REFERENCE__DOMAIN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dummyEntryRuleEClass.getESuperTypes().add(this.getMirBaseFile());
    namedMetaclassReferenceEClass.getESuperTypes().add(this.getMetaclassReference());
    metaclassFeatureReferenceEClass.getESuperTypes().add(this.getMetaclassReference());
    metaclassEAttributeReferenceEClass.getESuperTypes().add(this.getMetaclassReference());
    metaclassEReferenceReferenceEClass.getESuperTypes().add(this.getMetaclassReference());

    // Initialize classes and features; add operations and parameters
    initEClass(dummyEntryRuleEClass, DummyEntryRule.class, "DummyEntryRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mirBaseFileEClass, MirBaseFile.class, "MirBaseFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMirBaseFile_MetamodelImports(), this.getMetamodelImport(), null, "metamodelImports", null, 0, -1, MirBaseFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metamodelImportEClass, MetamodelImport.class, "MetamodelImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetamodelImport_Package(), ecorePackage.getEPackage(), null, "package", null, 0, 1, MetamodelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetamodelImport_Name(), ecorePackage.getEString(), "name", null, 0, 1, MetamodelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMetamodelImport_UseQualifiedNames(), ecorePackage.getEBoolean(), "useQualifiedNames", null, 0, 1, MetamodelImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedJavaElementEClass, NamedJavaElement.class, "NamedJavaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNamedJavaElement_Type(), theTypesPackage.getJvmTypeReference(), null, "type", null, 0, 1, NamedJavaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNamedJavaElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedJavaElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaclassReferenceEClass, MetaclassReference.class, "MetaclassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaclassReference_Metamodel(), this.getMetamodelImport(), null, "metamodel", null, 0, 1, MetaclassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMetaclassReference_Metaclass(), ecorePackage.getEClass(), null, "metaclass", null, 0, 1, MetaclassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namedMetaclassReferenceEClass, NamedMetaclassReference.class, "NamedMetaclassReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedMetaclassReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedMetaclassReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaclassFeatureReferenceEClass, MetaclassFeatureReference.class, "MetaclassFeatureReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaclassFeatureReference_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, MetaclassFeatureReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaclassEAttributeReferenceEClass, MetaclassEAttributeReference.class, "MetaclassEAttributeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaclassEAttributeReference_Feature(), ecorePackage.getEAttribute(), null, "feature", null, 0, 1, MetaclassEAttributeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metaclassEReferenceReferenceEClass, MetaclassEReferenceReference.class, "MetaclassEReferenceReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetaclassEReferenceReference_Feature(), ecorePackage.getEReference(), null, "feature", null, 0, 1, MetaclassEReferenceReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(metamodelReferenceEClass, MetamodelReference.class, "MetamodelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMetamodelReference_Model(), this.getMetamodelImport(), null, "model", null, 0, 1, MetamodelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(domainReferenceEClass, DomainReference.class, "DomainReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainReference_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, DomainReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MirBasePackageImpl
