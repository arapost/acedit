/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentModule;
import GSN1.ElementVisibility;
import GSN1.GSN1Package;
import GSN1.Goal;

import GSN1.Module;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.GoalImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link GSN1.impl.GoalImpl#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}</li>
 *   <li>{@link GSN1.impl.GoalImpl#getToBeSupportedByContract <em>To Be Supported By Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends DecomposableSpinalElementImpl implements Goal {
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
	 * The default value of the '{@link #getToBeSupportedByContract() <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeSupportedByContract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getToBeSupportedByContract() <em>To Be Supported By Contract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeSupportedByContract()
	 * @generated
	 * @ordered
	 */
	protected Boolean toBeSupportedByContract = TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GoalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.GOAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.GOAL__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getIsTopLevelGoalOf() {
		if (eContainerFeatureID() != GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsTopLevelGoalOf(Module newIsTopLevelGoalOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsTopLevelGoalOf, GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTopLevelGoalOf(Module newIsTopLevelGoalOf) {
		if (newIsTopLevelGoalOf != eInternalContainer() || (eContainerFeatureID() != GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF && newIsTopLevelGoalOf != null)) {
			if (EcoreUtil.isAncestor(this, newIsTopLevelGoalOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsTopLevelGoalOf != null)
				msgs = ((InternalEObject)newIsTopLevelGoalOf).eInverseAdd(this, GSN1Package.MODULE__HAS_TOP_LEVEL, Module.class, msgs);
			msgs = basicSetIsTopLevelGoalOf(newIsTopLevelGoalOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF, newIsTopLevelGoalOf, newIsTopLevelGoalOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getToBeSupportedByContract() {
		return toBeSupportedByContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeSupportedByContract(Boolean newToBeSupportedByContract) {
		Boolean oldToBeSupportedByContract = toBeSupportedByContract;
		toBeSupportedByContract = newToBeSupportedByContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT, oldToBeSupportedByContract, toBeSupportedByContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsTopLevelGoalOf((Module)otherEnd, msgs);
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
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				return basicSetIsTopLevelGoalOf(null, msgs);
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
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				return eInternalContainer().eInverseRemove(this, GSN1Package.MODULE__HAS_TOP_LEVEL, Module.class, msgs);
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
			case GSN1Package.GOAL__VISIBILITY:
				return getVisibility();
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				return getIsTopLevelGoalOf();
			case GSN1Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				return getToBeSupportedByContract();
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
			case GSN1Package.GOAL__VISIBILITY:
				setVisibility((ElementVisibility)newValue);
				return;
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				setIsTopLevelGoalOf((Module)newValue);
				return;
			case GSN1Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				setToBeSupportedByContract((Boolean)newValue);
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
			case GSN1Package.GOAL__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				setIsTopLevelGoalOf((Module)null);
				return;
			case GSN1Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				setToBeSupportedByContract(TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT);
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
			case GSN1Package.GOAL__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				return getIsTopLevelGoalOf() != null;
			case GSN1Package.GOAL__TO_BE_SUPPORTED_BY_CONTRACT:
				return TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT == null ? toBeSupportedByContract != null : !TO_BE_SUPPORTED_BY_CONTRACT_EDEFAULT.equals(toBeSupportedByContract);
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
		result.append(", toBeSupportedByContract: ");
		result.append(toBeSupportedByContract);
		result.append(')');
		return result.toString();
	}

} //GoalImpl
