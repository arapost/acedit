/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ContextualElement;
import GSN1.DecomposableSpinalElement;
import GSN1.GSN1Package;
import GSN1.InContextOf;

import GSN1.InTheContextOfTargetElement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Context Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.InContextOfImpl#getContextualElement <em>Contextual Element</em>}</li>
 *   <li>{@link GSN1.impl.InContextOfImpl#getContextOfSpinalElement <em>Context Of Spinal Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InContextOfImpl extends EObjectImpl implements InContextOf {
	/**
	 * The cached value of the '{@link #getContextualElement() <em>Contextual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualElement()
	 * @generated
	 * @ordered
	 */
	protected InTheContextOfTargetElement contextualElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InContextOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.IN_CONTEXT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InTheContextOfTargetElement getContextualElement() {
		if (contextualElement != null && contextualElement.eIsProxy()) {
			InternalEObject oldContextualElement = (InternalEObject)contextualElement;
			contextualElement = (InTheContextOfTargetElement)eResolveProxy(oldContextualElement);
			if (contextualElement != oldContextualElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
			}
		}
		return contextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InTheContextOfTargetElement basicGetContextualElement() {
		return contextualElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualElement(InTheContextOfTargetElement newContextualElement) {
		InTheContextOfTargetElement oldContextualElement = contextualElement;
		contextualElement = newContextualElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT, oldContextualElement, contextualElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposableSpinalElement getContextOfSpinalElement() {
		if (eContainerFeatureID() != GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT) return null;
		return (DecomposableSpinalElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContextOfSpinalElement(DecomposableSpinalElement newContextOfSpinalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContextOfSpinalElement, GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextOfSpinalElement(DecomposableSpinalElement newContextOfSpinalElement) {
		if (newContextOfSpinalElement != eInternalContainer() || (eContainerFeatureID() != GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT && newContextOfSpinalElement != null)) {
			if (EcoreUtil.isAncestor(this, newContextOfSpinalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContextOfSpinalElement != null)
				msgs = ((InternalEObject)newContextOfSpinalElement).eInverseAdd(this, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT, DecomposableSpinalElement.class, msgs);
			msgs = basicSetContextOfSpinalElement(newContextOfSpinalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT, newContextOfSpinalElement, newContextOfSpinalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContextOfSpinalElement((DecomposableSpinalElement)otherEnd, msgs);
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
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return basicSetContextOfSpinalElement(null, msgs);
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
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT, DecomposableSpinalElement.class, msgs);
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
			case GSN1Package.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				if (resolve) return getContextualElement();
				return basicGetContextualElement();
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return getContextOfSpinalElement();
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
			case GSN1Package.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				setContextualElement((InTheContextOfTargetElement)newValue);
				return;
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				setContextOfSpinalElement((DecomposableSpinalElement)newValue);
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
			case GSN1Package.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				setContextualElement((InTheContextOfTargetElement)null);
				return;
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				setContextOfSpinalElement((DecomposableSpinalElement)null);
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
			case GSN1Package.IN_CONTEXT_OF__CONTEXTUAL_ELEMENT:
				return contextualElement != null;
			case GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT:
				return getContextOfSpinalElement() != null;
		}
		return super.eIsSet(featureID);
	}

} //InContextOfImpl
