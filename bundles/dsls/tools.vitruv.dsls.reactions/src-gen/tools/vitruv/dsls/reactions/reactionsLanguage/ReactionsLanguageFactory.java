/**
 * generated by Xtext 2.12.0-SNAPSHOT
 */
package tools.vitruv.dsls.reactions.reactionsLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tools.vitruv.dsls.reactions.reactionsLanguage.ReactionsLanguagePackage
 * @generated
 */
public interface ReactionsLanguageFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ReactionsLanguageFactory eINSTANCE = tools.vitruv.dsls.reactions.reactionsLanguage.impl.ReactionsLanguageFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Reactions File</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactions File</em>'.
	 * @generated
	 */
  ReactionsFile createReactionsFile();

  /**
	 * Returns a new object of class '<em>Reactions Segment</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactions Segment</em>'.
	 * @generated
	 */
  ReactionsSegment createReactionsSegment();

  /**
	 * Returns a new object of class '<em>Reaction</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction</em>'.
	 * @generated
	 */
  Reaction createReaction();

  /**
	 * Returns a new object of class '<em>Reaction Routine Call</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Routine Call</em>'.
	 * @generated
	 */
  ReactionRoutineCall createReactionRoutineCall();

  /**
	 * Returns a new object of class '<em>Invariant Violation Event</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invariant Violation Event</em>'.
	 * @generated
	 */
  InvariantViolationEvent createInvariantViolationEvent();

  /**
	 * Returns a new object of class '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trigger</em>'.
	 * @generated
	 */
  Trigger createTrigger();

  /**
	 * Returns a new object of class '<em>Model Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Change</em>'.
	 * @generated
	 */
  ModelChange createModelChange();

  /**
	 * Returns a new object of class '<em>Concrete Model Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concrete Model Change</em>'.
	 * @generated
	 */
  ConcreteModelChange createConcreteModelChange();

  /**
	 * Returns a new object of class '<em>Model Element Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Change</em>'.
	 * @generated
	 */
  ModelElementChange createModelElementChange();

  /**
	 * Returns a new object of class '<em>Model Attribute Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Attribute Change</em>'.
	 * @generated
	 */
  ModelAttributeChange createModelAttributeChange();

  /**
	 * Returns a new object of class '<em>Arbitrary Model Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arbitrary Model Change</em>'.
	 * @generated
	 */
  ArbitraryModelChange createArbitraryModelChange();

  /**
	 * Returns a new object of class '<em>Element Existence Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Existence Change Type</em>'.
	 * @generated
	 */
  ElementExistenceChangeType createElementExistenceChangeType();

  /**
	 * Returns a new object of class '<em>Model Element Usage Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Element Usage Change Type</em>'.
	 * @generated
	 */
  ModelElementUsageChangeType createModelElementUsageChangeType();

  /**
	 * Returns a new object of class '<em>Element Creation Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Creation Change Type</em>'.
	 * @generated
	 */
  ElementCreationChangeType createElementCreationChangeType();

  /**
	 * Returns a new object of class '<em>Element Deletion Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Deletion Change Type</em>'.
	 * @generated
	 */
  ElementDeletionChangeType createElementDeletionChangeType();

  /**
	 * Returns a new object of class '<em>Element Reference Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Reference Change Type</em>'.
	 * @generated
	 */
  ElementReferenceChangeType createElementReferenceChangeType();

  /**
	 * Returns a new object of class '<em>Element Root Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Root Change Type</em>'.
	 * @generated
	 */
  ElementRootChangeType createElementRootChangeType();

  /**
	 * Returns a new object of class '<em>Element Insertion Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Insertion Change Type</em>'.
	 * @generated
	 */
  ElementInsertionChangeType createElementInsertionChangeType();

  /**
	 * Returns a new object of class '<em>Element Insertion In List Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Insertion In List Change Type</em>'.
	 * @generated
	 */
  ElementInsertionInListChangeType createElementInsertionInListChangeType();

  /**
	 * Returns a new object of class '<em>Element Insertion As Root Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Insertion As Root Change Type</em>'.
	 * @generated
	 */
  ElementInsertionAsRootChangeType createElementInsertionAsRootChangeType();

  /**
	 * Returns a new object of class '<em>Element Removal Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Removal Change Type</em>'.
	 * @generated
	 */
  ElementRemovalChangeType createElementRemovalChangeType();

  /**
	 * Returns a new object of class '<em>Element Removal As Root Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Removal As Root Change Type</em>'.
	 * @generated
	 */
  ElementRemovalAsRootChangeType createElementRemovalAsRootChangeType();

  /**
	 * Returns a new object of class '<em>Element Removal From List Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Removal From List Change Type</em>'.
	 * @generated
	 */
  ElementRemovalFromListChangeType createElementRemovalFromListChangeType();

  /**
	 * Returns a new object of class '<em>Element Replacement Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Replacement Change Type</em>'.
	 * @generated
	 */
  ElementReplacementChangeType createElementReplacementChangeType();

  /**
	 * Returns a new object of class '<em>Element Creation And Insertion Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Creation And Insertion Change Type</em>'.
	 * @generated
	 */
  ElementCreationAndInsertionChangeType createElementCreationAndInsertionChangeType();

  /**
	 * Returns a new object of class '<em>Element Deletion And Removal Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Deletion And Removal Change Type</em>'.
	 * @generated
	 */
  ElementDeletionAndRemovalChangeType createElementDeletionAndRemovalChangeType();

  /**
	 * Returns a new object of class '<em>Element Deletion And Creation And Replacement Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Deletion And Creation And Replacement Change Type</em>'.
	 * @generated
	 */
  ElementDeletionAndCreationAndReplacementChangeType createElementDeletionAndCreationAndReplacementChangeType();

  /**
	 * Returns a new object of class '<em>Element Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Change Type</em>'.
	 * @generated
	 */
  ElementChangeType createElementChangeType();

  /**
	 * Returns a new object of class '<em>Element Compound Change Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Compound Change Type</em>'.
	 * @generated
	 */
  ElementCompoundChangeType createElementCompoundChangeType();

  /**
	 * Returns a new object of class '<em>Routine</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine</em>'.
	 * @generated
	 */
  Routine createRoutine();

  /**
	 * Returns a new object of class '<em>Routine Input</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Input</em>'.
	 * @generated
	 */
  RoutineInput createRoutineInput();

  /**
	 * Returns a new object of class '<em>Matcher</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher</em>'.
	 * @generated
	 */
  Matcher createMatcher();

  /**
	 * Returns a new object of class '<em>Matcher Statement</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher Statement</em>'.
	 * @generated
	 */
  MatcherStatement createMatcherStatement();

  /**
	 * Returns a new object of class '<em>Retrieve Model Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retrieve Model Element</em>'.
	 * @generated
	 */
  RetrieveModelElement createRetrieveModelElement();

  /**
	 * Returns a new object of class '<em>Matcher Check Statement</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Matcher Check Statement</em>'.
	 * @generated
	 */
  MatcherCheckStatement createMatcherCheckStatement();

  /**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
  Action createAction();

  /**
	 * Returns a new object of class '<em>Routine Call Statement</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Call Statement</em>'.
	 * @generated
	 */
  RoutineCallStatement createRoutineCallStatement();

  /**
	 * Returns a new object of class '<em>Action Statement</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Statement</em>'.
	 * @generated
	 */
  ActionStatement createActionStatement();

  /**
	 * Returns a new object of class '<em>Create Model Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Model Element</em>'.
	 * @generated
	 */
  CreateModelElement createCreateModelElement();

  /**
	 * Returns a new object of class '<em>Delete Model Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete Model Element</em>'.
	 * @generated
	 */
  DeleteModelElement createDeleteModelElement();

  /**
	 * Returns a new object of class '<em>Update Model Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Model Element</em>'.
	 * @generated
	 */
  UpdateModelElement createUpdateModelElement();

  /**
	 * Returns a new object of class '<em>Create Correspondence</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Correspondence</em>'.
	 * @generated
	 */
  CreateCorrespondence createCreateCorrespondence();

  /**
	 * Returns a new object of class '<em>Remove Correspondence</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Correspondence</em>'.
	 * @generated
	 */
  RemoveCorrespondence createRemoveCorrespondence();

  /**
	 * Returns a new object of class '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Block</em>'.
	 * @generated
	 */
  CodeBlock createCodeBlock();

  /**
	 * Returns a new object of class '<em>Execute Action Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute Action Block</em>'.
	 * @generated
	 */
  ExecuteActionBlock createExecuteActionBlock();

  /**
	 * Returns a new object of class '<em>Routine Call Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Routine Call Block</em>'.
	 * @generated
	 */
  RoutineCallBlock createRoutineCallBlock();

  /**
	 * Returns a new object of class '<em>Taggable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Taggable</em>'.
	 * @generated
	 */
  Taggable createTaggable();

  /**
	 * Returns a new object of class '<em>Existing Element Reference</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existing Element Reference</em>'.
	 * @generated
	 */
  ExistingElementReference createExistingElementReference();

  /**
	 * Returns a new object of class '<em>Tag Code Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Code Block</em>'.
	 * @generated
	 */
  TagCodeBlock createTagCodeBlock();

  /**
	 * Returns a new object of class '<em>Precondition Code Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precondition Code Block</em>'.
	 * @generated
	 */
  PreconditionCodeBlock createPreconditionCodeBlock();

  /**
	 * Returns a new object of class '<em>Corresponding Object Code Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corresponding Object Code Block</em>'.
	 * @generated
	 */
  CorrespondingObjectCodeBlock createCorrespondingObjectCodeBlock();

  /**
	 * Returns a new object of class '<em>Execution Code Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Code Block</em>'.
	 * @generated
	 */
  ExecutionCodeBlock createExecutionCodeBlock();

  /**
	 * Returns a new object of class '<em>Return Statement</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Statement</em>'.
	 * @generated
	 */
  ReturnStatement createReturnStatement();

  /**
	 * Returns a new object of class '<em>Model Attribute Inserted Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Attribute Inserted Change</em>'.
	 * @generated
	 */
  ModelAttributeInsertedChange createModelAttributeInsertedChange();

  /**
	 * Returns a new object of class '<em>Model Attribute Removed Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Attribute Removed Change</em>'.
	 * @generated
	 */
  ModelAttributeRemovedChange createModelAttributeRemovedChange();

  /**
	 * Returns a new object of class '<em>Model Attribute Replaced Change</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Attribute Replaced Change</em>'.
	 * @generated
	 */
  ModelAttributeReplacedChange createModelAttributeReplacedChange();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  ReactionsLanguagePackage getReactionsLanguagePackage();

} //ReactionsLanguageFactory
