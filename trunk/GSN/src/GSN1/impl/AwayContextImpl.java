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

import GSN1.Module;
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
 *   <li>{@link GSN1.impl.AwayContextImpl#getPointsTo <em>Points To</em>}</li>
 *   <li>{@link GSN1.impl.AwayContextImpl#getModuleIdentifier <em>Module Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AwayContextImpl extends ContextualElementImpl implements AwayContext {
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
	 * The default value of the '{@link #getModuleIdentifier() <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModuleIdentifier() <em>Module Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String moduleIdentifier = MODULE_IDENTIFIER_EDEFAULT;

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
	public String getModuleIdentifier() {
		return moduleIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModuleIdentifier(String newModuleIdentifier) {
		String oldModuleIdentifier = moduleIdentifier;
		moduleIdentifier = newModuleIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.AWAY_CONTEXT__MODULE_IDENTIFIER, oldModuleIdentifier, moduleIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
				if (resolve) return getPointsTo();
				return basicGetPointsTo();
			case GSN1Package.AWAY_CONTEXT__MODULE_IDENTIFIER:
				return getModuleIdentifier();
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
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
				setPointsTo((Goal)newValue);
				return;
			case GSN1Package.AWAY_CONTEXT__MODULE_IDENTIFIER:
				setModuleIdentifier((String)newValue);
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
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
				setPointsTo((Goal)null);
				return;
			case GSN1Package.AWAY_CONTEXT__MODULE_IDENTIFIER:
				setModuleIdentifier(MODULE_IDENTIFIER_EDEFAULT);
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
			case GSN1Package.AWAY_CONTEXT__POINTS_TO:
				return pointsTo != null;
			case GSN1Package.AWAY_CONTEXT__MODULE_IDENTIFIER:
				return MODULE_IDENTIFIER_EDEFAULT == null ? moduleIdentifier != null : !MODULE_IDENTIFIER_EDEFAULT.equals(moduleIdentifier);
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
		result.append(" (moduleIdentifier: ");
		result.append(moduleIdentifier);
		result.append(')');
		return result.toString();
	}

} //AwayContextImpl
