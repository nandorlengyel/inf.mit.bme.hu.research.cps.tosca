/**
 */
package org.open.oasis.docs.tosca.tosca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TTags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TTags#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTTags()
 * @model extendedMetaData="name='tTags' kind='elementOnly'"
 * @generated
 */
public interface TTags extends EObject {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link org.open.oasis.docs.tosca.tosca.TTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTTags_Tag()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Tag' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<TTag> getTag();

} // TTags
