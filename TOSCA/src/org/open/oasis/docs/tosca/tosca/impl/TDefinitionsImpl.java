/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.tosca.tosca.ExtensionsType;
import org.open.oasis.docs.tosca.tosca.TArtifactTemplate;
import org.open.oasis.docs.tosca.tosca.TArtifactType;
import org.open.oasis.docs.tosca.tosca.TCapabilityType;
import org.open.oasis.docs.tosca.tosca.TDefinitions;
import org.open.oasis.docs.tosca.tosca.TImport;
import org.open.oasis.docs.tosca.tosca.TNodeType;
import org.open.oasis.docs.tosca.tosca.TNodeTypeImplementation;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;
import org.open.oasis.docs.tosca.tosca.TPolicyTemplate;
import org.open.oasis.docs.tosca.tosca.TPolicyType;
import org.open.oasis.docs.tosca.tosca.TRelationshipType;
import org.open.oasis.docs.tosca.tosca.TRelationshipTypeImplementation;
import org.open.oasis.docs.tosca.tosca.TRequirementType;
import org.open.oasis.docs.tosca.tosca.TServiceTemplate;
import org.open.oasis.docs.tosca.tosca.TypesType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TDefinitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getImport <em>Import</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getServiceTemplate <em>Service Template</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getNodeType <em>Node Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getNodeTypeImplementation <em>Node Type Implementation</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getRelationshipType <em>Relationship Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getRelationshipTypeImplementation <em>Relationship Type Implementation</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getRequirementType <em>Requirement Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getCapabilityType <em>Capability Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getArtifactTemplate <em>Artifact Template</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getPolicyType <em>Policy Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getPolicyTemplate <em>Policy Template</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TDefinitionsImpl#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TDefinitionsImpl extends TExtensibleElementsImpl implements TDefinitions {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<TImport> import_;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected TypesType types;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	protected TDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.TDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TDEFINITIONS__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TDEFINITIONS__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TImport> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<TImport>(TImport.class, this, TOSCAPackage.TDEFINITIONS__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType getTypes() {
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypes(TypesType newTypes, NotificationChain msgs) {
		TypesType oldTypes = types;
		types = newTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__TYPES, oldTypes, newTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypes(TypesType newTypes) {
		if (newTypes != types) {
			NotificationChain msgs = null;
			if (types != null)
				msgs = ((InternalEObject)types).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TDEFINITIONS__TYPES, null, msgs);
			if (newTypes != null)
				msgs = ((InternalEObject)newTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TOSCAPackage.TDEFINITIONS__TYPES, null, msgs);
			msgs = basicSetTypes(newTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__TYPES, newTypes, newTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, TOSCAPackage.TDEFINITIONS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TServiceTemplate> getServiceTemplate() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__SERVICE_TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TNodeType> getNodeType() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__NODE_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TNodeTypeImplementation> getNodeTypeImplementation() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipType> getRelationshipType() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRelationshipTypeImplementation> getRelationshipTypeImplementation() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TRequirementType> getRequirementType() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__REQUIREMENT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TCapabilityType> getCapabilityType() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__CAPABILITY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TArtifactType> getArtifactType() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__ARTIFACT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TArtifactTemplate> getArtifactTemplate() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__ARTIFACT_TEMPLATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPolicyType> getPolicyType() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__POLICY_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TPolicyTemplate> getPolicyTemplate() {
		return getGroup().list(TOSCAPackage.Literals.TDEFINITIONS__POLICY_TEMPLATE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TDEFINITIONS__TARGET_NAMESPACE, oldTargetNamespace, targetNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.TDEFINITIONS__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case TOSCAPackage.TDEFINITIONS__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__TYPES:
				return basicSetTypes(null, msgs);
			case TOSCAPackage.TDEFINITIONS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				return ((InternalEList<?>)getServiceTemplate()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE:
				return ((InternalEList<?>)getNodeType()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				return ((InternalEList<?>)getNodeTypeImplementation()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				return ((InternalEList<?>)getRelationshipType()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				return ((InternalEList<?>)getRelationshipTypeImplementation()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				return ((InternalEList<?>)getRequirementType()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__CAPABILITY_TYPE:
				return ((InternalEList<?>)getCapabilityType()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TYPE:
				return ((InternalEList<?>)getArtifactType()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				return ((InternalEList<?>)getArtifactTemplate()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__POLICY_TYPE:
				return ((InternalEList<?>)getPolicyType()).basicRemove(otherEnd, msgs);
			case TOSCAPackage.TDEFINITIONS__POLICY_TEMPLATE:
				return ((InternalEList<?>)getPolicyTemplate()).basicRemove(otherEnd, msgs);
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
			case TOSCAPackage.TDEFINITIONS__EXTENSIONS:
				return getExtensions();
			case TOSCAPackage.TDEFINITIONS__IMPORT:
				return getImport();
			case TOSCAPackage.TDEFINITIONS__TYPES:
				return getTypes();
			case TOSCAPackage.TDEFINITIONS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case TOSCAPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				return getServiceTemplate();
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE:
				return getNodeType();
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				return getNodeTypeImplementation();
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				return getRelationshipType();
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				return getRelationshipTypeImplementation();
			case TOSCAPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				return getRequirementType();
			case TOSCAPackage.TDEFINITIONS__CAPABILITY_TYPE:
				return getCapabilityType();
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TYPE:
				return getArtifactType();
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				return getArtifactTemplate();
			case TOSCAPackage.TDEFINITIONS__POLICY_TYPE:
				return getPolicyType();
			case TOSCAPackage.TDEFINITIONS__POLICY_TEMPLATE:
				return getPolicyTemplate();
			case TOSCAPackage.TDEFINITIONS__ID:
				return getId();
			case TOSCAPackage.TDEFINITIONS__NAME:
				return getName();
			case TOSCAPackage.TDEFINITIONS__TARGET_NAMESPACE:
				return getTargetNamespace();
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
			case TOSCAPackage.TDEFINITIONS__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends TImport>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__TYPES:
				setTypes((TypesType)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				getServiceTemplate().clear();
				getServiceTemplate().addAll((Collection<? extends TServiceTemplate>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE:
				getNodeType().clear();
				getNodeType().addAll((Collection<? extends TNodeType>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				getNodeTypeImplementation().clear();
				getNodeTypeImplementation().addAll((Collection<? extends TNodeTypeImplementation>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				getRelationshipType().clear();
				getRelationshipType().addAll((Collection<? extends TRelationshipType>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				getRelationshipTypeImplementation().clear();
				getRelationshipTypeImplementation().addAll((Collection<? extends TRelationshipTypeImplementation>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				getRequirementType().clear();
				getRequirementType().addAll((Collection<? extends TRequirementType>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__CAPABILITY_TYPE:
				getCapabilityType().clear();
				getCapabilityType().addAll((Collection<? extends TCapabilityType>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TYPE:
				getArtifactType().clear();
				getArtifactType().addAll((Collection<? extends TArtifactType>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				getArtifactTemplate().clear();
				getArtifactTemplate().addAll((Collection<? extends TArtifactTemplate>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__POLICY_TYPE:
				getPolicyType().clear();
				getPolicyType().addAll((Collection<? extends TPolicyType>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__POLICY_TEMPLATE:
				getPolicyTemplate().clear();
				getPolicyTemplate().addAll((Collection<? extends TPolicyTemplate>)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__ID:
				setId((String)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__NAME:
				setName((String)newValue);
				return;
			case TOSCAPackage.TDEFINITIONS__TARGET_NAMESPACE:
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
			case TOSCAPackage.TDEFINITIONS__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case TOSCAPackage.TDEFINITIONS__IMPORT:
				getImport().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__TYPES:
				setTypes((TypesType)null);
				return;
			case TOSCAPackage.TDEFINITIONS__GROUP:
				getGroup().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				getServiceTemplate().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE:
				getNodeType().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				getNodeTypeImplementation().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				getRelationshipType().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				getRelationshipTypeImplementation().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				getRequirementType().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__CAPABILITY_TYPE:
				getCapabilityType().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TYPE:
				getArtifactType().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				getArtifactTemplate().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__POLICY_TYPE:
				getPolicyType().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__POLICY_TEMPLATE:
				getPolicyTemplate().clear();
				return;
			case TOSCAPackage.TDEFINITIONS__ID:
				setId(ID_EDEFAULT);
				return;
			case TOSCAPackage.TDEFINITIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TOSCAPackage.TDEFINITIONS__TARGET_NAMESPACE:
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
			case TOSCAPackage.TDEFINITIONS__EXTENSIONS:
				return extensions != null;
			case TOSCAPackage.TDEFINITIONS__IMPORT:
				return import_ != null && !import_.isEmpty();
			case TOSCAPackage.TDEFINITIONS__TYPES:
				return types != null;
			case TOSCAPackage.TDEFINITIONS__GROUP:
				return group != null && !group.isEmpty();
			case TOSCAPackage.TDEFINITIONS__SERVICE_TEMPLATE:
				return !getServiceTemplate().isEmpty();
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE:
				return !getNodeType().isEmpty();
			case TOSCAPackage.TDEFINITIONS__NODE_TYPE_IMPLEMENTATION:
				return !getNodeTypeImplementation().isEmpty();
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE:
				return !getRelationshipType().isEmpty();
			case TOSCAPackage.TDEFINITIONS__RELATIONSHIP_TYPE_IMPLEMENTATION:
				return !getRelationshipTypeImplementation().isEmpty();
			case TOSCAPackage.TDEFINITIONS__REQUIREMENT_TYPE:
				return !getRequirementType().isEmpty();
			case TOSCAPackage.TDEFINITIONS__CAPABILITY_TYPE:
				return !getCapabilityType().isEmpty();
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TYPE:
				return !getArtifactType().isEmpty();
			case TOSCAPackage.TDEFINITIONS__ARTIFACT_TEMPLATE:
				return !getArtifactTemplate().isEmpty();
			case TOSCAPackage.TDEFINITIONS__POLICY_TYPE:
				return !getPolicyType().isEmpty();
			case TOSCAPackage.TDEFINITIONS__POLICY_TEMPLATE:
				return !getPolicyTemplate().isEmpty();
			case TOSCAPackage.TDEFINITIONS__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case TOSCAPackage.TDEFINITIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TOSCAPackage.TDEFINITIONS__TARGET_NAMESPACE:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", targetNamespace: ");
		result.append(targetNamespace);
		result.append(')');
		return result.toString();
	}

} //TDefinitionsImpl
