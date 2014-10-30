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

package edu.kit.ipd.sdq.vitruvius.framework.run.editor.monitored.emfchange.test.testmodels.pcm;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.uka.ipd.sdq.pcm.repository.DataType;
import de.uka.ipd.sdq.pcm.repository.PrimitiveDataType;
import de.uka.ipd.sdq.pcm.repository.PrimitiveTypeEnum;

public final class PCMTestUtils {
    public static final String BOOL_TYPE_URI = "pathmap://PCM_MODELS/PrimitiveTypes.repository#//@dataTypes__Repository.2";

    public static DataType getBoolType(Resource pcmResource) {
        ResourceSet rs = pcmResource.getResourceSet();
        EObject boolTypeObj = rs.getEObject(
                URI.createURI("pathmap://PCM_MODELS/PrimitiveTypes.repository#//@dataTypes__Repository.2"), true);
        PrimitiveDataType boolType = (PrimitiveDataType) boolTypeObj;

        assert boolType.getType() == PrimitiveTypeEnum.BOOL;

        return boolType;
    }

    private PCMTestUtils() {

    }
}
