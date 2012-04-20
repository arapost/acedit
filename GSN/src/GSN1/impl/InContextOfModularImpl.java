/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.GSN1Package;
import GSN1.InContextOfModular;
import GSN1.Module;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Context Of Modular</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.InContextOfModularImpl#getParentInConextOfModuleElement <em>Parent In Conext Of Module Element</em>}</li>
 *   <li>{@link GSN1.impl.InContextOfModularImpl#getModularContextualElement <em>Modular Contextual Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InContextOfModularImpl extends EObjectImpl implements InContextOfModular {
	/**
	 * The cached value of the '{@link #getModularContextualElement() <em>Modular Contextual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModularContextualElement()
	 * @generated
	 * @ordered
	 */
	protected Module modularContextualElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InContextOfModularImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.IN_CONTEXT_OF_MODULAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getParentInConextOfModuleElement() {
		if (eContainerFeatureID() != GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentInConextOfModuleElement(Module newParentInConextOfModuleElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentInConextOfModuleElement, GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentInConextOfModuleElement(Module newParentInConextOfModuleElement) {
		if (newParentInConextOfModuleElement != eInternalContainer() || (eContainerFeatureID() != GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT && newParentInConextOfModuleElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentInConextOfModuleElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentInConextOfModuleElement != null)
				msgs = ((InternalEObject)newParentInConextOfModuleElement).eInverseAdd(this, GSN1Package.MODULE__HAS_CONTEXT, Module.class, msgs);
			msgs = basicSetParentInConextOfModuleElement(newParentInConextOfModuleElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT, newParentInConextOfModuleElement, newParentInConextOfModuleElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModularContextualElement() {
		if (modularContextualElement != null && modularContextualElement.eIsProxy()) {
			InternalEObject oldModularContextualElement = (InternalEObject)modularContextualElement;
			modularContextualElement = (Module)eResolveProxy(oldModularContextualElement);
			if (modularContextualElement != oldModularContextualElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT, oldModularContextualElement, modularContextualElement));
			}
		}
		return modularContextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetModularContextualElement() {
		return modularContextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModularContextualElement(Module newModularContextualElement) {
		Module oldModularContextualElement = modularContextualElement;
		modularContextualElement = newModularContextualElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT, oldModularContextualElement, modularContextualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentInConextOfModuleElement((Module)otherEnd, msgs);
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
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				return basicSetParentInConextOfModuleElement(null, msgs);
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
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GSN1Package.MODULE__HAS_CONTEXT, Module.class, msgs);
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
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				return getParentInConextOfModuleElement();
			case GSN1Package.IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT:
				if (resolve) return getModularContextualElement();
				return basicGetModularContextualElement();
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
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				setParentInConextOfModuleElement((Module)newValue);
				return;
			case GSN1Package.IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT:
				setModularContextualElement((Module)newValue);
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
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				setParentInConextOfModuleElement((Module)null);
				return;
			case GSN1Package.IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT:
				setModularContextualElement((Module)null);
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
			case GSN1Package.IN_CONTEXT_OF_MODULAR__PARENT_IN_CONEXT_OF_MODULE_ELEMENT:
				return getParentInConextOfModuleElement() != null;
			case GSN1Package.IN_CONTEXT_OF_MODULAR__MODULAR_CONTEXTUAL_ELEMENT:
				return modularContextualElement != null;
		}
		return super.eIsSet(featureID);
	}

} //InContextOfModularImpl
