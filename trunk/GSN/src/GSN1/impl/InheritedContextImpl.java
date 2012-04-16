/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ContextualElement;
import GSN1.GSN1Package;
import GSN1.InheritedContext;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inherited Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.InheritedContextImpl#getInheritsFromParentArguments <em>Inherits From Parent Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InheritedContextImpl extends ContextualElementImpl implements InheritedContext {
	/**
	 * The cached value of the '{@link #getInheritsFromParentArguments() <em>Inherits From Parent Arguments</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInheritsFromParentArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<ContextualElement> inheritsFromParentArguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InheritedContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.INHERITED_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContextualElement> getInheritsFromParentArguments() {
		if (inheritsFromParentArguments == null) {
			inheritsFromParentArguments = new EObjectResolvingEList<ContextualElement>(ContextualElement.class, this, GSN1Package.INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS);
		}
		return inheritsFromParentArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS:
				return getInheritsFromParentArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GSN1Package.INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS:
				getInheritsFromParentArguments().clear();
				getInheritsFromParentArguments().addAll((Collection<? extends ContextualElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GSN1Package.INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS:
				getInheritsFromParentArguments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GSN1Package.INHERITED_CONTEXT__INHERITS_FROM_PARENT_ARGUMENTS:
				return inheritsFromParentArguments != null && !inheritsFromParentArguments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InheritedContextImpl
