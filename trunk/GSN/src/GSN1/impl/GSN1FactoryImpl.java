/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class GSN1FactoryImpl extends EFactoryImpl implements GSN1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GSN1Factory init() {
		try {
			GSN1Factory theGSN1Factory = (GSN1Factory)EPackage.Registry.INSTANCE.getEFactory("GSN1"); 
			if (theGSN1Factory != null) {
				return theGSN1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GSN1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSN1FactoryImpl() {
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
			case GSN1Package.CASE: return createCase();
			case GSN1Package.SOLVED_BY_MODULAR: return createSolvedByModular();
			case GSN1Package.IN_CONTEXT_OF_MODULAR: return createInContextOfModular();
			case GSN1Package.SOLVED_BY: return createSolvedBy();
			case GSN1Package.IN_CONTEXT_OF: return createInContextOf();
			case GSN1Package.GOAL: return createGoal();
			case GSN1Package.STRATEGY: return createStrategy();
			case GSN1Package.SOLUTION: return createSolution();
			case GSN1Package.CONTEXT: return createContext();
			case GSN1Package.JUSTIFICATION: return createJustification();
			case GSN1Package.ASSUMPTION: return createAssumption();
			case GSN1Package.AWAY_CONTEXT: return createAwayContext();
			case GSN1Package.AWAY_SOLUTION: return createAwaySolution();
			case GSN1Package.AWAY_GOAL: return createAwayGoal();
			case GSN1Package.ARGUMENT_MODULE: return createArgumentModule();
			case GSN1Package.CONTRACT_MODULE: return createContractModule();
			case GSN1Package.TAGGED_VALUE: return createTaggedValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GSN1Package.ELEMENT_VISIBILITY:
				return createElementVisibilityFromString(eDataType, initialValue);
			case GSN1Package.SOLVED_BY_MULTIPLICITY_EXTENSION:
				return createSolvedByMultiplicityExtensionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GSN1Package.ELEMENT_VISIBILITY:
				return convertElementVisibilityToString(eDataType, instanceValue);
			case GSN1Package.SOLVED_BY_MULTIPLICITY_EXTENSION:
				return convertSolvedByMultiplicityExtensionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public SolvedByModular createSolvedByModular() {
		SolvedByModularImpl solvedByModular = new SolvedByModularImpl();
		return solvedByModular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InContextOfModular createInContextOfModular() {
		InContextOfModularImpl inContextOfModular = new InContextOfModularImpl();
		return inContextOfModular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedBy createSolvedBy() {
		SolvedByImpl solvedBy = new SolvedByImpl();
		return solvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InContextOf createInContextOf() {
		InContextOfImpl inContextOf = new InContextOfImpl();
		return inContextOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution createSolution() {
		SolutionImpl solution = new SolutionImpl();
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Context createContext() {
		ContextImpl context = new ContextImpl();
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Justification createJustification() {
		JustificationImpl justification = new JustificationImpl();
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentModule createArgumentModule() {
		ArgumentModuleImpl argumentModule = new ArgumentModuleImpl();
		return argumentModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractModule createContractModule() {
		ContractModuleImpl contractModule = new ContractModuleImpl();
		return contractModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayContext createAwayContext() {
		AwayContextImpl awayContext = new AwayContextImpl();
		return awayContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwaySolution createAwaySolution() {
		AwaySolutionImpl awaySolution = new AwaySolutionImpl();
		return awaySolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwayGoal createAwayGoal() {
		AwayGoalImpl awayGoal = new AwayGoalImpl();
		return awayGoal;
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
	public ElementVisibility createElementVisibilityFromString(EDataType eDataType, String initialValue) {
		ElementVisibility result = ElementVisibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedByMultiplicityExtension createSolvedByMultiplicityExtensionFromString(EDataType eDataType, String initialValue) {
		SolvedByMultiplicityExtension result = SolvedByMultiplicityExtension.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSolvedByMultiplicityExtensionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSN1Package getGSN1Package() {
		return (GSN1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GSN1Package getPackage() {
		return GSN1Package.eINSTANCE;
	}

} //GSN1FactoryImpl
