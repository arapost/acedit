/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arm.Claim#isAssumed <em>Assumed</em>}</li>
 *   <li>{@link arm.Claim#isToBeSupported <em>To Be Supported</em>}</li>
 * </ul>
 * </p>
 *
 * @see arm.ArmPackage#getClaim()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='rectangle' size='100,70'"
 * @generated
 */
public interface Claim extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Assumed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assumed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assumed</em>' attribute.
	 * @see #setAssumed(boolean)
	 * @see arm.ArmPackage#getClaim_Assumed()
	 * @model
	 * @generated
	 */
	boolean isAssumed();

	/**
	 * Sets the value of the '{@link arm.Claim#isAssumed <em>Assumed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assumed</em>' attribute.
	 * @see #isAssumed()
	 * @generated
	 */
	void setAssumed(boolean value);

	/**
	 * Returns the value of the '<em><b>To Be Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Supported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Supported</em>' attribute.
	 * @see #setToBeSupported(boolean)
	 * @see arm.ArmPackage#getClaim_ToBeSupported()
	 * @model
	 * @generated
	 */
	boolean isToBeSupported();

	/**
	 * Sets the value of the '{@link arm.Claim#isToBeSupported <em>To Be Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Supported</em>' attribute.
	 * @see #isToBeSupported()
	 * @generated
	 */
	void setToBeSupported(boolean value);

} // Claim
