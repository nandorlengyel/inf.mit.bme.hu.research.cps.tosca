/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.open.oasis.docs.tosca.tosca.PlanType;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.PlanTypeImpl#getPlanRef <em>Plan Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanTypeImpl extends MinimalEObjectImpl.Container implements PlanType {
	/**
	 * The default value of the '{@link #getPlanRef() <em>Plan Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAN_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlanRef() <em>Plan Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanRef()
	 * @generated
	 * @ordered
	 */
	protected String planRef = PLAN_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.PLAN_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlanRef() {
		return planRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlanRef(String newPlanRef) {
		String oldPlanRef = planRef;
		planRef = newPlanRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.PLAN_TYPE__PLAN_REF, oldPlanRef, planRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSCAPackage.PLAN_TYPE__PLAN_REF:
				return getPlanRef();
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
			case TOSCAPackage.PLAN_TYPE__PLAN_REF:
				setPlanRef((String)newValue);
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
			case TOSCAPackage.PLAN_TYPE__PLAN_REF:
				setPlanRef(PLAN_REF_EDEFAULT);
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
			case TOSCAPackage.PLAN_TYPE__PLAN_REF:
				return PLAN_REF_EDEFAULT == null ? planRef != null : !PLAN_REF_EDEFAULT.equals(planRef);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (planRef: ");
		result.append(planRef);
		result.append(')');
		return result.toString();
	}

} //PlanTypeImpl
