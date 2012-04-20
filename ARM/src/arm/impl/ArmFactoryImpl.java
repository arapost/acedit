/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm.impl;

import arm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArmFactoryImpl extends EFactoryImpl implements ArmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArmFactory init() {
		try {
			ArmFactory theArmFactory = (ArmFactory)EPackage.Registry.INSTANCE.getEFactory("ARM"); 
			if (theArmFactory != null) {
				return theArmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ArmPackage.CASE: return createCase();
			case ArmPackage.TAGGED_VALUE: return createTaggedValue();
			case ArmPackage.INFORMATION_ELEMENT: return createInformationElement();
			case ArmPackage.ARGUMENT: return createArgument();
			case ArmPackage.ANNOTATION: return createAnnotation();
			case ArmPackage.ASSERTED_INFERENCE: return createAssertedInference();
			case ArmPackage.ASSERTED_CONTEXT: return createAssertedContext();
			case ArmPackage.ASSERTED_CHALLENGE: return createAssertedChallenge();
			case ArmPackage.ASSERTED_EVIDENCE: return createAssertedEvidence();
			case ArmPackage.ASSERTED_COUNTER_EVIDENCE: return createAssertedCounterEvidence();
			case ArmPackage.CITIATION_ELEMENT: return createCitiationElement();
			case ArmPackage.CLAIM: return createClaim();
			case ArmPackage.EVIDENCE_ASSERTATION: return createEvidenceAssertation();
			case ArmPackage.ARGUMENT_REASONING: return createArgumentReasoning();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Case createCase() {
		CaseImpl case_ = new CaseImpl();
		return case_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValue createTaggedValue() {
		TaggedValueImpl taggedValue = new TaggedValueImpl();
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationElement createInformationElement() {
		InformationElementImpl informationElement = new InformationElementImpl();
		return informationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument createArgument() {
		ArgumentImpl argument = new ArgumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedInference createAssertedInference() {
		AssertedInferenceImpl assertedInference = new AssertedInferenceImpl();
		return assertedInference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedContext createAssertedContext() {
		AssertedContextImpl assertedContext = new AssertedContextImpl();
		return assertedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedChallenge createAssertedChallenge() {
		AssertedChallengeImpl assertedChallenge = new AssertedChallengeImpl();
		return assertedChallenge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedEvidence createAssertedEvidence() {
		AssertedEvidenceImpl assertedEvidence = new AssertedEvidenceImpl();
		return assertedEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertedCounterEvidence createAssertedCounterEvidence() {
		AssertedCounterEvidenceImpl assertedCounterEvidence = new AssertedCounterEvidenceImpl();
		return assertedCounterEvidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitiationElement createCitiationElement() {
		CitiationElementImpl citiationElement = new CitiationElementImpl();
		return citiationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim createClaim() {
		ClaimImpl claim = new ClaimImpl();
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvidenceAssertation createEvidenceAssertation() {
		EvidenceAssertationImpl evidenceAssertation = new EvidenceAssertationImpl();
		return evidenceAssertation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentReasoning createArgumentReasoning() {
		ArgumentReasoningImpl argumentReasoning = new ArgumentReasoningImpl();
		return argumentReasoning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmPackage getArmPackage() {
		return (ArmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArmPackage getPackage() {
		return ArmPackage.eINSTANCE;
	}

} //ArmFactoryImpl
