/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.tosca.tosca.PropertiesType1;
import org.open.oasis.docs.tosca.tosca.PropertyMappingsType;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Properties Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.PropertiesType1Impl#getAny <em>Any</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.PropertiesType1Impl#getPropertyMappings <em>Property Mappings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertiesType1Impl extends MinimalEObjectImpl.Container implements PropertiesType1 {
	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The cached value of the '{@link #getPropertyMappings() <em>Property Mappings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyMappings()
	 * @generated
	 * @ordered
	 */
	protected PropertyMappingsType propertyMappings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.PROPERTIES_TYPE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, TOSCAPackage.PROPERTIES_TYPE1__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMappingsType getPropertyMappings() {
		return propertyMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyMappings(PropertyMappingsType newPropertyMappings, NotificationChain msgs) {
		PropertyMappingsType oldPropertyMappings = propertyMappings;
		propertyMappings = newPropertyMappings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS, oldPropertyMappings, newPropertyMappings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyMappings(PropertyMappingsType newPropertyMappings) {
		if (newPropertyMappings != propertyMappings) {
			NotificationChain msgs = null;
			if (propertyMappings != null)
				msgs = ((InternalEObject)propertyMappings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS, null, msgs);
			if (newPropertyMappings != null)
				msgs = ((InternalEObject)newPropertyMappings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS, null, msgs);
			msgs = basicSetPropertyMappings(newPropertyMappings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS, newPropertyMappings, newPropertyMappings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.PROPERTIES_TYPE1__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS:
				return basicSetPropertyMappings(null, msgs);
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
			case TOSCAPackage.PROPERTIES_TYPE1__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS:
				return getPropertyMappings();
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
			case TOSCAPackage.PROPERTIES_TYPE1__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS:
				setPropertyMappings((PropertyMappingsType)newValue);
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
			case TOSCAPackage.PROPERTIES_TYPE1__ANY:
				getAny().clear();
				return;
			case TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS:
				setPropertyMappings((PropertyMappingsType)null);
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
			case TOSCAPackage.PROPERTIES_TYPE1__ANY:
				return any != null && !any.isEmpty();
			case TOSCAPackage.PROPERTIES_TYPE1__PROPERTY_MAPPINGS:
				return propertyMappings != null;
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
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //PropertiesType1Impl
