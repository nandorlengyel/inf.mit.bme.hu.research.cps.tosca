/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.tosca.tosca.RequirementDefinitionsType;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;
import org.open.oasis.docs.tosca.tosca.TRequirementDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.RequirementDefinitionsTypeImpl#getRequirementDefinition <em>Requirement Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementDefinitionsTypeImpl extends MinimalEObjectImpl.Container implements RequirementDefinitionsType {
	/**
	 * The cached value of the '{@link #getRequirementDefinition() <em>Requirement Definition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementDefinition()
	 * @generated
	 * @ordered
	 */
	protected EList<TRequirementDefinition> requirementDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementDefinitionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.REQUIREMENT_DEFINITIONS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRequirementDefinition> getRequirementDefinition() {
		if (requirementDefinition == null) {
			requirementDefinition = new EObjectContainmentEList<TRequirementDefinition>(TRequirementDefinition.class, this, TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION);
		}
		return requirementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION:
				return ((InternalEList<?>)getRequirementDefinition()).basicRemove(otherEnd, msgs);
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
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION:
				return getRequirementDefinition();
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
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION:
				getRequirementDefinition().clear();
				getRequirementDefinition().addAll((Collection<? extends TRequirementDefinition>)newValue);
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
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION:
				getRequirementDefinition().clear();
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
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE__REQUIREMENT_DEFINITION:
				return requirementDefinition != null && !requirementDefinition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementDefinitionsTypeImpl
