/**
 */
package org.open.oasis.docs.tosca.tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TImplementation Artifact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTImplementationArtifact()
 * @model extendedMetaData="name='tImplementationArtifact' kind='elementOnly'"
 * @generated
 */
public interface TImplementationArtifact extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Interface Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name</em>' attribute.
	 * @see #setInterfaceName(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTImplementationArtifact_InterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='interfaceName'"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getInterfaceName <em>Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Name</em>' attribute.
	 * @see #getInterfaceName()
	 * @generated
	 */
	void setInterfaceName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTImplementationArtifact_OperationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='operationName'"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Type</em>' attribute.
	 * @see #setArtifactType(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTImplementationArtifact_ArtifactType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='artifactType'"
	 * @generated
	 */
	QName getArtifactType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getArtifactType <em>Artifact Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Type</em>' attribute.
	 * @see #getArtifactType()
	 * @generated
	 */
	void setArtifactType(QName value);

	/**
	 * Returns the value of the '<em><b>Artifact Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Ref</em>' attribute.
	 * @see #setArtifactRef(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTImplementationArtifact_ArtifactRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='artifactRef'"
	 * @generated
	 */
	QName getArtifactRef();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TImplementationArtifact#getArtifactRef <em>Artifact Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Ref</em>' attribute.
	 * @see #getArtifactRef()
	 * @generated
	 */
	void setArtifactRef(QName value);

} // TImplementationArtifact
