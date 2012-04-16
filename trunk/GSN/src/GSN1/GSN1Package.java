/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see GSN1.GSN1Factory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface GSN1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GSN1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "GSN1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "GSN1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GSN1Package eINSTANCE = GSN1.impl.GSN1PackageImpl.init();

	/**
	 * The meta object id for the '{@link GSN1.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.CaseImpl
	 * @see GSN1.impl.GSN1PackageImpl#getCase()
	 * @generated
	 */
	int CASE = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Auto ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__AUTO_ID = 1;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GSN1.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.ModelElementImpl
	 * @see GSN1.impl.GSN1PackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONTAINS_ADDITIONAL = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link GSN1.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.ArgumentElementImpl
	 * @see GSN1.impl.GSN1PackageImpl#getArgumentElement()
	 * @generated
	 */
	int ARGUMENT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__IDENTIFIER = MODEL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__CONTAINS_ADDITIONAL = MODEL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__VISIBILITY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__IS_PART_OF = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link GSN1.impl.SpinalElementImpl <em>Spinal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.SpinalElementImpl
	 * @see GSN1.impl.GSN1PackageImpl#getSpinalElement()
	 * @generated
	 */
	int SPINAL_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__CONTAINS_ADDITIONAL = ARGUMENT_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__VISIBILITY = ARGUMENT_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS = ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__IS_PART_OF = ARGUMENT_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT__PARENT_SOLVED_BY = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Spinal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPINAL_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.DecomposableSpinalElementImpl <em>Decomposable Spinal Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.DecomposableSpinalElementImpl
	 * @see GSN1.impl.GSN1PackageImpl#getDecomposableSpinalElement()
	 * @generated
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__VISIBILITY = SPINAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS = SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Child Solved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decomposable Spinal Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN1.impl.ContextualElementImpl <em>Contextual Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.ContextualElementImpl
	 * @see GSN1.impl.GSN1PackageImpl#getContextualElement()
	 * @generated
	 */
	int CONTEXTUAL_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL = ARGUMENT_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__VISIBILITY = ARGUMENT_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS = ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT__IS_PART_OF = ARGUMENT_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Contextual Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXTUAL_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN1.impl.SolvedByImpl <em>Solved By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.SolvedByImpl
	 * @see GSN1.impl.GSN1PackageImpl#getSolvedBy()
	 * @generated
	 */
	int SOLVED_BY = 5;

	/**
	 * The feature id for the '<em><b>Parent Spinal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__PARENT_SPINAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Child Spinalelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__CHILD_SPINALELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY__CARDINALITY = 2;

	/**
	 * The number of structural features of the '<em>Solved By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_BY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link GSN1.impl.InContextOfImpl <em>In Context Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.InContextOfImpl
	 * @see GSN1.impl.GSN1PackageImpl#getInContextOf()
	 * @generated
	 */
	int IN_CONTEXT_OF = 6;

	/**
	 * The feature id for the '<em><b>Contextual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CONTEXTUAL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Context Of Spinal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>In Context Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_CONTEXT_OF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GSN1.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.GoalImpl
	 * @see GSN1.impl.GSN1PackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IDENTIFIER = DECOMPOSABLE_SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__DESCRIPTION = DECOMPOSABLE_SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTAINS_ADDITIONAL = DECOMPOSABLE_SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__VISIBILITY = DECOMPOSABLE_SPINAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CONTEXTUAL_ELEMENT_STATUS = DECOMPOSABLE_SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_PART_OF = DECOMPOSABLE_SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__PARENT_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Child Solved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__CHILD_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__HAS_CONTEXT = DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT;

	/**
	 * The feature id for the '<em><b>Is Top Level Goal Of</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__IS_TOP_LEVEL_GOAL_OF = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.StrategyImpl
	 * @see GSN1.impl.GSN1PackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IDENTIFIER = DECOMPOSABLE_SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__DESCRIPTION = DECOMPOSABLE_SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTAINS_ADDITIONAL = DECOMPOSABLE_SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__VISIBILITY = DECOMPOSABLE_SPINAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CONTEXTUAL_ELEMENT_STATUS = DECOMPOSABLE_SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__IS_PART_OF = DECOMPOSABLE_SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__PARENT_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Child Solved By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__CHILD_SOLVED_BY = DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Has Context</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__HAS_CONTEXT = DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = DECOMPOSABLE_SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN1.impl.SolutionImpl <em>Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.SolutionImpl
	 * @see GSN1.impl.GSN1PackageImpl#getSolution()
	 * @generated
	 */
	int SOLUTION = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__VISIBILITY = SPINAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__CONTEXTUAL_ELEMENT_STATUS = SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The number of structural features of the '<em>Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN1.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.ContextImpl
	 * @see GSN1.impl.GSN1PackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__VISIBILITY = CONTEXTUAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__CONTEXTUAL_ELEMENT_STATUS = CONTEXTUAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN1.impl.JustificationImpl <em>Justification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.JustificationImpl
	 * @see GSN1.impl.GSN1PackageImpl#getJustification()
	 * @generated
	 */
	int JUSTIFICATION = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__VISIBILITY = CONTEXTUAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__CONTEXTUAL_ELEMENT_STATUS = CONTEXTUAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Justification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUSTIFICATION_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN1.impl.AssumptionImpl <em>Assumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.AssumptionImpl
	 * @see GSN1.impl.GSN1PackageImpl#getAssumption()
	 * @generated
	 */
	int ASSUMPTION = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__VISIBILITY = CONTEXTUAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__CONTEXTUAL_ELEMENT_STATUS = CONTEXTUAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The number of structural features of the '<em>Assumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSUMPTION_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link GSN1.impl.ArgumentModuleImpl <em>Argument Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.ArgumentModuleImpl
	 * @see GSN1.impl.GSN1PackageImpl#getArgumentModule()
	 * @generated
	 */
	int ARGUMENT_MODULE = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__IDENTIFIER = MODEL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__CONTAINS_ADDITIONAL = MODEL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Parent Module Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__PARENT_MODULE_OF = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Associated With Other</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Top Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__HAS_TOP_LEVEL = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Contains Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE__CONTAINS_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Argument Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_MODULE_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link GSN1.impl.AwayContextImpl <em>Away Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.AwayContextImpl
	 * @see GSN1.impl.GSN1PackageImpl#getAwayContext()
	 * @generated
	 */
	int AWAY_CONTEXT = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__VISIBILITY = CONTEXTUAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__CONTEXTUAL_ELEMENT_STATUS = CONTEXTUAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Ic Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__IC_CONTAINED_IN = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT__POINTS_TO = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Away Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_CONTEXT_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link GSN1.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.AwaySolutionImpl
	 * @see GSN1.impl.GSN1PackageImpl#getAwaySolution()
	 * @generated
	 */
	int AWAY_SOLUTION = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__VISIBILITY = SPINAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__CONTEXTUAL_ELEMENT_STATUS = SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION__POINTS_TO = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_SOLUTION_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.AwayGoalImpl <em>Away Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.AwayGoalImpl
	 * @see GSN1.impl.GSN1PackageImpl#getAwayGoal()
	 * @generated
	 */
	int AWAY_GOAL = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IDENTIFIER = SPINAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__DESCRIPTION = SPINAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CONTAINS_ADDITIONAL = SPINAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__VISIBILITY = SPINAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__CONTEXTUAL_ELEMENT_STATUS = SPINAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__IS_PART_OF = SPINAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Parent Solved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__PARENT_SOLVED_BY = SPINAL_ELEMENT__PARENT_SOLVED_BY;

	/**
	 * The feature id for the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL__POINTS_TO = SPINAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Away Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWAY_GOAL_FEATURE_COUNT = SPINAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.SolvedUsingContractImpl <em>Solved Using Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.SolvedUsingContractImpl
	 * @see GSN1.impl.GSN1PackageImpl#getSolvedUsingContract()
	 * @generated
	 */
	int SOLVED_USING_CONTRACT = 17;

	/**
	 * The feature id for the '<em><b>Parent Spinal Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_USING_CONTRACT__PARENT_SPINAL_ELEMENT = SOLVED_BY__PARENT_SPINAL_ELEMENT;

	/**
	 * The feature id for the '<em><b>Child Spinalelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_USING_CONTRACT__CHILD_SPINALELEMENT = SOLVED_BY__CHILD_SPINALELEMENT;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_USING_CONTRACT__CARDINALITY = SOLVED_BY__CARDINALITY;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_USING_CONTRACT__WITH = SOLVED_BY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Solved Using Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLVED_USING_CONTRACT_FEATURE_COUNT = SOLVED_BY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.ContractImpl <em>Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.ContractImpl
	 * @see GSN1.impl.GSN1PackageImpl#getContract()
	 * @generated
	 */
	int CONTRACT = 18;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__IDENTIFIER = ARGUMENT_MODULE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__DESCRIPTION = ARGUMENT_MODULE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CONTAINS_ADDITIONAL = ARGUMENT_MODULE__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Parent Module Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__PARENT_MODULE_OF = ARGUMENT_MODULE__PARENT_MODULE_OF;

	/**
	 * The feature id for the '<em><b>Associated With Other</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__ASSOCIATED_WITH_OTHER = ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER;

	/**
	 * The feature id for the '<em><b>Has Top Level</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__HAS_TOP_LEVEL = ARGUMENT_MODULE__HAS_TOP_LEVEL;

	/**
	 * The feature id for the '<em><b>Contains Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__CONTAINS_ELEMENT = ARGUMENT_MODULE__CONTAINS_ELEMENT;

	/**
	 * The feature id for the '<em><b>Is Used By</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT__IS_USED_BY = ARGUMENT_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRACT_FEATURE_COUNT = ARGUMENT_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.InheritedContextImpl <em>Inherited Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.InheritedContextImpl
	 * @see GSN1.impl.GSN1PackageImpl#getInheritedContext()
	 * @generated
	 */
	int INHERITED_CONTEXT = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__IDENTIFIER = CONTEXTUAL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__DESCRIPTION = CONTEXTUAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Contains Additional</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__CONTAINS_ADDITIONAL = CONTEXTUAL_ELEMENT__CONTAINS_ADDITIONAL;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__VISIBILITY = CONTEXTUAL_ELEMENT__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Contextual Element Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__CONTEXTUAL_ELEMENT_STATUS = CONTEXTUAL_ELEMENT__CONTEXTUAL_ELEMENT_STATUS;

	/**
	 * The feature id for the '<em><b>Is Part Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__IS_PART_OF = CONTEXTUAL_ELEMENT__IS_PART_OF;

	/**
	 * The feature id for the '<em><b>Inherits From Parent Arguments</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inherited Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INHERITED_CONTEXT_FEATURE_COUNT = CONTEXTUAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link GSN1.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.impl.TaggedValueImpl
	 * @see GSN1.impl.GSN1PackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Tagged Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGGED_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link GSN1.ElementStatus <em>Element Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.ElementStatus
	 * @see GSN1.impl.GSN1PackageImpl#getElementStatus()
	 * @generated
	 */
	int ELEMENT_STATUS = 22;

	/**
	 * The meta object id for the '{@link GSN1.ElementVisibility <em>Element Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GSN1.ElementVisibility
	 * @see GSN1.impl.GSN1PackageImpl#getElementVisibility()
	 * @generated
	 */
	int ELEMENT_VISIBILITY = 23;


	/**
	 * Returns the meta object for class '{@link GSN1.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see GSN1.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN1.Case#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see GSN1.Case#getContains()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Contains();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.Case#getAutoID <em>Auto ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto ID</em>'.
	 * @see GSN1.Case#getAutoID()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_AutoID();

	/**
	 * Returns the meta object for class '{@link GSN1.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element</em>'.
	 * @see GSN1.ArgumentElement
	 * @generated
	 */
	EClass getArgumentElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.ArgumentElement#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see GSN1.ArgumentElement#getVisibility()
	 * @see #getArgumentElement()
	 * @generated
	 */
	EAttribute getArgumentElement_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.ArgumentElement#getContextualElementStatus <em>Contextual Element Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contextual Element Status</em>'.
	 * @see GSN1.ArgumentElement#getContextualElementStatus()
	 * @see #getArgumentElement()
	 * @generated
	 */
	EAttribute getArgumentElement_ContextualElementStatus();

	/**
	 * Returns the meta object for the reference '{@link GSN1.ArgumentElement#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Part Of</em>'.
	 * @see GSN1.ArgumentElement#getIsPartOf()
	 * @see #getArgumentElement()
	 * @generated
	 */
	EReference getArgumentElement_IsPartOf();

	/**
	 * Returns the meta object for class '{@link GSN1.SpinalElement <em>Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spinal Element</em>'.
	 * @see GSN1.SpinalElement
	 * @generated
	 */
	EClass getSpinalElement();

	/**
	 * Returns the meta object for the reference '{@link GSN1.SpinalElement#getParentSolvedBy <em>Parent Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Solved By</em>'.
	 * @see GSN1.SpinalElement#getParentSolvedBy()
	 * @see #getSpinalElement()
	 * @generated
	 */
	EReference getSpinalElement_ParentSolvedBy();

	/**
	 * Returns the meta object for class '{@link GSN1.DecomposableSpinalElement <em>Decomposable Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decomposable Spinal Element</em>'.
	 * @see GSN1.DecomposableSpinalElement
	 * @generated
	 */
	EClass getDecomposableSpinalElement();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN1.DecomposableSpinalElement#getChildSolvedBy <em>Child Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Child Solved By</em>'.
	 * @see GSN1.DecomposableSpinalElement#getChildSolvedBy()
	 * @see #getDecomposableSpinalElement()
	 * @generated
	 */
	EReference getDecomposableSpinalElement_ChildSolvedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN1.DecomposableSpinalElement#getHasContext <em>Has Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Context</em>'.
	 * @see GSN1.DecomposableSpinalElement#getHasContext()
	 * @see #getDecomposableSpinalElement()
	 * @generated
	 */
	EReference getDecomposableSpinalElement_HasContext();

	/**
	 * Returns the meta object for class '{@link GSN1.ContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contextual Element</em>'.
	 * @see GSN1.ContextualElement
	 * @generated
	 */
	EClass getContextualElement();

	/**
	 * Returns the meta object for class '{@link GSN1.SolvedBy <em>Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solved By</em>'.
	 * @see GSN1.SolvedBy
	 * @generated
	 */
	EClass getSolvedBy();

	/**
	 * Returns the meta object for the container reference '{@link GSN1.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Spinal Element</em>'.
	 * @see GSN1.SolvedBy#getParentSpinalElement()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EReference getSolvedBy_ParentSpinalElement();

	/**
	 * Returns the meta object for the reference '{@link GSN1.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Child Spinalelement</em>'.
	 * @see GSN1.SolvedBy#getChildSpinalelement()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EReference getSolvedBy_ChildSpinalelement();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.SolvedBy#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality</em>'.
	 * @see GSN1.SolvedBy#getCardinality()
	 * @see #getSolvedBy()
	 * @generated
	 */
	EAttribute getSolvedBy_Cardinality();

	/**
	 * Returns the meta object for class '{@link GSN1.InContextOf <em>In Context Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Context Of</em>'.
	 * @see GSN1.InContextOf
	 * @generated
	 */
	EClass getInContextOf();

	/**
	 * Returns the meta object for the reference '{@link GSN1.InContextOf#getContextualElement <em>Contextual Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contextual Element</em>'.
	 * @see GSN1.InContextOf#getContextualElement()
	 * @see #getInContextOf()
	 * @generated
	 */
	EReference getInContextOf_ContextualElement();

	/**
	 * Returns the meta object for the container reference '{@link GSN1.InContextOf#getContextOfSpinalElement <em>Context Of Spinal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Context Of Spinal Element</em>'.
	 * @see GSN1.InContextOf#getContextOfSpinalElement()
	 * @see #getInContextOf()
	 * @generated
	 */
	EReference getInContextOf_ContextOfSpinalElement();

	/**
	 * Returns the meta object for class '{@link GSN1.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see GSN1.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the container reference '{@link GSN1.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Top Level Goal Of</em>'.
	 * @see GSN1.Goal#getIsTopLevelGoalOf()
	 * @see #getGoal()
	 * @generated
	 */
	EReference getGoal_IsTopLevelGoalOf();

	/**
	 * Returns the meta object for class '{@link GSN1.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see GSN1.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for class '{@link GSN1.Solution <em>Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution</em>'.
	 * @see GSN1.Solution
	 * @generated
	 */
	EClass getSolution();

	/**
	 * Returns the meta object for class '{@link GSN1.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see GSN1.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for class '{@link GSN1.Justification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Justification</em>'.
	 * @see GSN1.Justification
	 * @generated
	 */
	EClass getJustification();

	/**
	 * Returns the meta object for class '{@link GSN1.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assumption</em>'.
	 * @see GSN1.Assumption
	 * @generated
	 */
	EClass getAssumption();

	/**
	 * Returns the meta object for class '{@link GSN1.ArgumentModule <em>Argument Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Module</em>'.
	 * @see GSN1.ArgumentModule
	 * @generated
	 */
	EClass getArgumentModule();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN1.ArgumentModule#getParentModuleOf <em>Parent Module Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parent Module Of</em>'.
	 * @see GSN1.ArgumentModule#getParentModuleOf()
	 * @see #getArgumentModule()
	 * @generated
	 */
	EReference getArgumentModule_ParentModuleOf();

	/**
	 * Returns the meta object for the reference list '{@link GSN1.ArgumentModule#getAssociatedWithOther <em>Associated With Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated With Other</em>'.
	 * @see GSN1.ArgumentModule#getAssociatedWithOther()
	 * @see #getArgumentModule()
	 * @generated
	 */
	EReference getArgumentModule_AssociatedWithOther();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN1.ArgumentModule#getHasTopLevel <em>Has Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Has Top Level</em>'.
	 * @see GSN1.ArgumentModule#getHasTopLevel()
	 * @see #getArgumentModule()
	 * @generated
	 */
	EReference getArgumentModule_HasTopLevel();

	/**
	 * Returns the meta object for the reference list '{@link GSN1.ArgumentModule#getContainsElement <em>Contains Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Element</em>'.
	 * @see GSN1.ArgumentModule#getContainsElement()
	 * @see #getArgumentModule()
	 * @generated
	 */
	EReference getArgumentModule_ContainsElement();

	/**
	 * Returns the meta object for class '{@link GSN1.AwayContext <em>Away Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Context</em>'.
	 * @see GSN1.AwayContext
	 * @generated
	 */
	EClass getAwayContext();

	/**
	 * Returns the meta object for the reference '{@link GSN1.AwayContext#getIcContainedIn <em>Ic Contained In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ic Contained In</em>'.
	 * @see GSN1.AwayContext#getIcContainedIn()
	 * @see #getAwayContext()
	 * @generated
	 */
	EReference getAwayContext_IcContainedIn();

	/**
	 * Returns the meta object for the reference '{@link GSN1.AwayContext#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see GSN1.AwayContext#getPointsTo()
	 * @see #getAwayContext()
	 * @generated
	 */
	EReference getAwayContext_PointsTo();

	/**
	 * Returns the meta object for class '{@link GSN1.AwaySolution <em>Away Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Solution</em>'.
	 * @see GSN1.AwaySolution
	 * @generated
	 */
	EClass getAwaySolution();

	/**
	 * Returns the meta object for the reference '{@link GSN1.AwaySolution#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see GSN1.AwaySolution#getPointsTo()
	 * @see #getAwaySolution()
	 * @generated
	 */
	EReference getAwaySolution_PointsTo();

	/**
	 * Returns the meta object for class '{@link GSN1.AwayGoal <em>Away Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Away Goal</em>'.
	 * @see GSN1.AwayGoal
	 * @generated
	 */
	EClass getAwayGoal();

	/**
	 * Returns the meta object for the reference '{@link GSN1.AwayGoal#getPointsTo <em>Points To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Points To</em>'.
	 * @see GSN1.AwayGoal#getPointsTo()
	 * @see #getAwayGoal()
	 * @generated
	 */
	EReference getAwayGoal_PointsTo();

	/**
	 * Returns the meta object for class '{@link GSN1.SolvedUsingContract <em>Solved Using Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solved Using Contract</em>'.
	 * @see GSN1.SolvedUsingContract
	 * @generated
	 */
	EClass getSolvedUsingContract();

	/**
	 * Returns the meta object for the containment reference '{@link GSN1.SolvedUsingContract#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>With</em>'.
	 * @see GSN1.SolvedUsingContract#getWith()
	 * @see #getSolvedUsingContract()
	 * @generated
	 */
	EReference getSolvedUsingContract_With();

	/**
	 * Returns the meta object for class '{@link GSN1.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contract</em>'.
	 * @see GSN1.Contract
	 * @generated
	 */
	EClass getContract();

	/**
	 * Returns the meta object for the container reference '{@link GSN1.Contract#getIsUsedBy <em>Is Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Is Used By</em>'.
	 * @see GSN1.Contract#getIsUsedBy()
	 * @see #getContract()
	 * @generated
	 */
	EReference getContract_IsUsedBy();

	/**
	 * Returns the meta object for class '{@link GSN1.InheritedContext <em>Inherited Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inherited Context</em>'.
	 * @see GSN1.InheritedContext
	 * @generated
	 */
	EClass getInheritedContext();

	/**
	 * Returns the meta object for the reference list '{@link GSN1.InheritedContext#getInheritsFromParentArguments <em>Inherits From Parent Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inherits From Parent Arguments</em>'.
	 * @see GSN1.InheritedContext#getInheritsFromParentArguments()
	 * @see #getInheritedContext()
	 * @generated
	 */
	EReference getInheritedContext_InheritsFromParentArguments();

	/**
	 * Returns the meta object for class '{@link GSN1.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see GSN1.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.ModelElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see GSN1.ModelElement#getIdentifier()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see GSN1.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link GSN1.ModelElement#getContainsAdditional <em>Contains Additional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Additional</em>'.
	 * @see GSN1.ModelElement#getContainsAdditional()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_ContainsAdditional();

	/**
	 * Returns the meta object for class '{@link GSN1.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see GSN1.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see GSN1.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link GSN1.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GSN1.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for enum '{@link GSN1.ElementStatus <em>Element Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Status</em>'.
	 * @see GSN1.ElementStatus
	 * @generated
	 */
	EEnum getElementStatus();

	/**
	 * Returns the meta object for enum '{@link GSN1.ElementVisibility <em>Element Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Visibility</em>'.
	 * @see GSN1.ElementVisibility
	 * @generated
	 */
	EEnum getElementVisibility();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GSN1Factory getGSN1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link GSN1.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.CaseImpl
		 * @see GSN1.impl.GSN1PackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__CONTAINS = eINSTANCE.getCase_Contains();

		/**
		 * The meta object literal for the '<em><b>Auto ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__AUTO_ID = eINSTANCE.getCase_AutoID();

		/**
		 * The meta object literal for the '{@link GSN1.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.ArgumentElementImpl
		 * @see GSN1.impl.GSN1PackageImpl#getArgumentElement()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT = eINSTANCE.getArgumentElement();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_ELEMENT__VISIBILITY = eINSTANCE.getArgumentElement_Visibility();

		/**
		 * The meta object literal for the '<em><b>Contextual Element Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS = eINSTANCE.getArgumentElement_ContextualElementStatus();

		/**
		 * The meta object literal for the '<em><b>Is Part Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_ELEMENT__IS_PART_OF = eINSTANCE.getArgumentElement_IsPartOf();

		/**
		 * The meta object literal for the '{@link GSN1.impl.SpinalElementImpl <em>Spinal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.SpinalElementImpl
		 * @see GSN1.impl.GSN1PackageImpl#getSpinalElement()
		 * @generated
		 */
		EClass SPINAL_ELEMENT = eINSTANCE.getSpinalElement();

		/**
		 * The meta object literal for the '<em><b>Parent Solved By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPINAL_ELEMENT__PARENT_SOLVED_BY = eINSTANCE.getSpinalElement_ParentSolvedBy();

		/**
		 * The meta object literal for the '{@link GSN1.impl.DecomposableSpinalElementImpl <em>Decomposable Spinal Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.DecomposableSpinalElementImpl
		 * @see GSN1.impl.GSN1PackageImpl#getDecomposableSpinalElement()
		 * @generated
		 */
		EClass DECOMPOSABLE_SPINAL_ELEMENT = eINSTANCE.getDecomposableSpinalElement();

		/**
		 * The meta object literal for the '<em><b>Child Solved By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY = eINSTANCE.getDecomposableSpinalElement_ChildSolvedBy();

		/**
		 * The meta object literal for the '<em><b>Has Context</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT = eINSTANCE.getDecomposableSpinalElement_HasContext();

		/**
		 * The meta object literal for the '{@link GSN1.impl.ContextualElementImpl <em>Contextual Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.ContextualElementImpl
		 * @see GSN1.impl.GSN1PackageImpl#getContextualElement()
		 * @generated
		 */
		EClass CONTEXTUAL_ELEMENT = eINSTANCE.getContextualElement();

		/**
		 * The meta object literal for the '{@link GSN1.impl.SolvedByImpl <em>Solved By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.SolvedByImpl
		 * @see GSN1.impl.GSN1PackageImpl#getSolvedBy()
		 * @generated
		 */
		EClass SOLVED_BY = eINSTANCE.getSolvedBy();

		/**
		 * The meta object literal for the '<em><b>Parent Spinal Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY__PARENT_SPINAL_ELEMENT = eINSTANCE.getSolvedBy_ParentSpinalElement();

		/**
		 * The meta object literal for the '<em><b>Child Spinalelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_BY__CHILD_SPINALELEMENT = eINSTANCE.getSolvedBy_ChildSpinalelement();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLVED_BY__CARDINALITY = eINSTANCE.getSolvedBy_Cardinality();

		/**
		 * The meta object literal for the '{@link GSN1.impl.InContextOfImpl <em>In Context Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.InContextOfImpl
		 * @see GSN1.impl.GSN1PackageImpl#getInContextOf()
		 * @generated
		 */
		EClass IN_CONTEXT_OF = eINSTANCE.getInContextOf();

		/**
		 * The meta object literal for the '<em><b>Contextual Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF__CONTEXTUAL_ELEMENT = eINSTANCE.getInContextOf_ContextualElement();

		/**
		 * The meta object literal for the '<em><b>Context Of Spinal Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT = eINSTANCE.getInContextOf_ContextOfSpinalElement();

		/**
		 * The meta object literal for the '{@link GSN1.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.GoalImpl
		 * @see GSN1.impl.GSN1PackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Is Top Level Goal Of</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOAL__IS_TOP_LEVEL_GOAL_OF = eINSTANCE.getGoal_IsTopLevelGoalOf();

		/**
		 * The meta object literal for the '{@link GSN1.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.StrategyImpl
		 * @see GSN1.impl.GSN1PackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '{@link GSN1.impl.SolutionImpl <em>Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.SolutionImpl
		 * @see GSN1.impl.GSN1PackageImpl#getSolution()
		 * @generated
		 */
		EClass SOLUTION = eINSTANCE.getSolution();

		/**
		 * The meta object literal for the '{@link GSN1.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.ContextImpl
		 * @see GSN1.impl.GSN1PackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '{@link GSN1.impl.JustificationImpl <em>Justification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.JustificationImpl
		 * @see GSN1.impl.GSN1PackageImpl#getJustification()
		 * @generated
		 */
		EClass JUSTIFICATION = eINSTANCE.getJustification();

		/**
		 * The meta object literal for the '{@link GSN1.impl.AssumptionImpl <em>Assumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.AssumptionImpl
		 * @see GSN1.impl.GSN1PackageImpl#getAssumption()
		 * @generated
		 */
		EClass ASSUMPTION = eINSTANCE.getAssumption();

		/**
		 * The meta object literal for the '{@link GSN1.impl.ArgumentModuleImpl <em>Argument Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.ArgumentModuleImpl
		 * @see GSN1.impl.GSN1PackageImpl#getArgumentModule()
		 * @generated
		 */
		EClass ARGUMENT_MODULE = eINSTANCE.getArgumentModule();

		/**
		 * The meta object literal for the '<em><b>Parent Module Of</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_MODULE__PARENT_MODULE_OF = eINSTANCE.getArgumentModule_ParentModuleOf();

		/**
		 * The meta object literal for the '<em><b>Associated With Other</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER = eINSTANCE.getArgumentModule_AssociatedWithOther();

		/**
		 * The meta object literal for the '<em><b>Has Top Level</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_MODULE__HAS_TOP_LEVEL = eINSTANCE.getArgumentModule_HasTopLevel();

		/**
		 * The meta object literal for the '<em><b>Contains Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_MODULE__CONTAINS_ELEMENT = eINSTANCE.getArgumentModule_ContainsElement();

		/**
		 * The meta object literal for the '{@link GSN1.impl.AwayContextImpl <em>Away Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.AwayContextImpl
		 * @see GSN1.impl.GSN1PackageImpl#getAwayContext()
		 * @generated
		 */
		EClass AWAY_CONTEXT = eINSTANCE.getAwayContext();

		/**
		 * The meta object literal for the '<em><b>Ic Contained In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_CONTEXT__IC_CONTAINED_IN = eINSTANCE.getAwayContext_IcContainedIn();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_CONTEXT__POINTS_TO = eINSTANCE.getAwayContext_PointsTo();

		/**
		 * The meta object literal for the '{@link GSN1.impl.AwaySolutionImpl <em>Away Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.AwaySolutionImpl
		 * @see GSN1.impl.GSN1PackageImpl#getAwaySolution()
		 * @generated
		 */
		EClass AWAY_SOLUTION = eINSTANCE.getAwaySolution();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_SOLUTION__POINTS_TO = eINSTANCE.getAwaySolution_PointsTo();

		/**
		 * The meta object literal for the '{@link GSN1.impl.AwayGoalImpl <em>Away Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.AwayGoalImpl
		 * @see GSN1.impl.GSN1PackageImpl#getAwayGoal()
		 * @generated
		 */
		EClass AWAY_GOAL = eINSTANCE.getAwayGoal();

		/**
		 * The meta object literal for the '<em><b>Points To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWAY_GOAL__POINTS_TO = eINSTANCE.getAwayGoal_PointsTo();

		/**
		 * The meta object literal for the '{@link GSN1.impl.SolvedUsingContractImpl <em>Solved Using Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.SolvedUsingContractImpl
		 * @see GSN1.impl.GSN1PackageImpl#getSolvedUsingContract()
		 * @generated
		 */
		EClass SOLVED_USING_CONTRACT = eINSTANCE.getSolvedUsingContract();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLVED_USING_CONTRACT__WITH = eINSTANCE.getSolvedUsingContract_With();

		/**
		 * The meta object literal for the '{@link GSN1.impl.ContractImpl <em>Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.ContractImpl
		 * @see GSN1.impl.GSN1PackageImpl#getContract()
		 * @generated
		 */
		EClass CONTRACT = eINSTANCE.getContract();

		/**
		 * The meta object literal for the '<em><b>Is Used By</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRACT__IS_USED_BY = eINSTANCE.getContract_IsUsedBy();

		/**
		 * The meta object literal for the '{@link GSN1.impl.InheritedContextImpl <em>Inherited Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.InheritedContextImpl
		 * @see GSN1.impl.GSN1PackageImpl#getInheritedContext()
		 * @generated
		 */
		EClass INHERITED_CONTEXT = eINSTANCE.getInheritedContext();

		/**
		 * The meta object literal for the '<em><b>Inherits From Parent Arguments</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS = eINSTANCE.getInheritedContext_InheritsFromParentArguments();

		/**
		 * The meta object literal for the '{@link GSN1.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.ModelElementImpl
		 * @see GSN1.impl.GSN1PackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__IDENTIFIER = eINSTANCE.getModelElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getModelElement_Description();

		/**
		 * The meta object literal for the '<em><b>Contains Additional</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__CONTAINS_ADDITIONAL = eINSTANCE.getModelElement_ContainsAdditional();

		/**
		 * The meta object literal for the '{@link GSN1.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.impl.TaggedValueImpl
		 * @see GSN1.impl.GSN1PackageImpl#getTaggedValue()
		 * @generated
		 */
		EClass TAGGED_VALUE = eINSTANCE.getTaggedValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__KEY = eINSTANCE.getTaggedValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAGGED_VALUE__VALUE = eINSTANCE.getTaggedValue_Value();

		/**
		 * The meta object literal for the '{@link GSN1.ElementStatus <em>Element Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.ElementStatus
		 * @see GSN1.impl.GSN1PackageImpl#getElementStatus()
		 * @generated
		 */
		EEnum ELEMENT_STATUS = eINSTANCE.getElementStatus();

		/**
		 * The meta object literal for the '{@link GSN1.ElementVisibility <em>Element Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GSN1.ElementVisibility
		 * @see GSN1.impl.GSN1PackageImpl#getElementVisibility()
		 * @generated
		 */
		EEnum ELEMENT_VISIBILITY = eINSTANCE.getElementVisibility();

	}

} //GSN1Package
