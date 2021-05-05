/**
 */
package org.open.oasis.docs.tosca.tosca;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties Definition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.PropertiesDefinitionType#getElement <em>Element</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.PropertiesDefinitionType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPropertiesDefinitionType()
 * @model extendedMetaData="name='PropertiesDefinition_._type' kind='empty'"
 * @generated
 */
public interface PropertiesDefinitionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' attribute.
	 * @see #setElement(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPropertiesDefinitionType_Element()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='element'"
	 * @generated
	 */
	QName getElement();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.PropertiesDefinitionType#getElement <em>Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' attribute.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(QName value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getPropertiesDefinitionType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	QName getType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.PropertiesDefinitionType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(QName value);

} // PropertiesDefinitionType
