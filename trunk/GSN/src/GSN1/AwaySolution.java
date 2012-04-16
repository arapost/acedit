/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.AwaySolution#getPointsTo <em>Points To</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getAwaySolution()
 * @model
 * @generated
 */
public interface AwaySolution extends SpinalElement {
	/**
	 * Returns the value of the '<em><b>Points To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points To</em>' reference.
	 * @see #setPointsTo(Solution)
	 * @see GSN1.GSN1Package#getAwaySolution_PointsTo()
	 * @model required="true"
	 * @generated
	 */
	Solution getPointsTo();

	/**
	 * Sets the value of the '{@link GSN1.AwaySolution#getPointsTo <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points To</em>' reference.
	 * @see #getPointsTo()
	 * @generated
	 */
	void setPointsTo(Solution value);

} // AwaySolution
