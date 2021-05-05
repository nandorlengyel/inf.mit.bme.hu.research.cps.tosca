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

import org.open.oasis.docs.tosca.tosca.InputParametersType1;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;
import org.open.oasis.docs.tosca.tosca.TParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Parameters Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.InputParametersType1Impl#getInputParameter <em>Input Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputParametersType1Impl extends MinimalEObjectImpl.Container implements InputParametersType1 {
	/**
	 * The cached value of the '{@link #getInputParameter() <em>Input Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<TParameter> inputParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputParametersType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.INPUT_PARAMETERS_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TParameter> getInputParameter() {
		if (inputParameter == null) {
			inputParameter = new EObjectContainmentEList<TParameter>(TParameter.class, this, TOSCAPackage.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER);
		}
		return inputParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER:
				return ((InternalEList<?>)getInputParameter()).basicRemove(otherEnd, msgs);
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
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER:
				return getInputParameter();
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
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER:
				getInputParameter().clear();
				getInputParameter().addAll((Collection<? extends TParameter>)newValue);
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
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER:
				getInputParameter().clear();
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
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1__INPUT_PARAMETER:
				return inputParameter != null && !inputParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputParametersType1Impl
