/*
 * generated by Xtext 2.9.2
 */
package edu.kit.ipd.sdq.vitruvius.dsls.mirbase.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MirBaseAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("edu/kit/ipd/sdq/vitruvius/dsls/mirbase/parser/antlr/internal/InternalMirBase.tokens");
	}
}
