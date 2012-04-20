/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see arm.ArmFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ArmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ARM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ARM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArmPackage eINSTANCE = arm.impl.ArmPackageImpl.init();

	/**
	 * The meta object id for the '{@link arm.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.CaseImpl
	 * @see arm.impl.ArmPackageImpl#getCase()
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
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link arm.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ModelElementImpl
	 * @see arm.impl.ArmPackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

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
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__IS_TAGGED = 3;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link arm.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.TaggedValueImpl
	 * @see arm.impl.ArmPackageImpl#getTaggedValue()
	 * @generated
	 */
	int TAGGED_VALUE = 2;

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
	 * The meta object id for the '{@link arm.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ArgumentElementImpl
	 * @see arm.impl.ArmPackageImpl#getArgumentElement()
	 * @generated
	 */
	int ARGUMENT_ELEMENT = 5;

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
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__CONTENT = MODEL_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT__IS_TAGGED = MODEL_ELEMENT__IS_TAGGED;

	/**
	 * The number of structural features of the '<em>Argument Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.InformationElementImpl <em>Information Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.InformationElementImpl
	 * @see arm.impl.ArmPackageImpl#getInformationElement()
	 * @generated
	 */
	int INFORMATION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__CONTENT = ARGUMENT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT__IS_TAGGED = ARGUMENT_ELEMENT__IS_TAGGED;

	/**
	 * The number of structural features of the '<em>Information Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.ArgumentImpl <em>Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ArgumentImpl
	 * @see arm.impl.ArmPackageImpl#getArgument()
	 * @generated
	 */
	int ARGUMENT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IDENTIFIER = MODEL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTENT = MODEL_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__IS_TAGGED = MODEL_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Contains Argument Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTAINS_ARGUMENT_ELEMENT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains Argument Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTAINS_ARGUMENT_LINK = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contains Argument</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__CONTAINS_ARGUMENT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link arm.impl.ArgumentLinkImpl <em>Argument Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ArgumentLinkImpl
	 * @see arm.impl.ArmPackageImpl#getArgumentLink()
	 * @generated
	 */
	int ARGUMENT_LINK = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK__IDENTIFIER = MODEL_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK__DESCRIPTION = MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK__CONTENT = MODEL_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK__IS_TAGGED = MODEL_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK__SOURCE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK__TARGET = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argument Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_LINK_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link arm.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AnnotationImpl
	 * @see arm.impl.ArmPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IDENTIFIER = ARGUMENT_LINK__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DESCRIPTION = ARGUMENT_LINK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__CONTENT = ARGUMENT_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__IS_TAGGED = ARGUMENT_LINK__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__SOURCE = ARGUMENT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__TARGET = ARGUMENT_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = ARGUMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.AssertedRealationshipImpl <em>Asserted Realationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AssertedRealationshipImpl
	 * @see arm.impl.ArmPackageImpl#getAssertedRealationship()
	 * @generated
	 */
	int ASSERTED_REALATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP__IDENTIFIER = ARGUMENT_LINK__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP__DESCRIPTION = ARGUMENT_LINK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP__CONTENT = ARGUMENT_LINK__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP__IS_TAGGED = ARGUMENT_LINK__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP__SOURCE = ARGUMENT_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP__TARGET = ARGUMENT_LINK__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Realationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_REALATIONSHIP_FEATURE_COUNT = ARGUMENT_LINK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AssertedInferenceImpl
	 * @see arm.impl.ArmPackageImpl#getAssertedInference()
	 * @generated
	 */
	int ASSERTED_INFERENCE = 9;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IDENTIFIER = ASSERTED_REALATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__DESCRIPTION = ASSERTED_REALATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__CONTENT = ASSERTED_REALATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__IS_TAGGED = ASSERTED_REALATIONSHIP__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__SOURCE = ASSERTED_REALATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE__TARGET = ASSERTED_REALATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Inference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_INFERENCE_FEATURE_COUNT = ASSERTED_REALATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AssertedContextImpl
	 * @see arm.impl.ArmPackageImpl#getAssertedContext()
	 * @generated
	 */
	int ASSERTED_CONTEXT = 10;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IDENTIFIER = ASSERTED_REALATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__DESCRIPTION = ASSERTED_REALATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__CONTENT = ASSERTED_REALATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__IS_TAGGED = ASSERTED_REALATIONSHIP__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__SOURCE = ASSERTED_REALATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT__TARGET = ASSERTED_REALATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CONTEXT_FEATURE_COUNT = ASSERTED_REALATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.AssertedChallengeImpl <em>Asserted Challenge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AssertedChallengeImpl
	 * @see arm.impl.ArmPackageImpl#getAssertedChallenge()
	 * @generated
	 */
	int ASSERTED_CHALLENGE = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__IDENTIFIER = ASSERTED_REALATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__DESCRIPTION = ASSERTED_REALATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__CONTENT = ASSERTED_REALATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__IS_TAGGED = ASSERTED_REALATIONSHIP__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__SOURCE = ASSERTED_REALATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE__TARGET = ASSERTED_REALATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Challenge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_CHALLENGE_FEATURE_COUNT = ASSERTED_REALATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AssertedEvidenceImpl
	 * @see arm.impl.ArmPackageImpl#getAssertedEvidence()
	 * @generated
	 */
	int ASSERTED_EVIDENCE = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IDENTIFIER = ASSERTED_REALATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__DESCRIPTION = ASSERTED_REALATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__CONTENT = ASSERTED_REALATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__IS_TAGGED = ASSERTED_REALATIONSHIP__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__SOURCE = ASSERTED_REALATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE__TARGET = ASSERTED_REALATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_EVIDENCE_FEATURE_COUNT = ASSERTED_REALATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.AssertedCounterEvidenceImpl <em>Asserted Counter Evidence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.AssertedCounterEvidenceImpl
	 * @see arm.impl.ArmPackageImpl#getAssertedCounterEvidence()
	 * @generated
	 */
	int ASSERTED_COUNTER_EVIDENCE = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__IDENTIFIER = ASSERTED_REALATIONSHIP__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__DESCRIPTION = ASSERTED_REALATIONSHIP__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__CONTENT = ASSERTED_REALATIONSHIP__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__IS_TAGGED = ASSERTED_REALATIONSHIP__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__SOURCE = ASSERTED_REALATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE__TARGET = ASSERTED_REALATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Asserted Counter Evidence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTED_COUNTER_EVIDENCE_FEATURE_COUNT = ASSERTED_REALATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.ReasoningElementImpl <em>Reasoning Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ReasoningElementImpl
	 * @see arm.impl.ArmPackageImpl#getReasoningElement()
	 * @generated
	 */
	int REASONING_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__CONTENT = ARGUMENT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT__IS_TAGGED = ARGUMENT_ELEMENT__IS_TAGGED;

	/**
	 * The number of structural features of the '<em>Reasoning Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REASONING_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.CitiationElementImpl <em>Citiation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.CitiationElementImpl
	 * @see arm.impl.ArmPackageImpl#getCitiationElement()
	 * @generated
	 */
	int CITIATION_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT__IDENTIFIER = ARGUMENT_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT__DESCRIPTION = ARGUMENT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT__CONTENT = ARGUMENT_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT__IS_TAGGED = ARGUMENT_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Refers To Argument Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT = ARGUMENT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refers To Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT__REFERS_TO_ARGUMENT = ARGUMENT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Citiation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITIATION_ELEMENT_FEATURE_COUNT = ARGUMENT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link arm.impl.ClaimImpl <em>Claim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ClaimImpl
	 * @see arm.impl.ArmPackageImpl#getClaim()
	 * @generated
	 */
	int CLAIM = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IDENTIFIER = REASONING_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__DESCRIPTION = REASONING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__CONTENT = REASONING_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__IS_TAGGED = REASONING_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__ASSUMED = REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM__TO_BE_SUPPORTED = REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Claim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_FEATURE_COUNT = REASONING_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link arm.impl.EvidenceAssertationImpl <em>Evidence Assertation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.EvidenceAssertationImpl
	 * @see arm.impl.ArmPackageImpl#getEvidenceAssertation()
	 * @generated
	 */
	int EVIDENCE_ASSERTATION = 17;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION__IDENTIFIER = CLAIM__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION__DESCRIPTION = CLAIM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION__CONTENT = CLAIM__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION__IS_TAGGED = CLAIM__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION__ASSUMED = CLAIM__ASSUMED;

	/**
	 * The feature id for the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION__TO_BE_SUPPORTED = CLAIM__TO_BE_SUPPORTED;

	/**
	 * The number of structural features of the '<em>Evidence Assertation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVIDENCE_ASSERTATION_FEATURE_COUNT = CLAIM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link arm.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arm.impl.ArgumentReasoningImpl
	 * @see arm.impl.ArmPackageImpl#getArgumentReasoning()
	 * @generated
	 */
	int ARGUMENT_REASONING = 18;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__IDENTIFIER = REASONING_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIPTION = REASONING_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__CONTENT = REASONING_ELEMENT__CONTENT;

	/**
	 * The feature id for the '<em><b>Is Tagged</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__IS_TAGGED = REASONING_ELEMENT__IS_TAGGED;

	/**
	 * The feature id for the '<em><b>Has Stucture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__HAS_STUCTURE = REASONING_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Describes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING__DESCRIBES = REASONING_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Argument Reasoning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_REASONING_FEATURE_COUNT = REASONING_ELEMENT_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link arm.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see arm.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the containment reference list '{@link arm.Case#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see arm.Case#getContains()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Contains();

	/**
	 * Returns the meta object for class '{@link arm.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see arm.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the attribute '{@link arm.ModelElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see arm.ModelElement#getIdentifier()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link arm.ModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see arm.ModelElement#getDescription()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Description();

	/**
	 * Returns the meta object for the attribute '{@link arm.ModelElement#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see arm.ModelElement#getContent()
	 * @see #getModelElement()
	 * @generated
	 */
	EAttribute getModelElement_Content();

	/**
	 * Returns the meta object for the containment reference list '{@link arm.ModelElement#getIsTagged <em>Is Tagged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Tagged</em>'.
	 * @see arm.ModelElement#getIsTagged()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_IsTagged();

	/**
	 * Returns the meta object for class '{@link arm.TaggedValue <em>Tagged Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tagged Value</em>'.
	 * @see arm.TaggedValue
	 * @generated
	 */
	EClass getTaggedValue();

	/**
	 * Returns the meta object for the attribute '{@link arm.TaggedValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see arm.TaggedValue#getKey()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link arm.TaggedValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see arm.TaggedValue#getValue()
	 * @see #getTaggedValue()
	 * @generated
	 */
	EAttribute getTaggedValue_Value();

	/**
	 * Returns the meta object for class '{@link arm.InformationElement <em>Information Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Element</em>'.
	 * @see arm.InformationElement
	 * @generated
	 */
	EClass getInformationElement();

	/**
	 * Returns the meta object for class '{@link arm.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument</em>'.
	 * @see arm.Argument
	 * @generated
	 */
	EClass getArgument();

	/**
	 * Returns the meta object for the reference list '{@link arm.Argument#getContainsArgumentElement <em>Contains Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Argument Element</em>'.
	 * @see arm.Argument#getContainsArgumentElement()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ContainsArgumentElement();

	/**
	 * Returns the meta object for the reference list '{@link arm.Argument#getContainsArgumentLink <em>Contains Argument Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Argument Link</em>'.
	 * @see arm.Argument#getContainsArgumentLink()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ContainsArgumentLink();

	/**
	 * Returns the meta object for the reference list '{@link arm.Argument#getContainsArgument <em>Contains Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains Argument</em>'.
	 * @see arm.Argument#getContainsArgument()
	 * @see #getArgument()
	 * @generated
	 */
	EReference getArgument_ContainsArgument();

	/**
	 * Returns the meta object for class '{@link arm.ArgumentElement <em>Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Element</em>'.
	 * @see arm.ArgumentElement
	 * @generated
	 */
	EClass getArgumentElement();

	/**
	 * Returns the meta object for class '{@link arm.ArgumentLink <em>Argument Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Link</em>'.
	 * @see arm.ArgumentLink
	 * @generated
	 */
	EClass getArgumentLink();

	/**
	 * Returns the meta object for the reference list '{@link arm.ArgumentLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see arm.ArgumentLink#getSource()
	 * @see #getArgumentLink()
	 * @generated
	 */
	EReference getArgumentLink_Source();

	/**
	 * Returns the meta object for the reference list '{@link arm.ArgumentLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target</em>'.
	 * @see arm.ArgumentLink#getTarget()
	 * @see #getArgumentLink()
	 * @generated
	 */
	EReference getArgumentLink_Target();

	/**
	 * Returns the meta object for class '{@link arm.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see arm.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for class '{@link arm.AssertedRealationship <em>Asserted Realationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Realationship</em>'.
	 * @see arm.AssertedRealationship
	 * @generated
	 */
	EClass getAssertedRealationship();

	/**
	 * Returns the meta object for class '{@link arm.AssertedInference <em>Asserted Inference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Inference</em>'.
	 * @see arm.AssertedInference
	 * @generated
	 */
	EClass getAssertedInference();

	/**
	 * Returns the meta object for class '{@link arm.AssertedContext <em>Asserted Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Context</em>'.
	 * @see arm.AssertedContext
	 * @generated
	 */
	EClass getAssertedContext();

	/**
	 * Returns the meta object for class '{@link arm.AssertedChallenge <em>Asserted Challenge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Challenge</em>'.
	 * @see arm.AssertedChallenge
	 * @generated
	 */
	EClass getAssertedChallenge();

	/**
	 * Returns the meta object for class '{@link arm.AssertedEvidence <em>Asserted Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Evidence</em>'.
	 * @see arm.AssertedEvidence
	 * @generated
	 */
	EClass getAssertedEvidence();

	/**
	 * Returns the meta object for class '{@link arm.AssertedCounterEvidence <em>Asserted Counter Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asserted Counter Evidence</em>'.
	 * @see arm.AssertedCounterEvidence
	 * @generated
	 */
	EClass getAssertedCounterEvidence();

	/**
	 * Returns the meta object for class '{@link arm.ReasoningElement <em>Reasoning Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reasoning Element</em>'.
	 * @see arm.ReasoningElement
	 * @generated
	 */
	EClass getReasoningElement();

	/**
	 * Returns the meta object for class '{@link arm.CitiationElement <em>Citiation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citiation Element</em>'.
	 * @see arm.CitiationElement
	 * @generated
	 */
	EClass getCitiationElement();

	/**
	 * Returns the meta object for the reference '{@link arm.CitiationElement#getRefersToArgumentElement <em>Refers To Argument Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To Argument Element</em>'.
	 * @see arm.CitiationElement#getRefersToArgumentElement()
	 * @see #getCitiationElement()
	 * @generated
	 */
	EReference getCitiationElement_RefersToArgumentElement();

	/**
	 * Returns the meta object for the reference '{@link arm.CitiationElement#getRefersToArgument <em>Refers To Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers To Argument</em>'.
	 * @see arm.CitiationElement#getRefersToArgument()
	 * @see #getCitiationElement()
	 * @generated
	 */
	EReference getCitiationElement_RefersToArgument();

	/**
	 * Returns the meta object for class '{@link arm.Claim <em>Claim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim</em>'.
	 * @see arm.Claim
	 * @generated
	 */
	EClass getClaim();

	/**
	 * Returns the meta object for the attribute '{@link arm.Claim#isAssumed <em>Assumed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assumed</em>'.
	 * @see arm.Claim#isAssumed()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_Assumed();

	/**
	 * Returns the meta object for the attribute '{@link arm.Claim#isToBeSupported <em>To Be Supported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Be Supported</em>'.
	 * @see arm.Claim#isToBeSupported()
	 * @see #getClaim()
	 * @generated
	 */
	EAttribute getClaim_ToBeSupported();

	/**
	 * Returns the meta object for class '{@link arm.EvidenceAssertation <em>Evidence Assertation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evidence Assertation</em>'.
	 * @see arm.EvidenceAssertation
	 * @generated
	 */
	EClass getEvidenceAssertation();

	/**
	 * Returns the meta object for class '{@link arm.ArgumentReasoning <em>Argument Reasoning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Reasoning</em>'.
	 * @see arm.ArgumentReasoning
	 * @generated
	 */
	EClass getArgumentReasoning();

	/**
	 * Returns the meta object for the reference '{@link arm.ArgumentReasoning#getHasStucture <em>Has Stucture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Has Stucture</em>'.
	 * @see arm.ArgumentReasoning#getHasStucture()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_HasStucture();

	/**
	 * Returns the meta object for the reference list '{@link arm.ArgumentReasoning#getDescribes <em>Describes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Describes</em>'.
	 * @see arm.ArgumentReasoning#getDescribes()
	 * @see #getArgumentReasoning()
	 * @generated
	 */
	EReference getArgumentReasoning_Describes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArmFactory getArmFactory();

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
		 * The meta object literal for the '{@link arm.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.CaseImpl
		 * @see arm.impl.ArmPackageImpl#getCase()
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
		 * The meta object literal for the '{@link arm.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ModelElementImpl
		 * @see arm.impl.ArmPackageImpl#getModelElement()
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
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ELEMENT__CONTENT = eINSTANCE.getModelElement_Content();

		/**
		 * The meta object literal for the '<em><b>Is Tagged</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__IS_TAGGED = eINSTANCE.getModelElement_IsTagged();

		/**
		 * The meta object literal for the '{@link arm.impl.TaggedValueImpl <em>Tagged Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.TaggedValueImpl
		 * @see arm.impl.ArmPackageImpl#getTaggedValue()
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
		 * The meta object literal for the '{@link arm.impl.InformationElementImpl <em>Information Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.InformationElementImpl
		 * @see arm.impl.ArmPackageImpl#getInformationElement()
		 * @generated
		 */
		EClass INFORMATION_ELEMENT = eINSTANCE.getInformationElement();

		/**
		 * The meta object literal for the '{@link arm.impl.ArgumentImpl <em>Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ArgumentImpl
		 * @see arm.impl.ArmPackageImpl#getArgument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getArgument();

		/**
		 * The meta object literal for the '<em><b>Contains Argument Element</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONTAINS_ARGUMENT_ELEMENT = eINSTANCE.getArgument_ContainsArgumentElement();

		/**
		 * The meta object literal for the '<em><b>Contains Argument Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONTAINS_ARGUMENT_LINK = eINSTANCE.getArgument_ContainsArgumentLink();

		/**
		 * The meta object literal for the '<em><b>Contains Argument</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__CONTAINS_ARGUMENT = eINSTANCE.getArgument_ContainsArgument();

		/**
		 * The meta object literal for the '{@link arm.impl.ArgumentElementImpl <em>Argument Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ArgumentElementImpl
		 * @see arm.impl.ArmPackageImpl#getArgumentElement()
		 * @generated
		 */
		EClass ARGUMENT_ELEMENT = eINSTANCE.getArgumentElement();

		/**
		 * The meta object literal for the '{@link arm.impl.ArgumentLinkImpl <em>Argument Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ArgumentLinkImpl
		 * @see arm.impl.ArmPackageImpl#getArgumentLink()
		 * @generated
		 */
		EClass ARGUMENT_LINK = eINSTANCE.getArgumentLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_LINK__SOURCE = eINSTANCE.getArgumentLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_LINK__TARGET = eINSTANCE.getArgumentLink_Target();

		/**
		 * The meta object literal for the '{@link arm.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AnnotationImpl
		 * @see arm.impl.ArmPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '{@link arm.impl.AssertedRealationshipImpl <em>Asserted Realationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AssertedRealationshipImpl
		 * @see arm.impl.ArmPackageImpl#getAssertedRealationship()
		 * @generated
		 */
		EClass ASSERTED_REALATIONSHIP = eINSTANCE.getAssertedRealationship();

		/**
		 * The meta object literal for the '{@link arm.impl.AssertedInferenceImpl <em>Asserted Inference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AssertedInferenceImpl
		 * @see arm.impl.ArmPackageImpl#getAssertedInference()
		 * @generated
		 */
		EClass ASSERTED_INFERENCE = eINSTANCE.getAssertedInference();

		/**
		 * The meta object literal for the '{@link arm.impl.AssertedContextImpl <em>Asserted Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AssertedContextImpl
		 * @see arm.impl.ArmPackageImpl#getAssertedContext()
		 * @generated
		 */
		EClass ASSERTED_CONTEXT = eINSTANCE.getAssertedContext();

		/**
		 * The meta object literal for the '{@link arm.impl.AssertedChallengeImpl <em>Asserted Challenge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AssertedChallengeImpl
		 * @see arm.impl.ArmPackageImpl#getAssertedChallenge()
		 * @generated
		 */
		EClass ASSERTED_CHALLENGE = eINSTANCE.getAssertedChallenge();

		/**
		 * The meta object literal for the '{@link arm.impl.AssertedEvidenceImpl <em>Asserted Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AssertedEvidenceImpl
		 * @see arm.impl.ArmPackageImpl#getAssertedEvidence()
		 * @generated
		 */
		EClass ASSERTED_EVIDENCE = eINSTANCE.getAssertedEvidence();

		/**
		 * The meta object literal for the '{@link arm.impl.AssertedCounterEvidenceImpl <em>Asserted Counter Evidence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.AssertedCounterEvidenceImpl
		 * @see arm.impl.ArmPackageImpl#getAssertedCounterEvidence()
		 * @generated
		 */
		EClass ASSERTED_COUNTER_EVIDENCE = eINSTANCE.getAssertedCounterEvidence();

		/**
		 * The meta object literal for the '{@link arm.impl.ReasoningElementImpl <em>Reasoning Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ReasoningElementImpl
		 * @see arm.impl.ArmPackageImpl#getReasoningElement()
		 * @generated
		 */
		EClass REASONING_ELEMENT = eINSTANCE.getReasoningElement();

		/**
		 * The meta object literal for the '{@link arm.impl.CitiationElementImpl <em>Citiation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.CitiationElementImpl
		 * @see arm.impl.ArmPackageImpl#getCitiationElement()
		 * @generated
		 */
		EClass CITIATION_ELEMENT = eINSTANCE.getCitiationElement();

		/**
		 * The meta object literal for the '<em><b>Refers To Argument Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT = eINSTANCE.getCitiationElement_RefersToArgumentElement();

		/**
		 * The meta object literal for the '<em><b>Refers To Argument</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITIATION_ELEMENT__REFERS_TO_ARGUMENT = eINSTANCE.getCitiationElement_RefersToArgument();

		/**
		 * The meta object literal for the '{@link arm.impl.ClaimImpl <em>Claim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ClaimImpl
		 * @see arm.impl.ArmPackageImpl#getClaim()
		 * @generated
		 */
		EClass CLAIM = eINSTANCE.getClaim();

		/**
		 * The meta object literal for the '<em><b>Assumed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__ASSUMED = eINSTANCE.getClaim_Assumed();

		/**
		 * The meta object literal for the '<em><b>To Be Supported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM__TO_BE_SUPPORTED = eINSTANCE.getClaim_ToBeSupported();

		/**
		 * The meta object literal for the '{@link arm.impl.EvidenceAssertationImpl <em>Evidence Assertation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.EvidenceAssertationImpl
		 * @see arm.impl.ArmPackageImpl#getEvidenceAssertation()
		 * @generated
		 */
		EClass EVIDENCE_ASSERTATION = eINSTANCE.getEvidenceAssertation();

		/**
		 * The meta object literal for the '{@link arm.impl.ArgumentReasoningImpl <em>Argument Reasoning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arm.impl.ArgumentReasoningImpl
		 * @see arm.impl.ArmPackageImpl#getArgumentReasoning()
		 * @generated
		 */
		EClass ARGUMENT_REASONING = eINSTANCE.getArgumentReasoning();

		/**
		 * The meta object literal for the '<em><b>Has Stucture</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__HAS_STUCTURE = eINSTANCE.getArgumentReasoning_HasStucture();

		/**
		 * The meta object literal for the '<em><b>Describes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT_REASONING__DESCRIBES = eINSTANCE.getArgumentReasoning_Describes();

	}

} //ArmPackage
