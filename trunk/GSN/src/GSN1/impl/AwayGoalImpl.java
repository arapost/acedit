/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.AwayGoal;
import GSN1.GSN1Package;
import GSN1.Goal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.AwayGoalImpl#getPointsTo <em>Points To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwayGoalImpl extends SpinalElementImpl implements AwayGoal {
	/**
	 * The cached value of the '{@link #getPointsTo() <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsTo()
	 * @generated
	 * @ordered
	 */
	protected Goal pointsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwayGoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.AWAY_GOAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getPointsTo() {
		if (pointsTo != null && pointsTo.eIsProxy()) {
			InternalEObject oldPointsTo = (InternalEObject)pointsTo;
			pointsTo = (Goal)eResolveProxy(oldPointsTo);
			if (pointsTo != oldPointsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.AWAY_GOAL__POINTS_TO, oldPointsTo, pointsTo));
			}
		}
		return pointsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal basicGetPointsTo() {
		return pointsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsTo(Goal newPointsTo) {
		Goal oldPointsTo = pointsTo;
		pointsTo = newPointsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.AWAY_GOAL__POINTS_TO, oldPointsTo, pointsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.AWAY_GOAL__POINTS_TO:
				if (resolve) return getPointsTo();
				return basicGetPointsTo();
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
			case GSN1Package.AWAY_GOAL__POINTS_TO:
				setPointsTo((Goal)newValue);
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
			case GSN1Package.AWAY_GOAL__POINTS_TO:
				setPointsTo((Goal)null);
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
			case GSN1Package.AWAY_GOAL__POINTS_TO:
				return pointsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //AwayGoalImpl
