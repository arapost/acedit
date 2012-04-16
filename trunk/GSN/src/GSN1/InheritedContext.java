/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inherited Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GSN1.InheritedContext#getInheritsFromParentArguments <em>Inherits From Parent Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see GSN1.GSN1Package#getInheritedContext()
 * @model
 * @generated
 */
public interface InheritedContext extends ContextualElement {
	/**
	 * Returns the value of the '<em><b>Inherits From Parent Arguments</b></em>' reference list.
	 * The list contents are of type {@link GSN1.ContextualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherits From Parent Arguments</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherits From Parent Arguments</em>' reference list.
	 * @see GSN1.GSN1Package#getInheritedContext_InheritsFromParentArguments()
	 * @model
	 * @generated
	 */
	EList<ContextualElement> getInheritsFromParentArguments();

} // InheritedContext
