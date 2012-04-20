/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solved By Modular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.SolvedByModular#getChildSolvedByModular <em>Child Solved By Modular</em>}</li>
 *   <li>{@link GSN1.SolvedByModular#getParentSolvedByModuleElement <em>Parent Solved By Module Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getSolvedByModular()
 * @model annotation="gmf.link source='parentSolvedByModular' target='childSolvedByModular' style='solid' width='1' target.decoration='filledclosedarrow' tool.small.path='GSN_tooling_icons/solvedBy.gif' tool.large.path='GSN_tooling_icons/solvedBy.gif' tool.small.bundle='GSN' tool.large.bundle='GSN'"
 * @generated
 */
public interface SolvedByModular extends EObject {
	/**
	 * Returns the value of the '<em><b>Child Solved By Modular</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Solved By Modular</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Solved By Modular</em>' reference.
	 * @see #setChildSolvedByModular(Module)
	 * @see GSN1.GSN1Package#getSolvedByModular_ChildSolvedByModular()
	 * @model required="true"
	 * @generated
	 */
	Module getChildSolvedByModular();

	/**
	 * Sets the value of the '{@link GSN1.SolvedByModular#getChildSolvedByModular <em>Child Solved By Modular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Solved By Modular</em>' reference.
	 * @see #getChildSolvedByModular()
	 * @generated
	 */
	void setChildSolvedByModular(Module value);

	/**
	 * Returns the value of the '<em><b>Parent Solved By Module Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN1.Module#getParentSolvedByModular <em>Parent Solved By Modular</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Solved By Module Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Solved By Module Element</em>' container reference.
	 * @see #setParentSolvedByModuleElement(Module)
	 * @see GSN1.GSN1Package#getSolvedByModular_ParentSolvedByModuleElement()
	 * @see GSN1.Module#getParentSolvedByModular
	 * @model opposite="parentSolvedByModular" required="true" transient="false"
	 * @generated
	 */
	Module getParentSolvedByModuleElement();

	/**
	 * Sets the value of the '{@link GSN1.SolvedByModular#getParentSolvedByModuleElement <em>Parent Solved By Module Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Solved By Module Element</em>' container reference.
	 * @see #getParentSolvedByModuleElement()
	 * @generated
	 */
	void setParentSolvedByModuleElement(Module value);

} // SolvedByModular
