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
import GSN1.ContractModule;
import GSN1.DecomposableSpinalElement;
import GSN1.ElementVisibility;
import GSN1.GSN1Factory;
import GSN1.GSN1Package;
import GSN1.Goal;
import GSN1.InContextOf;
import GSN1.InContextOfModular;
import GSN1.InTheContextOfTargetElement;
import GSN1.Justification;
import GSN1.ModelElement;
import GSN1.Module;
import GSN1.Solution;
import GSN1.SolvedBy;
import GSN1.SolvedByModular;
import GSN1.SolvedByMultiplicityExtension;
import GSN1.SolvedByTargetElement;
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
	private EClass solvedByTargetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inTheContextOfTargetElementEClass = null;

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
	private EClass solvedByModularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inContextOfModularEClass = null;

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
	private EClass contractModuleEClass = null;

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
	private EClass moduleEClass = null;

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
	private EEnum elementVisibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum solvedByMultiplicityExtensionEEnum = null;

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
	public EAttribute getArgumentElement_Tobeinstantiated() {
		return (EAttribute)argumentElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgumentElement_IsPartOf() {
		return (EReference)argumentElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolvedByTargetElement() {
		return solvedByTargetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolvedByTargetElement_ParentSolvedBy() {
		return (EReference)solvedByTargetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInTheContextOfTargetElement() {
		return inTheContextOfTargetElementEClass;
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
	public EClass getDecomposableSpinalElement() {
		return decomposableSpinalElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecomposableSpinalElement_ToBeDeveloped() {
		return (EAttribute)decomposableSpinalElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposableSpinalElement_ChildSolvedBy() {
		return (EReference)decomposableSpinalElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecomposableSpinalElement_HasContext() {
		return (EReference)decomposableSpinalElementEClass.getEStructuralFeatures().get(2);
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
	public EClass getSolvedByModular() {
		return solvedByModularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolvedByModular_ChildSolvedByModular() {
		return (EReference)solvedByModularEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolvedByModular_ParentSolvedByModuleElement() {
		return (EReference)solvedByModularEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInContextOfModular() {
		return inContextOfModularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInContextOfModular_ParentInConextOfModuleElement() {
		return (EReference)inContextOfModularEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInContextOfModular_ModularContextualElement() {
		return (EReference)inContextOfModularEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSolvedBy_Multiextension() {
		return (EAttribute)solvedByEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getGoal_Visibility() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoal_IsTopLevelGoalOf() {
		return (EReference)goalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoal_ToBeSupportedByContract() {
		return (EAttribute)goalEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSolution_Visibility() {
		return (EAttribute)solutionEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getContext_Visibility() {
		return (EAttribute)contextEClass.getEStructuralFeatures().get(0);
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
	public EClass getContractModule() {
		return contractModuleEClass;
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
	public EReference getAwayContext_PointsTo() {
		return (EReference)awayContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAwayContext_ModuleIdentifier() {
		return (EAttribute)awayContextEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAwaySolution_ModuleIdentifier() {
		return (EAttribute)awaySolutionEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAwayGoal_ModuleIdentifier() {
		return (EAttribute)awayGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ParentModuleOf() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_AssociatedWithOther() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_HasTopLevel() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ContainsElement() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ParentSolvedByModular() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_HasContext() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(5);
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
	public EEnum getElementVisibility() {
		return elementVisibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSolvedByMultiplicityExtension() {
		return solvedByMultiplicityExtensionEEnum;
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
		createEAttribute(argumentElementEClass, ARGUMENT_ELEMENT__TOBEINSTANTIATED);
		createEReference(argumentElementEClass, ARGUMENT_ELEMENT__IS_PART_OF);

		solvedByTargetElementEClass = createEClass(SOLVED_BY_TARGET_ELEMENT);
		createEReference(solvedByTargetElementEClass, SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY);

		inTheContextOfTargetElementEClass = createEClass(IN_THE_CONTEXT_OF_TARGET_ELEMENT);

		solvedByModularEClass = createEClass(SOLVED_BY_MODULAR);
		createEReference(solvedByModularEClass, SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR);
		createEReference(solvedByModularEClass, SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT);

		inContextOfModularEClass = createEClass(IN_CONTEXT_OF_MODULAR);
		createEReference(inContextOfModularEClass, IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT);
		createEReference(inContextOfModularEClass, IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT);

		spinalElementEClass = createEClass(SPINAL_ELEMENT);

		decomposableSpinalElementEClass = createEClass(DECOMPOSABLE_SPINAL_ELEMENT);
		createEAttribute(decomposableSpinalElementEClass, DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED);
		createEReference(decomposableSpinalElementEClass, DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY);
		createEReference(decomposableSpinalElementEClass, DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT);

		contextualElementEClass = createEClass(CONTEXTUAL_ELEMENT);

		solvedByEClass = createEClass(SOLVED_BY);
		createEReference(solvedByEClass, SOLVED_BY__PARENT_SPINAL_ELEMENT);
		createEReference(solvedByEClass, SOLVED_BY__CHILD_SPINALELEMENT);
		createEAttribute(solvedByEClass, SOLVED_BY__CARDINALITY);
		createEAttribute(solvedByEClass, SOLVED_BY__MULTIEXTENSION);

		inContextOfEClass = createEClass(IN_CONTEXT_OF);
		createEReference(inContextOfEClass, IN_CONTEXT_OF__CONTEXTUAL_ELEMENT);
		createEReference(inContextOfEClass, IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT);

		goalEClass = createEClass(GOAL);
		createEAttribute(goalEClass, GOAL__VISIBILITY);
		createEReference(goalEClass, GOAL__IS_TOP_LEVEL_GOAL_OF);
		createEAttribute(goalEClass, GOAL__TO_BE_SUPPORTED_BY_CONTRACT);

		strategyEClass = createEClass(STRATEGY);

		solutionEClass = createEClass(SOLUTION);
		createEAttribute(solutionEClass, SOLUTION__VISIBILITY);

		contextEClass = createEClass(CONTEXT);
		createEAttribute(contextEClass, CONTEXT__VISIBILITY);

		justificationEClass = createEClass(JUSTIFICATION);

		assumptionEClass = createEClass(ASSUMPTION);

		awayContextEClass = createEClass(AWAY_CONTEXT);
		createEReference(awayContextEClass, AWAY_CONTEXT__POINTS_TO);
		createEAttribute(awayContextEClass, AWAY_CONTEXT__MODULE_IDENTIFIER);

		awaySolutionEClass = createEClass(AWAY_SOLUTION);
		createEReference(awaySolutionEClass, AWAY_SOLUTION__POINTS_TO);
		createEAttribute(awaySolutionEClass, AWAY_SOLUTION__MODULE_IDENTIFIER);

		awayGoalEClass = createEClass(AWAY_GOAL);
		createEReference(awayGoalEClass, AWAY_GOAL__POINTS_TO);
		createEAttribute(awayGoalEClass, AWAY_GOAL__MODULE_IDENTIFIER);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__PARENT_MODULE_OF);
		createEReference(moduleEClass, MODULE__ASSOCIATED_WITH_OTHER);
		createEReference(moduleEClass, MODULE__HAS_TOP_LEVEL);
		createEReference(moduleEClass, MODULE__CONTAINS_ELEMENT);
		createEReference(moduleEClass, MODULE__PARENT_SOLVED_BY_MODULAR);
		createEReference(moduleEClass, MODULE__HAS_CONTEXT);

		argumentModuleEClass = createEClass(ARGUMENT_MODULE);

		contractModuleEClass = createEClass(CONTRACT_MODULE);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__IDENTIFIER);
		createEAttribute(modelElementEClass, MODEL_ELEMENT__DESCRIPTION);
		createEReference(modelElementEClass, MODEL_ELEMENT__CONTAINS_ADDITIONAL);

		taggedValueEClass = createEClass(TAGGED_VALUE);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__KEY);
		createEAttribute(taggedValueEClass, TAGGED_VALUE__VALUE);

		// Create enums
		elementVisibilityEEnum = createEEnum(ELEMENT_VISIBILITY);
		solvedByMultiplicityExtensionEEnum = createEEnum(SOLVED_BY_MULTIPLICITY_EXTENSION);
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
		spinalElementEClass.getESuperTypes().add(this.getSolvedByTargetElement());
		decomposableSpinalElementEClass.getESuperTypes().add(this.getSpinalElement());
		contextualElementEClass.getESuperTypes().add(this.getArgumentElement());
		contextualElementEClass.getESuperTypes().add(this.getInTheContextOfTargetElement());
		goalEClass.getESuperTypes().add(this.getDecomposableSpinalElement());
		strategyEClass.getESuperTypes().add(this.getDecomposableSpinalElement());
		solutionEClass.getESuperTypes().add(this.getSpinalElement());
		contextEClass.getESuperTypes().add(this.getContextualElement());
		justificationEClass.getESuperTypes().add(this.getContextualElement());
		assumptionEClass.getESuperTypes().add(this.getContextualElement());
		awayContextEClass.getESuperTypes().add(this.getContextualElement());
		awaySolutionEClass.getESuperTypes().add(this.getSpinalElement());
		awayGoalEClass.getESuperTypes().add(this.getSpinalElement());
		awayGoalEClass.getESuperTypes().add(this.getInTheContextOfTargetElement());
		moduleEClass.getESuperTypes().add(this.getModelElement());
		moduleEClass.getESuperTypes().add(this.getSolvedByTargetElement());
		argumentModuleEClass.getESuperTypes().add(this.getModule());
		argumentModuleEClass.getESuperTypes().add(this.getInTheContextOfTargetElement());
		contractModuleEClass.getESuperTypes().add(this.getModule());

		// Initialize classes and features; add operations and parameters
		initEClass(caseEClass, Case.class, "Case", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCase_Contains(), this.getModelElement(), null, "contains", null, 0, -1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCase_AutoID(), ecorePackage.getEBooleanObject(), "autoID", "true", 0, 1, Case.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentElementEClass, ArgumentElement.class, "ArgumentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentElement_Tobeinstantiated(), ecorePackage.getEBooleanObject(), "tobeinstantiated", "false", 0, 1, ArgumentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgumentElement_IsPartOf(), this.getModule(), this.getModule_ContainsElement(), "isPartOf", null, 1, 1, ArgumentElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solvedByTargetElementEClass, SolvedByTargetElement.class, "SolvedByTargetElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolvedByTargetElement_ParentSolvedBy(), this.getSolvedBy(), this.getSolvedBy_ChildSpinalelement(), "parentSolvedBy", null, 0, -1, SolvedByTargetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inTheContextOfTargetElementEClass, InTheContextOfTargetElement.class, "InTheContextOfTargetElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solvedByModularEClass, SolvedByModular.class, "SolvedByModular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolvedByModular_ChildSolvedByModular(), this.getModule(), null, "childSolvedByModular", null, 1, 1, SolvedByModular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolvedByModular_ParentSolvedByModuleElement(), this.getModule(), this.getModule_ParentSolvedByModular(), "parentSolvedByModuleElement", null, 1, 1, SolvedByModular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inContextOfModularEClass, InContextOfModular.class, "InContextOfModular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInContextOfModular_ParentInConextOfModuleElement(), this.getModule(), this.getModule_HasContext(), "parentInConextOfModuleElement", null, 1, 1, InContextOfModular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInContextOfModular_ModularContextualElement(), this.getModule(), null, "modularContextualElement", null, 1, 1, InContextOfModular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spinalElementEClass, SpinalElement.class, "SpinalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decomposableSpinalElementEClass, DecomposableSpinalElement.class, "DecomposableSpinalElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecomposableSpinalElement_ToBeDeveloped(), ecorePackage.getEBooleanObject(), "toBeDeveloped", "false", 0, 1, DecomposableSpinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposableSpinalElement_ChildSolvedBy(), this.getSolvedBy(), this.getSolvedBy_ParentSpinalElement(), "childSolvedBy", null, 0, -1, DecomposableSpinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDecomposableSpinalElement_HasContext(), this.getInContextOf(), this.getInContextOf_ContextOfSpinalElement(), "hasContext", null, 0, -1, DecomposableSpinalElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextualElementEClass, ContextualElement.class, "ContextualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solvedByEClass, SolvedBy.class, "SolvedBy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolvedBy_ParentSpinalElement(), this.getDecomposableSpinalElement(), this.getDecomposableSpinalElement_ChildSolvedBy(), "parentSpinalElement", null, 1, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolvedBy_ChildSpinalelement(), this.getSolvedByTargetElement(), this.getSolvedByTargetElement_ParentSolvedBy(), "childSpinalelement", null, 1, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolvedBy_Cardinality(), ecorePackage.getEString(), "cardinality", null, 0, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolvedBy_Multiextension(), this.getSolvedByMultiplicityExtension(), "multiextension", null, 0, 1, SolvedBy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inContextOfEClass, InContextOf.class, "InContextOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInContextOf_ContextualElement(), this.getInTheContextOfTargetElement(), null, "contextualElement", null, 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInContextOf_ContextOfSpinalElement(), this.getDecomposableSpinalElement(), this.getDecomposableSpinalElement_HasContext(), "contextOfSpinalElement", null, 1, 1, InContextOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoal_Visibility(), this.getElementVisibility(), "visibility", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoal_IsTopLevelGoalOf(), this.getModule(), this.getModule_HasTopLevel(), "isTopLevelGoalOf", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoal_ToBeSupportedByContract(), ecorePackage.getEBooleanObject(), "toBeSupportedByContract", "false", 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strategyEClass, Strategy.class, "Strategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solutionEClass, Solution.class, "Solution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolution_Visibility(), this.getElementVisibility(), "visibility", null, 0, 1, Solution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextEClass, Context.class, "Context", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContext_Visibility(), this.getElementVisibility(), "visibility", null, 0, 1, Context.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(justificationEClass, Justification.class, "Justification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(awayContextEClass, AwayContext.class, "AwayContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwayContext_PointsTo(), this.getGoal(), null, "pointsTo", null, 1, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwayContext_ModuleIdentifier(), ecorePackage.getEString(), "moduleIdentifier", null, 1, 1, AwayContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awaySolutionEClass, AwaySolution.class, "AwaySolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwaySolution_PointsTo(), this.getSolution(), null, "pointsTo", null, 1, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwaySolution_ModuleIdentifier(), ecorePackage.getEString(), "moduleIdentifier", null, 1, 1, AwaySolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awayGoalEClass, AwayGoal.class, "AwayGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAwayGoal_PointsTo(), this.getGoal(), null, "pointsTo", null, 1, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAwayGoal_ModuleIdentifier(), ecorePackage.getEString(), "moduleIdentifier", null, 1, 1, AwayGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ParentModuleOf(), this.getModule(), null, "parentModuleOf", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_AssociatedWithOther(), this.getModule(), null, "associatedWithOther", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_HasTopLevel(), this.getGoal(), this.getGoal_IsTopLevelGoalOf(), "hasTopLevel", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ContainsElement(), this.getArgumentElement(), this.getArgumentElement_IsPartOf(), "containsElement", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_ParentSolvedByModular(), this.getSolvedByModular(), this.getSolvedByModular_ParentSolvedByModuleElement(), "parentSolvedByModular", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_HasContext(), this.getInContextOfModular(), this.getInContextOfModular_ParentInConextOfModuleElement(), "hasContext", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentModuleEClass, ArgumentModule.class, "ArgumentModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contractModuleEClass, ContractModule.class, "ContractModule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelElement_Identifier(), ecorePackage.getEString(), "identifier", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelElement_Description(), ecorePackage.getEString(), "description", null, 1, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_ContainsAdditional(), this.getTaggedValue(), null, "containsAdditional", null, 0, -1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedValueEClass, TaggedValue.class, "TaggedValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedValue_Key(), ecorePackage.getEString(), "key", null, 1, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, TaggedValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(elementVisibilityEEnum, ElementVisibility.class, "ElementVisibility");
		addEEnumLiteral(elementVisibilityEEnum, ElementVisibility.PRIVATE);
		addEEnumLiteral(elementVisibilityEEnum, ElementVisibility.PUBLIC);

		initEEnum(solvedByMultiplicityExtensionEEnum, SolvedByMultiplicityExtension.class, "SolvedByMultiplicityExtension");
		addEEnumLiteral(solvedByMultiplicityExtensionEEnum, SolvedByMultiplicityExtension.NORMAL);
		addEEnumLiteral(solvedByMultiplicityExtensionEEnum, SolvedByMultiplicityExtension.OPTIONAL);
		addEEnumLiteral(solvedByMultiplicityExtensionEEnum, SolvedByMultiplicityExtension.MULTI);

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
		  (solvedByModularEClass, 
		   source, 
		   new String[] {
			 "source", "parentSolvedByModular",
			 "target", "childSolvedByModular",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "filledclosedarrow",
			 "tool.small.path", "GSN_tooling_icons/solvedBy.gif",
			 "tool.large.path", "GSN_tooling_icons/solvedBy.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (inContextOfModularEClass, 
		   source, 
		   new String[] {
			 "source", "hasContext",
			 "target", "modularContextualElement",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "closedarrow",
			 "tool.small.path", "GSN_tooling_icons/inTheContextOf.gif",
			 "tool.large.path", "GSN_tooling_icons/inTheContextOf.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN"
		   });		
		addAnnotation
		  (solvedByEClass, 
		   source, 
		   new String[] {
			 "source", "parentSpinalElement",
			 "label", "cardinality",
			 "target", "childSpinalelement",
			 "style", "solid",
			 "width", "1",
			 "target.decoration", "filledclosedarrow",
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
			 "figure", "gsnfigures.GSNGoal",
			 "tool.small.path", "GSN_tooling_icons/Goal.gif",
			 "tool.large.path", "GSN_tooling_icons/Goal.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });		
		addAnnotation
		  (strategyEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNStrategy",
			 "tool.small.path", "GSN_tooling_icons/Strategy.gif",
			 "tool.large.path", "GSN_tooling_icons/Strategy.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });		
		addAnnotation
		  (solutionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNSolution",
			 "tool.small.path", "GSN_tooling_icons/Solution.gif",
			 "tool.large.path", "GSN_tooling_icons/Solution.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "100,100"
		   });		
		addAnnotation
		  (contextEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNContext",
			 "tool.small.path", "GSN_tooling_icons/Context.gif",
			 "tool.large.path", "GSN_tooling_icons/Context.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });		
		addAnnotation
		  (justificationEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNJustification",
			 "tool.small.path", "GSN_tooling_icons/Justification.gif",
			 "tool.large.path", "GSN_tooling_icons/Justification.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });		
		addAnnotation
		  (assumptionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNAssumption",
			 "tool.small.path", "GSN_tooling_icons/Assumption.gif",
			 "tool.large.path", "GSN_tooling_icons/Assumption.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });		
		addAnnotation
		  (awayContextEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNAwayContext",
			 "tool.small.path", "GSN_tooling_icons/AwayContext.gif",
			 "tool.large.path", "GSN_tooling_icons/AwayContext.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });			
		addAnnotation
		  (awaySolutionEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNAwaySolution",
			 "tool.small.path", "GSN_tooling_icons/AwaySolution.gif",
			 "tool.large.path", "GSN_tooling_icons/AwaySolution.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });			
		addAnnotation
		  (awayGoalEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNAwayGoal",
			 "tool.small.path", "GSN_tooling_icons/AwayGoal.gif",
			 "tool.large.path", "GSN_tooling_icons/AwayGoal.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
		   });			
		addAnnotation
		  (argumentModuleEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNArgumentModule",
			 "tool.small.bundle", "GSN",
			 "tool.small.path", "GSN_tooling_icons/ArgumentModule.gif",
			 "tool.large.bundle", "GSN",
			 "tool.large.path", "GSN_tooling_icons/ArgumentModule.gif",
			 "size", "120,80"
		   });		
		addAnnotation
		  (contractModuleEClass, 
		   source, 
		   new String[] {
			 "label", "identifier",
			 "label.icon", "false",
			 "figure", "gsnfigures.GSNContract",
			 "tool.small.path", "GSN_tooling_icons/Contract.gif",
			 "tool.large.path", "GSN_tooling_icons/Contract.gif",
			 "tool.small.bundle", "GSN",
			 "tool.large.bundle", "GSN",
			 "size", "120,80"
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
		  (getAwayContext_ModuleIdentifier(), 
		   source, 
		   new String[] {
			 "label", "moduleIdentifier"
		   });			
		addAnnotation
		  (getAwaySolution_ModuleIdentifier(), 
		   source, 
		   new String[] {
			 "label", "moduleIdentifier"
		   });			
		addAnnotation
		  (getAwayGoal_ModuleIdentifier(), 
		   source, 
		   new String[] {
			 "label", "moduleIdentifier"
		   });				
		addAnnotation
		  (getModelElement_Description(), 
		   source, 
		   new String[] {
			 "label", "description"
		   });
	}

} //GSN1PackageImpl
