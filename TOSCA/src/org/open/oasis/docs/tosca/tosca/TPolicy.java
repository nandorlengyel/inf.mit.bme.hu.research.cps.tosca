/**
 */
package org.open.oasis.docs.tosca.tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPolicy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPolicy#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPolicy#getPolicyType <em>Policy Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPolicy#getPolicyRef <em>Policy Ref</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPolicy()
 * @model extendedMetaData="name='tPolicy' kind='elementOnly'"
 * @generated
 */
public interface TPolicy extends TExtensibleElements {
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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPolicy_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPolicy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Policy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Type</em>' attribute.
	 * @see #setPolicyType(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPolicy_PolicyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='policyType'"
	 * @generated
	 */
	QName getPolicyType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPolicy#getPolicyType <em>Policy Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Type</em>' attribute.
	 * @see #getPolicyType()
	 * @generated
	 */
	void setPolicyType(QName value);

	/**
	 * Returns the value of the '<em><b>Policy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy Ref</em>' attribute.
	 * @see #setPolicyRef(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPolicy_PolicyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='policyRef'"
	 * @generated
	 */
	QName getPolicyRef();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPolicy#getPolicyRef <em>Policy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy Ref</em>' attribute.
	 * @see #getPolicyRef()
	 * @generated
	 */
	void setPolicyRef(QName value);

} // TPolicy
