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
 * A representation of the model object '<em><b>In Context Of Modular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.InContextOfModular#getParentInConextOfModuleElement <em>Parent In Conext Of Module Element</em>}</li>
 *   <li>{@link GSN1.InContextOfModular#getModularContextualElement <em>Modular Contextual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getInContextOfModular()
 * @model annotation="gmf.link source='hasContext' target='modularContextualElement' style='solid' width='1' target.decoration='closedarrow' tool.small.path='GSN_tooling_icons/inTheContextOf.gif' tool.large.path='GSN_tooling_icons/inTheContextOf.gif' tool.small.bundle='GSN' tool.large.bundle='GSN'"
 * @generated
 */
public interface InContextOfModular extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent In Conext Of Module Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GSN1.Module#getHasContext <em>Has Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent In Conext Of Module Element</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent In Conext Of Module Element</em>' container reference.
	 * @see #setParentInConextOfModuleElement(Module)
	 * @see GSN1.GSN1Package#getInContextOfModular_ParentInConextOfModuleElement()
	 * @see GSN1.Module#getHasContext
	 * @model opposite="hasContext" required="true" transient="false"
	 * @generated
	 */
	Module getParentInConextOfModuleElement();

	/**
	 * Sets the value of the '{@link GSN1.InContextOfModular#getParentInConextOfModuleElement <em>Parent In Conext Of Module Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent In Conext Of Module Element</em>' container reference.
	 * @see #getParentInConextOfModuleElement()
	 * @generated
	 */
	void setParentInConextOfModuleElement(Module value);

	/**
	 * Returns the value of the '<em><b>Modular Contextual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modular Contextual Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modular Contextual Element</em>' reference.
	 * @see #setModularContextualElement(Module)
	 * @see GSN1.GSN1Package#getInContextOfModular_ModularContextualElement()
	 * @model required="true"
	 * @generated
	 */
	Module getModularContextualElement();

	/**
	 * Sets the value of the '{@link GSN1.InContextOfModular#getModularContextualElement <em>Modular Contextual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modular Contextual Element</em>' reference.
	 * @see #getModularContextualElement()
	 * @generated
	 */
	void setModularContextualElement(Module value);

} // InContextOfModular
