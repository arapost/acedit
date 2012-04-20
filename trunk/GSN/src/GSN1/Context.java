/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.Context#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getContext()
 * @model annotation="gmf.node label='identifier' label.icon='false' figure='gsnfigures.GSNContext' tool.small.path='GSN_tooling_icons/Context.gif' tool.large.path='GSN_tooling_icons/Context.gif' tool.small.bundle='GSN' tool.large.bundle='GSN' size='120,80'"
 * @generated
 */
public interface Context extends ContextualElement {
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
	 * @see GSN1.GSN1Package#getContext_Visibility()
	 * @model
	 * @generated
	 */
	ElementVisibility getVisibility();

	/**
	 * Sets the value of the '{@link GSN1.Context#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see GSN1.ElementVisibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(ElementVisibility value);

} // Context
