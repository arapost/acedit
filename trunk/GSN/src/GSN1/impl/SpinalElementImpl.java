/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.GSN1Package;
import GSN1.SolvedBy;
import GSN1.SpinalElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spinal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.SpinalElementImpl#getParentSolvedBy <em>Parent Solved By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpinalElementImpl extends ArgumentElementImpl implements SpinalElement {
	/**
	 * The cached value of the '{@link #getParentSolvedBy() <em>Parent Solved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentSolvedBy()
	 * @generated
	 * @ordered
	 */
	protected SolvedBy parentSolvedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpinalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.SPINAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedBy getParentSolvedBy() {
		if (parentSolvedBy != null && parentSolvedBy.eIsProxy()) {
			InternalEObject oldParentSolvedBy = (InternalEObject)parentSolvedBy;
			parentSolvedBy = (SolvedBy)eResolveProxy(oldParentSolvedBy);
			if (parentSolvedBy != oldParentSolvedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY, oldParentSolvedBy, parentSolvedBy));
			}
		}
		return parentSolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolvedBy basicGetParentSolvedBy() {
		return parentSolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSolvedBy(SolvedBy newParentSolvedBy, NotificationChain msgs) {
		SolvedBy oldParentSolvedBy = parentSolvedBy;
		parentSolvedBy = newParentSolvedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY, oldParentSolvedBy, newParentSolvedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSolvedBy(SolvedBy newParentSolvedBy) {
		if (newParentSolvedBy != parentSolvedBy) {
			NotificationChain msgs = null;
			if (parentSolvedBy != null)
				msgs = ((InternalEObject)parentSolvedBy).eInverseRemove(this, GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT, SolvedBy.class, msgs);
			if (newParentSolvedBy != null)
				msgs = ((InternalEObject)newParentSolvedBy).eInverseAdd(this, GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT, SolvedBy.class, msgs);
			msgs = basicSetParentSolvedBy(newParentSolvedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY, newParentSolvedBy, newParentSolvedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				if (parentSolvedBy != null)
					msgs = ((InternalEObject)parentSolvedBy).eInverseRemove(this, GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT, SolvedBy.class, msgs);
				return basicSetParentSolvedBy((SolvedBy)otherEnd, msgs);
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
			case GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				return basicSetParentSolvedBy(null, msgs);
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
			case GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				if (resolve) return getParentSolvedBy();
				return basicGetParentSolvedBy();
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
			case GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				setParentSolvedBy((SolvedBy)newValue);
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
			case GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				setParentSolvedBy((SolvedBy)null);
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
			case GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY:
				return parentSolvedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //SpinalElementImpl
