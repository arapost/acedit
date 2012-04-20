/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.ArgumentElement#getTobeinstantiated <em>Tobeinstantiated</em>}</li>
 *   <li>{@link GSN1.ArgumentElement#getIsPartOf <em>Is Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getArgumentElement()
 * @model abstract="true"
 * @generated
 */
public interface ArgumentElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Tobeinstantiated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tobeinstantiated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tobeinstantiated</em>' attribute.
	 * @see #setTobeinstantiated(Boolean)
	 * @see GSN1.GSN1Package#getArgumentElement_Tobeinstantiated()
	 * @model default="false"
	 * @generated
	 */
	Boolean getTobeinstantiated();

	/**
	 * Sets the value of the '{@link GSN1.ArgumentElement#getTobeinstantiated <em>Tobeinstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tobeinstantiated</em>' attribute.
	 * @see #getTobeinstantiated()
	 * @generated
	 */
	void setTobeinstantiated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GSN1.Module#getContainsElement <em>Contains Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' reference.
	 * @see #setIsPartOf(Module)
	 * @see GSN1.GSN1Package#getArgumentElement_IsPartOf()
	 * @see GSN1.Module#getContainsElement
	 * @model opposite="containsElement" required="true"
	 * @generated
	 */
	Module getIsPartOf();

	/**
	 * Sets the value of the '{@link GSN1.ArgumentElement#getIsPartOf <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(Module value);

} // ArgumentElement
