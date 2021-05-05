/**
 */
package org.open.oasis.docs.tosca.tosca.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.open.oasis.docs.tosca.tosca.TDefinitions;
import org.open.oasis.docs.tosca.tosca.TOSCAFactory;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;

/**
 * This is the item provider adapter for a {@link org.open.oasis.docs.tosca.tosca.TDefinitions} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TDefinitionsItemProvider extends TExtensibleElementsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitionsItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTargetNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TDefinitions_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_id_feature", "_UI_TDefinitions_type"),
				 TOSCAPackage.Literals.TDEFINITIONS__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TDefinitions_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_name_feature", "_UI_TDefinitions_type"),
				 TOSCAPackage.Literals.TDEFINITIONS__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TDefinitions_targetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TDefinitions_targetNamespace_feature", "_UI_TDefinitions_type"),
				 TOSCAPackage.Literals.TDEFINITIONS__TARGET_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(TOSCAPackage.Literals.TDEFINITIONS__EXTENSIONS);
			childrenFeatures.add(TOSCAPackage.Literals.TDEFINITIONS__IMPORT);
			childrenFeatures.add(TOSCAPackage.Literals.TDEFINITIONS__TYPES);
			childrenFeatures.add(TOSCAPackage.Literals.TDEFINITIONS__GROUP);
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
	 * This returns TDefinitions.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TDefinitions"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TDefinitions)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TDefinitions_type") :
			getString("_UI_TDefinitions_type") + " " + label;
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

		switch (notification.getFeatureID(TDefinitions.class)) {
			case TOSCAPackage.TDEFINITIONS__ID:
			case TOSCAPackage.TDEFINITIONS__NAME:
			case TOSCAPackage.TDEFINITIONS__TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case TOSCAPackage.TDEFINITIONS__EXTENSIONS:
			case TOSCAPackage.TDEFINITIONS__IMPORT:
			case TOSCAPackage.TDEFINITIONS__TYPES:
			case TOSCAPackage.TDEFINITIONS__GROUP:
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
				(TOSCAPackage.Literals.TDEFINITIONS__EXTENSIONS,
				 TOSCAFactory.eINSTANCE.createExtensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__IMPORT,
				 TOSCAFactory.eINSTANCE.createTImport()));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__TYPES,
				 TOSCAFactory.eINSTANCE.createTypesType()));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__SERVICE_TEMPLATE,
					 TOSCAFactory.eINSTANCE.createTServiceTemplate())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__NODE_TYPE,
					 TOSCAFactory.eINSTANCE.createTNodeType())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION,
					 TOSCAFactory.eINSTANCE.createTNodeTypeImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE,
					 TOSCAFactory.eINSTANCE.createTRelationshipType())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION,
					 TOSCAFactory.eINSTANCE.createTRelationshipTypeImplementation())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__REQUIREMENT_TYPE,
					 TOSCAFactory.eINSTANCE.createTRequirementType())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__CAPABILITY_TYPE,
					 TOSCAFactory.eINSTANCE.createTCapabilityType())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__ARTIFACT_TYPE,
					 TOSCAFactory.eINSTANCE.createTArtifactType())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__ARTIFACT_TEMPLATE,
					 TOSCAFactory.eINSTANCE.createTArtifactTemplate())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__POLICY_TYPE,
					 TOSCAFactory.eINSTANCE.createTPolicyType())));

		newChildDescriptors.add
			(createChildParameter
				(TOSCAPackage.Literals.TDEFINITIONS__GROUP,
				 FeatureMapUtil.createEntry
					(TOSCAPackage.Literals.TDEFINITIONS__POLICY_TEMPLATE,
					 TOSCAFactory.eINSTANCE.createTPolicyTemplate())));
	}

}
