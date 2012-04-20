/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.Goal#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link GSN1.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}</li>
 *   <li>{@link GSN1.Goal#getToBeSupportedByContract <em>To Be Supported By Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getGoal()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='gsnfigures.GSNGoal' tool.small.path='GSN_tooling_icons/Goal.gif' tool.large.path='GSN_tooling_icons/Goal.gif' tool.small.bundle='GSN' tool.large.bundle='GSN' size='120,80'"
 * @generated
 */
public interface Goal extends DecomposableSpinalElement {
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
	 * @see GSN1.GSN1Package#getGoal_Visibility()
	 * @model
	 * @generated
	 */
	ElementVisibility getVisibility();

	/**
	 * Sets the value of the '{@link GSN1.Goal#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see GSN1.ElementVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(ElementVisibility value);

	/**
	 * Returns the value of the '<em><b>Is Top Level Goal Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN1.Module#getHasTopLevel <em>Has Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Top Level Goal Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Top Level Goal Of</em>' container reference.
	 * @see #setIsTopLevelGoalOf(Module)
	 * @see GSN1.GSN1Package#getGoal_IsTopLevelGoalOf()
	 * @see GSN1.Module#getHasTopLevel
	 * @model opposite="hasTopLevel" transient="false"
	 * @generated
	 */
	Module getIsTopLevelGoalOf();

	/**
	 * Sets the value of the '{@link GSN1.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Top Level Goal Of</em>' container reference.
	 * @see #getIsTopLevelGoalOf()
	 * @generated
	 */
	void setIsTopLevelGoalOf(Module value);

	/**
	 * Returns the value of the '<em><b>To Be Supported By Contract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Be Supported By Contract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Be Supported By Contract</em>' attribute.
	 * @see #setToBeSupportedByContract(Boolean)
	 * @see GSN1.GSN1Package#getGoal_ToBeSupportedByContract()
	 * @model default="false"
	 * @generated
	 */
	Boolean getToBeSupportedByContract();

	/**
	 * Sets the value of the '{@link GSN1.Goal#getToBeSupportedByContract <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Be Supported By Contract</em>' attribute.
	 * @see #getToBeSupportedByContract()
	 * @generated
	 */
	void setToBeSupportedByContract(Boolean value);

} // Goal
