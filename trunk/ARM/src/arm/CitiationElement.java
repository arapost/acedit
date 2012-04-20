/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citiation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arm.CitiationElement#getRefersToArgumentElement <em>Refers To Argument Element</em>}</li>
 *   <li>{@link arm.CitiationElement#getRefersToArgument <em>Refers To Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see arm.ArmPackage#getCitiationElement()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='rectangle' size='100,70'"
 * @generated
 */
public interface CitiationElement extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Refers To Argument Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To Argument Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Argument Element</em>' reference.
	 * @see #setRefersToArgumentElement(ArgumentElement)
	 * @see arm.ArmPackage#getCitiationElement_RefersToArgumentElement()
	 * @model
	 * @generated
	 */
	ArgumentElement getRefersToArgumentElement();

	/**
	 * Sets the value of the '{@link arm.CitiationElement#getRefersToArgumentElement <em>Refers To Argument Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Argument Element</em>' reference.
	 * @see #getRefersToArgumentElement()
	 * @generated
	 */
	void setRefersToArgumentElement(ArgumentElement value);

	/**
	 * Returns the value of the '<em><b>Refers To Argument</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers To Argument</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers To Argument</em>' reference.
	 * @see #setRefersToArgument(Argument)
	 * @see arm.ArmPackage#getCitiationElement_RefersToArgument()
	 * @model
	 * @generated
	 */
	Argument getRefersToArgument();

	/**
	 * Sets the value of the '{@link arm.CitiationElement#getRefersToArgument <em>Refers To Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers To Argument</em>' reference.
	 * @see #getRefersToArgument()
	 * @generated
	 */
	void setRefersToArgument(Argument value);

} // CitiationElement
