/**
 */
package org.open.oasis.docs.tosca.tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived From Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.DerivedFromType#getRelationshipTypeImplementationRef <em>Relationship Type Implementation Ref</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getDerivedFromType()
 * @model extendedMetaData="name='DerivedFrom_._type' kind='empty'"
 * @generated
 */
public interface DerivedFromType extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship Type Implementation Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type Implementation Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type Implementation Ref</em>' attribute.
	 * @see #setRelationshipTypeImplementationRef(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getDerivedFromType_RelationshipTypeImplementationRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipTypeImplementationRef'"
	 * @generated
	 */
	QName getRelationshipTypeImplementationRef();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.DerivedFromType#getRelationshipTypeImplementationRef <em>Relationship Type Implementation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type Implementation Ref</em>' attribute.
	 * @see #getRelationshipTypeImplementationRef()
	 * @generated
	 */
	void setRelationshipTypeImplementationRef(QName value);

} // DerivedFromType
