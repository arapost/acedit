/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm.impl;

import arm.Argument;
import arm.ArgumentElement;
import arm.ArmPackage;
import arm.CitiationElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citiation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arm.impl.CitiationElementImpl#getRefersToArgumentElement <em>Refers To Argument Element</em>}</li>
 *   <li>{@link arm.impl.CitiationElementImpl#getRefersToArgument <em>Refers To Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CitiationElementImpl extends ArgumentElementImpl implements CitiationElement {
	/**
	 * The cached value of the '{@link #getRefersToArgumentElement() <em>Refers To Argument Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToArgumentElement()
	 * @generated
	 * @ordered
	 */
	protected ArgumentElement refersToArgumentElement;

	/**
	 * The cached value of the '{@link #getRefersToArgument() <em>Refers To Argument</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersToArgument()
	 * @generated
	 * @ordered
	 */
	protected Argument refersToArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitiationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArmPackage.Literals.CITIATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentElement getRefersToArgumentElement() {
		if (refersToArgumentElement != null && refersToArgumentElement.eIsProxy()) {
			InternalEObject oldRefersToArgumentElement = (InternalEObject)refersToArgumentElement;
			refersToArgumentElement = (ArgumentElement)eResolveProxy(oldRefersToArgumentElement);
			if (refersToArgumentElement != oldRefersToArgumentElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT, oldRefersToArgumentElement, refersToArgumentElement));
			}
		}
		return refersToArgumentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentElement basicGetRefersToArgumentElement() {
		return refersToArgumentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToArgumentElement(ArgumentElement newRefersToArgumentElement) {
		ArgumentElement oldRefersToArgumentElement = refersToArgumentElement;
		refersToArgumentElement = newRefersToArgumentElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT, oldRefersToArgumentElement, refersToArgumentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getRefersToArgument() {
		if (refersToArgument != null && refersToArgument.eIsProxy()) {
			InternalEObject oldRefersToArgument = (InternalEObject)refersToArgument;
			refersToArgument = (Argument)eResolveProxy(oldRefersToArgument);
			if (refersToArgument != oldRefersToArgument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT, oldRefersToArgument, refersToArgument));
			}
		}
		return refersToArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument basicGetRefersToArgument() {
		return refersToArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersToArgument(Argument newRefersToArgument) {
		Argument oldRefersToArgument = refersToArgument;
		refersToArgument = newRefersToArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT, oldRefersToArgument, refersToArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT:
				if (resolve) return getRefersToArgumentElement();
				return basicGetRefersToArgumentElement();
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT:
				if (resolve) return getRefersToArgument();
				return basicGetRefersToArgument();
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
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT:
				setRefersToArgumentElement((ArgumentElement)newValue);
				return;
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT:
				setRefersToArgument((Argument)newValue);
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
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT:
				setRefersToArgumentElement((ArgumentElement)null);
				return;
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT:
				setRefersToArgument((Argument)null);
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
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT_ELEMENT:
				return refersToArgumentElement != null;
			case ArmPackage.CITIATION_ELEMENT__REFERS_TO_ARGUMENT:
				return refersToArgument != null;
		}
		return super.eIsSet(featureID);
	}

} //CitiationElementImpl
