/**
 */
package org.open.oasis.docs.tosca.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TPlan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getInputParameters <em>Input Parameters</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getOutputParameters <em>Output Parameters</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanModel <em>Plan Model</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanModelReference <em>Plan Model Reference</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getId <em>Id</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanType <em>Plan Type</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanLanguage <em>Plan Language</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan()
 * @model extendedMetaData="name='tPlan' kind='elementOnly'"
 * @generated
 */
public interface TPlan extends TExtensibleElements {
	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(TCondition)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_Precondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Precondition' namespace='##targetNamespace'"
	 * @generated
	 */
	TCondition getPrecondition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(TCondition value);

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference.
	 * @see #setInputParameters(InputParametersType1)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_InputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InputParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	InputParametersType1 getInputParameters();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getInputParameters <em>Input Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Parameters</em>' containment reference.
	 * @see #getInputParameters()
	 * @generated
	 */
	void setInputParameters(InputParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Output Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Parameters</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Parameters</em>' containment reference.
	 * @see #setOutputParameters(OutputParametersType1)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_OutputParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OutputParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	OutputParametersType1 getOutputParameters();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getOutputParameters <em>Output Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Parameters</em>' containment reference.
	 * @see #getOutputParameters()
	 * @generated
	 */
	void setOutputParameters(OutputParametersType1 value);

	/**
	 * Returns the value of the '<em><b>Plan Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Model</em>' containment reference.
	 * @see #setPlanModel(PlanModelType)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_PlanModel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlanModel' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanModelType getPlanModel();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanModel <em>Plan Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Model</em>' containment reference.
	 * @see #getPlanModel()
	 * @generated
	 */
	void setPlanModel(PlanModelType value);

	/**
	 * Returns the value of the '<em><b>Plan Model Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Model Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Model Reference</em>' containment reference.
	 * @see #setPlanModelReference(PlanModelReferenceType)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_PlanModelReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlanModelReference' namespace='##targetNamespace'"
	 * @generated
	 */
	PlanModelReferenceType getPlanModelReference();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanModelReference <em>Plan Model Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Model Reference</em>' containment reference.
	 * @see #getPlanModelReference()
	 * @generated
	 */
	void setPlanModelReference(PlanModelReferenceType value);

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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getId <em>Id</em>}' attribute.
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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Plan Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Type</em>' attribute.
	 * @see #setPlanType(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_PlanType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='planType'"
	 * @generated
	 */
	String getPlanType();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanType <em>Plan Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Type</em>' attribute.
	 * @see #getPlanType()
	 * @generated
	 */
	void setPlanType(String value);

	/**
	 * Returns the value of the '<em><b>Plan Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Language</em>' attribute.
	 * @see #setPlanLanguage(String)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTPlan_PlanLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='attribute' name='planLanguage'"
	 * @generated
	 */
	String getPlanLanguage();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TPlan#getPlanLanguage <em>Plan Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Language</em>' attribute.
	 * @see #getPlanLanguage()
	 * @generated
	 */
	void setPlanLanguage(String value);

} // TPlan
