/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interfaces Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.InterfacesType1#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getInterfacesType1()
 * @model extendedMetaData="name='Interfaces_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface InterfacesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.tosca.tosca.TExportedInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getInterfacesType1_Interface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Interface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TExportedInterface> getInterface();

} // InterfacesType1
