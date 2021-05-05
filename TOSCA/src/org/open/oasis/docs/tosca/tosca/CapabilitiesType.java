/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capabilities Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.CapabilitiesType#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getCapabilitiesType()
 * @model extendedMetaData="name='Capabilities_._type' kind='elementOnly'"
 * @generated
 */
public interface CapabilitiesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.tosca.tosca.TCapability}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capability</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getCapabilitiesType_Capability()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Capability' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TCapability> getCapability();

} // CapabilitiesType
