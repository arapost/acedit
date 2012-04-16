/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.DecomposableSpinalElement;
import GSN1.GSN1Package;
import GSN1.SolvedBy;
import GSN1.SpinalElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solved By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.SolvedByImpl#getParentSpinalElement <em>Parent Spinal Element</em>}</li>
 *   <li>{@link GSN1.impl.SolvedByImpl#getChildSpinalelement <em>Child Spinalelement</em>}</li>
 *   <li>{@link GSN1.impl.SolvedByImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolvedByImpl extends EObjectImpl implements SolvedBy {
	/**
	 * The cached value of the '{@link #getChildSpinalelement() <em>Child Spinalelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSpinalelement()
	 * @generated
	 * @ordered
	 */
	protected SpinalElement childSpinalelement;

	/**
	 * The default value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CARDINALITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinality()
	 * @generated
	 * @ordered
	 */
	protected Integer cardinality = CARDINALITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolvedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.SOLVED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecomposableSpinalElement getParentSpinalElement() {
		if (eContainerFeatureID() != GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT) return null;
		return (DecomposableSpinalElement)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentSpinalElement(DecomposableSpinalElement newParentSpinalElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParentSpinalElement, GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentSpinalElement(DecomposableSpinalElement newParentSpinalElement) {
		if (newParentSpinalElement != eInternalContainer() || (eContainerFeatureID() != GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT && newParentSpinalElement != null)) {
			if (EcoreUtil.isAncestor(this, newParentSpinalElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentSpinalElement != null)
				msgs = ((InternalEObject)newParentSpinalElement).eInverseAdd(this, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY, DecomposableSpinalElement.class, msgs);
			msgs = basicSetParentSpinalElement(newParentSpinalElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT, newParentSpinalElement, newParentSpinalElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpinalElement getChildSpinalelement() {
		if (childSpinalelement != null && childSpinalelement.eIsProxy()) {
			InternalEObject oldChildSpinalelement = (InternalEObject)childSpinalelement;
			childSpinalelement = (SpinalElement)eResolveProxy(oldChildSpinalelement);
			if (childSpinalelement != oldChildSpinalelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT, oldChildSpinalelement, childSpinalelement));
			}
		}
		return childSpinalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpinalElement basicGetChildSpinalelement() {
		return childSpinalelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildSpinalelement(SpinalElement newChildSpinalelement, NotificationChain msgs) {
		SpinalElement oldChildSpinalelement = childSpinalelement;
		childSpinalelement = newChildSpinalelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT, oldChildSpinalelement, newChildSpinalelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildSpinalelement(SpinalElement newChildSpinalelement) {
		if (newChildSpinalelement != childSpinalelement) {
			NotificationChain msgs = null;
			if (childSpinalelement != null)
				msgs = ((InternalEObject)childSpinalelement).eInverseRemove(this, GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY, SpinalElement.class, msgs);
			if (newChildSpinalelement != null)
				msgs = ((InternalEObject)newChildSpinalelement).eInverseAdd(this, GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY, SpinalElement.class, msgs);
			msgs = basicSetChildSpinalelement(newChildSpinalelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT, newChildSpinalelement, newChildSpinalelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCardinality() {
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinality(Integer newCardinality) {
		Integer oldCardinality = cardinality;
		cardinality = newCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.SOLVED_BY__CARDINALITY, oldCardinality, cardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParentSpinalElement((DecomposableSpinalElement)otherEnd, msgs);
			case GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT:
				if (childSpinalelement != null)
					msgs = ((InternalEObject)childSpinalelement).eInverseRemove(this, GSN1Package.SPINAL_ELEMENT__PARENT_SOLVED_BY, SpinalElement.class, msgs);
				return basicSetChildSpinalelement((SpinalElement)otherEnd, msgs);
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
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return basicSetParentSpinalElement(null, msgs);
			case GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT:
				return basicSetChildSpinalelement(null, msgs);
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
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return eInternalContainer().eInverseRemove(this, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY, DecomposableSpinalElement.class, msgs);
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
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return getParentSpinalElement();
			case GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT:
				if (resolve) return getChildSpinalelement();
				return basicGetChildSpinalelement();
			case GSN1Package.SOLVED_BY__CARDINALITY:
				return getCardinality();
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
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				setParentSpinalElement((DecomposableSpinalElement)newValue);
				return;
			case GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT:
				setChildSpinalelement((SpinalElement)newValue);
				return;
			case GSN1Package.SOLVED_BY__CARDINALITY:
				setCardinality((Integer)newValue);
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
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				setParentSpinalElement((DecomposableSpinalElement)null);
				return;
			case GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT:
				setChildSpinalelement((SpinalElement)null);
				return;
			case GSN1Package.SOLVED_BY__CARDINALITY:
				setCardinality(CARDINALITY_EDEFAULT);
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
			case GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT:
				return getParentSpinalElement() != null;
			case GSN1Package.SOLVED_BY__CHILD_SPINALELEMENT:
				return childSpinalelement != null;
			case GSN1Package.SOLVED_BY__CARDINALITY:
				return CARDINALITY_EDEFAULT == null ? cardinality != null : !CARDINALITY_EDEFAULT.equals(cardinality);
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
		result.append(" (cardinality: ");
		result.append(cardinality);
		result.append(')');
		return result.toString();
	}

} //SolvedByImpl
