package mir.reactions.reactionsPersonsToFamilies.personsToFamilies;

import edu.kit.ipd.sdq.metamodels.persons.Female;
import edu.kit.ipd.sdq.metamodels.persons.PersonRegister;
import mir.routines.personsToFamilies.RoutinesFacade;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Extension;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractReactionRealization;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;
import tools.vitruv.framework.change.echange.EChange;
import tools.vitruv.framework.change.echange.compound.CreateAndInsertNonRoot;
import tools.vitruv.framework.change.echange.feature.reference.InsertEReference;

@SuppressWarnings("all")
class CreatedFemaleReaction extends AbstractReactionRealization {
  public void executeReaction(final EChange change) {
    InsertEReference<PersonRegister, Female> typedChange = ((CreateAndInsertNonRoot<PersonRegister, Female>)change).getInsertChange();
    PersonRegister affectedEObject = typedChange.getAffectedEObject();
    EReference affectedFeature = typedChange.getAffectedFeature();
    Female newValue = typedChange.getNewValue();
    mir.routines.personsToFamilies.RoutinesFacade routinesFacade = new mir.routines.personsToFamilies.RoutinesFacade(this.executionState, this);
    mir.reactions.reactionsPersonsToFamilies.personsToFamilies.CreatedFemaleReaction.ActionUserExecution userExecution = new mir.reactions.reactionsPersonsToFamilies.personsToFamilies.CreatedFemaleReaction.ActionUserExecution(this.executionState, this);
    userExecution.callRoutine1(affectedEObject, affectedFeature, newValue, routinesFacade);
  }
  
  public static Class<? extends EChange> getExpectedChangeType() {
    return CreateAndInsertNonRoot.class;
  }
  
  private boolean checkChangeProperties(final EChange change) {
    InsertEReference<PersonRegister, Female> relevantChange = ((CreateAndInsertNonRoot<PersonRegister, Female>)change).getInsertChange();
    if (!(relevantChange.getAffectedEObject() instanceof PersonRegister)) {
    	return false;
    }
    if (!relevantChange.getAffectedFeature().getName().equals("persons")) {
    	return false;
    }
    if (!(relevantChange.getNewValue() instanceof Female)) {
    	return false;
    }
    return true;
  }
  
  public boolean checkPrecondition(final EChange change) {
    if (!(change instanceof CreateAndInsertNonRoot)) {
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
    
    public void callRoutine1(final PersonRegister affectedEObject, final EReference affectedFeature, final Female newValue, @Extension final RoutinesFacade _routinesFacade) {
      _routinesFacade.createFemaleMemberOfFamily(newValue);
    }
  }
}
