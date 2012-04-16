/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solved By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}</li>
 *   <li>{@link GSN1.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}</li>
 *   <li>{@link GSN1.SolvedBy#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getSolvedBy()
 * @model annotation="gmf.link source='parentSpinalElement' target='childSpinalelement' style='solid' width='1' target.decoration='arrow' tool.small.path='GSN_tooling_icons/solvedBy.gif' tool.large.path='GSN_tooling_icons/solvedBy.gif' tool.small.bundle='GSN' tool.large.bundle='GSN'"
 * @generated
 */
public interface SolvedBy extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Spinal Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN1.DecomposableSpinalElement#getChildSolvedBy <em>Child Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Spinal Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Spinal Element</em>' container reference.
	 * @see #setParentSpinalElement(DecomposableSpinalElement)
	 * @see GSN1.GSN1Package#getSolvedBy_ParentSpinalElement()
	 * @see GSN1.DecomposableSpinalElement#getChildSolvedBy
	 * @model opposite="childSolvedBy" required="true" transient="false"
	 * @generated
	 */
	DecomposableSpinalElement getParentSpinalElement();

	/**
	 * Sets the value of the '{@link GSN1.SolvedBy#getParentSpinalElement <em>Parent Spinal Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Spinal Element</em>' container reference.
	 * @see #getParentSpinalElement()
	 * @generated
	 */
	void setParentSpinalElement(DecomposableSpinalElement value);

	/**
	 * Returns the value of the '<em><b>Child Spinalelement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link GSN1.SpinalElement#getParentSolvedBy <em>Parent Solved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Spinalelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Spinalelement</em>' reference.
	 * @see #setChildSpinalelement(SpinalElement)
	 * @see GSN1.GSN1Package#getSolvedBy_ChildSpinalelement()
	 * @see GSN1.SpinalElement#getParentSolvedBy
	 * @model opposite="parentSolvedBy" required="true"
	 * @generated
	 */
	SpinalElement getChildSpinalelement();

	/**
	 * Sets the value of the '{@link GSN1.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child Spinalelement</em>' reference.
	 * @see #getChildSpinalelement()
	 * @generated
	 */
	void setChildSpinalelement(SpinalElement value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see #setCardinality(Integer)
	 * @see GSN1.GSN1Package#getSolvedBy_Cardinality()
	 * @model
	 * @generated
	 */
	Integer getCardinality();

	/**
	 * Sets the value of the '{@link GSN1.SolvedBy#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Integer value);

} // SolvedBy
