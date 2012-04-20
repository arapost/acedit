/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentElement;
import GSN1.ArgumentModule;
import GSN1.GSN1Package;

import GSN1.Module;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.ArgumentElementImpl#getTobeinstantiated <em>Tobeinstantiated</em>}</li>
 *   <li>{@link GSN1.impl.ArgumentElementImpl#getIsPartOf <em>Is Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArgumentElementImpl extends ModelElementImpl implements ArgumentElement {
	/**
	 * The default value of the '{@link #getTobeinstantiated() <em>Tobeinstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobeinstantiated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TOBEINSTANTIATED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getTobeinstantiated() <em>Tobeinstantiated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTobeinstantiated()
	 * @generated
	 * @ordered
	 */
	protected Boolean tobeinstantiated = TOBEINSTANTIATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsPartOf() <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected Module isPartOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.ARGUMENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getTobeinstantiated() {
		return tobeinstantiated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTobeinstantiated(Boolean newTobeinstantiated) {
		Boolean oldTobeinstantiated = tobeinstantiated;
		tobeinstantiated = newTobeinstantiated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.ARGUMENT_ELEMENT__TOBEINSTANTIATED, oldTobeinstantiated, tobeinstantiated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getIsPartOf() {
		if (isPartOf != null && isPartOf.eIsProxy()) {
			InternalEObject oldIsPartOf = (InternalEObject)isPartOf;
			isPartOf = (Module)eResolveProxy(oldIsPartOf);
			if (isPartOf != oldIsPartOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF, oldIsPartOf, isPartOf));
			}
		}
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module basicGetIsPartOf() {
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(Module newIsPartOf, NotificationChain msgs) {
		Module oldIsPartOf = isPartOf;
		isPartOf = newIsPartOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF, oldIsPartOf, newIsPartOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPartOf(Module newIsPartOf) {
		if (newIsPartOf != isPartOf) {
			NotificationChain msgs = null;
			if (isPartOf != null)
				msgs = ((InternalEObject)isPartOf).eInverseRemove(this, GSN1Package.MODULE__CONTAINS_ELEMENT, Module.class, msgs);
			if (newIsPartOf != null)
				msgs = ((InternalEObject)newIsPartOf).eInverseAdd(this, GSN1Package.MODULE__CONTAINS_ELEMENT, Module.class, msgs);
			msgs = basicSetIsPartOf(newIsPartOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF, newIsPartOf, newIsPartOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				if (isPartOf != null)
					msgs = ((InternalEObject)isPartOf).eInverseRemove(this, GSN1Package.MODULE__CONTAINS_ELEMENT, Module.class, msgs);
				return basicSetIsPartOf((Module)otherEnd, msgs);
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
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				return basicSetIsPartOf(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.ARGUMENT_ELEMENT__TOBEINSTANTIATED:
				return getTobeinstantiated();
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				if (resolve) return getIsPartOf();
				return basicGetIsPartOf();
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
			case GSN1Package.ARGUMENT_ELEMENT__TOBEINSTANTIATED:
				setTobeinstantiated((Boolean)newValue);
				return;
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				setIsPartOf((Module)newValue);
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
			case GSN1Package.ARGUMENT_ELEMENT__TOBEINSTANTIATED:
				setTobeinstantiated(TOBEINSTANTIATED_EDEFAULT);
				return;
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				setIsPartOf((Module)null);
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
			case GSN1Package.ARGUMENT_ELEMENT__TOBEINSTANTIATED:
				return TOBEINSTANTIATED_EDEFAULT == null ? tobeinstantiated != null : !TOBEINSTANTIATED_EDEFAULT.equals(tobeinstantiated);
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				return isPartOf != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tobeinstantiated: ");
		result.append(tobeinstantiated);
		result.append(')');
		return result.toString();
	}

} //ArgumentElementImpl
