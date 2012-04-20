/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solved By Target Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.SolvedByTargetElement#getParentSolvedBy <em>Parent Solved By</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getSolvedByTargetElement()
 * @model abstract="true"
 * @generated
 */
public interface SolvedByTargetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent Solved By</b></em>' reference list.
	 * The list contents are of type {@link GSN1.SolvedBy}.
	 * It is bidirectional and its opposite is '{@link GSN1.SolvedBy#getChildSpinalelement <em>Child Spinalelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Solved By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Solved By</em>' reference list.
	 * @see GSN1.GSN1Package#getSolvedByTargetElement_ParentSolvedBy()
	 * @see GSN1.SolvedBy#getChildSpinalelement
	 * @model opposite="childSpinalelement"
	 * @generated
	 */
	EList<SolvedBy> getParentSolvedBy();

} // SolvedByTargetElement
