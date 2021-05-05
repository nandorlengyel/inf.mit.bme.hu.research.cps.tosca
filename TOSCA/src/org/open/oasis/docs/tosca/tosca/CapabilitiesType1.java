/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilities Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.CapabilitiesType1#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getCapabilitiesType1()
 * @model extendedMetaData="name='Capabilities_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface CapabilitiesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.tosca.tosca.TCapabilityRef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getCapabilitiesType1_Capability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Capability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCapabilityRef> getCapability();

} // CapabilitiesType1
