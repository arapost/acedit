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
 * A representation of the model object '<em><b>Argument Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arm.ArgumentLink#getSource <em>Source</em>}</li>
 *   <li>{@link arm.ArgumentLink#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see arm.ArmPackage#getArgumentLink()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentLink extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link arm.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see arm.ArmPackage#getArgumentLink_Source()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link arm.ModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see arm.ArmPackage#getArgumentLink_Target()
	 * @model
	 * @generated
	 */
	EList<ModelElement> getTarget();

} // ArgumentLink
