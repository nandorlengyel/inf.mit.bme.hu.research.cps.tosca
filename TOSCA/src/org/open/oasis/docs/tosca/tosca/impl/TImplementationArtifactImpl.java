/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.open.oasis.docs.tosca.tosca.TImplementationArtifact;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TImplementation Artifact</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TImplementationArtifactImpl#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TImplementationArtifactImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TImplementationArtifactImpl#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.TImplementationArtifactImpl#getArtifactRef <em>Artifact Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TImplementationArtifactImpl extends TExtensibleElementsImpl implements TImplementationArtifact {
	/**
	 * The default value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterfaceName() <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String interfaceName = INTERFACE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected static final QName ARTIFACT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactType() <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactType()
	 * @generated
	 * @ordered
	 */
	protected QName artifactType = ARTIFACT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArtifactRef() <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName ARTIFACT_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArtifactRef() <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactRef()
	 * @generated
	 * @ordered
	 */
	protected QName artifactRef = ARTIFACT_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TImplementationArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.TIMPLEMENTATION_ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterfaceName() {
		return interfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceName(String newInterfaceName) {
		String oldInterfaceName = interfaceName;
		interfaceName = newInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME, oldInterfaceName, interfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TIMPLEMENTATION_ARTIFACT__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getArtifactType() {
		return artifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactType(QName newArtifactType) {
		QName oldArtifactType = artifactType;
		artifactType = newArtifactType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE, oldArtifactType, artifactType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getArtifactRef() {
		return artifactRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactRef(QName newArtifactRef) {
		QName oldArtifactRef = artifactRef;
		artifactRef = newArtifactRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF, oldArtifactRef, artifactRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME:
				return getInterfaceName();
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__OPERATION_NAME:
				return getOperationName();
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE:
				return getArtifactType();
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF:
				return getArtifactRef();
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
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME:
				setInterfaceName((String)newValue);
				return;
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE:
				setArtifactType((QName)newValue);
				return;
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF:
				setArtifactRef((QName)newValue);
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
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME:
				setInterfaceName(INTERFACE_NAME_EDEFAULT);
				return;
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE:
				setArtifactType(ARTIFACT_TYPE_EDEFAULT);
				return;
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF:
				setArtifactRef(ARTIFACT_REF_EDEFAULT);
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
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__INTERFACE_NAME:
				return INTERFACE_NAME_EDEFAULT == null ? interfaceName != null : !INTERFACE_NAME_EDEFAULT.equals(interfaceName);
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_TYPE:
				return ARTIFACT_TYPE_EDEFAULT == null ? artifactType != null : !ARTIFACT_TYPE_EDEFAULT.equals(artifactType);
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT__ARTIFACT_REF:
				return ARTIFACT_REF_EDEFAULT == null ? artifactRef != null : !ARTIFACT_REF_EDEFAULT.equals(artifactRef);
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
		result.append(" (interfaceName: ");
		result.append(interfaceName);
		result.append(", operationName: ");
		result.append(operationName);
		result.append(", artifactType: ");
		result.append(artifactType);
		result.append(", artifactRef: ");
		result.append(artifactRef);
		result.append(')');
		return result.toString();
	}

} //TImplementationArtifactImpl
