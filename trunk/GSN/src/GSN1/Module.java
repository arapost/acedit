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
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.Module#getParentModuleOf <em>Parent Module Of</em>}</li>
 *   <li>{@link GSN1.Module#getAssociatedWithOther <em>Associated With Other</em>}</li>
 *   <li>{@link GSN1.Module#getHasTopLevel <em>Has Top Level</em>}</li>
 *   <li>{@link GSN1.Module#getContainsElement <em>Contains Element</em>}</li>
 *   <li>{@link GSN1.Module#getParentSolvedByModular <em>Parent Solved By Modular</em>}</li>
 *   <li>{@link GSN1.Module#getHasContext <em>Has Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getModule()
 * @model abstract="true"
 * @generated
 */
public interface Module extends ModelElement, SolvedByTargetElement {
	/**
	 * Returns the value of the '<em><b>Parent Module Of</b></em>' reference list.
	 * The list contents are of type {@link GSN1.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Module Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Module Of</em>' reference list.
	 * @see GSN1.GSN1Package#getModule_ParentModuleOf()
	 * @model
	 * @generated
	 */
	EList<Module> getParentModuleOf();

	/**
	 * Returns the value of the '<em><b>Associated With Other</b></em>' reference list.
	 * The list contents are of type {@link GSN1.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated With Other</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated With Other</em>' reference list.
	 * @see GSN1.GSN1Package#getModule_AssociatedWithOther()
	 * @model
	 * @generated
	 */
	EList<Module> getAssociatedWithOther();

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
	 * @see GSN1.GSN1Package#getModule_HasTopLevel()
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
	 * @see GSN1.GSN1Package#getModule_ContainsElement()
	 * @see GSN1.ArgumentElement#getIsPartOf
	 * @model opposite="isPartOf"
	 * @generated
	 */
	EList<ArgumentElement> getContainsElement();

	/**
	 * Returns the value of the '<em><b>Parent Solved By Modular</b></em>' containment reference list.
	 * The list contents are of type {@link GSN1.SolvedByModular}.
	 * It is bidirectional and its opposite is '{@link GSN1.SolvedByModular#getParentSolvedByModuleElement <em>Parent Solved By Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Solved By Modular</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Solved By Modular</em>' containment reference list.
	 * @see GSN1.GSN1Package#getModule_ParentSolvedByModular()
	 * @see GSN1.SolvedByModular#getParentSolvedByModuleElement
	 * @model opposite="parentSolvedByModuleElement" containment="true"
	 * @generated
	 */
	EList<SolvedByModular> getParentSolvedByModular();

	/**
	 * Returns the value of the '<em><b>Has Context</b></em>' containment reference list.
	 * The list contents are of type {@link GSN1.InContextOfModular}.
	 * It is bidirectional and its opposite is '{@link GSN1.InContextOfModular#getParentInConextOfModuleElement <em>Parent In Conext Of Module Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Context</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Context</em>' containment reference list.
	 * @see GSN1.GSN1Package#getModule_HasContext()
	 * @see GSN1.InContextOfModular#getParentInConextOfModuleElement
	 * @model opposite="parentInConextOfModuleElement" containment="true"
	 * @generated
	 */
	EList<InContextOfModular> getHasContext();

} // Module
