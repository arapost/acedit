/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.Contract#getIsUsedBy <em>Is Used By</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getContract()
 * @model
 * @generated
 */
public interface Contract extends ArgumentModule {
	/**
	 * Returns the value of the '<em><b>Is Used By</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN1.SolvedUsingContract#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Used By</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Used By</em>' container reference.
	 * @see #setIsUsedBy(SolvedUsingContract)
	 * @see GSN1.GSN1Package#getContract_IsUsedBy()
	 * @see GSN1.SolvedUsingContract#getWith
	 * @model opposite="with" required="true" transient="false"
	 * @generated
	 */
	SolvedUsingContract getIsUsedBy();

	/**
	 * Sets the value of the '{@link GSN1.Contract#getIsUsedBy <em>Is Used By</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Used By</em>' container reference.
	 * @see #getIsUsedBy()
	 * @generated
	 */
	void setIsUsedBy(SolvedUsingContract value);

} // Contract
