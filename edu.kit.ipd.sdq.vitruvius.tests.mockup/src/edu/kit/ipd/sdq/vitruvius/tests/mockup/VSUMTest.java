package edu.kit.ipd.sdq.vitruvius.tests.mockup;

import static org.junit.Assert.assertNotNull;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.ModelInstance;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.VURI;
import edu.kit.ipd.sdq.vitruvius.framework.metarepository.MetaRepositoryImpl;
import edu.kit.ipd.sdq.vitruvius.framework.vsum.VSUMImpl;
import edu.kit.ipd.sdq.vitruvius.tests.util.TestUtil;

public class VSUMTest extends MetaRepositoryTest {
    protected static final String PCM_INSTANCE_URI = "MockupProject/model/My.pcm_mockup";
    protected static final String UML_INSTANCE_URI = "MockupProject/model/My.uml_mockup";

    @Override
    @Test
    public void testAll() {
        testMetaRepositoryVSUMAndModelInstancesCreation();
    }

    protected VSUMImpl testMetaRepositoryVSUMAndModelInstancesCreation() {
        VSUMImpl vsum = testMetaRepositoryAndVSUMCreation();
        testInstanceCreation(vsum);
        return vsum;
    }

    protected VSUMImpl testMetaRepositoryAndVSUMCreation() {
        return testMetaRepositoryAndVSUMCreation(PCM_MM_URI, PCM_FILE_EXT, UML_MM_URI, UML_FILE_EXT);
    }

    private VSUMImpl testMetaRepositoryAndVSUMCreation(final String mm1URIString, final String fileExt1,
            final String mm2URIString, final String fileExt2) {
        MetaRepositoryImpl metaRepository = testMetaRepository();
        testAddMapping(metaRepository, mm1URIString, fileExt1, mm2URIString, fileExt2);
        return testVSUMCreation(metaRepository);
    }

    protected VSUMImpl testVSUMCreation(final MetaRepositoryImpl metaRepository) {
        VSUMImpl vsum = TestUtil.createVSUM(metaRepository);
        return vsum;
    }

    protected void testInstanceCreation(final VSUMImpl vsum) {
        testInstanceCreation(PCM_INSTANCE_URI, UML_INSTANCE_URI, vsum);
    }

    private void testInstanceCreation(final String model1URIString, final String model2URIString, final VSUMImpl vsum) {
        VURI model1URI = VURI.getInstance(model1URIString);
        VURI model2URI = VURI.getInstance(model2URIString);
        ModelInstance model1 = vsum.getAndLoadModelInstanceOriginal(model1URI);
        ModelInstance model2 = vsum.getAndLoadModelInstanceOriginal(model2URI);
        EList<EObject> contents1 = model1.getResource().getContents();
        assertNotNull(contents1);
        EObject root1 = contents1.get(0);
        assertNotNull(root1);
        EList<EObject> contents2 = model2.getResource().getContents();
        assertNotNull(contents2);
        EObject root2 = contents2.get(0);
        assertNotNull(root2);
    }
}
