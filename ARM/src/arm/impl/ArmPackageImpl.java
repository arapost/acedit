/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm.impl;

import arm.Annotation;
import arm.Argument;
import arm.ArgumentElement;
import arm.ArgumentLink;
import arm.ArgumentReasoning;
import arm.ArmFactory;
import arm.ArmPackage;
import arm.AssertedChallenge;
import arm.AssertedContext;
import arm.AssertedCounterEvidence;
import arm.AssertedEvidence;
import arm.AssertedInference;
import arm.AssertedRealationship;
import arm.Case;
import arm.CitiationElement;
import arm.Claim;
import arm.EvidenceAssertation;
import arm.InformationElement;
import arm.ModelElement;
import arm.ReasoningElement;
import arm.TaggedValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArmPackageImpl extends EPackageImpl implements ArmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass caseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedRealationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedInferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedChallengeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertedCounterEvidenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reasoningElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citiationElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evidenceAssertationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentReasoningEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arm.ArmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArmPackageImpl() {
		super(eNS_URI, ArmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ArmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArmPackage init() {
		if (isInited) return (ArmPackage)EPackage.Registry.INSTANCE.getEPackage(ArmPackage.eNS_URI);

		// Obtain or create and register package
		ArmPackageImpl theArmPackage = (ArmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArmPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theArmPackage.createPackageContents();

		// Initialize created meta-data
		theArmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArmPackage.eNS_URI, theArmPackage);
		return theArmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCase() {
		return caseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCase_Contains() {
		return (EReference)caseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Identifier() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Description() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelElement_Content() {
		return (EAttribute)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_IsTagged() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaggedValue() {
		return taggedValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedValue_Key() {
		return (EAttribute)taggedValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedValue_Value() {
		return (EAttribute)taggedValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationElement() {
		return informationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ContainsArgumentElement() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ContainsArgumentLink() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_ContainsArgument() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentElement() {
		return argumentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentLink() {
		return argumentLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentLink_Source() {
		return (EReference)argumentLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentLink_Target() {
		return (EReference)argumentLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedRealationship() {
		return assertedRealationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedInference() {
		return assertedInferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedContext() {
		return assertedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedChallenge() {
		return assertedChallengeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedEvidence() {
		return assertedEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertedCounterEvidence() {
		return assertedCounterEvidenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReasoningElement() {
		return reasoningElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitiationElement() {
		return citiationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitiationElement_RefersToArgumentElement() {
		return (EReference)citiationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitiationElement_RefersToArgument() {
		return (EReference)citiationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaim() {
		return claimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_Assumed() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaim_ToBeSupported() {
		return (EAttribute)claimEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvidenceAssertation() {
		return evidenceAssertationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentReasoning() {
		return argumentReasoningEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_HasStucture() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentReasoning_Describes() {
		return (EReference)argumentReasoningEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArmFactory getArmFactory() {
		return (ArmFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		caseEClass = createEClass(CASE);
		createEReference(caseEClass, CASE__CONTAINS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__IDENTIFIER);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__CONTENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__IS_TAGGED);

		taggedValueEClass = createEClass(TAGGED_VALUE);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__KEY);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__VALUE);

		informationElementEClass = createEClass(INFORMATION_ELEMENT);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__CONTAINS_ARGUMENT_ELEMENT);
		createEReference(argumentEClass, ARGUMENT__CONTAINS_ARGUMENT_LINK);
		createEReference(argumentEClass, ARGUMENT__CONTAINS_ARGUMENT);

		argumentElementEClass = createEClass(ARGUMENT_ELEMENT);

		argumentLinkEClass = createEClass(ARGUMENT_LINK);
		createEReference(argumentLinkEClass, ARGUMENT_LINK__SOURCE);
		createEReference(argumentLinkEClass, ARGUMENT_LINK__TARGET);

		annotationEClass = createEClass(ANNOTATION);

		assertedRealationshipEClass = createEClass(ASSERTED_REALATIONSHIP);

		assertedInferenceEClass = createEClass(ASSERTED_INFERENCE);

		assertedContextEClass = createEClass(ASSERTED_CONTEXT);

		assertedChallengeEClass = createEClass(ASSERTED_CHALLENGE);

		assertedEvidenceEClass = createEClass(ASSERTED_EVIDENCE);

		assertedCounterEvidenceEClass = createEClass(ASSERTED_COUNTER_EVIDENCE);

		reasoningElementEClass = createEClass(REASONING_ELEMENT);

		citiationElementEClass = createEClass(CITIATION_ELEMENT);
		createEReference(citiationElementEClass, CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT);
		createEReference(citiationElementEClass, CITIATION_ELEMENT__REFERS_TO_ARGUMENT);

		claimEClass = createEClass(CLAIM);
		createEAttribute(claimEClass, CLAIM__ASSUMED);
		createEAttribute(claimEClass, CLAIM__TO_BE_SUPPORTED);

		evidenceAssertationEClass = createEClass(EVIDENCE_ASSERTATION);

		argumentReasoningEClass = createEClass(ARGUMENT_REASONING);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__HAS_STUCTURE);
		createEReference(argumentReasoningEClass, ARGUMENT_REASONING__DESCRIBES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		informationElementEClass.getESuperTypes().add(this.getArgumentElement());
		argumentEClass.getESuperTypes().add(this.getModelElement());
		argumentElementEClass.getESuperTypes().add(this.getModelElement());
		argumentLinkEClass.getESuperTypes().add(this.getModelElement());
		annotationEClass.getESuperTypes().add(this.getArgumentLink());
		assertedRealationshipEClass.getESuperTypes().add(this.getArgumentLink());
		assertedInferenceEClass.getESuperTypes().add(this.getAssertedRealationship());
		assertedContextEClass.getESuperTypes().add(this.getAssertedRealationship());
		assertedChallengeEClass.getESuperTypes().add(this.getAssertedRealationship());
		assertedEvidenceEClass.getESuperTypes().add(this.getAssertedRealationship());
		assertedCounterEvidenceEClass.getESuperTypes().add(this.getAssertedRealationship());
		reasoningElementEClass.getESuperTypes().add(this.getArgumentElement());
		citiationElementEClass.getESuperTypes().add(this.getArgumentElement());
		claimEClass.getESuperTypes().add(this.getReasoningElement());
		evidenceAssertationEClass.getESuperTypes().add(this.getClaim());
		argumentReasoningEClass.getESuperTypes().add(this.getReasoningElement());

		// Initialize classes and features; add operations and parameters
		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Contains(), this.getModelElement(), null, "contains", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Content(), ecorePackage.getEString(), "content", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_IsTagged(), this.getTaggedValue(), null, "isTagged", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedValueEClass, TaggedValue.class, "TaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedValue_Key(), ecorePackage.getEString(), "key", null, 0, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationElementEClass, InformationElement.class, "InformationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_ContainsArgumentElement(), this.getArgumentElement(), null, "containsArgumentElement", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_ContainsArgumentLink(), this.getArgumentLink(), null, "containsArgumentLink", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_ContainsArgument(), this.getArgument(), null, "containsArgument", null, 0, -1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentElementEClass, ArgumentElement.class, "ArgumentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentLinkEClass, ArgumentLink.class, "ArgumentLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentLink_Source(), this.getModelElement(), null, "source", null, 0, -1, ArgumentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentLink_Target(), this.getModelElement(), null, "target", null, 0, -1, ArgumentLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedRealationshipEClass, AssertedRealationship.class, "AssertedRealationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedInferenceEClass, AssertedInference.class, "AssertedInference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedContextEClass, AssertedContext.class, "AssertedContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedChallengeEClass, AssertedChallenge.class, "AssertedChallenge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedEvidenceEClass, AssertedEvidence.class, "AssertedEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assertedCounterEvidenceEClass, AssertedCounterEvidence.class, "AssertedCounterEvidence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reasoningElementEClass, ReasoningElement.class, "ReasoningElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(citiationElementEClass, CitiationElement.class, "CitiationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitiationElement_RefersToArgumentElement(), this.getArgumentElement(), null, "refersToArgumentElement", null, 0, 1, CitiationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCitiationElement_RefersToArgument(), this.getArgument(), null, "refersToArgument", null, 0, 1, CitiationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(claimEClass, Claim.class, "Claim", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaim_Assumed(), ecorePackage.getEBoolean(), "assumed", null, 0, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClaim_ToBeSupported(), ecorePackage.getEBoolean(), "toBeSupported", null, 0, 1, Claim.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evidenceAssertationEClass, EvidenceAssertation.class, "EvidenceAssertation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentReasoningEClass, ArgumentReasoning.class, "ArgumentReasoning", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentReasoning_HasStucture(), this.getArgument(), null, "hasStucture", null, 0, 1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentReasoning_Describes(), this.getAssertedInference(), null, "describes", null, 0, -1, ArgumentReasoning.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.label
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });										
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";			
		addAnnotation
		  (caseEClass, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });									
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.label";				
		addAnnotation
		  (getModelElement_Description(), 
		   source, 
		   new String[] {
			 "label", "description"
		   });								
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";					
		addAnnotation
		  (informationElementEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "ellipse",
			 "size", "100,70"
		   });		
		addAnnotation
		  (argumentEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "size", "110,70"
		   });					
		addAnnotation
		  (citiationElementEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "size", "100,70"
		   });		
		addAnnotation
		  (claimEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "rectangle",
			 "size", "100,70"
		   });		
		addAnnotation
		  (argumentReasoningEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "size", "100,70"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";							
		addAnnotation
		  (assertedInferenceEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "filledclosedarrow"
		   });		
		addAnnotation
		  (assertedContextEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "closedarrow"
		   });		
		addAnnotation
		  (assertedEvidenceEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "arrow"
		   });			
	}

} //ArmPackageImpl
