/**
 */
package org.open.oasis.docs.tosca.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TArtifact Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TArtifactTemplate#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTArtifactTemplate()
 * @model extendedMetaData="name='tArtifactTemplate' kind='elementOnly'"
 * @generated
 */
public interface TArtifactTemplate extends TEntityTemplate {
	/**
	 * Returns the value of the '<em><b>Artifact References</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact References</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact References</em>' containment reference.
	 * @see #setArtifactReferences(ArtifactReferencesType)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTArtifactTemplate_ArtifactReferences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ArtifactReferences' namespace='##targetNamespace'"
	 * @generated
	 */
	ArtifactReferencesType getArtifactReferences();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TArtifactTemplate#getArtifactReferences <em>Artifact References</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact References</em>' containment reference.
	 * @see #getArtifactReferences()
	 * @generated
	 */
	void setArtifactReferences(ArtifactReferencesType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTArtifactTemplate_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TArtifactTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TArtifactTemplate
