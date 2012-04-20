/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.util;

import GSN1.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see GSN1.GSN1Package
 * @generated
 */
public class GSN1Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GSN1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSN1Switch() {
		if (modelPackage == null) {
			modelPackage = GSN1Package.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GSN1Package.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.ARGUMENT_ELEMENT: {
				ArgumentElement argumentElement = (ArgumentElement)theEObject;
				T result = caseArgumentElement(argumentElement);
				if (result == null) result = caseModelElement(argumentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.SOLVED_BY_TARGET_ELEMENT: {
				SolvedByTargetElement solvedByTargetElement = (SolvedByTargetElement)theEObject;
				T result = caseSolvedByTargetElement(solvedByTargetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.IN_THE_CONTEXT_OF_TARGET_ELEMENT: {
				InTheContextOfTargetElement inTheContextOfTargetElement = (InTheContextOfTargetElement)theEObject;
				T result = caseInTheContextOfTargetElement(inTheContextOfTargetElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.SOLVED_BY_MODULAR: {
				SolvedByModular solvedByModular = (SolvedByModular)theEObject;
				T result = caseSolvedByModular(solvedByModular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.IN_CONTEXT_OF_MODULAR: {
				InContextOfModular inContextOfModular = (InContextOfModular)theEObject;
				T result = caseInContextOfModular(inContextOfModular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.SPINAL_ELEMENT: {
				SpinalElement spinalElement = (SpinalElement)theEObject;
				T result = caseSpinalElement(spinalElement);
				if (result == null) result = caseArgumentElement(spinalElement);
				if (result == null) result = caseSolvedByTargetElement(spinalElement);
				if (result == null) result = caseModelElement(spinalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT: {
				DecomposableSpinalElement decomposableSpinalElement = (DecomposableSpinalElement)theEObject;
				T result = caseDecomposableSpinalElement(decomposableSpinalElement);
				if (result == null) result = caseSpinalElement(decomposableSpinalElement);
				if (result == null) result = caseArgumentElement(decomposableSpinalElement);
				if (result == null) result = caseSolvedByTargetElement(decomposableSpinalElement);
				if (result == null) result = caseModelElement(decomposableSpinalElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.CONTEXTUAL_ELEMENT: {
				ContextualElement contextualElement = (ContextualElement)theEObject;
				T result = caseContextualElement(contextualElement);
				if (result == null) result = caseArgumentElement(contextualElement);
				if (result == null) result = caseInTheContextOfTargetElement(contextualElement);
				if (result == null) result = caseModelElement(contextualElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.SOLVED_BY: {
				SolvedBy solvedBy = (SolvedBy)theEObject;
				T result = caseSolvedBy(solvedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.IN_CONTEXT_OF: {
				InContextOf inContextOf = (InContextOf)theEObject;
				T result = caseInContextOf(inContextOf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.GOAL: {
				Goal goal = (Goal)theEObject;
				T result = caseGoal(goal);
				if (result == null) result = caseDecomposableSpinalElement(goal);
				if (result == null) result = caseSpinalElement(goal);
				if (result == null) result = caseArgumentElement(goal);
				if (result == null) result = caseSolvedByTargetElement(goal);
				if (result == null) result = caseModelElement(goal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.STRATEGY: {
				Strategy strategy = (Strategy)theEObject;
				T result = caseStrategy(strategy);
				if (result == null) result = caseDecomposableSpinalElement(strategy);
				if (result == null) result = caseSpinalElement(strategy);
				if (result == null) result = caseArgumentElement(strategy);
				if (result == null) result = caseSolvedByTargetElement(strategy);
				if (result == null) result = caseModelElement(strategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.SOLUTION: {
				Solution solution = (Solution)theEObject;
				T result = caseSolution(solution);
				if (result == null) result = caseSpinalElement(solution);
				if (result == null) result = caseArgumentElement(solution);
				if (result == null) result = caseSolvedByTargetElement(solution);
				if (result == null) result = caseModelElement(solution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.CONTEXT: {
				Context context = (Context)theEObject;
				T result = caseContext(context);
				if (result == null) result = caseContextualElement(context);
				if (result == null) result = caseArgumentElement(context);
				if (result == null) result = caseInTheContextOfTargetElement(context);
				if (result == null) result = caseModelElement(context);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.JUSTIFICATION: {
				Justification justification = (Justification)theEObject;
				T result = caseJustification(justification);
				if (result == null) result = caseContextualElement(justification);
				if (result == null) result = caseArgumentElement(justification);
				if (result == null) result = caseInTheContextOfTargetElement(justification);
				if (result == null) result = caseModelElement(justification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.ASSUMPTION: {
				Assumption assumption = (Assumption)theEObject;
				T result = caseAssumption(assumption);
				if (result == null) result = caseContextualElement(assumption);
				if (result == null) result = caseArgumentElement(assumption);
				if (result == null) result = caseInTheContextOfTargetElement(assumption);
				if (result == null) result = caseModelElement(assumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.AWAY_CONTEXT: {
				AwayContext awayContext = (AwayContext)theEObject;
				T result = caseAwayContext(awayContext);
				if (result == null) result = caseContextualElement(awayContext);
				if (result == null) result = caseArgumentElement(awayContext);
				if (result == null) result = caseInTheContextOfTargetElement(awayContext);
				if (result == null) result = caseModelElement(awayContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.AWAY_SOLUTION: {
				AwaySolution awaySolution = (AwaySolution)theEObject;
				T result = caseAwaySolution(awaySolution);
				if (result == null) result = caseSpinalElement(awaySolution);
				if (result == null) result = caseArgumentElement(awaySolution);
				if (result == null) result = caseSolvedByTargetElement(awaySolution);
				if (result == null) result = caseModelElement(awaySolution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.AWAY_GOAL: {
				AwayGoal awayGoal = (AwayGoal)theEObject;
				T result = caseAwayGoal(awayGoal);
				if (result == null) result = caseSpinalElement(awayGoal);
				if (result == null) result = caseInTheContextOfTargetElement(awayGoal);
				if (result == null) result = caseArgumentElement(awayGoal);
				if (result == null) result = caseSolvedByTargetElement(awayGoal);
				if (result == null) result = caseModelElement(awayGoal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseModelElement(module);
				if (result == null) result = caseSolvedByTargetElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.ARGUMENT_MODULE: {
				ArgumentModule argumentModule = (ArgumentModule)theEObject;
				T result = caseArgumentModule(argumentModule);
				if (result == null) result = caseModule(argumentModule);
				if (result == null) result = caseInTheContextOfTargetElement(argumentModule);
				if (result == null) result = caseModelElement(argumentModule);
				if (result == null) result = caseSolvedByTargetElement(argumentModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.CONTRACT_MODULE: {
				ContractModule contractModule = (ContractModule)theEObject;
				T result = caseContractModule(contractModule);
				if (result == null) result = caseModule(contractModule);
				if (result == null) result = caseModelElement(contractModule);
				if (result == null) result = caseSolvedByTargetElement(contractModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GSN1Package.TAGGED_VALUE: {
				TaggedValue taggedValue = (TaggedValue)theEObject;
				T result = caseTaggedValue(taggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentElement(ArgumentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solved By Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solved By Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolvedByTargetElement(SolvedByTargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In The Context Of Target Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In The Context Of Target Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInTheContextOfTargetElement(InTheContextOfTargetElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spinal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spinal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpinalElement(SpinalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposable Spinal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposable Spinal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecomposableSpinalElement(DecomposableSpinalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contextual Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contextual Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextualElement(ContextualElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solved By Modular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solved By Modular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolvedByModular(SolvedByModular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Context Of Modular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Context Of Modular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInContextOfModular(InContextOfModular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solved By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solved By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolvedBy(SolvedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Context Of</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInContextOf(InContextOf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoal(Goal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolution(Solution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContext(Context object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Justification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJustification(Justification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssumption(Assumption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentModule(ArgumentModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contract Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContractModule(ContractModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayContext(AwayContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Solution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwaySolution(AwaySolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Away Goal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwayGoal(AwayGoal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tagged Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaggedValue(TaggedValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GSN1Switch
