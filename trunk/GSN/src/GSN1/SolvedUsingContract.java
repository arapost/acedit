/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solved Using Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.SolvedUsingContract#getWith <em>With</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getSolvedUsingContract()
 * @model
 * @generated
 */
public interface SolvedUsingContract extends SolvedBy {
	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link GSN1.Contract#getIsUsedBy <em>Is Used By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference.
	 * @see #setWith(Contract)
	 * @see GSN1.GSN1Package#getSolvedUsingContract_With()
	 * @see GSN1.Contract#getIsUsedBy
	 * @model opposite="isUsedBy" containment="true" required="true"
	 * @generated
	 */
	Contract getWith();

	/**
	 * Sets the value of the '{@link GSN1.SolvedUsingContract#getWith <em>With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' containment reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(Contract value);

} // SolvedUsingContract
