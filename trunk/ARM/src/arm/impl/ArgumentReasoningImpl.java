/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm.impl;

import arm.Argument;
import arm.ArgumentReasoning;
import arm.ArmPackage;
import arm.AssertedInference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Reasoning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arm.impl.ArgumentReasoningImpl#getHasStucture <em>Has Stucture</em>}</li>
 *   <li>{@link arm.impl.ArgumentReasoningImpl#getDescribes <em>Describes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentReasoningImpl extends ReasoningElementImpl implements ArgumentReasoning {
	/**
	 * The cached value of the '{@link #getHasStucture() <em>Has Stucture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasStucture()
	 * @generated
	 * @ordered
	 */
	protected Argument hasStucture;

	/**
	 * The cached value of the '{@link #getDescribes() <em>Describes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescribes()
	 * @generated
	 * @ordered
	 */
	protected EList<AssertedInference> describes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentReasoningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArmPackage.Literals.ARGUMENT_REASONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getHasStucture() {
		if (hasStucture != null && hasStucture.eIsProxy()) {
			InternalEObject oldHasStucture = (InternalEObject)hasStucture;
			hasStucture = (Argument)eResolveProxy(oldHasStucture);
			if (hasStucture != oldHasStucture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArmPackage.ARGUMENT_REASONING__HAS_STUCTURE, oldHasStucture, hasStucture));
			}
		}
		return hasStucture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetHasStucture() {
		return hasStucture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasStucture(Argument newHasStucture) {
		Argument oldHasStucture = hasStucture;
		hasStucture = newHasStucture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArmPackage.ARGUMENT_REASONING__HAS_STUCTURE, oldHasStucture, hasStucture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssertedInference> getDescribes() {
		if (describes == null) {
			describes = new EObjectResolvingEList<AssertedInference>(AssertedInference.class, this, ArmPackage.ARGUMENT_REASONING__DESCRIBES);
		}
		return describes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArmPackage.ARGUMENT_REASONING__HAS_STUCTURE:
				if (resolve) return getHasStucture();
				return basicGetHasStucture();
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				return getDescribes();
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
			case ArmPackage.ARGUMENT_REASONING__HAS_STUCTURE:
				setHasStucture((Argument)newValue);
				return;
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				getDescribes().clear();
				getDescribes().addAll((Collection<? extends AssertedInference>)newValue);
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
			case ArmPackage.ARGUMENT_REASONING__HAS_STUCTURE:
				setHasStucture((Argument)null);
				return;
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				getDescribes().clear();
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
			case ArmPackage.ARGUMENT_REASONING__HAS_STUCTURE:
				return hasStucture != null;
			case ArmPackage.ARGUMENT_REASONING__DESCRIBES:
				return describes != null && !describes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentReasoningImpl
