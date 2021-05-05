/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Operation Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.RelationshipOperationType#getOperationName <em>Operation Name</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getRelationshipOperationType()
 * @model extendedMetaData="name='RelationshipOperation_._type' kind='empty'"
 * @generated
 */
public interface RelationshipOperationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Ref</em>' attribute.
	 * @see #setRelationshipRef(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getRelationshipOperationType_RelationshipRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='relationshipRef'"
	 * @generated
	 */
	String getRelationshipRef();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.RelationshipOperationType#getRelationshipRef <em>Relationship Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Ref</em>' attribute.
	 * @see #getRelationshipRef()
	 * @generated
	 */
	void setRelationshipRef(String value);

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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getRelationshipOperationType_InterfaceName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='interfaceName'"
	 * @generated
	 */
	String getInterfaceName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.RelationshipOperationType#getInterfaceName <em>Interface Name</em>}' attribute.
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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getRelationshipOperationType_OperationName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='operationName'"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.RelationshipOperationType#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

} // RelationshipOperationType
