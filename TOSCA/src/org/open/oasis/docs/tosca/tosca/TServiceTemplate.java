/**
 */
package org.open.oasis.docs.tosca.tosca;

import javax.xml.namespace.QName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TService Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getTags <em>Tags</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getPlans <em>Plans</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getId <em>Id</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate()
 * @model extendedMetaData="name='tServiceTemplate' kind='elementOnly'"
 * @generated
 */
public interface TServiceTemplate extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TTags)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tags' namespace='##targetNamespace'"
	 * @generated
	 */
	TTags getTags();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TTags value);

	/**
	 * Returns the value of the '<em><b>Boundary Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Definitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Definitions</em>' containment reference.
	 * @see #setBoundaryDefinitions(TBoundaryDefinitions)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_BoundaryDefinitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BoundaryDefinitions' namespace='##targetNamespace'"
	 * @generated
	 */
	TBoundaryDefinitions getBoundaryDefinitions();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getBoundaryDefinitions <em>Boundary Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary Definitions</em>' containment reference.
	 * @see #getBoundaryDefinitions()
	 * @generated
	 */
	void setBoundaryDefinitions(TBoundaryDefinitions value);

	/**
	 * Returns the value of the '<em><b>Topology Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Template</em>' containment reference.
	 * @see #setTopologyTemplate(TTopologyTemplate)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_TopologyTemplate()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopologyTemplate' namespace='##targetNamespace'"
	 * @generated
	 */
	TTopologyTemplate getTopologyTemplate();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getTopologyTemplate <em>Topology Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Template</em>' containment reference.
	 * @see #getTopologyTemplate()
	 * @generated
	 */
	void setTopologyTemplate(TTopologyTemplate value);

	/**
	 * Returns the value of the '<em><b>Plans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plans</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plans</em>' containment reference.
	 * @see #setPlans(TPlans)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_Plans()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plans' namespace='##targetNamespace'"
	 * @generated
	 */
	TPlans getPlans();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getPlans <em>Plans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plans</em>' containment reference.
	 * @see #getPlans()
	 * @generated
	 */
	void setPlans(TPlans value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Target Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Namespace</em>' attribute.
	 * @see #setTargetNamespace(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Substitutable Node Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substitutable Node Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substitutable Node Type</em>' attribute.
	 * @see #setSubstitutableNodeType(QName)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTServiceTemplate_SubstitutableNodeType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 *        extendedMetaData="kind='attribute' name='substitutableNodeType'"
	 * @generated
	 */
	QName getSubstitutableNodeType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TServiceTemplate#getSubstitutableNodeType <em>Substitutable Node Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitutable Node Type</em>' attribute.
	 * @see #getSubstitutableNodeType()
	 * @generated
	 */
	void setSubstitutableNodeType(QName value);

} // TServiceTemplate
