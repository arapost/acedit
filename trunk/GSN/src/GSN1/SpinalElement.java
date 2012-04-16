/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spinal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.SpinalElement#getParentSolvedBy <em>Parent Solved By</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getSpinalElement()
 * @model abstract="true"
 * @generated
 */
public interface SpinalElement extends ArgumentElement {
	/**
	 * Returns the value of the '<em><b>Parent Solved By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GSN1.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Solved By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Solved By</em>' reference.
	 * @see #setParentSolvedBy(SolvedBy)
	 * @see GSN1.GSN1Package#getSpinalElement_ParentSolvedBy()
	 * @see GSN1.SolvedBy#getChildSpinalelement
	 * @model opposite="childSpinalelement" required="true"
	 * @generated
	 */
	SolvedBy getParentSolvedBy();

	/**
	 * Sets the value of the '{@link GSN1.SpinalElement#getParentSolvedBy <em>Parent Solved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Solved By</em>' reference.
	 * @see #getParentSolvedBy()
	 * @generated
	 */
	void setParentSolvedBy(SolvedBy value);

} // SpinalElement
