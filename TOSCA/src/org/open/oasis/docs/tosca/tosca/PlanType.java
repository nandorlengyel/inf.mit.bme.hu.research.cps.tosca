/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.PlanType#getPlanRef <em>Plan Ref</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPlanType()
 * @model extendedMetaData="name='Plan_._type' kind='empty'"
 * @generated
 */
public interface PlanType extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Ref</em>' attribute.
	 * @see #setPlanRef(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPlanType_PlanRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='planRef'"
	 * @generated
	 */
	String getPlanRef();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.PlanType#getPlanRef <em>Plan Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Ref</em>' attribute.
	 * @see #getPlanRef()
	 * @generated
	 */
	void setPlanRef(String value);

} // PlanType
