package mir.routines.familiesToPersons;

import edu.kit.ipd.sdq.metamodels.families.Family;
import edu.kit.ipd.sdq.metamodels.families.Member;
import edu.kit.ipd.sdq.metamodels.persons.Male;
import edu.kit.ipd.sdq.metamodels.persons.Person;
import edu.kit.ipd.sdq.metamodels.persons.PersonRegister;
import edu.kit.ipd.sdq.metamodels.persons.impl.PersonsFactoryImpl;
import java.io.IOException;
import mir.routines.familiesToPersons.RoutinesFacade;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import tools.vitruv.extensions.dslsruntime.reactions.AbstractRepairRoutineRealization;
import tools.vitruv.extensions.dslsruntime.reactions.ReactionExecutionState;
import tools.vitruv.extensions.dslsruntime.reactions.structure.CallHierarchyHaving;

@SuppressWarnings("all")
public class CreateDaughterRoutine extends AbstractRepairRoutineRealization {
  private RoutinesFacade actionsFacade;
  
  private CreateDaughterRoutine.ActionUserExecution userExecution;
  
  private static class ActionUserExecution extends AbstractRepairRoutineRealization.UserExecution {
    public ActionUserExecution(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy) {
      super(reactionExecutionState);
    }
    
    public EObject getCorrepondenceSourcePersonsRegister(final Member member) {
      EObject _eContainer = member.eContainer();
      EObject _eContainer_1 = _eContainer.eContainer();
      return _eContainer_1;
    }
    
    public EObject getElement1(final Member member, final PersonRegister personsRegister, final Male person) {
      return personsRegister;
    }
    
    public void update0Element(final Member member, final PersonRegister personsRegister, final Male person) {
      EList<Person> _persons = personsRegister.getPersons();
      _persons.add(person);
    }
    
    public EObject getElement4(final Member member, final PersonRegister personsRegister, final Male person) {
      Family _familyDaughter = member.getFamilyDaughter();
      return _familyDaughter;
    }
    
    public EObject getElement5(final Member member, final PersonRegister personsRegister, final Male person) {
      return person;
    }
    
    public EObject getElement2(final Member member, final PersonRegister personsRegister, final Male person) {
      return member;
    }
    
    public EObject getElement3(final Member member, final PersonRegister personsRegister, final Male person) {
      return person;
    }
    
    public void updatePersonElement(final Member member, final PersonRegister personsRegister, final Male person) {
      String _firstName = member.getFirstName();
      String _plus = (_firstName + " ");
      Family _familyDaughter = member.getFamilyDaughter();
      String _lastName = _familyDaughter.getLastName();
      String _plus_1 = (_plus + _lastName);
      person.setFullName(_plus_1);
    }
  }
  
  public CreateDaughterRoutine(final ReactionExecutionState reactionExecutionState, final CallHierarchyHaving calledBy, final Member member) {
    super(reactionExecutionState, calledBy);
    this.userExecution = new mir.routines.familiesToPersons.CreateDaughterRoutine.ActionUserExecution(getExecutionState(), this);
    this.actionsFacade = new mir.routines.familiesToPersons.RoutinesFacade(getExecutionState(), this);
    this.member = member;
  }
  
  private Member member;
  
  protected void executeRoutine() throws IOException {
    getLogger().debug("Called routine CreateDaughterRoutine with input:");
    getLogger().debug("   Member: " + this.member);
    
    PersonRegister personsRegister = getCorrespondingElement(
    	userExecution.getCorrepondenceSourcePersonsRegister(member), // correspondence source supplier
    	PersonRegister.class,
    	(PersonRegister _element) -> true, // correspondence precondition checker
    	null);
    if (personsRegister == null) {
    	return;
    }
    registerObjectUnderModification(personsRegister);
    Male person = PersonsFactoryImpl.eINSTANCE.createMale();
    notifyObjectCreated(person);
    userExecution.updatePersonElement(member, personsRegister, person);
    
    // val updatedElement userExecution.getElement1(member, personsRegister, person);
    userExecution.update0Element(member, personsRegister, person);
    
    addCorrespondenceBetween(userExecution.getElement2(member, personsRegister, person), userExecution.getElement3(member, personsRegister, person), "");
    
    addCorrespondenceBetween(userExecution.getElement4(member, personsRegister, person), userExecution.getElement5(member, personsRegister, person), "");
    
    postprocessElements();
  }
}
