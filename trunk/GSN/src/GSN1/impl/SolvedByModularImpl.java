/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentModule;
import GSN1.GSN1Package;
import GSN1.Module;
import GSN1.SolvedByModular;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solved By Modular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.SolvedByModularImpl#getChildSolvedByModular <em>Child Solved By Modular</em>}</li>
 *   <li>{@link GSN1.impl.SolvedByModularImpl#getParentSolvedByModuleElement <em>Parent Solved By Module Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolvedByModularImpl extends EObjectImpl implements SolvedByModular {
	/**
	 * The cached value of the '{@link #getChildSolvedByModular() <em>Child Solved By Modular</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSolvedByModular()
	 * @generated
	 * @ordered
	 */
	protected Module childSolvedByModular;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolvedByModularImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.SOLVED_BY_MODULAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getChildSolvedByModular() {
		if (childSolvedByModular != null && childSolvedByModular.eIsProxy()) {
			InternalEObject oldChildSolvedByModular = (InternalEObject)childSolvedByModular;
			childSolvedByModular = (Module)eResolveProxy(oldChildSolvedByModular);
			if (childSolvedByModular != oldChildSolvedByModular) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR, oldChildSolvedByModular, childSolvedByModular));
			}
		}
		return childSolvedByModular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetChildSolvedByModular() {
		return childSolvedByModular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildSolvedByModular(Module newChildSolvedByModular) {
		Module oldChildSolvedByModular = childSolvedByModular;
		childSolvedByModular = newChildSolvedByModular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR, oldChildSolvedByModular, childSolvedByModular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getParentSolvedByModuleElement() {
		if (eContainerFeatureID() != GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSolvedByModuleElement(Module newParentSolvedByModuleElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSolvedByModuleElement, GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSolvedByModuleElement(Module newParentSolvedByModuleElement) {
		if (newParentSolvedByModuleElement != eInternalContainer() || (eContainerFeatureID() != GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT && newParentSolvedByModuleElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentSolvedByModuleElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSolvedByModuleElement != null)
				msgs = ((InternalEObject)newParentSolvedByModuleElement).eInverseAdd(this, GSN1Package.MODULE__PARENT_SOLVED_BY_MODULAR, Module.class, msgs);
			msgs = basicSetParentSolvedByModuleElement(newParentSolvedByModuleElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT, newParentSolvedByModuleElement, newParentSolvedByModuleElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSolvedByModuleElement((Module)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				return basicSetParentSolvedByModuleElement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GSN1Package.MODULE__PARENT_SOLVED_BY_MODULAR, Module.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR:
				if (resolve) return getChildSolvedByModular();
				return basicGetChildSolvedByModular();
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				return getParentSolvedByModuleElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GSN1Package.SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR:
				setChildSolvedByModular((Module)newValue);
				return;
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				setParentSolvedByModuleElement((Module)newValue);
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
			case GSN1Package.SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR:
				setChildSolvedByModular((Module)null);
				return;
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				setParentSolvedByModuleElement((Module)null);
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
			case GSN1Package.SOLVED_BY_MODULAR__CHILD_SOLVED_BY_MODULAR:
				return childSolvedByModular != null;
			case GSN1Package.SOLVED_BY_MODULAR__PARENT_SOLVED_BY_MODULE_ELEMENT:
				return getParentSolvedByModuleElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //SolvedByModularImpl
