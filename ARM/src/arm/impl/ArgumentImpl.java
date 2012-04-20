/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package arm.impl;

import arm.Argument;
import arm.ArgumentElement;
import arm.ArgumentLink;
import arm.ArmPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link arm.impl.ArgumentImpl#getContainsArgumentElement <em>Contains Argument Element</em>}</li>
 *   <li>{@link arm.impl.ArgumentImpl#getContainsArgumentLink <em>Contains Argument Link</em>}</li>
 *   <li>{@link arm.impl.ArgumentImpl#getContainsArgument <em>Contains Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends ModelElementImpl implements Argument {
	/**
	 * The cached value of the '{@link #getContainsArgumentElement() <em>Contains Argument Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArgumentElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> containsArgumentElement;

	/**
	 * The cached value of the '{@link #getContainsArgumentLink() <em>Contains Argument Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArgumentLink()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentLink> containsArgumentLink;

	/**
	 * The cached value of the '{@link #getContainsArgument() <em>Contains Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsArgument()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> containsArgument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArmPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getContainsArgumentElement() {
		if (containsArgumentElement == null) {
			containsArgumentElement = new EObjectResolvingEList<ArgumentElement>(ArgumentElement.class, this, ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT);
		}
		return containsArgumentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentLink> getContainsArgumentLink() {
		if (containsArgumentLink == null) {
			containsArgumentLink = new EObjectResolvingEList<ArgumentLink>(ArgumentLink.class, this, ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK);
		}
		return containsArgumentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getContainsArgument() {
		if (containsArgument == null) {
			containsArgument = new EObjectResolvingEList<Argument>(Argument.class, this, ArmPackage.ARGUMENT__CONTAINS_ARGUMENT);
		}
		return containsArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				return getContainsArgumentElement();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				return getContainsArgumentLink();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				return getContainsArgument();
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				getContainsArgumentElement().clear();
				getContainsArgumentElement().addAll((Collection<? extends ArgumentElement>)newValue);
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				getContainsArgumentLink().clear();
				getContainsArgumentLink().addAll((Collection<? extends ArgumentLink>)newValue);
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				getContainsArgument().clear();
				getContainsArgument().addAll((Collection<? extends Argument>)newValue);
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				getContainsArgumentElement().clear();
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				getContainsArgumentLink().clear();
				return;
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				getContainsArgument().clear();
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
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_ELEMENT:
				return containsArgumentElement != null && !containsArgumentElement.isEmpty();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT_LINK:
				return containsArgumentLink != null && !containsArgumentLink.isEmpty();
			case ArmPackage.ARGUMENT__CONTAINS_ARGUMENT:
				return containsArgument != null && !containsArgument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentImpl
