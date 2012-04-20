/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package GSN1.provider;


import GSN1.GSN1Factory;
import GSN1.GSN1Package;
import GSN1.Module;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link GSN1.Module} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModuleItemProvider
	extends ModelElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParentSolvedByPropertyDescriptor(object);
			addAssociatedWithOtherPropertyDescriptor(object);
			addContainsElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Solved By feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentSolvedByPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SolvedByTargetElement_parentSolvedBy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SolvedByTargetElement_parentSolvedBy_feature", "_UI_SolvedByTargetElement_type"),
				 GSN1Package.Literals.SOLVED_BY_TARGET_ELEMENT__PARENT_SOLVED_BY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Associated With Other feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociatedWithOtherPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_associatedWithOther_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_associatedWithOther_feature", "_UI_Module_type"),
				 GSN1Package.Literals.MODULE__ASSOCIATED_WITH_OTHER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contains Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Module_containsElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Module_containsElement_feature", "_UI_Module_type"),
				 GSN1Package.Literals.MODULE__CONTAINS_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GSN1Package.Literals.MODULE__PARENT_MODULE_OF);
			childrenFeatures.add(GSN1Package.Literals.MODULE__HAS_TOP_LEVEL);
			childrenFeatures.add(GSN1Package.Literals.MODULE__PARENT_SOLVED_BY_MODULAR);
			childrenFeatures.add(GSN1Package.Literals.MODULE__HAS_CONTEXT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Module)object).getIdentifier();
		return label == null || label.length() == 0 ?
			getString("_UI_Module_type") :
			getString("_UI_Module_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Module.class)) {
			case GSN1Package.MODULE__PARENT_MODULE_OF:
			case GSN1Package.MODULE__HAS_TOP_LEVEL:
			case GSN1Package.MODULE__PARENT_SOLVED_BY_MODULAR:
			case GSN1Package.MODULE__HAS_CONTEXT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GSN1Package.Literals.MODULE__PARENT_MODULE_OF,
				 GSN1Factory.eINSTANCE.createArgumentModule()));

		newChildDescriptors.add
			(createChildParameter
				(GSN1Package.Literals.MODULE__PARENT_MODULE_OF,
				 GSN1Factory.eINSTANCE.createContractModule()));

		newChildDescriptors.add
			(createChildParameter
				(GSN1Package.Literals.MODULE__HAS_TOP_LEVEL,
				 GSN1Factory.eINSTANCE.createGoal()));

		newChildDescriptors.add
			(createChildParameter
				(GSN1Package.Literals.MODULE__PARENT_SOLVED_BY_MODULAR,
				 GSN1Factory.eINSTANCE.createSolvedByModular()));

		newChildDescriptors.add
			(createChildParameter
				(GSN1Package.Literals.MODULE__HAS_CONTEXT,
				 GSN1Factory.eINSTANCE.createInContextOfModular()));
	}

}
