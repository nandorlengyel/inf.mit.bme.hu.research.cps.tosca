/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Artifact References Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.ArtifactReferencesType#getArtifactReference <em>Artifact Reference</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getArtifactReferencesType()
 * @model extendedMetaData="name='ArtifactReferences_._type' kind='elementOnly'"
 * @generated
 */
public interface ArtifactReferencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Artifact Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.tosca.tosca.TArtifactReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Reference</em>' containment reference list.
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getArtifactReferencesType_ArtifactReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ArtifactReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TArtifactReference> getArtifactReference();

} // ArtifactReferencesType
