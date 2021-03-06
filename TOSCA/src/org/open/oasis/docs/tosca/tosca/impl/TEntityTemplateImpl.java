/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.tosca.tosca.PropertiesType;
import org.open.oasis.docs.tosca.tosca.PropertyConstraintsType;
import org.open.oasis.docs.tosca.tosca.TEntityTemplate;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEntity Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTemplateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTemplateImpl#getPropertyConstraints <em>Property Constraints</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTemplateImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTemplateImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TEntityTemplateImpl extends TExtensibleElementsImpl implements TEntityTemplate {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * The cached value of the '{@link #getPropertyConstraints() <em>Property Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyConstraints()
	 * @generated
	 * @ordered
	 */
	protected PropertyConstraintsType propertyConstraints;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QName TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QName type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEntityTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.TENTITY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType getPropertyConstraints() {
		return propertyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyConstraints(PropertyConstraintsType newPropertyConstraints, NotificationChain msgs) {
		PropertyConstraintsType oldPropertyConstraints = propertyConstraints;
		propertyConstraints = newPropertyConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, oldPropertyConstraints, newPropertyConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyConstraints(PropertyConstraintsType newPropertyConstraints) {
		if (newPropertyConstraints != propertyConstraints) {
			NotificationChain msgs = null;
			if (propertyConstraints != null)
				msgs = ((InternalEObject)propertyConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, null, msgs);
			if (newPropertyConstraints != null)
				msgs = ((InternalEObject)newPropertyConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, null, msgs);
			msgs = basicSetPropertyConstraints(newPropertyConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS, newPropertyConstraints, newPropertyConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TEMPLATE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QName newType) {
		QName oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TEMPLATE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return basicSetPropertyConstraints(null, msgs);
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
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES:
				return getProperties();
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return getPropertyConstraints();
			case TOSCAPackage.TENTITY_TEMPLATE__ID:
				return getId();
			case TOSCAPackage.TENTITY_TEMPLATE__TYPE:
				return getType();
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
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES:
				setProperties((PropertiesType)newValue);
				return;
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				setPropertyConstraints((PropertyConstraintsType)newValue);
				return;
			case TOSCAPackage.TENTITY_TEMPLATE__ID:
				setId((String)newValue);
				return;
			case TOSCAPackage.TENTITY_TEMPLATE__TYPE:
				setType((QName)newValue);
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
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES:
				setProperties((PropertiesType)null);
				return;
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				setPropertyConstraints((PropertyConstraintsType)null);
				return;
			case TOSCAPackage.TENTITY_TEMPLATE__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSCAPackage.TENTITY_TEMPLATE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTIES:
				return properties != null;
			case TOSCAPackage.TENTITY_TEMPLATE__PROPERTY_CONSTRAINTS:
				return propertyConstraints != null;
			case TOSCAPackage.TENTITY_TEMPLATE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSCAPackage.TENTITY_TEMPLATE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TEntityTemplateImpl
