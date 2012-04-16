/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.ArgumentModule#getParentModuleOf <em>Parent Module Of</em>}</li>
 *   <li>{@link GSN1.ArgumentModule#getAssociatedWithOther <em>Associated With Other</em>}</li>
 *   <li>{@link GSN1.ArgumentModule#getHasTopLevel <em>Has Top Level</em>}</li>
 *   <li>{@link GSN1.ArgumentModule#getContainsElement <em>Contains Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getArgumentModule()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='rectangle'"
 * @generated
 */
public interface ArgumentModule extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Parent Module Of</b></em>' containment reference list.
	 * The list contents are of type {@link GSN1.ArgumentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Module Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module Of</em>' containment reference list.
	 * @see GSN1.GSN1Package#getArgumentModule_ParentModuleOf()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentModule> getParentModuleOf();

	/**
	 * Returns the value of the '<em><b>Associated With Other</b></em>' reference list.
	 * The list contents are of type {@link GSN1.ArgumentModule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated With Other</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated With Other</em>' reference list.
	 * @see GSN1.GSN1Package#getArgumentModule_AssociatedWithOther()
	 * @model
	 * @generated
	 */
	EList<ArgumentModule> getAssociatedWithOther();

	/**
	 * Returns the value of the '<em><b>Has Top Level</b></em>' containment reference list.
	 * The list contents are of type {@link GSN1.Goal}.
	 * It is bidirectional and its opposite is '{@link GSN1.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Top Level</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Top Level</em>' containment reference list.
	 * @see GSN1.GSN1Package#getArgumentModule_HasTopLevel()
	 * @see GSN1.Goal#getIsTopLevelGoalOf
	 * @model opposite="isTopLevelGoalOf" containment="true"
	 * @generated
	 */
	EList<Goal> getHasTopLevel();

	/**
	 * Returns the value of the '<em><b>Contains Element</b></em>' reference list.
	 * The list contents are of type {@link GSN1.ArgumentElement}.
	 * It is bidirectional and its opposite is '{@link GSN1.ArgumentElement#getIsPartOf <em>Is Part Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Element</em>' reference list.
	 * @see GSN1.GSN1Package#getArgumentModule_ContainsElement()
	 * @see GSN1.ArgumentElement#getIsPartOf
	 * @model opposite="isPartOf"
	 * @generated
	 */
	EList<ArgumentElement> getContainsElement();

} // ArgumentModule
