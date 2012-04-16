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
 *   <li>{@link GSN1.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getGoal()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='gsnfigures.GSNRectangleFigure' tool.small.path='GSN_tooling_icons/Goal.gif' tool.large.path='GSN_tooling_icons/Goal.gif' tool.small.bundle='GSN' tool.large.bundle='GSN'"
 * @generated
 */
public interface Goal extends DecomposableSpinalElement {
	/**
	 * Returns the value of the '<em><b>Is Top Level Goal Of</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN1.ArgumentModule#getHasTopLevel <em>Has Top Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Top Level Goal Of</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Top Level Goal Of</em>' container reference.
	 * @see #setIsTopLevelGoalOf(ArgumentModule)
	 * @see GSN1.GSN1Package#getGoal_IsTopLevelGoalOf()
	 * @see GSN1.ArgumentModule#getHasTopLevel
	 * @model opposite="hasTopLevel" required="true" transient="false"
	 * @generated
	 */
	ArgumentModule getIsTopLevelGoalOf();

	/**
	 * Sets the value of the '{@link GSN1.Goal#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Top Level Goal Of</em>' container reference.
	 * @see #getIsTopLevelGoalOf()
	 * @generated
	 */
	void setIsTopLevelGoalOf(ArgumentModule value);

} // Goal
