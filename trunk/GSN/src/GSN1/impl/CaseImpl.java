/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.Case;
import GSN1.GSN1Package;
import GSN1.ModelElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.CaseImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link GSN1.impl.CaseImpl#getAutoID <em>Auto ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends EObjectImpl implements Case {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelElement> contains;

	/**
	 * The default value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean AUTO_ID_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getAutoID() <em>Auto ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoID()
	 * @generated
	 * @ordered
	 */
	protected Boolean autoID = AUTO_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelElement> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ModelElement>(ModelElement.class, this, GSN1Package.CASE__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAutoID() {
		return autoID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoID(Boolean newAutoID) {
		Boolean oldAutoID = autoID;
		autoID = newAutoID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.CASE__AUTO_ID, oldAutoID, autoID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.CASE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case GSN1Package.CASE__CONTAINS:
				return getContains();
			case GSN1Package.CASE__AUTO_ID:
				return getAutoID();
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
			case GSN1Package.CASE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ModelElement>)newValue);
				return;
			case GSN1Package.CASE__AUTO_ID:
				setAutoID((Boolean)newValue);
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
			case GSN1Package.CASE__CONTAINS:
				getContains().clear();
				return;
			case GSN1Package.CASE__AUTO_ID:
				setAutoID(AUTO_ID_EDEFAULT);
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
			case GSN1Package.CASE__CONTAINS:
				return contains != null && !contains.isEmpty();
			case GSN1Package.CASE__AUTO_ID:
				return AUTO_ID_EDEFAULT == null ? autoID != null : !AUTO_ID_EDEFAULT.equals(autoID);
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
		result.append(" (autoID: ");
		result.append(autoID);
		result.append(')');
		return result.toString();
	}

} //CaseImpl
