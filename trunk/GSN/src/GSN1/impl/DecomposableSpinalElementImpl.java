/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.DecomposableSpinalElement;
import GSN1.GSN1Package;
import GSN1.InContextOf;
import GSN1.SolvedBy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposable Spinal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.DecomposableSpinalElementImpl#getToBeDeveloped <em>To Be Developed</em>}</li>
 *   <li>{@link GSN1.impl.DecomposableSpinalElementImpl#getChildSolvedBy <em>Child Solved By</em>}</li>
 *   <li>{@link GSN1.impl.DecomposableSpinalElementImpl#getHasContext <em>Has Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DecomposableSpinalElementImpl extends SpinalElementImpl implements DecomposableSpinalElement {
	/**
	 * The default value of the '{@link #getToBeDeveloped() <em>To Be Developed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeDeveloped()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean TO_BE_DEVELOPED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getToBeDeveloped() <em>To Be Developed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToBeDeveloped()
	 * @generated
	 * @ordered
	 */
	protected Boolean toBeDeveloped = TO_BE_DEVELOPED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildSolvedBy() <em>Child Solved By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildSolvedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<SolvedBy> childSolvedBy;

	/**
	 * The cached value of the '{@link #getHasContext() <em>Has Context</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasContext()
	 * @generated
	 * @ordered
	 */
	protected EList<InContextOf> hasContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecomposableSpinalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.DECOMPOSABLE_SPINAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getToBeDeveloped() {
		return toBeDeveloped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToBeDeveloped(Boolean newToBeDeveloped) {
		Boolean oldToBeDeveloped = toBeDeveloped;
		toBeDeveloped = newToBeDeveloped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED, oldToBeDeveloped, toBeDeveloped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SolvedBy> getChildSolvedBy() {
		if (childSolvedBy == null) {
			childSolvedBy = new EObjectContainmentWithInverseEList<SolvedBy>(SolvedBy.class, this, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY, GSN1Package.SOLVED_BY__PARENT_SPINAL_ELEMENT);
		}
		return childSolvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InContextOf> getHasContext() {
		if (hasContext == null) {
			hasContext = new EObjectContainmentWithInverseEList<InContextOf>(InContextOf.class, this, GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT, GSN1Package.IN_CONTEXT_OF__CONTEXT_OF_SPINAL_ELEMENT);
		}
		return hasContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildSolvedBy()).basicAdd(otherEnd, msgs);
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasContext()).basicAdd(otherEnd, msgs);
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
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY:
				return ((InternalEList<?>)getChildSolvedBy()).basicRemove(otherEnd, msgs);
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT:
				return ((InternalEList<?>)getHasContext()).basicRemove(otherEnd, msgs);
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
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED:
				return getToBeDeveloped();
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY:
				return getChildSolvedBy();
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT:
				return getHasContext();
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
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED:
				setToBeDeveloped((Boolean)newValue);
				return;
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY:
				getChildSolvedBy().clear();
				getChildSolvedBy().addAll((Collection<? extends SolvedBy>)newValue);
				return;
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT:
				getHasContext().clear();
				getHasContext().addAll((Collection<? extends InContextOf>)newValue);
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
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED:
				setToBeDeveloped(TO_BE_DEVELOPED_EDEFAULT);
				return;
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY:
				getChildSolvedBy().clear();
				return;
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT:
				getHasContext().clear();
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
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__TO_BE_DEVELOPED:
				return TO_BE_DEVELOPED_EDEFAULT == null ? toBeDeveloped != null : !TO_BE_DEVELOPED_EDEFAULT.equals(toBeDeveloped);
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__CHILD_SOLVED_BY:
				return childSolvedBy != null && !childSolvedBy.isEmpty();
			case GSN1Package.DECOMPOSABLE_SPINAL_ELEMENT__HAS_CONTEXT:
				return hasContext != null && !hasContext.isEmpty();
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
		result.append(" (toBeDeveloped: ");
		result.append(toBeDeveloped);
		result.append(')');
		return result.toString();
	}

} //DecomposableSpinalElementImpl
