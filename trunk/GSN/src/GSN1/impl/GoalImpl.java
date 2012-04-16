/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentModule;
import GSN1.GSN1Package;
import GSN1.Goal;

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
 *   <li>{@link GSN1.impl.GoalImpl#getIsTopLevelGoalOf <em>Is Top Level Goal Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends DecomposableSpinalElementImpl implements Goal {
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
	public ArgumentModule getIsTopLevelGoalOf() {
		if (eContainerFeatureID() != GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF) return null;
		return (ArgumentModule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsTopLevelGoalOf(ArgumentModule newIsTopLevelGoalOf, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIsTopLevelGoalOf, GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTopLevelGoalOf(ArgumentModule newIsTopLevelGoalOf) {
		if (newIsTopLevelGoalOf != eInternalContainer() || (eContainerFeatureID() != GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF && newIsTopLevelGoalOf != null)) {
			if (EcoreUtil.isAncestor(this, newIsTopLevelGoalOf))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIsTopLevelGoalOf != null)
				msgs = ((InternalEObject)newIsTopLevelGoalOf).eInverseAdd(this, GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL, ArgumentModule.class, msgs);
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIsTopLevelGoalOf((ArgumentModule)otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL, ArgumentModule.class, msgs);
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
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				return getIsTopLevelGoalOf();
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
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				setIsTopLevelGoalOf((ArgumentModule)newValue);
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
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				setIsTopLevelGoalOf((ArgumentModule)null);
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
			case GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF:
				return getIsTopLevelGoalOf() != null;
		}
		return super.eIsSet(featureID);
	}

} //GoalImpl
