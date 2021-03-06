/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.open.oasis.docs.tosca.tosca.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TOSCAFactoryImpl extends EFactoryImpl implements TOSCAFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TOSCAFactory init() {
		try {
			TOSCAFactory theTOSCAFactory = (TOSCAFactory)EPackage.Registry.INSTANCE.getEFactory(TOSCAPackage.eNS_URI);
			if (theTOSCAFactory != null) {
				return theTOSCAFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TOSCAFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSCAFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE: return createArtifactReferencesType();
			case TOSCAPackage.CAPABILITIES_TYPE: return createCapabilitiesType();
			case TOSCAPackage.CAPABILITIES_TYPE1: return createCapabilitiesType1();
			case TOSCAPackage.CAPABILITY_DEFINITIONS_TYPE: return createCapabilityDefinitionsType();
			case TOSCAPackage.CONSTRAINTS_TYPE: return createConstraintsType();
			case TOSCAPackage.CONSTRAINTS_TYPE1: return createConstraintsType1();
			case TOSCAPackage.DEFINITIONS_TYPE: return createDefinitionsType();
			case TOSCAPackage.DERIVED_FROM_TYPE: return createDerivedFromType();
			case TOSCAPackage.DERIVED_FROM_TYPE1: return createDerivedFromType1();
			case TOSCAPackage.DERIVED_FROM_TYPE2: return createDerivedFromType2();
			case TOSCAPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TOSCAPackage.EXCLUDE_TYPE: return createExcludeType();
			case TOSCAPackage.EXTENSIONS_TYPE: return createExtensionsType();
			case TOSCAPackage.IMPLEMENTATION_ARTIFACT_TYPE: return createImplementationArtifactType();
			case TOSCAPackage.INCLUDE_TYPE: return createIncludeType();
			case TOSCAPackage.INPUT_PARAMETERS_TYPE: return createInputParametersType();
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1: return createInputParametersType1();
			case TOSCAPackage.INSTANCE_STATE_TYPE: return createInstanceStateType();
			case TOSCAPackage.INTERFACES_TYPE: return createInterfacesType();
			case TOSCAPackage.INTERFACES_TYPE1: return createInterfacesType1();
			case TOSCAPackage.NODE_OPERATION_TYPE: return createNodeOperationType();
			case TOSCAPackage.NODE_TYPE_REFERENCE_TYPE: return createNodeTypeReferenceType();
			case TOSCAPackage.OUTPUT_PARAMETERS_TYPE: return createOutputParametersType();
			case TOSCAPackage.OUTPUT_PARAMETERS_TYPE1: return createOutputParametersType1();
			case TOSCAPackage.PLAN_MODEL_REFERENCE_TYPE: return createPlanModelReferenceType();
			case TOSCAPackage.PLAN_MODEL_TYPE: return createPlanModelType();
			case TOSCAPackage.PLAN_TYPE: return createPlanType();
			case TOSCAPackage.POLICIES_TYPE: return createPoliciesType();
			case TOSCAPackage.POLICIES_TYPE1: return createPoliciesType1();
			case TOSCAPackage.PROPERTIES_DEFINITION_TYPE: return createPropertiesDefinitionType();
			case TOSCAPackage.PROPERTIES_TYPE: return createPropertiesType();
			case TOSCAPackage.PROPERTIES_TYPE1: return createPropertiesType1();
			case TOSCAPackage.PROPERTY_CONSTRAINTS_TYPE: return createPropertyConstraintsType();
			case TOSCAPackage.PROPERTY_CONSTRAINTS_TYPE1: return createPropertyConstraintsType1();
			case TOSCAPackage.PROPERTY_MAPPINGS_TYPE: return createPropertyMappingsType();
			case TOSCAPackage.RELATIONSHIP_CONSTRAINTS_TYPE: return createRelationshipConstraintsType();
			case TOSCAPackage.RELATIONSHIP_CONSTRAINT_TYPE: return createRelationshipConstraintType();
			case TOSCAPackage.RELATIONSHIP_OPERATION_TYPE: return createRelationshipOperationType();
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE: return createRequirementDefinitionsType();
			case TOSCAPackage.REQUIREMENTS_TYPE: return createRequirementsType();
			case TOSCAPackage.REQUIREMENTS_TYPE1: return createRequirementsType1();
			case TOSCAPackage.SOURCE_ELEMENT_TYPE: return createSourceElementType();
			case TOSCAPackage.SOURCE_INTERFACES_TYPE: return createSourceInterfacesType();
			case TOSCAPackage.TAPPLIES_TO: return createTAppliesTo();
			case TOSCAPackage.TARGET_ELEMENT_TYPE: return createTargetElementType();
			case TOSCAPackage.TARGET_INTERFACES_TYPE: return createTargetInterfacesType();
			case TOSCAPackage.TARTIFACT_REFERENCE: return createTArtifactReference();
			case TOSCAPackage.TARTIFACT_TEMPLATE: return createTArtifactTemplate();
			case TOSCAPackage.TARTIFACT_TYPE: return createTArtifactType();
			case TOSCAPackage.TBOUNDARY_DEFINITIONS: return createTBoundaryDefinitions();
			case TOSCAPackage.TCAPABILITY: return createTCapability();
			case TOSCAPackage.TCAPABILITY_DEFINITION: return createTCapabilityDefinition();
			case TOSCAPackage.TCAPABILITY_REF: return createTCapabilityRef();
			case TOSCAPackage.TCAPABILITY_TYPE: return createTCapabilityType();
			case TOSCAPackage.TCONDITION: return createTCondition();
			case TOSCAPackage.TCONSTRAINT: return createTConstraint();
			case TOSCAPackage.TDEFINITIONS: return createTDefinitions();
			case TOSCAPackage.TDEPLOYMENT_ARTIFACT: return createTDeploymentArtifact();
			case TOSCAPackage.TDEPLOYMENT_ARTIFACTS: return createTDeploymentArtifacts();
			case TOSCAPackage.TDOCUMENTATION: return createTDocumentation();
			case TOSCAPackage.TEXPORTED_INTERFACE: return createTExportedInterface();
			case TOSCAPackage.TEXPORTED_OPERATION: return createTExportedOperation();
			case TOSCAPackage.TEXTENSIBLE_ELEMENTS: return createTExtensibleElements();
			case TOSCAPackage.TEXTENSION: return createTExtension();
			case TOSCAPackage.TEXTENSIONS: return createTExtensions();
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT: return createTImplementationArtifact();
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACTS: return createTImplementationArtifacts();
			case TOSCAPackage.TIMPORT: return createTImport();
			case TOSCAPackage.TINTERFACE: return createTInterface();
			case TOSCAPackage.TNODE_TEMPLATE: return createTNodeTemplate();
			case TOSCAPackage.TNODE_TYPE: return createTNodeType();
			case TOSCAPackage.TNODE_TYPE_IMPLEMENTATION: return createTNodeTypeImplementation();
			case TOSCAPackage.TOPERATION: return createTOperation();
			case TOSCAPackage.TPARAMETER: return createTParameter();
			case TOSCAPackage.TPLAN: return createTPlan();
			case TOSCAPackage.TPLANS: return createTPlans();
			case TOSCAPackage.TPOLICY: return createTPolicy();
			case TOSCAPackage.TPOLICY_TEMPLATE: return createTPolicyTemplate();
			case TOSCAPackage.TPOLICY_TYPE: return createTPolicyType();
			case TOSCAPackage.TPROPERTY_CONSTRAINT: return createTPropertyConstraint();
			case TOSCAPackage.TPROPERTY_MAPPING: return createTPropertyMapping();
			case TOSCAPackage.TRELATIONSHIP_TEMPLATE: return createTRelationshipTemplate();
			case TOSCAPackage.TRELATIONSHIP_TYPE: return createTRelationshipType();
			case TOSCAPackage.TRELATIONSHIP_TYPE_IMPLEMENTATION: return createTRelationshipTypeImplementation();
			case TOSCAPackage.TREQUIRED_CONTAINER_FEATURE: return createTRequiredContainerFeature();
			case TOSCAPackage.TREQUIRED_CONTAINER_FEATURES: return createTRequiredContainerFeatures();
			case TOSCAPackage.TREQUIREMENT: return createTRequirement();
			case TOSCAPackage.TREQUIREMENT_DEFINITION: return createTRequirementDefinition();
			case TOSCAPackage.TREQUIREMENT_REF: return createTRequirementRef();
			case TOSCAPackage.TREQUIREMENT_TYPE: return createTRequirementType();
			case TOSCAPackage.TSERVICE_TEMPLATE: return createTServiceTemplate();
			case TOSCAPackage.TTAG: return createTTag();
			case TOSCAPackage.TTAGS: return createTTags();
			case TOSCAPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES: return createTTopologyElementInstanceStates();
			case TOSCAPackage.TTOPOLOGY_TEMPLATE: return createTTopologyTemplate();
			case TOSCAPackage.TYPES_TYPE: return createTypesType();
			case TOSCAPackage.VALID_SOURCE_TYPE: return createValidSourceType();
			case TOSCAPackage.VALID_TARGET_TYPE: return createValidTargetType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER1:
				return createMaxInstancesTypeMember1FromString(eDataType, initialValue);
			case TOSCAPackage.TBOOLEAN:
				return createTBooleanFromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1:
				return createUpperBoundTypeMember1FromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER11:
				return createUpperBoundTypeMember11FromString(eDataType, initialValue);
			case TOSCAPackage.IMPORTED_URI:
				return createImportedURIFromString(eDataType, initialValue);
			case TOSCAPackage.MAX_INSTANCES_TYPE:
				return createMaxInstancesTypeFromString(eDataType, initialValue);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER0:
				return createMaxInstancesTypeMember0FromString(eDataType, initialValue);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return createMaxInstancesTypeMember1ObjectFromString(eDataType, initialValue);
			case TOSCAPackage.TBOOLEAN_OBJECT:
				return createTBooleanObjectFromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE:
				return createUpperBoundTypeFromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE1:
				return createUpperBoundType1FromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER0:
				return createUpperBoundTypeMember0FromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER01:
				return createUpperBoundTypeMember01FromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return createUpperBoundTypeMember1ObjectFromString(eDataType, initialValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return createUpperBoundTypeMember1Object1FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER1:
				return convertMaxInstancesTypeMember1ToString(eDataType, instanceValue);
			case TOSCAPackage.TBOOLEAN:
				return convertTBooleanToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1:
				return convertUpperBoundTypeMember1ToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER11:
				return convertUpperBoundTypeMember11ToString(eDataType, instanceValue);
			case TOSCAPackage.IMPORTED_URI:
				return convertImportedURIToString(eDataType, instanceValue);
			case TOSCAPackage.MAX_INSTANCES_TYPE:
				return convertMaxInstancesTypeToString(eDataType, instanceValue);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER0:
				return convertMaxInstancesTypeMember0ToString(eDataType, instanceValue);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return convertMaxInstancesTypeMember1ObjectToString(eDataType, instanceValue);
			case TOSCAPackage.TBOOLEAN_OBJECT:
				return convertTBooleanObjectToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE:
				return convertUpperBoundTypeToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE1:
				return convertUpperBoundType1ToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER0:
				return convertUpperBoundTypeMember0ToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER01:
				return convertUpperBoundTypeMember01ToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return convertUpperBoundTypeMember1ObjectToString(eDataType, instanceValue);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return convertUpperBoundTypeMember1Object1ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArtifactReferencesType createArtifactReferencesType() {
		ArtifactReferencesTypeImpl artifactReferencesType = new ArtifactReferencesTypeImpl();
		return artifactReferencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType createCapabilitiesType() {
		CapabilitiesTypeImpl capabilitiesType = new CapabilitiesTypeImpl();
		return capabilitiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilitiesType1 createCapabilitiesType1() {
		CapabilitiesType1Impl capabilitiesType1 = new CapabilitiesType1Impl();
		return capabilitiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityDefinitionsType createCapabilityDefinitionsType() {
		CapabilityDefinitionsTypeImpl capabilityDefinitionsType = new CapabilityDefinitionsTypeImpl();
		return capabilityDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType1 createConstraintsType1() {
		ConstraintsType1Impl constraintsType1 = new ConstraintsType1Impl();
		return constraintsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsType createDefinitionsType() {
		DefinitionsTypeImpl definitionsType = new DefinitionsTypeImpl();
		return definitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType createDerivedFromType() {
		DerivedFromTypeImpl derivedFromType = new DerivedFromTypeImpl();
		return derivedFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType1 createDerivedFromType1() {
		DerivedFromType1Impl derivedFromType1 = new DerivedFromType1Impl();
		return derivedFromType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFromType2 createDerivedFromType2() {
		DerivedFromType2Impl derivedFromType2 = new DerivedFromType2Impl();
		return derivedFromType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeType createExcludeType() {
		ExcludeTypeImpl excludeType = new ExcludeTypeImpl();
		return excludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType createExtensionsType() {
		ExtensionsTypeImpl extensionsType = new ExtensionsTypeImpl();
		return extensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationArtifactType createImplementationArtifactType() {
		ImplementationArtifactTypeImpl implementationArtifactType = new ImplementationArtifactTypeImpl();
		return implementationArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType createInputParametersType() {
		InputParametersTypeImpl inputParametersType = new InputParametersTypeImpl();
		return inputParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputParametersType1 createInputParametersType1() {
		InputParametersType1Impl inputParametersType1 = new InputParametersType1Impl();
		return inputParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceStateType createInstanceStateType() {
		InstanceStateTypeImpl instanceStateType = new InstanceStateTypeImpl();
		return instanceStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType createInterfacesType() {
		InterfacesTypeImpl interfacesType = new InterfacesTypeImpl();
		return interfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfacesType1 createInterfacesType1() {
		InterfacesType1Impl interfacesType1 = new InterfacesType1Impl();
		return interfacesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeOperationType createNodeOperationType() {
		NodeOperationTypeImpl nodeOperationType = new NodeOperationTypeImpl();
		return nodeOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeTypeReferenceType createNodeTypeReferenceType() {
		NodeTypeReferenceTypeImpl nodeTypeReferenceType = new NodeTypeReferenceTypeImpl();
		return nodeTypeReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType createOutputParametersType() {
		OutputParametersTypeImpl outputParametersType = new OutputParametersTypeImpl();
		return outputParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputParametersType1 createOutputParametersType1() {
		OutputParametersType1Impl outputParametersType1 = new OutputParametersType1Impl();
		return outputParametersType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelReferenceType createPlanModelReferenceType() {
		PlanModelReferenceTypeImpl planModelReferenceType = new PlanModelReferenceTypeImpl();
		return planModelReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanModelType createPlanModelType() {
		PlanModelTypeImpl planModelType = new PlanModelTypeImpl();
		return planModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanType createPlanType() {
		PlanTypeImpl planType = new PlanTypeImpl();
		return planType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType createPoliciesType() {
		PoliciesTypeImpl policiesType = new PoliciesTypeImpl();
		return policiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoliciesType1 createPoliciesType1() {
		PoliciesType1Impl policiesType1 = new PoliciesType1Impl();
		return policiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesDefinitionType createPropertiesDefinitionType() {
		PropertiesDefinitionTypeImpl propertiesDefinitionType = new PropertiesDefinitionTypeImpl();
		return propertiesDefinitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType createPropertiesType() {
		PropertiesTypeImpl propertiesType = new PropertiesTypeImpl();
		return propertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesType1 createPropertiesType1() {
		PropertiesType1Impl propertiesType1 = new PropertiesType1Impl();
		return propertiesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType createPropertyConstraintsType() {
		PropertyConstraintsTypeImpl propertyConstraintsType = new PropertyConstraintsTypeImpl();
		return propertyConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyConstraintsType1 createPropertyConstraintsType1() {
		PropertyConstraintsType1Impl propertyConstraintsType1 = new PropertyConstraintsType1Impl();
		return propertyConstraintsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyMappingsType createPropertyMappingsType() {
		PropertyMappingsTypeImpl propertyMappingsType = new PropertyMappingsTypeImpl();
		return propertyMappingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintsType createRelationshipConstraintsType() {
		RelationshipConstraintsTypeImpl relationshipConstraintsType = new RelationshipConstraintsTypeImpl();
		return relationshipConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipConstraintType createRelationshipConstraintType() {
		RelationshipConstraintTypeImpl relationshipConstraintType = new RelationshipConstraintTypeImpl();
		return relationshipConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipOperationType createRelationshipOperationType() {
		RelationshipOperationTypeImpl relationshipOperationType = new RelationshipOperationTypeImpl();
		return relationshipOperationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinitionsType createRequirementDefinitionsType() {
		RequirementDefinitionsTypeImpl requirementDefinitionsType = new RequirementDefinitionsTypeImpl();
		return requirementDefinitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType createRequirementsType() {
		RequirementsTypeImpl requirementsType = new RequirementsTypeImpl();
		return requirementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsType1 createRequirementsType1() {
		RequirementsType1Impl requirementsType1 = new RequirementsType1Impl();
		return requirementsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceElementType createSourceElementType() {
		SourceElementTypeImpl sourceElementType = new SourceElementTypeImpl();
		return sourceElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceInterfacesType createSourceInterfacesType() {
		SourceInterfacesTypeImpl sourceInterfacesType = new SourceInterfacesTypeImpl();
		return sourceInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TAppliesTo createTAppliesTo() {
		TAppliesToImpl tAppliesTo = new TAppliesToImpl();
		return tAppliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetElementType createTargetElementType() {
		TargetElementTypeImpl targetElementType = new TargetElementTypeImpl();
		return targetElementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetInterfacesType createTargetInterfacesType() {
		TargetInterfacesTypeImpl targetInterfacesType = new TargetInterfacesTypeImpl();
		return targetInterfacesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactReference createTArtifactReference() {
		TArtifactReferenceImpl tArtifactReference = new TArtifactReferenceImpl();
		return tArtifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactTemplate createTArtifactTemplate() {
		TArtifactTemplateImpl tArtifactTemplate = new TArtifactTemplateImpl();
		return tArtifactTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TArtifactType createTArtifactType() {
		TArtifactTypeImpl tArtifactType = new TArtifactTypeImpl();
		return tArtifactType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoundaryDefinitions createTBoundaryDefinitions() {
		TBoundaryDefinitionsImpl tBoundaryDefinitions = new TBoundaryDefinitionsImpl();
		return tBoundaryDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapability createTCapability() {
		TCapabilityImpl tCapability = new TCapabilityImpl();
		return tCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityDefinition createTCapabilityDefinition() {
		TCapabilityDefinitionImpl tCapabilityDefinition = new TCapabilityDefinitionImpl();
		return tCapabilityDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityRef createTCapabilityRef() {
		TCapabilityRefImpl tCapabilityRef = new TCapabilityRefImpl();
		return tCapabilityRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCapabilityType createTCapabilityType() {
		TCapabilityTypeImpl tCapabilityType = new TCapabilityTypeImpl();
		return tCapabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCondition createTCondition() {
		TConditionImpl tCondition = new TConditionImpl();
		return tCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TConstraint createTConstraint() {
		TConstraintImpl tConstraint = new TConstraintImpl();
		return tConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDefinitions createTDefinitions() {
		TDefinitionsImpl tDefinitions = new TDefinitionsImpl();
		return tDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifact createTDeploymentArtifact() {
		TDeploymentArtifactImpl tDeploymentArtifact = new TDeploymentArtifactImpl();
		return tDeploymentArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDeploymentArtifacts createTDeploymentArtifacts() {
		TDeploymentArtifactsImpl tDeploymentArtifacts = new TDeploymentArtifactsImpl();
		return tDeploymentArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TDocumentation createTDocumentation() {
		TDocumentationImpl tDocumentation = new TDocumentationImpl();
		return tDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedInterface createTExportedInterface() {
		TExportedInterfaceImpl tExportedInterface = new TExportedInterfaceImpl();
		return tExportedInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExportedOperation createTExportedOperation() {
		TExportedOperationImpl tExportedOperation = new TExportedOperationImpl();
		return tExportedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensibleElements createTExtensibleElements() {
		TExtensibleElementsImpl tExtensibleElements = new TExtensibleElementsImpl();
		return tExtensibleElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtension createTExtension() {
		TExtensionImpl tExtension = new TExtensionImpl();
		return tExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TExtensions createTExtensions() {
		TExtensionsImpl tExtensions = new TExtensionsImpl();
		return tExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifact createTImplementationArtifact() {
		TImplementationArtifactImpl tImplementationArtifact = new TImplementationArtifactImpl();
		return tImplementationArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImplementationArtifacts createTImplementationArtifacts() {
		TImplementationArtifactsImpl tImplementationArtifacts = new TImplementationArtifactsImpl();
		return tImplementationArtifacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TImport createTImport() {
		TImportImpl tImport = new TImportImpl();
		return tImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TInterface createTInterface() {
		TInterfaceImpl tInterface = new TInterfaceImpl();
		return tInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTemplate createTNodeTemplate() {
		TNodeTemplateImpl tNodeTemplate = new TNodeTemplateImpl();
		return tNodeTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeType createTNodeType() {
		TNodeTypeImpl tNodeType = new TNodeTypeImpl();
		return tNodeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNodeTypeImplementation createTNodeTypeImplementation() {
		TNodeTypeImplementationImpl tNodeTypeImplementation = new TNodeTypeImplementationImpl();
		return tNodeTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOperation createTOperation() {
		TOperationImpl tOperation = new TOperationImpl();
		return tOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TParameter createTParameter() {
		TParameterImpl tParameter = new TParameterImpl();
		return tParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlan createTPlan() {
		TPlanImpl tPlan = new TPlanImpl();
		return tPlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPlans createTPlans() {
		TPlansImpl tPlans = new TPlansImpl();
		return tPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicy createTPolicy() {
		TPolicyImpl tPolicy = new TPolicyImpl();
		return tPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyTemplate createTPolicyTemplate() {
		TPolicyTemplateImpl tPolicyTemplate = new TPolicyTemplateImpl();
		return tPolicyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPolicyType createTPolicyType() {
		TPolicyTypeImpl tPolicyType = new TPolicyTypeImpl();
		return tPolicyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyConstraint createTPropertyConstraint() {
		TPropertyConstraintImpl tPropertyConstraint = new TPropertyConstraintImpl();
		return tPropertyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TPropertyMapping createTPropertyMapping() {
		TPropertyMappingImpl tPropertyMapping = new TPropertyMappingImpl();
		return tPropertyMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTemplate createTRelationshipTemplate() {
		TRelationshipTemplateImpl tRelationshipTemplate = new TRelationshipTemplateImpl();
		return tRelationshipTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipType createTRelationshipType() {
		TRelationshipTypeImpl tRelationshipType = new TRelationshipTypeImpl();
		return tRelationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRelationshipTypeImplementation createTRelationshipTypeImplementation() {
		TRelationshipTypeImplementationImpl tRelationshipTypeImplementation = new TRelationshipTypeImplementationImpl();
		return tRelationshipTypeImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeature createTRequiredContainerFeature() {
		TRequiredContainerFeatureImpl tRequiredContainerFeature = new TRequiredContainerFeatureImpl();
		return tRequiredContainerFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequiredContainerFeatures createTRequiredContainerFeatures() {
		TRequiredContainerFeaturesImpl tRequiredContainerFeatures = new TRequiredContainerFeaturesImpl();
		return tRequiredContainerFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirement createTRequirement() {
		TRequirementImpl tRequirement = new TRequirementImpl();
		return tRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementDefinition createTRequirementDefinition() {
		TRequirementDefinitionImpl tRequirementDefinition = new TRequirementDefinitionImpl();
		return tRequirementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementRef createTRequirementRef() {
		TRequirementRefImpl tRequirementRef = new TRequirementRefImpl();
		return tRequirementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRequirementType createTRequirementType() {
		TRequirementTypeImpl tRequirementType = new TRequirementTypeImpl();
		return tRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TServiceTemplate createTServiceTemplate() {
		TServiceTemplateImpl tServiceTemplate = new TServiceTemplateImpl();
		return tServiceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTag createTTag() {
		TTagImpl tTag = new TTagImpl();
		return tTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTags createTTags() {
		TTagsImpl tTags = new TTagsImpl();
		return tTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyElementInstanceStates createTTopologyElementInstanceStates() {
		TTopologyElementInstanceStatesImpl tTopologyElementInstanceStates = new TTopologyElementInstanceStatesImpl();
		return tTopologyElementInstanceStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTopologyTemplate createTTopologyTemplate() {
		TTopologyTemplateImpl tTopologyTemplate = new TTopologyTemplateImpl();
		return tTopologyTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypesType createTypesType() {
		TypesTypeImpl typesType = new TypesTypeImpl();
		return typesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidSourceType createValidSourceType() {
		ValidSourceTypeImpl validSourceType = new ValidSourceTypeImpl();
		return validSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidTargetType createValidTargetType() {
		ValidTargetTypeImpl validTargetType = new ValidTargetTypeImpl();
		return validTargetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInstancesTypeMember1 createMaxInstancesTypeMember1FromString(EDataType eDataType, String initialValue) {
		MaxInstancesTypeMember1 result = MaxInstancesTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanFromString(EDataType eDataType, String initialValue) {
		TBoolean result = TBoolean.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember1 createUpperBoundTypeMember1FromString(EDataType eDataType, String initialValue) {
		UpperBoundTypeMember1 result = UpperBoundTypeMember1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember11 createUpperBoundTypeMember11FromString(EDataType eDataType, String initialValue) {
		UpperBoundTypeMember11 result = UpperBoundTypeMember11.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember11ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createImportedURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImportedURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createMaxInstancesTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createMaxInstancesTypeMember0FromString(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createMaxInstancesTypeMember1FromString(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertMaxInstancesTypeMember0ToString(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertMaxInstancesTypeMember1ToString(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createMaxInstancesTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxInstancesTypeMember1 createMaxInstancesTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createMaxInstancesTypeMember1FromString(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaxInstancesTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaxInstancesTypeMember1ToString(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBoolean createTBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createTBooleanFromString(TOSCAPackage.Literals.TBOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTBooleanToString(TOSCAPackage.Literals.TBOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUpperBoundTypeFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createUpperBoundTypeMember0FromString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER0, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUpperBoundTypeMember1FromString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER0.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember0ToString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER0, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember1ToString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createUpperBoundType1FromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createUpperBoundTypeMember01FromString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER01, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createUpperBoundTypeMember11FromString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundType1ToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER01.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember01ToString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER01, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11.isInstance(instanceValue)) {
			try {
				String value = convertUpperBoundTypeMember11ToString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUpperBoundTypeMember0FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createUpperBoundTypeMember01FromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember01ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember1 createUpperBoundTypeMember1ObjectFromString(EDataType eDataType, String initialValue) {
		return createUpperBoundTypeMember1FromString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpperBoundTypeMember1ToString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundTypeMember11 createUpperBoundTypeMember1Object1FromString(EDataType eDataType, String initialValue) {
		return createUpperBoundTypeMember11FromString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpperBoundTypeMember1Object1ToString(EDataType eDataType, Object instanceValue) {
		return convertUpperBoundTypeMember11ToString(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSCAPackage getTOSCAPackage() {
		return (TOSCAPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TOSCAPackage getPackage() {
		return TOSCAPackage.eINSTANCE;
	}

} //TOSCAFactoryImpl
