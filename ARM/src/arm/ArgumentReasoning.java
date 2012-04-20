/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link arm.ArgumentReasoning#getHasStucture <em>Has Stucture</em>}</li>
 *   <li>{@link arm.ArgumentReasoning#getDescribes <em>Describes</em>}</li>
 * </ul>
 * </p>
 *
 * @see arm.ArmPackage#getArgumentReasoning()
 * @model annotation="gmf.node label='identifier' label.icon='false' size='100,70'"
 * @generated
 */
public interface ArgumentReasoning extends ReasoningElement {
	/**
	 * Returns the value of the '<em><b>Has Stucture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Stucture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Stucture</em>' reference.
	 * @see #setHasStucture(Argument)
	 * @see arm.ArmPackage#getArgumentReasoning_HasStucture()
	 * @model
	 * @generated
	 */
	Argument getHasStucture();

	/**
	 * Sets the value of the '{@link arm.ArgumentReasoning#getHasStucture <em>Has Stucture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Stucture</em>' reference.
	 * @see #getHasStucture()
	 * @generated
	 */
	void setHasStucture(Argument value);

	/**
	 * Returns the value of the '<em><b>Describes</b></em>' reference list.
	 * The list contents are of type {@link arm.AssertedInference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Describes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Describes</em>' reference list.
	 * @see arm.ArmPackage#getArgumentReasoning_Describes()
	 * @model
	 * @generated
	 */
	EList<AssertedInference> getDescribes();

} // ArgumentReasoning
