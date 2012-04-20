/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arm.Argument#getContainsArgumentElement <em>Contains Argument Element</em>}</li>
 *   <li>{@link arm.Argument#getContainsArgumentLink <em>Contains Argument Link</em>}</li>
 *   <li>{@link arm.Argument#getContainsArgument <em>Contains Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see arm.ArmPackage#getArgument()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='rectangle' size='110,70'"
 * @generated
 */
public interface Argument extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Contains Argument Element</b></em>' reference list.
	 * The list contents are of type {@link arm.ArgumentElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Argument Element</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Argument Element</em>' reference list.
	 * @see arm.ArmPackage#getArgument_ContainsArgumentElement()
	 * @model
	 * @generated
	 */
	EList<ArgumentElement> getContainsArgumentElement();

	/**
	 * Returns the value of the '<em><b>Contains Argument Link</b></em>' reference list.
	 * The list contents are of type {@link arm.ArgumentLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Argument Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Argument Link</em>' reference list.
	 * @see arm.ArmPackage#getArgument_ContainsArgumentLink()
	 * @model
	 * @generated
	 */
	EList<ArgumentLink> getContainsArgumentLink();

	/**
	 * Returns the value of the '<em><b>Contains Argument</b></em>' reference list.
	 * The list contents are of type {@link arm.Argument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Argument</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Argument</em>' reference list.
	 * @see arm.ArmPackage#getArgument_ContainsArgument()
	 * @model
	 * @generated
	 */
	EList<Argument> getContainsArgument();

} // Argument
