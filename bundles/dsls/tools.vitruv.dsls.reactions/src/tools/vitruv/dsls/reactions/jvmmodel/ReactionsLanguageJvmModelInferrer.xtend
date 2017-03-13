/*
 * generated by Xtext 2.9.0
 */
package tools.vitruv.dsls.reactions.jvmmodel

import com.google.inject.Inject
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import tools.vitruv.dsls.reactions.codegen.classgenerators.ExecutorClassGenerator
import tools.vitruv.dsls.reactions.codegen.classgenerators.RoutineFacadeClassGenerator
import tools.vitruv.dsls.reactions.codegen.classgenerators.RoutineClassGenerator
import tools.vitruv.dsls.reactions.reactionsLanguage.Routine
import tools.vitruv.dsls.reactions.reactionsLanguage.Reaction
import tools.vitruv.dsls.reactions.reactionsLanguage.ReactionsFile
import tools.vitruv.dsls.reactions.codegen.typesbuilder.JvmTypesBuilderWithoutAssociations
import tools.vitruv.dsls.reactions.codegen.typesbuilder.TypesBuilderExtensionProvider
import tools.vitruv.dsls.reactions.codegen.classgenerators.ReactionClassGenerator

/**
 * <p>Infers a JVM model for the Xtend code blocks of the reaction file model.</p> 
 *
 * <p>The resulting classes are not to be persisted but only to be used for content assist purposes.</p>
 * 
 * @author Heiko Klare     
 */
class ReactionsLanguageJvmModelInferrer extends AbstractModelInferrer  {

	@Inject extension JvmTypesBuilderWithoutAssociations _typesBuilder
	@Inject TypesBuilderExtensionProvider typesBuilderExtensionProvider;
	
	private def void updateBuilders() {
		typesBuilderExtensionProvider.setBuilders(_typesBuilder, _typeReferenceBuilder, _annotationTypesBuilder);
	}
	
	def dispatch void generate(Reaction reaction, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		if (isPreIndexingPhase) {
			return;
		}
		
		val reactionClassGenerator = new ReactionClassGenerator(reaction, typesBuilderExtensionProvider);
		acceptor.accept(reactionClassGenerator.generateClass());
	}
	
	def dispatch void generate(Routine routine, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		if (isPreIndexingPhase) {
			return;
		}
		
		acceptor.accept(new RoutineClassGenerator(routine, typesBuilderExtensionProvider).generateClass());
	}
	
	def dispatch void infer(ReactionsFile file, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		if (isPreIndexingPhase) {
			return;
		}
		updateBuilders();
		
		for (reactionsSegment : file.reactionsSegments) {
			acceptor.accept(new RoutineFacadeClassGenerator(reactionsSegment, typesBuilderExtensionProvider).generateClass());
			for (effect : reactionsSegment.routines) {
				generate(effect, acceptor, isPreIndexingPhase);
			}
			for (reaction : reactionsSegment.reactions) {
				generate(reaction, acceptor, isPreIndexingPhase);
			}
			acceptor.accept(new ExecutorClassGenerator(reactionsSegment, typesBuilderExtensionProvider).generateClass());			
		}

	}

}
