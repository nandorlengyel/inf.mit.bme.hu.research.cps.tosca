/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Model Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.PlanModelReferenceType#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPlanModelReferenceType()
 * @model extendedMetaData="name='PlanModelReference_._type' kind='empty'"
 * @generated
 */
public interface PlanModelReferenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' attribute.
	 * @see #setReference(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPlanModelReferenceType_Reference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='reference'"
	 * @generated
	 */
	String getReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.PlanModelReferenceType#getReference <em>Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' attribute.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(String value);

} // PlanModelReferenceType
