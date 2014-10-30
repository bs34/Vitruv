/*******************************************************************************
 * Copyright (c) 2014 Felix Kutzner.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Felix Kutzner - initial implementation.
 ******************************************************************************/

package edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.monitor;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.ui.IEditorPart;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.Change;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.EMFModelChange;
import edu.kit.ipd.sdq.vitruvius.framework.contracts.datatypes.VURI;
import edu.kit.ipd.sdq.vitruvius.framework.meta.change.feature.EFeatureChange;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.IEditorPartAdapterFactory;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.IEditorPartAdapterFactory.IEditorPartAdapter;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.IMonitoringDecider;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.ISynchronizingMonitoredEmfEditor.ResourceChangeSynchronizing;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.mocking.EclipseMock;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.mocking.EclipseMock.SaveEventKind;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.testmodels.Files;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.utils.BasicTestCase;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.utils.DefaultImplementations;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.utils.EnsureExecuted;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.utils.EnsureNotExecuted;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.tools.EclipseAdapterProvider;
import edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.tools.IEclipseAdapter;

public class SynchronizingMonitoredEmfEditorImplTests extends BasicTestCase {
    private EclipseMock eclipseCtrl;
    private IEclipseAdapter mockedEclipseUtils;

    private IEditorPart editorPart;
    private IEditorPartAdapter editorPartAdapter;
    private IEditorPartAdapterFactory adapterFactory;

    private static final EObject DUMMY_EOBJECT = EcoreFactory.eINSTANCE.createEClass();

    @Before
    public void setUp() {
        this.eclipseCtrl = new EclipseMock();
        this.mockedEclipseUtils = eclipseCtrl.getEclipseUtils();
        EclipseAdapterProvider.getInstance().setProvidedEclipseAdapter(mockedEclipseUtils);
        adapterFactory = new DefaultEditorPartAdapterFactoryImpl(Files.ECORE_FILE_EXTENSION);
        editorPart = eclipseCtrl.openNewEMFTreeEditorPart(Files.EXAMPLEMODEL_ECORE);
        editorPartAdapter = adapterFactory.createAdapter(editorPart);
    }

    @After
    public void tearDown() {
        assert !eclipseCtrl.hasListeners() : "Listeners were not fully removed from Eclipse";
    }

