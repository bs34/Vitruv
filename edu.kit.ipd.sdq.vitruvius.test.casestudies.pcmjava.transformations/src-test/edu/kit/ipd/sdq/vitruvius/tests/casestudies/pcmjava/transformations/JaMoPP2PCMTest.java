package edu.kit.ipd.sdq.vitruvius.tests.casestudies.pcmjava.transformations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emftext.language.java.classifiers.Class;
import org.emftext.language.java.classifiers.ClassifiersFactory;
import org.emftext.language.java.classifiers.Interface;
import org.emftext.language.java.commons.CommonsPackage;
import org.emftext.language.java.commons.NamedElement;
import org.emftext.language.java.containers.CompilationUnit;
import org.emftext.language.java.containers.ContainersFactory;
import org.emftext.language.java.containers.ContainersPackage;
import org.emftext.language.java.containers.Package;
import org.emftext.language.java.modifiers.ModifiersFactory;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.uka.ipd.sdq.pcm.repository.BasicComponent;
import de.uka.ipd.sdq.pcm.repository.OperationInterface;
import de.uka.ipd.sdq.pcm.repository.Repository;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.ChangeFactory;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.CreateNonRootEObject;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.DeleteNonRootEObject;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.DeleteRootEObject;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.EObjectChange;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.UpdateEAttribute;

/**
 * Test for JaMoPP 2 PCM Curent Test cases: i) C Package a) package that corresponds to repository
 * b) package that corresponds to a basic component ii) C Class iii) C Interface
 * 
 * @author Langhamm
 * 
 */
public class JaMoPP2PCMTest extends JaMoPPPCMTransformationTest {

    private static final Logger logger = Logger.getLogger(JaMoPP2PCMTest.class.getSimpleName());

    private static final String REPOSITORY_NAME = "testRepository";
    private static final String BASIC_COMPONENT_NAME = "TestBasicComponent";
    private static final String IMPLEMENTING_CLASS_NAME = BASIC_COMPONENT_NAME + "Impl";
    private static final String INTERFACE_NAME = "TestInterface";
    private static final String RENAME = "Rename";

    private Package mainPackage;
    private Package secondPackage;

    @BeforeClass
    public static void setUp() {
        JaMoPPPCMTransformationTest.setUp();
    }

    @Override
    @Before
    public void createNewCorrespondenceInstance() {
        super.createNewCorrespondenceInstance();
    }

    /**
     * Test i) a) --> first package is created --> should be mapped to a repository
     */
    @Test
    public void testAddFirstPackage() {
        final Repository repo = this.addFirstPackage();
        assertEquals("Name of the repository is not the same as the name of the package", REPOSITORY_NAME,
                repo.getEntityName());
    }

    /**
     * Test i) b) --> second packages is added --> should be mapped to a basic component
     */
    @Test
    public void testAddSecondPackage() {
        final Repository repo = this.addFirstPackage();
        final BasicComponent bc = this.addSecondPackage();
        // repository of basic component has to be the repository
        assertTrue("Repository of basic compoennt is not the repository: " + repo,
                repo.equals(bc.getRepository__RepositoryComponent()));
        assertTrue("The name of the basic component is not " + BASIC_COMPONENT_NAME, bc.getEntityName()
                .equalsIgnoreCase(BASIC_COMPONENT_NAME));
    }

    /**
     * Test ii) class that in mapped package and same name as component + impl--> should be the new
     * implementing class for the component
     */
    @Test
    public void testAddClassInPackageWithCorrespondingComponent() {
        this.addFirstPackage();
        final BasicComponent bc = this.addSecondPackage();

        final BasicComponent bcForClass = this.addClassInSecondPackage();

        assertTrue("BasicComponent for package is not basic component for class", bc.equals(bcForClass));
    }

    /**
     * Test ii) class in non corresponding package --> should not be mapped to a Basic Component
     */
    @Test
    public void testAddClassInPackageWithoutCorrespondingComponent() {
        this.addFirstPackage();
        this.addSecondPackage();

        final Package packageWithoutCorrespondence = ContainersFactory.eINSTANCE.createPackage();
        packageWithoutCorrespondence.setName("packageWithoutCorrespondence");
        packageWithoutCorrespondence.getNamespaces().add("packageWithoutCorrespondence");
        final EObject eObject = this.addClassInPackage(packageWithoutCorrespondence);

        assertTrue(
                "The corresponding object for the class created in a package that does not correspond to a component should be null",
                null == eObject);

    }

