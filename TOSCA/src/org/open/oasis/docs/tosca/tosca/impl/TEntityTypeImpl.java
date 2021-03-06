/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.tosca.tosca.DerivedFromType2;
import org.open.oasis.docs.tosca.tosca.PropertiesDefinitionType;
import org.open.oasis.docs.tosca.tosca.TBoolean;
import org.open.oasis.docs.tosca.tosca.TEntityType;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;
import org.open.oasis.docs.tosca.tosca.TTags;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TEntity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getPropertiesDefinition <em>Properties Definition</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getFinal <em>Final</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TEntityTypeImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TEntityTypeImpl extends TExtensibleElementsImpl implements TEntityType {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected TTags tags;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected DerivedFromType2 derivedFrom;

	/**
	 * The cached value of the '{@link #getPropertiesDefinition() <em>Properties Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertiesDefinition()
	 * @generated
	 * @ordered
	 */
	protected PropertiesDefinitionType propertiesDefinition;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final TBoolean ABSTRACT_EDEFAULT = TBoolean.NO;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected TBoolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * This is true if the Abstract attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean abstractESet;

	/**
	 * The default value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected static final TBoolean FINAL_EDEFAULT = TBoolean.NO;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected TBoolean final_ = FINAL_EDEFAULT;

	/**
	 * This is true if the Final attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finalESet;

	/**
	 * The default value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetNamespace() <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetNamespace()
	 * @generated
	 * @ordered
	 */
	protected String targetNamespace = TARGET_NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TEntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.TENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTags getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(TTags newTags, NotificationChain msgs) {
		TTags oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__TAGS, oldTags, newTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(TTags newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TYPE__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TYPE__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType2 getDerivedFrom() {
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedFrom(DerivedFromType2 newDerivedFrom, NotificationChain msgs) {
		DerivedFromType2 oldDerivedFrom = derivedFrom;
		derivedFrom = newDerivedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__DERIVED_FROM, oldDerivedFrom, newDerivedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedFrom(DerivedFromType2 newDerivedFrom) {
		if (newDerivedFrom != derivedFrom) {
			NotificationChain msgs = null;
			if (derivedFrom != null)
				msgs = ((InternalEObject)derivedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TYPE__DERIVED_FROM, null, msgs);
			if (newDerivedFrom != null)
				msgs = ((InternalEObject)newDerivedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TYPE__DERIVED_FROM, null, msgs);
			msgs = basicSetDerivedFrom(newDerivedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__DERIVED_FROM, newDerivedFrom, newDerivedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinitionType getPropertiesDefinition() {
		return propertiesDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertiesDefinition(PropertiesDefinitionType newPropertiesDefinition, NotificationChain msgs) {
		PropertiesDefinitionType oldPropertiesDefinition = propertiesDefinition;
		propertiesDefinition = newPropertiesDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION, oldPropertiesDefinition, newPropertiesDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesDefinition(PropertiesDefinitionType newPropertiesDefinition) {
		if (newPropertiesDefinition != propertiesDefinition) {
			NotificationChain msgs = null;
			if (propertiesDefinition != null)
				msgs = ((InternalEObject)propertiesDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION, null, msgs);
			if (newPropertiesDefinition != null)
				msgs = ((InternalEObject)newPropertiesDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION, null, msgs);
			msgs = basicSetPropertiesDefinition(newPropertiesDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION, newPropertiesDefinition, newPropertiesDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(TBoolean newAbstract) {
		TBoolean oldAbstract = abstract_;
		abstract_ = newAbstract == null ? ABSTRACT_EDEFAULT : newAbstract;
		boolean oldAbstractESet = abstractESet;
		abstractESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__ABSTRACT, oldAbstract, abstract_, !oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAbstract() {
		TBoolean oldAbstract = abstract_;
		boolean oldAbstractESet = abstractESet;
		abstract_ = ABSTRACT_EDEFAULT;
		abstractESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TOSCAPackage.TENTITY_TYPE__ABSTRACT, oldAbstract, ABSTRACT_EDEFAULT, oldAbstractESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAbstract() {
		return abstractESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinal(TBoolean newFinal) {
		TBoolean oldFinal = final_;
		final_ = newFinal == null ? FINAL_EDEFAULT : newFinal;
		boolean oldFinalESet = finalESet;
		finalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__FINAL, oldFinal, final_, !oldFinalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFinal() {
		TBoolean oldFinal = final_;
		boolean oldFinalESet = finalESet;
		final_ = FINAL_EDEFAULT;
		finalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, TOSCAPackage.TENTITY_TYPE__FINAL, oldFinal, FINAL_EDEFAULT, oldFinalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFinal() {
		return finalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetNamespace() {
		return targetNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetNamespace(String newTargetNamespace) {
		String oldTargetNamespace = targetNamespace;
		targetNamespace = newTargetNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TENTITY_TYPE__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.TENTITY_TYPE__TAGS:
				return basicSetTags(null, msgs);
			case TOSCAPackage.TENTITY_TYPE__DERIVED_FROM:
				return basicSetDerivedFrom(null, msgs);
			case TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION:
				return basicSetPropertiesDefinition(null, msgs);
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
			case TOSCAPackage.TENTITY_TYPE__TAGS:
				return getTags();
			case TOSCAPackage.TENTITY_TYPE__DERIVED_FROM:
				return getDerivedFrom();
			case TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION:
				return getPropertiesDefinition();
			case TOSCAPackage.TENTITY_TYPE__NAME:
				return getName();
			case TOSCAPackage.TENTITY_TYPE__ABSTRACT:
				return getAbstract();
			case TOSCAPackage.TENTITY_TYPE__FINAL:
				return getFinal();
			case TOSCAPackage.TENTITY_TYPE__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case TOSCAPackage.TENTITY_TYPE__TAGS:
				setTags((TTags)newValue);
				return;
			case TOSCAPackage.TENTITY_TYPE__DERIVED_FROM:
				setDerivedFrom((DerivedFromType2)newValue);
				return;
			case TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION:
				setPropertiesDefinition((PropertiesDefinitionType)newValue);
				return;
			case TOSCAPackage.TENTITY_TYPE__NAME:
				setName((String)newValue);
				return;
			case TOSCAPackage.TENTITY_TYPE__ABSTRACT:
				setAbstract((TBoolean)newValue);
				return;
			case TOSCAPackage.TENTITY_TYPE__FINAL:
				setFinal((TBoolean)newValue);
				return;
			case TOSCAPackage.TENTITY_TYPE__TARGET_NAMESPACE:
				setTargetNamespace((String)newValue);
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
			case TOSCAPackage.TENTITY_TYPE__TAGS:
				setTags((TTags)null);
				return;
			case TOSCAPackage.TENTITY_TYPE__DERIVED_FROM:
				setDerivedFrom((DerivedFromType2)null);
				return;
			case TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION:
				setPropertiesDefinition((PropertiesDefinitionType)null);
				return;
			case TOSCAPackage.TENTITY_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TOSCAPackage.TENTITY_TYPE__ABSTRACT:
				unsetAbstract();
				return;
			case TOSCAPackage.TENTITY_TYPE__FINAL:
				unsetFinal();
				return;
			case TOSCAPackage.TENTITY_TYPE__TARGET_NAMESPACE:
				setTargetNamespace(TARGET_NAMESPACE_EDEFAULT);
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
			case TOSCAPackage.TENTITY_TYPE__TAGS:
				return tags != null;
			case TOSCAPackage.TENTITY_TYPE__DERIVED_FROM:
				return derivedFrom != null;
			case TOSCAPackage.TENTITY_TYPE__PROPERTIES_DEFINITION:
				return propertiesDefinition != null;
			case TOSCAPackage.TENTITY_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TOSCAPackage.TENTITY_TYPE__ABSTRACT:
				return isSetAbstract();
			case TOSCAPackage.TENTITY_TYPE__FINAL:
				return isSetFinal();
			case TOSCAPackage.TENTITY_TYPE__TARGET_NAMESPACE:
				return TARGET_NAMESPACE_EDEFAULT == null ? targetNamespace != null : !TARGET_NAMESPACE_EDEFAULT.equals(targetNamespace);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		if (abstractESet) result.append(abstract_); else result.append("<unset>");
		result.append(", final: ");
		if (finalESet) result.append(final_); else result.append("<unset>");
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //TEntityTypeImpl
