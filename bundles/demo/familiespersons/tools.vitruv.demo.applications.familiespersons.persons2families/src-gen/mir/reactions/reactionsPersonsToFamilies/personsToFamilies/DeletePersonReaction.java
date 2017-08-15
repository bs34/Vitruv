package mir.reactions.reactionsPersonsToFamilies.personsToFamilies;

import edu.kit.ipd.sdq.metamodels.persons.Person;
import mir.routines.personsToFamilies.RoutinesFacade;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionRealization;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.eobject.DeleteEObject;

@SuppressWarnings("all")
class DeletePersonReaction extends AbstractReactionRealization {
  public void executeReaction(final EChange change) {
    DeleteEObject<Person> typedChange = (DeleteEObject<Person>)change;
    Person affectedEObject = typedChange.getAffectedEObject();
    mir.routines.personsToFamilies.RoutinesFacade routinesFacade = new mir.routines.personsToFamilies.RoutinesFacade(this.executionState, this);
    mir.reactions.reactionsPersonsToFamilies.personsToFamilies.DeletePersonReaction.ActionUserExecution userExecution = new mir.reactions.reactionsPersonsToFamilies.personsToFamilies.DeletePersonReaction.ActionUserExecution(this.executionState, this);
    userExecution.callRoutine1(affectedEObject, routinesFacade);
  }
  
  public static Class<? extends EChange> getExpectedChangeType() {
    return DeleteEObject.class;
  }
  
  private boolean checkChangeProperties(final EChange change) {
    DeleteEObject<Person> relevantChange = (DeleteEObject<Person>)change;
    if (!(relevantChange.getAffectedEObject() instanceof Person)) {
    	return false;
    }
    return true;
  }
  
  public boolean checkPrecondition(final EChange change) {
    if (!(change instanceof DeleteEObject)) {
    	return false;
    }
    getLogger().debug("Passed change type check of reaction " + this.getClass().getName());
    if (!checkChangeProperties(change)) {
    	return false;
    }
    getLogger().debug("Passed change properties check of reaction " + this.getClass().getName());
    getLogger().debug("Passed complete precondition check of reaction " + this.getClass().getName());
    return true;
  }
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public void callRoutine1(final Person affectedEObject, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.deleteMember(affectedEObject);
    }
  }
}