    /**
     * Test iii) interface in repository package --> should be mapped to operation interface
     */
    @Test
    public void testAddInterfaceInRepositoryPackage() {
        final Repository repo = this.addFirstPackage();
        final OperationInterface opIf = this.addInterfaceInMainPackage();

        assertTrue("The created operation interface is null", null != opIf);
        assertEquals("OperationInterface name does not equals the expected interface Name.", opIf.getEntityName(),
                INTERFACE_NAME);
        assertEquals("The created operation interface is not in the repository", repo, opIf.getRepository__Interface());
    }

    /**
     * test iii) interface in non-repository package --> should not be mapped
     */
    @Test
    public void testAddInterfaceInNonRepositoryPackage() {
        this.addFirstPackage();
        this.addSecondPackage();

        final EObject eObject = this.addInterfaceInSecondPackage();

        assertTrue("Corresponding object for interface that is created in non main package is not null: " + eObject,
                null == eObject);
    }

    @Test
    public void testRenamePackageWithCorrespondence() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addClassInSecondPackage();
        final UpdateEAttribute<String> updateEAttribute = ChangeFactory.eINSTANCE.createUpdateEAttribute();
        updateEAttribute.setAffectedEObject(this.secondPackage);
        updateEAttribute.setAffectedFeature(this.getNameAttribute(this.secondPackage));
        updateEAttribute.setNewValue(BASIC_COMPONENT_NAME + RENAME);
        this.secondPackage.setName(BASIC_COMPONENT_NAME + RENAME);
        final EObject[] eObject = changeSynchronizer.synchronizeChange(updateEAttribute);
        assertTrue("Nothing should happen since the name of the component matches the name of the implementing class",
                null == eObject);
    }

    @Test
    public void testRenameClassWithCorrespondence() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addClassInSecondPackage();
        final CompilationUnit compilationUnitInSecondPackage = this.secondPackage.getCompilationUnits().get(0);
        final Class classInSecondPackage = (Class) compilationUnitInSecondPackage.getClassifiers().get(0);
        final UpdateEAttribute<String> updateEAttribute = ChangeFactory.eINSTANCE.createUpdateEAttribute();
        updateEAttribute.setAffectedEObject(classInSecondPackage);
        updateEAttribute.setAffectedFeature(this.getNameAttribute(classInSecondPackage));
        updateEAttribute.setNewValue(classInSecondPackage.getName() + RENAME);
        final BasicComponent basicComponent = (BasicComponent) changeSynchronizer.synchronizeChange(updateEAttribute)[0];
        classInSecondPackage.setName(IMPLEMENTING_CLASS_NAME + RENAME);
        assertEquals("The BasicComponent should have the same name as the renamed class",
                classInSecondPackage.getName(), basicComponent.getEntityName());
    }

    @Test
    public void testRenameInterfaceWithCorrespondence() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addInterfaceInMainPackage();
        final Interface jaMoPPIf = (Interface) this.mainPackage.getCompilationUnits().get(0).getClassifiers().get(0);
        final UpdateEAttribute<String> updateEAttribute = ChangeFactory.eINSTANCE.createUpdateEAttribute();
        updateEAttribute.setAffectedEObject(jaMoPPIf);
        updateEAttribute.setAffectedFeature(this.getNameAttribute(jaMoPPIf));
        updateEAttribute.setNewValue(jaMoPPIf.getName() + RENAME);
        final OperationInterface opIf = (OperationInterface) changeSynchronizer.synchronizeChange(updateEAttribute)[0];
        jaMoPPIf.setName(INTERFACE_NAME + RENAME);
        assertEquals("The OperationInterface should have the same name as the renamed interface", jaMoPPIf.getName(),
                opIf.getEntityName());
    }

    @Test
    public void testDeletePackageWithCorrespondence() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addClassInSecondPackage();

        final DeleteNonRootEObject<Package> deleteNonRootEObj = ChangeFactory.eINSTANCE.createDeleteNonRootEObject();
        deleteNonRootEObj.setChangedEObject(this.secondPackage);
        deleteNonRootEObj.setAffectedEObject(this.mainPackage);
        deleteNonRootEObj.setAffectedFeature(null);
        deleteNonRootEObj.setNewValue(null);
        final EObject[] eObj = changeSynchronizer.synchronizeChange(deleteNonRootEObj);
        this.correspondenceInstance.removeAllDependingCorrespondences(this.secondPackage);
        EcoreUtil.delete(this.secondPackage);

        assertTrue("Returned EObject is not null", null == eObj);
        assertTrue("Second package still has correspondences",
                null == this.correspondenceInstance.getAllCorrespondences(this.secondPackage));
    }

    @Test
    public void testDeleteRootPackage() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addClassInSecondPackage();

        final DeleteRootEObject deleteRoot = ChangeFactory.eINSTANCE.createDeleteRootEObject();
        deleteRoot.setChangedEObject(this.mainPackage);
        final EObject[] eObject = changeSynchronizer.synchronizeChange(deleteRoot);
        this.correspondenceInstance.removeAllDependingCorrespondences(this.mainPackage);
        EcoreUtil.delete(this.mainPackage);
        final Set<Object> allCorrespondences = this.correspondenceInstance
                .getAllEObjectsInCorrespondencesWithType(Object.class);

        assertTrue("Returned EObject is not null", null == eObject);
        assertTrue("Main packages still has correspondences",
                null == this.correspondenceInstance.getAllCorrespondences(this.mainPackage));
        assertTrue(
                "Even though the root object was deleted there are still correspondences in correspondence instance",
                null == allCorrespondences || 0 == allCorrespondences.size());
    }

    @Test
    public void testDeleteClassWithCorrespondence() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addClassInSecondPackage();

        final CompilationUnit compilationUnitInSecondPackage = this.secondPackage.getCompilationUnits().get(0);
        final Class classInSecondPackage = (Class) compilationUnitInSecondPackage.getClassifiers().get(0);
        final DeleteNonRootEObject<Package> deleteClass = ChangeFactory.eINSTANCE.createDeleteNonRootEObject();
        deleteClass.setChangedEObject(classInSecondPackage);
        deleteClass.setAffectedEObject(this.secondPackage);
        deleteClass.setAffectedFeature(null);
        deleteClass.setNewValue(null);
        final EObject[] eObject = changeSynchronizer.synchronizeChange(deleteClass);

        assertTrue("Returned EObject is not null", null == eObject);
        assertTrue("The class still has corresponding objects",
                null == this.correspondenceInstance.getAllCorrespondences(classInSecondPackage));
        assertTrue("The compilation unit still has corresponding objects",
                null == this.correspondenceInstance.getAllCorrespondences(compilationUnitInSecondPackage));
    }

    @Test
    public void testDeleteInterfaceWithCorrespondence() {
        this.addFirstPackage();
        this.addSecondPackage();
        this.addInterfaceInMainPackage();

        final CompilationUnit compilationUnitInMainPackage = this.mainPackage.getCompilationUnits().get(0);
        final Interface interfaceInMainPackage = (Interface) compilationUnitInMainPackage.getClassifiers().get(0);
        final DeleteNonRootEObject<Package> deleteInterface = ChangeFactory.eINSTANCE.createDeleteNonRootEObject();
        deleteInterface.setChangedEObject(interfaceInMainPackage);
        deleteInterface.setAffectedEObject(this.secondPackage);
        deleteInterface.setAffectedFeature(null);
        deleteInterface.setNewValue(null);
        final EObject[] eObject = changeSynchronizer.synchronizeChange(deleteInterface);

        assertTrue("Returned EObject is not null", null == eObject);
        assertTrue("The interface still has corresponding objects",
                null == this.correspondenceInstance.getAllCorrespondences(interfaceInMainPackage));
        assertTrue("The compilation unit still has corresponding objects",
                null == this.correspondenceInstance.getAllCorrespondences(compilationUnitInMainPackage));
    }

    private Repository addFirstPackage() {
        this.mainPackage = ContainersFactory.eINSTANCE.createPackage();
        this.mainPackage.setName(REPOSITORY_NAME);
        this.mainPackage.getNamespaces().add(REPOSITORY_NAME);
        logger.info("Namespace of new package: " + this.mainPackage.getNamespacesAsString());
        final EObjectChange eoc = ChangeFactory.eINSTANCE.createCreateRootEObject();
        eoc.setChangedEObject(this.mainPackage);
        final EObject createdEObject = changeSynchronizer.synchronizeChange(eoc)[0];
        final Repository repo = (Repository) createdEObject;
        return repo;
    }

    private BasicComponent addSecondPackage() {
        this.secondPackage = ContainersFactory.eINSTANCE.createPackage();
        this.secondPackage.setName(BASIC_COMPONENT_NAME);
        this.secondPackage.getNamespaces().addAll(this.mainPackage.getNamespaces());
        this.secondPackage.getNamespaces().add(BASIC_COMPONENT_NAME);
        final EObjectChange eoc = ChangeFactory.eINSTANCE.createCreateRootEObject();
        eoc.setChangedEObject(this.secondPackage);
        final EObject createdEObject = changeSynchronizer.synchronizeChange(eoc)[0];
        final BasicComponent basicComp = (BasicComponent) createdEObject;
        return basicComp;
    }

    private BasicComponent addClassInSecondPackage() {
        final EObject createdEObject = this.addClassInPackage(this.secondPackage);
        return (BasicComponent) createdEObject;
    }

    private EObject addClassInPackage(final Package packageForClass) {
        final CompilationUnit cu = ContainersFactory.eINSTANCE.createCompilationUnit();
        cu.setName(IMPLEMENTING_CLASS_NAME + ".java");
        final Class jaMoPPClass = ClassifiersFactory.eINSTANCE.createClass();
        jaMoPPClass.setName(IMPLEMENTING_CLASS_NAME);
        jaMoPPClass.addModifier(ModifiersFactory.eINSTANCE.createPublic());
        cu.getClassifiers().add(jaMoPPClass);
        packageForClass.getCompilationUnits().add(cu);
        cu.getNamespaces().addAll(packageForClass.getNamespaces());
        final CreateNonRootEObject<CompilationUnit> eoc = ChangeFactory.eINSTANCE.createCreateNonRootEObject();
        eoc.setChangedEObject(jaMoPPClass);
        eoc.setAffectedEObject(packageForClass);
        eoc.setAffectedFeature((EReference) packageForClass.eClass().getEStructuralFeature(
                ContainersPackage.PACKAGE__COMPILATION_UNITS));
        eoc.setNewValue(cu);
        final EObject createdEObject = changeSynchronizer.synchronizeChange(eoc)[0];
        return createdEObject;
    }

    private OperationInterface addInterfaceInMainPackage() {
        final EObject eObject = this.addInterfaceInPackage(this.mainPackage);
        return (OperationInterface) eObject;
    }

    private EObject addInterfaceInSecondPackage() {
        return this.addInterfaceInPackage(this.secondPackage);
    }

    private EObject addInterfaceInPackage(final Package pack) {
        final CompilationUnit cu = ContainersFactory.eINSTANCE.createCompilationUnit();
        cu.setName(INTERFACE_NAME + ".java");
        final Interface jaMoPPInterface = ClassifiersFactory.eINSTANCE.createInterface();
        jaMoPPInterface.setName(INTERFACE_NAME);
        cu.getClassifiers().add(jaMoPPInterface);
        pack.getCompilationUnits().add(cu);
        cu.getNamespaces().addAll(pack.getNamespaces());
        final CreateNonRootEObject<CompilationUnit> eoc = ChangeFactory.eINSTANCE.createCreateNonRootEObject();
        eoc.setChangedEObject(jaMoPPInterface);
        eoc.setAffectedEObject(pack);
        eoc.setAffectedFeature((EReference) pack.eClass().getEStructuralFeature(
                ContainersPackage.PACKAGE__COMPILATION_UNITS));
        eoc.setNewValue(cu);
        final EObject eObject = changeSynchronizer.synchronizeChange(eoc)[0];
        return eObject;
    }

    private EAttribute getNameAttribute(final NamedElement ne) {
        return (EAttribute) ne.eClass().getEStructuralFeature(CommonsPackage.NAMED_ELEMENT__NAME);
    }
}
