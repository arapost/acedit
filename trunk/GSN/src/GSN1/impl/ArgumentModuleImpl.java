/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.impl;

import GSN1.ArgumentElement;
import GSN1.ArgumentModule;
import GSN1.GSN1Package;
import GSN1.Goal;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GSN1.impl.ArgumentModuleImpl#getParentModuleOf <em>Parent Module Of</em>}</li>
 *   <li>{@link GSN1.impl.ArgumentModuleImpl#getAssociatedWithOther <em>Associated With Other</em>}</li>
 *   <li>{@link GSN1.impl.ArgumentModuleImpl#getHasTopLevel <em>Has Top Level</em>}</li>
 *   <li>{@link GSN1.impl.ArgumentModuleImpl#getContainsElement <em>Contains Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentModuleImpl extends ModelElementImpl implements ArgumentModule {
	/**
	 * The cached value of the '{@link #getParentModuleOf() <em>Parent Module Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentModuleOf()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentModule> parentModuleOf;

	/**
	 * The cached value of the '{@link #getAssociatedWithOther() <em>Associated With Other</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedWithOther()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentModule> associatedWithOther;

	/**
	 * The cached value of the '{@link #getHasTopLevel() <em>Has Top Level</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasTopLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> hasTopLevel;

	/**
	 * The cached value of the '{@link #getContainsElement() <em>Contains Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArgumentElement> containsElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GSN1Package.Literals.ARGUMENT_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentModule> getParentModuleOf() {
		if (parentModuleOf == null) {
			parentModuleOf = new EObjectContainmentEList<ArgumentModule>(ArgumentModule.class, this, GSN1Package.ARGUMENT_MODULE__PARENT_MODULE_OF);
		}
		return parentModuleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentModule> getAssociatedWithOther() {
		if (associatedWithOther == null) {
			associatedWithOther = new EObjectResolvingEList<ArgumentModule>(ArgumentModule.class, this, GSN1Package.ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER);
		}
		return associatedWithOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Goal> getHasTopLevel() {
		if (hasTopLevel == null) {
			hasTopLevel = new EObjectContainmentWithInverseEList<Goal>(Goal.class, this, GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL, GSN1Package.GOAL__IS_TOP_LEVEL_GOAL_OF);
		}
		return hasTopLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArgumentElement> getContainsElement() {
		if (containsElement == null) {
			containsElement = new EObjectWithInverseResolvingEList<ArgumentElement>(ArgumentElement.class, this, GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT, GSN1Package.ARGUMENT_ELEMENT__IS_PART_OF);
		}
		return containsElement;
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
			case GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasTopLevel()).basicAdd(otherEnd, msgs);
			case GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getContainsElement()).basicAdd(otherEnd, msgs);
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
			case GSN1Package.ARGUMENT_MODULE__PARENT_MODULE_OF:
				return ((InternalEList<?>)getParentModuleOf()).basicRemove(otherEnd, msgs);
			case GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL:
				return ((InternalEList<?>)getHasTopLevel()).basicRemove(otherEnd, msgs);
			case GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT:
				return ((InternalEList<?>)getContainsElement()).basicRemove(otherEnd, msgs);
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
			case GSN1Package.ARGUMENT_MODULE__PARENT_MODULE_OF:
				return getParentModuleOf();
			case GSN1Package.ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER:
				return getAssociatedWithOther();
			case GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL:
				return getHasTopLevel();
			case GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT:
				return getContainsElement();
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
			case GSN1Package.ARGUMENT_MODULE__PARENT_MODULE_OF:
				getParentModuleOf().clear();
				getParentModuleOf().addAll((Collection<? extends ArgumentModule>)newValue);
				return;
			case GSN1Package.ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER:
				getAssociatedWithOther().clear();
				getAssociatedWithOther().addAll((Collection<? extends ArgumentModule>)newValue);
				return;
			case GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL:
				getHasTopLevel().clear();
				getHasTopLevel().addAll((Collection<? extends Goal>)newValue);
				return;
			case GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT:
				getContainsElement().clear();
				getContainsElement().addAll((Collection<? extends ArgumentElement>)newValue);
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
			case GSN1Package.ARGUMENT_MODULE__PARENT_MODULE_OF:
				getParentModuleOf().clear();
				return;
			case GSN1Package.ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER:
				getAssociatedWithOther().clear();
				return;
			case GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL:
				getHasTopLevel().clear();
				return;
			case GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT:
				getContainsElement().clear();
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
			case GSN1Package.ARGUMENT_MODULE__PARENT_MODULE_OF:
				return parentModuleOf != null && !parentModuleOf.isEmpty();
			case GSN1Package.ARGUMENT_MODULE__ASSOCIATED_WITH_OTHER:
				return associatedWithOther != null && !associatedWithOther.isEmpty();
			case GSN1Package.ARGUMENT_MODULE__HAS_TOP_LEVEL:
				return hasTopLevel != null && !hasTopLevel.isEmpty();
			case GSN1Package.ARGUMENT_MODULE__CONTAINS_ELEMENT:
				return containsElement != null && !containsElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArgumentModuleImpl
