/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.AwayContext#getIcContainedIn <em>Ic Contained In</em>}</li>
 *   <li>{@link GSN1.AwayContext#getPointsTo <em>Points To</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getAwayContext()
 * @model
 * @generated
 */
public interface AwayContext extends ContextualElement {
	/**
	 * Returns the value of the '<em><b>Ic Contained In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ic Contained In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ic Contained In</em>' reference.
	 * @see #setIcContainedIn(ArgumentModule)
	 * @see GSN1.GSN1Package#getAwayContext_IcContainedIn()
	 * @model required="true"
	 * @generated
	 */
	ArgumentModule getIcContainedIn();

	/**
	 * Sets the value of the '{@link GSN1.AwayContext#getIcContainedIn <em>Ic Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ic Contained In</em>' reference.
	 * @see #getIcContainedIn()
	 * @generated
	 */
	void setIcContainedIn(ArgumentModule value);

	/**
	 * Returns the value of the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points To</em>' reference.
	 * @see #setPointsTo(Goal)
	 * @see GSN1.GSN1Package#getAwayContext_PointsTo()
	 * @model required="true"
	 * @generated
	 */
	Goal getPointsTo();

	/**
	 * Sets the value of the '{@link GSN1.AwayContext#getPointsTo <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points To</em>' reference.
	 * @see #getPointsTo()
	 * @generated
	 */
	void setPointsTo(Goal value);

} // AwayContext
