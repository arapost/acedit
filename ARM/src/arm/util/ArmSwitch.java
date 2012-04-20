/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm.util;

import arm.*;

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
 * @see arm.ArmPackage
 * @generated
 */
public class ArmSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmSwitch() {
		if (modelPackage == null) {
			modelPackage = ArmPackage.eINSTANCE;
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
			case ArmPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.MODEL_ELEMENT: {
				ModelElement modelElement = (ModelElement)theEObject;
				T result = caseModelElement(modelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.TAGGED_VALUE: {
				TaggedValue taggedValue = (TaggedValue)theEObject;
				T result = caseTaggedValue(taggedValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.INFORMATION_ELEMENT: {
				InformationElement informationElement = (InformationElement)theEObject;
				T result = caseInformationElement(informationElement);
				if (result == null) result = caseArgumentElement(informationElement);
				if (result == null) result = caseModelElement(informationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseModelElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT_ELEMENT: {
				ArgumentElement argumentElement = (ArgumentElement)theEObject;
				T result = caseArgumentElement(argumentElement);
				if (result == null) result = caseModelElement(argumentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT_LINK: {
				ArgumentLink argumentLink = (ArgumentLink)theEObject;
				T result = caseArgumentLink(argumentLink);
				if (result == null) result = caseModelElement(argumentLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseArgumentLink(annotation);
				if (result == null) result = caseModelElement(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_REALATIONSHIP: {
				AssertedRealationship assertedRealationship = (AssertedRealationship)theEObject;
				T result = caseAssertedRealationship(assertedRealationship);
				if (result == null) result = caseArgumentLink(assertedRealationship);
				if (result == null) result = caseModelElement(assertedRealationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_INFERENCE: {
				AssertedInference assertedInference = (AssertedInference)theEObject;
				T result = caseAssertedInference(assertedInference);
				if (result == null) result = caseAssertedRealationship(assertedInference);
				if (result == null) result = caseArgumentLink(assertedInference);
				if (result == null) result = caseModelElement(assertedInference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_CONTEXT: {
				AssertedContext assertedContext = (AssertedContext)theEObject;
				T result = caseAssertedContext(assertedContext);
				if (result == null) result = caseAssertedRealationship(assertedContext);
				if (result == null) result = caseArgumentLink(assertedContext);
				if (result == null) result = caseModelElement(assertedContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_CHALLENGE: {
				AssertedChallenge assertedChallenge = (AssertedChallenge)theEObject;
				T result = caseAssertedChallenge(assertedChallenge);
				if (result == null) result = caseAssertedRealationship(assertedChallenge);
				if (result == null) result = caseArgumentLink(assertedChallenge);
				if (result == null) result = caseModelElement(assertedChallenge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_EVIDENCE: {
				AssertedEvidence assertedEvidence = (AssertedEvidence)theEObject;
				T result = caseAssertedEvidence(assertedEvidence);
				if (result == null) result = caseAssertedRealationship(assertedEvidence);
				if (result == null) result = caseArgumentLink(assertedEvidence);
				if (result == null) result = caseModelElement(assertedEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ASSERTED_COUNTER_EVIDENCE: {
				AssertedCounterEvidence assertedCounterEvidence = (AssertedCounterEvidence)theEObject;
				T result = caseAssertedCounterEvidence(assertedCounterEvidence);
				if (result == null) result = caseAssertedRealationship(assertedCounterEvidence);
				if (result == null) result = caseArgumentLink(assertedCounterEvidence);
				if (result == null) result = caseModelElement(assertedCounterEvidence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.REASONING_ELEMENT: {
				ReasoningElement reasoningElement = (ReasoningElement)theEObject;
				T result = caseReasoningElement(reasoningElement);
				if (result == null) result = caseArgumentElement(reasoningElement);
				if (result == null) result = caseModelElement(reasoningElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.CITIATION_ELEMENT: {
				CitiationElement citiationElement = (CitiationElement)theEObject;
				T result = caseCitiationElement(citiationElement);
				if (result == null) result = caseArgumentElement(citiationElement);
				if (result == null) result = caseModelElement(citiationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.CLAIM: {
				Claim claim = (Claim)theEObject;
				T result = caseClaim(claim);
				if (result == null) result = caseReasoningElement(claim);
				if (result == null) result = caseArgumentElement(claim);
				if (result == null) result = caseModelElement(claim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.EVIDENCE_ASSERTATION: {
				EvidenceAssertation evidenceAssertation = (EvidenceAssertation)theEObject;
				T result = caseEvidenceAssertation(evidenceAssertation);
				if (result == null) result = caseClaim(evidenceAssertation);
				if (result == null) result = caseReasoningElement(evidenceAssertation);
				if (result == null) result = caseArgumentElement(evidenceAssertation);
				if (result == null) result = caseModelElement(evidenceAssertation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArmPackage.ARGUMENT_REASONING: {
				ArgumentReasoning argumentReasoning = (ArgumentReasoning)theEObject;
				T result = caseArgumentReasoning(argumentReasoning);
				if (result == null) result = caseReasoningElement(argumentReasoning);
				if (result == null) result = caseArgumentElement(argumentReasoning);
				if (result == null) result = caseModelElement(argumentReasoning);
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
	 * Returns the result of interpreting the object as an instance of '<em>Information Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationElement(InformationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Argument Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentLink(ArgumentLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Realationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Realationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedRealationship(AssertedRealationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Inference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedInference(AssertedInference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedContext(AssertedContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Challenge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedChallenge(AssertedChallenge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedEvidence(AssertedEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asserted Counter Evidence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssertedCounterEvidence(AssertedCounterEvidence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reasoning Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasoningElement(ReasoningElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Citiation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Citiation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitiationElement(CitiationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaim(Claim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evidence Assertation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evidence Assertation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvidenceAssertation(EvidenceAssertation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Reasoning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentReasoning(ArgumentReasoning object) {
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

} //ArmSwitch
