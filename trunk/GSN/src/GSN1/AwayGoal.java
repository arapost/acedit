/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.AwayGoal#getPointsTo <em>Points To</em>}</li>
 *   <li>{@link GSN1.AwayGoal#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getAwayGoal()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='gsnfigures.GSNAwayGoal' tool.small.path='GSN_tooling_icons/AwayGoal.gif' tool.large.path='GSN_tooling_icons/AwayGoal.gif' tool.small.bundle='GSN' tool.large.bundle='GSN' size='120,80'"
 * @generated
 */
public interface AwayGoal extends SpinalElement, InTheContextOfTargetElement {
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
	 * @see GSN1.GSN1Package#getAwayGoal_PointsTo()
	 * @model required="true"
	 * @generated
	 */
	Goal getPointsTo();

	/**
	 * Sets the value of the '{@link GSN1.AwayGoal#getPointsTo <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points To</em>' reference.
	 * @see #getPointsTo()
	 * @generated
	 */
	void setPointsTo(Goal value);

	/**
	 * Returns the value of the '<em><b>Module Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Identifier</em>' attribute.
	 * @see #setModuleIdentifier(String)
	 * @see GSN1.GSN1Package#getAwayGoal_ModuleIdentifier()
	 * @model required="true"
	 *        annotation="gmf.label label='moduleIdentifier'"
	 * @generated
	 */
	String getModuleIdentifier();

	/**
	 * Sets the value of the '{@link GSN1.AwayGoal#getModuleIdentifier <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Identifier</em>' attribute.
	 * @see #getModuleIdentifier()
	 * @generated
	 */
	void setModuleIdentifier(String value);

} // AwayGoal
