/**
 */
package org.open.oasis.docs.tosca.tosca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEntity Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getTags <em>Tags</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getPropertiesDefinition <em>Properties Definition</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getName <em>Name</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getFinal <em>Final</em>}</li>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.TEntityType#getTargetNamespace <em>Target Namespace</em>}</li>
 * </ul>
 *
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType()
 * @model abstract="true"
 *        extendedMetaData="name='tEntityType' kind='elementOnly'"
 * @generated
 */
public interface TEntityType extends TExtensibleElements {
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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Tags' namespace='##targetNamespace'"
	 * @generated
	 */
	TTags getTags();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TTags value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference.
	 * @see #setDerivedFrom(DerivedFromType2)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_DerivedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivedFromType2 getDerivedFrom();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getDerivedFrom <em>Derived From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived From</em>' containment reference.
	 * @see #getDerivedFrom()
	 * @generated
	 */
	void setDerivedFrom(DerivedFromType2 value);

	/**
	 * Returns the value of the '<em><b>Properties Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Definition</em>' containment reference.
	 * @see #setPropertiesDefinition(PropertiesDefinitionType)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_PropertiesDefinition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PropertiesDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesDefinitionType getPropertiesDefinition();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getPropertiesDefinition <em>Properties Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Definition</em>' containment reference.
	 * @see #getPropertiesDefinition()
	 * @generated
	 */
	void setPropertiesDefinition(PropertiesDefinitionType value);

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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.tosca.tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see org.open.oasis.docs.tosca.tosca.TBoolean
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #setAbstract(TBoolean)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_Abstract()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='abstract'"
	 * @generated
	 */
	TBoolean getAbstract();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see org.open.oasis.docs.tosca.tosca.TBoolean
	 * @see #isSetAbstract()
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(TBoolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(TBoolean)
	 * @generated
	 */
	void unsetAbstract();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getAbstract <em>Abstract</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Abstract</em>' attribute is set.
	 * @see #unsetAbstract()
	 * @see #getAbstract()
	 * @see #setAbstract(TBoolean)
	 * @generated
	 */
	boolean isSetAbstract();

	/**
	 * Returns the value of the '<em><b>Final</b></em>' attribute.
	 * The default value is <code>"no"</code>.
	 * The literals are from the enumeration {@link org.open.oasis.docs.tosca.tosca.TBoolean}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' attribute.
	 * @see org.open.oasis.docs.tosca.tosca.TBoolean
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #setFinal(TBoolean)
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_Final()
	 * @model default="no" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='final'"
	 * @generated
	 */
	TBoolean getFinal();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' attribute.
	 * @see org.open.oasis.docs.tosca.tosca.TBoolean
	 * @see #isSetFinal()
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(TBoolean value);

	/**
	 * Unsets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getFinal <em>Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFinal()
	 * @see #getFinal()
	 * @see #setFinal(TBoolean)
	 * @generated
	 */
	void unsetFinal();

	/**
	 * Returns whether the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getFinal <em>Final</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Final</em>' attribute is set.
	 * @see #unsetFinal()
	 * @see #getFinal()
	 * @see #setFinal(TBoolean)
	 * @generated
	 */
	boolean isSetFinal();

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
	 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage#getTEntityType_TargetNamespace()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='targetNamespace'"
	 * @generated
	 */
	String getTargetNamespace();

	/**
	 * Sets the value of the '{@link org.open.oasis.docs.tosca.tosca.TEntityType#getTargetNamespace <em>Target Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Namespace</em>' attribute.
	 * @see #getTargetNamespace()
	 * @generated
	 */
	void setTargetNamespace(String value);

} // TEntityType
