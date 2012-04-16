/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentElement;
import GSN1.ArgumentModule;
import GSN1.ElementStatus;
import GSN1.ElementVisibility;
import GSN1.GSN1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.ArgumentElementImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link GSN1.impl.ArgumentElementImpl#getContextualElementStatus <em>Contextual Element Status</em>}</li>
 *   <li>{@link GSN1.impl.ArgumentElementImpl#getIsPartOf <em>Is Part Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ArgumentElementImpl extends ModelElementImpl implements ArgumentElement {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final ElementVisibility VISIBILITY_EDEFAULT = ElementVisibility.PRIVATE;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected ElementVisibility visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getContextualElementStatus() <em>Contextual Element Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualElementStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ElementStatus CONTEXTUAL_ELEMENT_STATUS_EDEFAULT = ElementStatus.UNDEFINED;

	/**
	 * The cached value of the '{@link #getContextualElementStatus() <em>Contextual Element Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextualElementStatus()
	 * @generated
	 * @ordered
	 */
	protected ElementStatus contextualElementStatus = CONTEXTUAL_ELEMENT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsPartOf() <em>Is Part Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPartOf()
	 * @generated
	 * @ordered
	 */
	protected ArgumentModule isPartOf;

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
	public ElementVisibility getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(ElementVisibility newVisibility) {
		ElementVisibility oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.ARGUMENT_ELEMENT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementStatus getContextualElementStatus() {
		return contextualElementStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextualElementStatus(ElementStatus newContextualElementStatus) {
		ElementStatus oldContextualElementStatus = contextualElementStatus;
		contextualElementStatus = newContextualElementStatus == null ? CONTEXTUAL_ELEMENT_STATUS_EDEFAULT : newContextualElementStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS, oldContextualElementStatus, contextualElementStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentModule getIsPartOf() {
		if (isPartOf != null && isPartOf.eIsProxy()) {
			InternalEObject oldIsPartOf = (InternalEObject)isPartOf;
			isPartOf = (ArgumentModule)eResolveProxy(oldIsPartOf);
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
	public ArgumentModule basicGetIsPartOf() {
		return isPartOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsPartOf(ArgumentModule newIsPartOf, NotificationChain msgs) {
		ArgumentModule oldIsPartOf = isPartOf;
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
	public void setIsPartOf(ArgumentModule newIsPartOf) {
		if (newIsPartOf != isPartOf) {
			NotificationChain msgs = null;
			if (isPartOf != null)
				msgs = ((InternalEObject)isPartOf).eInverseRemove(this, GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT, ArgumentModule.class, msgs);
			if (newIsPartOf != null)
				msgs = ((InternalEObject)newIsPartOf).eInverseAdd(this, GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT, ArgumentModule.class, msgs);
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
					msgs = ((InternalEObject)isPartOf).eInverseRemove(this, GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT, ArgumentModule.class, msgs);
				return basicSetIsPartOf((ArgumentModule)otherEnd, msgs);
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
			case GSN1Package.ARGUMENT_ELEMENT__VISIBILITY:
				return getVisibility();
			case GSN1Package.ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS:
				return getContextualElementStatus();
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
			case GSN1Package.ARGUMENT_ELEMENT__VISIBILITY:
				setVisibility((ElementVisibility)newValue);
				return;
			case GSN1Package.ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS:
				setContextualElementStatus((ElementStatus)newValue);
				return;
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				setIsPartOf((ArgumentModule)newValue);
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
			case GSN1Package.ARGUMENT_ELEMENT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GSN1Package.ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS:
				setContextualElementStatus(CONTEXTUAL_ELEMENT_STATUS_EDEFAULT);
				return;
			case GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF:
				setIsPartOf((ArgumentModule)null);
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
			case GSN1Package.ARGUMENT_ELEMENT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case GSN1Package.ARGUMENT_ELEMENT__CONTEXTUAL_ELEMENT_STATUS:
				return contextualElementStatus != CONTEXTUAL_ELEMENT_STATUS_EDEFAULT;
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", contextualElementStatus: ");
		result.append(contextualElementStatus);
		result.append(')');
		return result.toString();
	}

} //ArgumentElementImpl
