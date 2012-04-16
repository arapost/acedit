/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentElement;
import GSN1.ArgumentModule;
import GSN1.Assumption;
import GSN1.AwayContext;
import GSN1.AwayGoal;
import GSN1.AwaySolution;
import GSN1.Case;
import GSN1.Context;
import GSN1.ContextualElement;
import GSN1.Contract;
import GSN1.DecomposableSpinalElement;
import GSN1.ElementStatus;
import GSN1.ElementVisibility;
import GSN1.GSN1Factory;
import GSN1.GSN1Package;
import GSN1.Goal;
import GSN1.InContextOf;
import GSN1.InheritedContext;
import GSN1.Justification;
import GSN1.ModelElement;
import GSN1.Solution;
import GSN1.SolvedBy;
import GSN1.SolvedUsingContract;
import GSN1.SpinalElement;
import GSN1.Strategy;
import GSN1.TaggedValue;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GSN1PackageImpl extends EPackageImpl implements GSN1Package {
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
	private EClass argumentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spinalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decomposableSpinalElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextualElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solvedByEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inContextOfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass justificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentModuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awaySolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awayGoalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solvedUsingContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inheritedContextEClass = null;

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
	private EEnum elementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementVisibilityEEnum = null;

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
	 * @see GSN1.GSN1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GSN1PackageImpl() {
		super(eNS_URI, GSN1Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GSN1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GSN1Package init() {
		if (isInited) return (GSN1Package)EPackage.Registry.INSTANCE.getEPackage(GSN1Package.eNS_URI);

		// Obtain or create and register package
		GSN1PackageImpl theGSN1Package = (GSN1PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GSN1PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GSN1PackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGSN1Package.createPackageContents();

		// Initialize created meta-data
		theGSN1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGSN1Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GSN1Package.eNS_URI, theGSN1Package);
		return theGSN1Package;
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
	public EAttribute getCase_AutoID() {
		return (EAttribute)caseEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getArgumentElement_Visibility() {
		return (EAttribute)argumentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentElement_ContextualElementStatus() {
		return (EAttribute)argumentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentElement_IsPartOf() {
		return (EReference)argumentElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpinalElement() {
		return spinalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpinalElement_ParentSolvedBy() {
		return (EReference)spinalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecomposableSpinalElement() {
		return decomposableSpinalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposableSpinalElement_ChildSolvedBy() {
		return (EReference)decomposableSpinalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposableSpinalElement_HasContext() {
		return (EReference)decomposableSpinalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContextualElement() {
		return contextualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolvedBy() {
		return solvedByEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolvedBy_ParentSpinalElement() {
		return (EReference)solvedByEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolvedBy_ChildSpinalelement() {
		return (EReference)solvedByEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolvedBy_Cardinality() {
		return (EAttribute)solvedByEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInContextOf() {
		return inContextOfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInContextOf_ContextualElement() {
		return (EReference)inContextOfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInContextOf_ContextOfSpinalElement() {
		return (EReference)inContextOfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoal() {
		return goalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_IsTopLevelGoalOf() {
		return (EReference)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrategy() {
		return strategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolution() {
		return solutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContext() {
		return contextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJustification() {
		return justificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentModule() {
		return argumentModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentModule_ParentModuleOf() {
		return (EReference)argumentModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentModule_AssociatedWithOther() {
		return (EReference)argumentModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentModule_HasTopLevel() {
		return (EReference)argumentModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentModule_ContainsElement() {
		return (EReference)argumentModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayContext() {
		return awayContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwayContext_IcContainedIn() {
		return (EReference)awayContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwayContext_PointsTo() {
		return (EReference)awayContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwaySolution() {
		return awaySolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwaySolution_PointsTo() {
		return (EReference)awaySolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAwayGoal() {
		return awayGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAwayGoal_PointsTo() {
		return (EReference)awayGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolvedUsingContract() {
		return solvedUsingContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolvedUsingContract_With() {
		return (EReference)solvedUsingContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContract() {
		return contractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContract_IsUsedBy() {
		return (EReference)contractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInheritedContext() {
		return inheritedContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInheritedContext_InheritsFromParentArguments() {
		return (EReference)inheritedContextEClass.getEStructuralFeatures().get(0);
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
	public EReference getModelElement_ContainsAdditional() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
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
	public EEnum getElementStatus() {
		return elementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementVisibility() {
		return elementVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSN1Factory getGSN1Factory() {
		return (GSN1Factory)getEFactoryInstance();
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
		createEAttribute(caseEClass, CASE__AUTO_ID);

		argumentElementEClass = createEClass(ARGUMENT_ELEMENT);
		createEAttribute(argumentElementEClass, ARGUMENT_ELEMENT__VISIBILITY);
		createEAttribute(argumentElementEClass, ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS);
		createEReference(argumentElementEClass, ARGUMENT_ELEMENT__IS_PART_OF);

		spinalElementEClass = createEClass(SPINAL_ELEMENT);
		createEReference(spinalElementEClass, SPINAL_ELEMENT__PARENT_SOLVED_BY);

		decomposableSpinalElementEClass = createEClass(DECOMPOSABLE_SPINAL_ELEMENT);
		createEReference(decomposableSpinalElementEClass, DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY);
		createEReference(decomposableSpinalElementEClass, DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT);

		contextualElementEClass = createEClass(CONTEXTUAL_ELEMENT);

		solvedByEClass = createEClass(SOLVED_BY);
		createEReference(solvedByEClass, SOLVED_BY__PARENT_SPINAL_ELEMENT);
		createEReference(solvedByEClass, SOLVED_BY__CHILD_SPINALELEMENT);
		createEAttribute(solvedByEClass, SOLVED_BY__CARDINALITY);

		inContextOfEClass = createEClass(IN_CONTEXT_OF);
		createEReference(inContextOfEClass, IN_CONTEXT_OF__CONTEXTUAL_ELEMENT);
		createEReference(inContextOfEClass, IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT);

		goalEClass = createEClass(GOAL);
		createEReference(goalEClass, GOAL__IS_TOP_LEVEL_GOAL_OF);

		strategyEClass = createEClass(STRATEGY);

		solutionEClass = createEClass(SOLUTION);

		contextEClass = createEClass(CONTEXT);

		justificationEClass = createEClass(JUSTIFICATION);

		assumptionEClass = createEClass(ASSUMPTION);

		argumentModuleEClass = createEClass(ARGUMENT_MODULE);
		createEReference(argumentModuleEClass, ARGUMENT_MODULE__PARENT_MODULE_OF);
		createEReference(argumentModuleEClass, ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER);
		createEReference(argumentModuleEClass, ARGUMENT_MODULE__HAS_TOP_LEVEL);
		createEReference(argumentModuleEClass, ARGUMENT_MODULE__CONTAINS_ELEMENT);

		awayContextEClass = createEClass(AWAY_CONTEXT);
		createEReference(awayContextEClass, AWAY_CONTEXT__IC_CONTAINED_IN);
		createEReference(awayContextEClass, AWAY_CONTEXT__POINTS_TO);

		awaySolutionEClass = createEClass(AWAY_SOLUTION);
		createEReference(awaySolutionEClass, AWAY_SOLUTION__POINTS_TO);

		awayGoalEClass = createEClass(AWAY_GOAL);
		createEReference(awayGoalEClass, AWAY_GOAL__POINTS_TO);

		solvedUsingContractEClass = createEClass(SOLVED_USING_CONTRACT);
		createEReference(solvedUsingContractEClass, SOLVED_USING_CONTRACT__WITH);

		contractEClass = createEClass(CONTRACT);
		createEReference(contractEClass, CONTRACT__IS_USED_BY);

		inheritedContextEClass = createEClass(INHERITED_CONTEXT);
		createEReference(inheritedContextEClass, INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__IDENTIFIER);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEReference(modelElementEClass, MODEL_ELEMENT__CONTAINS_ADDITIONAL);

		taggedValueEClass = createEClass(TAGGED_VALUE);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__KEY);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__VALUE);

		// Create enums
		elementStatusEEnum = createEEnum(ELEMENT_STATUS);
		elementVisibilityEEnum = createEEnum(ELEMENT_VISIBILITY);
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
		argumentElementEClass.getESuperTypes().add(this.getModelElement());
		spinalElementEClass.getESuperTypes().add(this.getArgumentElement());
		decomposableSpinalElementEClass.getESuperTypes().add(this.getSpinalElement());
		contextualElementEClass.getESuperTypes().add(this.getArgumentElement());
		goalEClass.getESuperTypes().add(this.getDecomposableSpinalElement());
		strategyEClass.getESuperTypes().add(this.getDecomposableSpinalElement());
		solutionEClass.getESuperTypes().add(this.getSpinalElement());
		contextEClass.getESuperTypes().add(this.getContextualElement());
		justificationEClass.getESuperTypes().add(this.getContextualElement());
		assumptionEClass.getESuperTypes().add(this.getContextualElement());
		argumentModuleEClass.getESuperTypes().add(this.getModelElement());
		awayContextEClass.getESuperTypes().add(this.getContextualElement());
		awaySolutionEClass.getESuperTypes().add(this.getSpinalElement());
		awayGoalEClass.getESuperTypes().add(this.getSpinalElement());
		solvedUsingContractEClass.getESuperTypes().add(this.getSolvedBy());
		contractEClass.getESuperTypes().add(this.getArgumentModule());
		inheritedContextEClass.getESuperTypes().add(this.getContextualElement());

		// Initialize classes and features; add operations and parameters
		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Contains(), this.getModelElement(), null, "contains", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase_AutoID(), ecorePackage.getEBooleanObject(), "autoID", "true", 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentElementEClass, ArgumentElement.class, "ArgumentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentElement_Visibility(), this.getElementVisibility(), "visibility", null, 0, 1, ArgumentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgumentElement_ContextualElementStatus(), this.getElementStatus(), "contextualElementStatus", null, 0, 1, ArgumentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentElement_IsPartOf(), this.getArgumentModule(), this.getArgumentModule_ContainsElement(), "isPartOf", null, 1, 1, ArgumentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinalElementEClass, SpinalElement.class, "SpinalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpinalElement_ParentSolvedBy(), this.getSolvedBy(), this.getSolvedBy_ChildSpinalelement(), "parentSolvedBy", null, 1, 1, SpinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decomposableSpinalElementEClass, DecomposableSpinalElement.class, "DecomposableSpinalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecomposableSpinalElement_ChildSolvedBy(), this.getSolvedBy(), this.getSolvedBy_ParentSpinalElement(), "childSolvedBy", null, 0, -1, DecomposableSpinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposableSpinalElement_HasContext(), this.getInContextOf(), this.getInContextOf_ContextOfSpinalElement(), "hasContext", null, 0, -1, DecomposableSpinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextualElementEClass, ContextualElement.class, "ContextualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solvedByEClass, SolvedBy.class, "SolvedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolvedBy_ParentSpinalElement(), this.getDecomposableSpinalElement(), this.getDecomposableSpinalElement_ChildSolvedBy(), "parentSpinalElement", null, 1, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolvedBy_ChildSpinalelement(), this.getSpinalElement(), this.getSpinalElement_ParentSolvedBy(), "childSpinalelement", null, 1, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolvedBy_Cardinality(), ecorePackage.getEIntegerObject(), "cardinality", null, 0, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inContextOfEClass, InContextOf.class, "InContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInContextOf_ContextualElement(), this.getContextualElement(), null, "contextualElement", null, 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInContextOf_ContextOfSpinalElement(), this.getDecomposableSpinalElement(), this.getDecomposableSpinalElement_HasContext(), "contextOfSpinalElement", null, 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoal_IsTopLevelGoalOf(), this.getArgumentModule(), this.getArgumentModule_HasTopLevel(), "isTopLevelGoalOf", null, 1, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentModuleEClass, ArgumentModule.class, "ArgumentModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgumentModule_ParentModuleOf(), this.getArgumentModule(), null, "parentModuleOf", null, 0, -1, ArgumentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentModule_AssociatedWithOther(), this.getArgumentModule(), null, "associatedWithOther", null, 0, -1, ArgumentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentModule_HasTopLevel(), this.getGoal(), this.getGoal_IsTopLevelGoalOf(), "hasTopLevel", null, 0, -1, ArgumentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentModule_ContainsElement(), this.getArgumentElement(), this.getArgumentElement_IsPartOf(), "containsElement", null, 0, -1, ArgumentModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayContextEClass, AwayContext.class, "AwayContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwayContext_IcContainedIn(), this.getArgumentModule(), null, "icContainedIn", null, 1, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwayContext_PointsTo(), this.getGoal(), null, "pointsTo", null, 1, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awaySolutionEClass, AwaySolution.class, "AwaySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwaySolution_PointsTo(), this.getSolution(), null, "pointsTo", null, 1, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayGoalEClass, AwayGoal.class, "AwayGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwayGoal_PointsTo(), this.getGoal(), null, "pointsTo", null, 1, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solvedUsingContractEClass, SolvedUsingContract.class, "SolvedUsingContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolvedUsingContract_With(), this.getContract(), this.getContract_IsUsedBy(), "with", null, 1, 1, SolvedUsingContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contractEClass, Contract.class, "Contract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContract_IsUsedBy(), this.getSolvedUsingContract(), this.getSolvedUsingContract_With(), "isUsedBy", null, 1, 1, Contract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inheritedContextEClass, InheritedContext.class, "InheritedContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInheritedContext_InheritsFromParentArguments(), this.getContextualElement(), null, "inheritsFromParentArguments", null, 0, -1, InheritedContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_ContainsAdditional(), this.getTaggedValue(), null, "containsAdditional", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedValueEClass, TaggedValue.class, "TaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedValue_Key(), ecorePackage.getEString(), "key", null, 1, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(elementStatusEEnum, ElementStatus.class, "ElementStatus");
		addEEnumLiteral(elementStatusEEnum, ElementStatus.UNDEFINED);
		addEEnumLiteral(elementStatusEEnum, ElementStatus.TO_BE_DEVELOPED);
		addEEnumLiteral(elementStatusEEnum, ElementStatus.TO_BE_INSTANTIATED);
		addEEnumLiteral(elementStatusEEnum, ElementStatus.TO_BE_DEVELOPED_AND_INSTANTIATED);

		initEEnum(elementVisibilityEEnum, ElementVisibility.class, "ElementVisibility");
		addEEnumLiteral(elementVisibilityEEnum, ElementVisibility.PRIVATE);
		addEEnumLiteral(elementVisibilityEEnum, ElementVisibility.PUBLIC);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.label
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
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";				
		addAnnotation
		  (solvedByEClass, 
		   source, 
		   new String[] {
			 "source", "parentSpinalElement",
			 "target", "childSpinalelement",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "arrow",
			 "tool.small.path", "GSN_tooling_icons/solvedBy.gif",
			 "tool.large.path", "GSN_tooling_icons/solvedBy.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (inContextOfEClass, 
		   source, 
		   new String[] {
			 "source", "contextOfSpinalElement",
			 "target", "contextualElement",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "closedarrow",
			 "tool.small.path", "GSN_tooling_icons/inTheContextOf.gif",
			 "tool.large.path", "GSN_tooling_icons/inTheContextOf.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
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
		  (goalEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNRectangleFigure",
			 "tool.small.path", "GSN_tooling_icons/Goal.gif",
			 "tool.large.path", "GSN_tooling_icons/Goal.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (strategyEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.ParallelogramFigure",
			 "tool.small.path", "GSN_tooling_icons/Strategy.gif",
			 "tool.large.path", "GSN_tooling_icons/Strategy.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (solutionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNEllipseFigure",
			 "tool.small.path", "GSN_tooling_icons/Solution.gif",
			 "tool.large.path", "GSN_tooling_icons/Solution.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (contextEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNRoundedRectangleFigure",
			 "tool.small.path", "GSN_tooling_icons/Context.gif",
			 "tool.large.path", "GSN_tooling_icons/Context.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (justificationEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNEllipseFigure",
			 "tool.small.path", "GSN_tooling_icons/Justification.gif",
			 "tool.large.path", "GSN_tooling_icons/Justification.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (assumptionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNEllipseFigure",
			 "tool.small.path", "GSN_tooling_icons/Assumption.gif",
			 "tool.large.path", "GSN_tooling_icons/Assumption.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (argumentModuleEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "rectangle"
		   });	
	}

	/**
	 * Initializes the annotations for <b>gmf.label</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.label";													
		addAnnotation
		  (getModelElement_Description(), 
		   source, 
		   new String[] {
			 "label", "description"
		   });
	}

} //GSN1PackageImpl
