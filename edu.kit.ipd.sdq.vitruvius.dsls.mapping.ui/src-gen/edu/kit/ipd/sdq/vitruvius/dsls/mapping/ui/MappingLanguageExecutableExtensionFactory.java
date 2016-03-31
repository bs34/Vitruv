/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mapping.ui;

import com.google.inject.Injector;
import edu.kit.ipd.sdq.vitruvius.dsls.mapping.ui.internal.MappingActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MappingLanguageExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MappingActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MappingActivator.getInstance().getInjector(MappingActivator.EDU_KIT_IPD_SDQ_VITRUVIUS_DSLS_MAPPING_MAPPINGLANGUAGE);
	}
	
}
