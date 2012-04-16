/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentModule;
import GSN1.AwayContext;
import GSN1.GSN1Package;
import GSN1.Goal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Away Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.AwayContextImpl#getIcContainedIn <em>Ic Contained In</em>}</li>
 *   <li>{@link GSN1.impl.AwayContextImpl#getPointsTo <em>Points To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwayContextImpl extends ContextualElementImpl implements AwayContext {
	/**
	 * The cached value of the '{@link #getIcContainedIn() <em>Ic Contained In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcContainedIn()
	 * @generated
	 * @ordered
	 */
	protected ArgumentModule icContainedIn;

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
	protected AwayContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.AWAY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentModule getIcContainedIn() {
		if (icContainedIn != null && icContainedIn.eIsProxy()) {
			InternalEObject oldIcContainedIn = (InternalEObject)icContainedIn;
			icContainedIn = (ArgumentModule)eResolveProxy(oldIcContainedIn);
			if (icContainedIn != oldIcContainedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.AWAY_CONTEXT__IC_CONTAINED_IN, oldIcContainedIn, icContainedIn));
			}
		}
		return icContainedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentModule basicGetIcContainedIn() {
		return icContainedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcContainedIn(ArgumentModule newIcContainedIn) {
		ArgumentModule oldIcContainedIn = icContainedIn;
		icContainedIn = newIcContainedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.AWAY_CONTEXT__IC_CONTAINED_IN, oldIcContainedIn, icContainedIn));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.AWAY_CONTEXT__POINTS_TO, oldPointsTo, pointsTo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.AWAY_CONTEXT__POINTS_TO, oldPointsTo, pointsTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.AWAY_CONTEXT__IC_CONTAINED_IN:
				if (resolve) return getIcContainedIn();
				return basicGetIcContainedIn();
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
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
			case GSN1Package.AWAY_CONTEXT__IC_CONTAINED_IN:
				setIcContainedIn((ArgumentModule)newValue);
				return;
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
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
			case GSN1Package.AWAY_CONTEXT__IC_CONTAINED_IN:
				setIcContainedIn((ArgumentModule)null);
				return;
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
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
			case GSN1Package.AWAY_CONTEXT__IC_CONTAINED_IN:
				return icContainedIn != null;
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
				return pointsTo != null;
		}
		return super.eIsSet(featureID);
	}

} //AwayContextImpl