    @Test
    public void initializeCompletesWithoutFailures() {
        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(
                DefaultImplementations.EFFECTLESS_CHANGESYNC, adapterFactory, IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();
        monitor.dispose();
    }

    @Test
    public void emfEditorsCreatedAfterInitializeAreMonitored() {
        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(
                DefaultImplementations.EFFECTLESS_CHANGESYNC, adapterFactory, IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();

        IEditorPart emfEditor2 = eclipseCtrl.openNewEMFTreeEditorPart(Files.EMPTY_ECORE);
        assert monitor.isMonitoringEditor(emfEditor2);

        monitor.dispose();
    }

    @Test
    public void nonEmfEditorsAreNotMonitored() {
        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(
                DefaultImplementations.EFFECTLESS_CHANGESYNC, adapterFactory, IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();

        IEditorPart nonEmfEditor = eclipseCtrl.openNewNonEMFEditorPart();
        assert !monitor.isMonitoringEditor(nonEmfEditor);

        monitor.dispose();
    }

    @Test
    public void noEditorsAreMonitoredWhenMonitoringDeciderSaysNo() {
        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(
                DefaultImplementations.EFFECTLESS_CHANGESYNC, adapterFactory, new IMonitoringDecider() {
                    @Override
                    public boolean isMonitoringEnabled(IEditorPartAdapter editor) {
                        return false;
                    }
                });
        monitor.initialize();

        IEditorPart emfEditor2 = eclipseCtrl.openNewEMFTreeEditorPart(Files.EMPTY_ECORE);
        assert !monitor.isMonitoringEditor(emfEditor2);

        monitor.dispose();
    }

    @Test
    public void correctAdapterIsPassedToTheMonitoringDecider() {
        final EnsureExecuted ensureExecuted = new EnsureExecuted();

        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(
                DefaultImplementations.EFFECTLESS_CHANGESYNC, adapterFactory, new IMonitoringDecider() {
                    @Override
                    public boolean isMonitoringEnabled(IEditorPartAdapter editor) {
                        assert editor.getEditorPart() == SynchronizingMonitoredEmfEditorImplTests.this.editorPart;
                        ensureExecuted.markExecuted();
                        return true;
                    }
                });

        monitor.initialize();

        monitor.dispose();

        assert !ensureExecuted.isIndicatingFail() : "The monitoring decider was not queried.";
    }

    @Test
    public void saveEventsCauseSyncForCurrentEditor() {
        Resource res = this.editorPartAdapter.getEditedModelResource();
        final VURI resVURI = VURI.getInstance(res);

        final EnsureExecuted ensureExecuted = new EnsureExecuted();
        ResourceChangeSynchronizing cs = new ResourceChangeSynchronizing() {

            @Override
            public void synchronizeChanges(List<Change> changes, VURI sourceModelURI, Resource res) {
                ensureExecuted.markExecuted();
                assert sourceModelURI == resVURI;
            }
        };

        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(cs, adapterFactory,
                IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();

        EPackage rootObj = (EPackage) this.editorPartAdapter.getEditingDomain().getRoot(DUMMY_EOBJECT);
        rootObj.setName(rootObj.getName() + "!");

        eclipseCtrl.issueSaveEvent(SaveEventKind.SAVE);

        monitor.dispose();
        assert !ensureExecuted.isIndicatingFail() : "Synchronization was not triggered.";
    }

    @Test
    public void saveEventsCauseNoSyncWhenNoChangesOccured() {
        final EnsureNotExecuted ensureNotExecuted = new EnsureNotExecuted();
        ResourceChangeSynchronizing cs = new ResourceChangeSynchronizing() {

            @Override
            public void synchronizeChanges(List<Change> changes, VURI sourceModelURI, Resource res) {
                ensureNotExecuted.markExecuted();
            }
        };

        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(cs, adapterFactory,
                IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();

        eclipseCtrl.issueSaveEvent(SaveEventKind.SAVE);

        monitor.dispose();
        assert !ensureNotExecuted.isIndicatingFail() : "Synchronization was erroneously triggered.";
    }

    @Test
    public void saveEventsCauseNoSyncWhenOtherEditorIsSaved() {
        Resource res = this.editorPartAdapter.getEditedModelResource();
        final VURI resVURI = VURI.getInstance(res);

        final EnsureNotExecuted ensureNotExecuted = new EnsureNotExecuted();
        final EnsureExecuted ensureExecuted = new EnsureExecuted();
        ResourceChangeSynchronizing cs = new ResourceChangeSynchronizing() {

            @Override
            public void synchronizeChanges(List<Change> changes, VURI sourceModelURI, Resource res) {
                if (sourceModelURI == resVURI) {
                    ensureNotExecuted.markExecuted();
                } else {
                    ensureExecuted.markExecuted();
                }
            }
        };

        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(cs, adapterFactory,
                IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();

        IEditorPart otherEditor = eclipseCtrl.openNewEMFTreeEditorPart(Files.EMPTY_ECORE);
        // now, otherEditor is the current editor.
        assert eclipseCtrl.getEclipseUtils().getActiveEditorPart() == otherEditor;

        EditingDomain dom = adapterFactory.createAdapter(otherEditor).getEditingDomain();

        EPackage rootObj = (EPackage) this.editorPartAdapter.getEditingDomain().getRoot(DUMMY_EOBJECT);
        rootObj.setName(rootObj.getName() + "!");

        EPackage rootObj2 = (EPackage) dom.getRoot(DUMMY_EOBJECT);
        rootObj2.setName(rootObj2.getName() + "!");

        eclipseCtrl.issueSaveEvent(SaveEventKind.SAVE);

        monitor.dispose();

        assert !ensureNotExecuted.isIndicatingFail() : "Synchronization was erroneously triggered for unsaved model.";
        assert !ensureExecuted.isIndicatingFail() : "Synchronization was not triggered for saved model.";
    }

    @Test
    public void resourceReloadCausesChangesToBeCleared() throws IOException {
        Resource res = this.editorPartAdapter.getEditedModelResource();
        final VURI resVURI = VURI.getInstance(res);

        final EnsureExecuted ensureExecuted = new EnsureExecuted();
        ResourceChangeSynchronizing cs = new ResourceChangeSynchronizing() {

            @Override
            public void synchronizeChanges(List<Change> changes, VURI sourceModelURI, Resource res) {
                ensureExecuted.markExecuted();
                assert sourceModelURI == resVURI;

                assert changes.size() == 1;
                EMFModelChange emfChange = (EMFModelChange) changes.get(0);
                assert emfChange.getEChange() instanceof EFeatureChange<?>;
                EFeatureChange<?> updateAttr = (EFeatureChange<?>) emfChange.getEChange();

                assert updateAttr.getAffectedFeature().getName().equals("nsPrefix") : "Unexpected feature change on "
                        + updateAttr.getAffectedFeature().getName();
            }
        };

        SynchronizingMonitoredEmfEditorImpl monitor = new SynchronizingMonitoredEmfEditorImpl(cs, adapterFactory,
                IMonitoringDecider.MONITOR_ALL);
        monitor.initialize();

        EPackage rootObj = (EPackage) this.editorPartAdapter.getEditingDomain().getRoot(DUMMY_EOBJECT);
        rootObj.setName(rootObj.getName() + "!");

        this.editorPartAdapter.getEditedModelResource().unload();
        this.editorPartAdapter.getEditedModelResource().load(Collections.EMPTY_MAP);

        System.out.println(".");
        rootObj = (EPackage) this.editorPartAdapter.getEditedModelResource().getContents().get(0);
        rootObj.setNsPrefix("!" + rootObj.getNsPrefix());

        eclipseCtrl.issueSaveEvent(SaveEventKind.SAVE);

        monitor.dispose();
        assert !ensureExecuted.isIndicatingFail() : "Synchronization was not triggered.";
    }
}
