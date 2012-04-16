/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.AwaySolution;
import GSN1.GSN1Package;
import GSN1.Solution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.AwaySolutionImpl#getPointsTo <em>Points To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwaySolutionImpl extends SpinalElementImpl implements AwaySolution {
	/**
	 * The cached value of the '{@link #getPointsTo() <em>Points To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointsTo()
	 * @generated
	 * @ordered
	 */
	protected Solution pointsTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AwaySolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.AWAY_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution getPointsTo() {
		if (pointsTo != null && pointsTo.eIsProxy()) {
			InternalEObject oldPointsTo = (InternalEObject)pointsTo;
			pointsTo = (Solution)eResolveProxy(oldPointsTo);
			if (pointsTo != oldPointsTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.AWAY_SOLUTION__POINTS_TO, oldPointsTo, pointsTo));
			}
		}
		return pointsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solution basicGetPointsTo() {
		return pointsTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointsTo(Solution newPointsTo) {
		Solution oldPointsTo = pointsTo;
		pointsTo = newPointsTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.AWAY_SOLUTION__POINTS_TO, oldPointsTo, pointsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.AWAY_SOLUTION__POINTS_TO:
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
			case GSN1Package.AWAY_SOLUTION__POINTS_TO:
				setPointsTo((Solution)newValue);
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
			case GSN1Package.AWAY_SOLUTION__POINTS_TO:
				setPointsTo((Solution)null);
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
			case GSN1Package.AWAY_SOLUTION__POINTS_TO:
				return pointsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //AwaySolutionImpl
