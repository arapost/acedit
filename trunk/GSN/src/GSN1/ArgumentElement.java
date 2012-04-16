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
 *   <li>{@link GSN1.ArgumentElement#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link GSN1.ArgumentElement#getContextualElementStatus <em>Contextual Element Status</em>}</li>
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
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link GSN1.ElementVisibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see GSN1.ElementVisibility
	 * @see #setVisibility(ElementVisibility)
	 * @see GSN1.GSN1Package#getArgumentElement_Visibility()
	 * @model
	 * @generated
	 */
	ElementVisibility getVisibility();

	/**
	 * Sets the value of the '{@link GSN1.ArgumentElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see GSN1.ElementVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(ElementVisibility value);

	/**
	 * Returns the value of the '<em><b>Contextual Element Status</b></em>' attribute.
	 * The literals are from the enumeration {@link GSN1.ElementStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contextual Element Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contextual Element Status</em>' attribute.
	 * @see GSN1.ElementStatus
	 * @see #setContextualElementStatus(ElementStatus)
	 * @see GSN1.GSN1Package#getArgumentElement_ContextualElementStatus()
	 * @model
	 * @generated
	 */
	ElementStatus getContextualElementStatus();

	/**
	 * Sets the value of the '{@link GSN1.ArgumentElement#getContextualElementStatus <em>Contextual Element Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contextual Element Status</em>' attribute.
	 * @see GSN1.ElementStatus
	 * @see #getContextualElementStatus()
	 * @generated
	 */
	void setContextualElementStatus(ElementStatus value);

	/**
	 * Returns the value of the '<em><b>Is Part Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GSN1.ArgumentModule#getContainsElement <em>Contains Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Part Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Part Of</em>' reference.
	 * @see #setIsPartOf(ArgumentModule)
	 * @see GSN1.GSN1Package#getArgumentElement_IsPartOf()
	 * @see GSN1.ArgumentModule#getContainsElement
	 * @model opposite="containsElement" required="true"
	 * @generated
	 */
	ArgumentModule getIsPartOf();

	/**
	 * Sets the value of the '{@link GSN1.ArgumentElement#getIsPartOf <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Part Of</em>' reference.
	 * @see #getIsPartOf()
	 * @generated
	 */
	void setIsPartOf(ArgumentModule value);

} // ArgumentElement
