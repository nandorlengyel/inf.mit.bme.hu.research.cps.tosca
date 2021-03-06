/**
 */
package org.open.oasis.docs.tosca.tosca.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.open.oasis.docs.tosca.tosca.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.open.oasis.docs.tosca.tosca.TOSCAPackage
 * @generated
 */
public class TOSCAValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TOSCAValidator INSTANCE = new TOSCAValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.open.oasis.docs.tosca.tosca";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOSCAValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TOSCAPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE:
				return validateArtifactReferencesType((ArtifactReferencesType)value, diagnostics, context);
			case TOSCAPackage.CAPABILITIES_TYPE:
				return validateCapabilitiesType((CapabilitiesType)value, diagnostics, context);
			case TOSCAPackage.CAPABILITIES_TYPE1:
				return validateCapabilitiesType1((CapabilitiesType1)value, diagnostics, context);
			case TOSCAPackage.CAPABILITY_DEFINITIONS_TYPE:
				return validateCapabilityDefinitionsType((CapabilityDefinitionsType)value, diagnostics, context);
			case TOSCAPackage.CONSTRAINTS_TYPE:
				return validateConstraintsType((ConstraintsType)value, diagnostics, context);
			case TOSCAPackage.CONSTRAINTS_TYPE1:
				return validateConstraintsType1((ConstraintsType1)value, diagnostics, context);
			case TOSCAPackage.DEFINITIONS_TYPE:
				return validateDefinitionsType((DefinitionsType)value, diagnostics, context);
			case TOSCAPackage.DERIVED_FROM_TYPE:
				return validateDerivedFromType((DerivedFromType)value, diagnostics, context);
			case TOSCAPackage.DERIVED_FROM_TYPE1:
				return validateDerivedFromType1((DerivedFromType1)value, diagnostics, context);
			case TOSCAPackage.DERIVED_FROM_TYPE2:
				return validateDerivedFromType2((DerivedFromType2)value, diagnostics, context);
			case TOSCAPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TOSCAPackage.EXCLUDE_TYPE:
				return validateExcludeType((ExcludeType)value, diagnostics, context);
			case TOSCAPackage.EXTENSIONS_TYPE:
				return validateExtensionsType((ExtensionsType)value, diagnostics, context);
			case TOSCAPackage.IMPLEMENTATION_ARTIFACT_TYPE:
				return validateImplementationArtifactType((ImplementationArtifactType)value, diagnostics, context);
			case TOSCAPackage.INCLUDE_TYPE:
				return validateIncludeType((IncludeType)value, diagnostics, context);
			case TOSCAPackage.INPUT_PARAMETERS_TYPE:
				return validateInputParametersType((InputParametersType)value, diagnostics, context);
			case TOSCAPackage.INPUT_PARAMETERS_TYPE1:
				return validateInputParametersType1((InputParametersType1)value, diagnostics, context);
			case TOSCAPackage.INSTANCE_STATE_TYPE:
				return validateInstanceStateType((InstanceStateType)value, diagnostics, context);
			case TOSCAPackage.INTERFACES_TYPE:
				return validateInterfacesType((InterfacesType)value, diagnostics, context);
			case TOSCAPackage.INTERFACES_TYPE1:
				return validateInterfacesType1((InterfacesType1)value, diagnostics, context);
			case TOSCAPackage.NODE_OPERATION_TYPE:
				return validateNodeOperationType((NodeOperationType)value, diagnostics, context);
			case TOSCAPackage.NODE_TYPE_REFERENCE_TYPE:
				return validateNodeTypeReferenceType((NodeTypeReferenceType)value, diagnostics, context);
			case TOSCAPackage.OUTPUT_PARAMETERS_TYPE:
				return validateOutputParametersType((OutputParametersType)value, diagnostics, context);
			case TOSCAPackage.OUTPUT_PARAMETERS_TYPE1:
				return validateOutputParametersType1((OutputParametersType1)value, diagnostics, context);
			case TOSCAPackage.PLAN_MODEL_REFERENCE_TYPE:
				return validatePlanModelReferenceType((PlanModelReferenceType)value, diagnostics, context);
			case TOSCAPackage.PLAN_MODEL_TYPE:
				return validatePlanModelType((PlanModelType)value, diagnostics, context);
			case TOSCAPackage.PLAN_TYPE:
				return validatePlanType((PlanType)value, diagnostics, context);
			case TOSCAPackage.POLICIES_TYPE:
				return validatePoliciesType((PoliciesType)value, diagnostics, context);
			case TOSCAPackage.POLICIES_TYPE1:
				return validatePoliciesType1((PoliciesType1)value, diagnostics, context);
			case TOSCAPackage.PROPERTIES_DEFINITION_TYPE:
				return validatePropertiesDefinitionType((PropertiesDefinitionType)value, diagnostics, context);
			case TOSCAPackage.PROPERTIES_TYPE:
				return validatePropertiesType((PropertiesType)value, diagnostics, context);
			case TOSCAPackage.PROPERTIES_TYPE1:
				return validatePropertiesType1((PropertiesType1)value, diagnostics, context);
			case TOSCAPackage.PROPERTY_CONSTRAINTS_TYPE:
				return validatePropertyConstraintsType((PropertyConstraintsType)value, diagnostics, context);
			case TOSCAPackage.PROPERTY_CONSTRAINTS_TYPE1:
				return validatePropertyConstraintsType1((PropertyConstraintsType1)value, diagnostics, context);
			case TOSCAPackage.PROPERTY_MAPPINGS_TYPE:
				return validatePropertyMappingsType((PropertyMappingsType)value, diagnostics, context);
			case TOSCAPackage.RELATIONSHIP_CONSTRAINTS_TYPE:
				return validateRelationshipConstraintsType((RelationshipConstraintsType)value, diagnostics, context);
			case TOSCAPackage.RELATIONSHIP_CONSTRAINT_TYPE:
				return validateRelationshipConstraintType((RelationshipConstraintType)value, diagnostics, context);
			case TOSCAPackage.RELATIONSHIP_OPERATION_TYPE:
				return validateRelationshipOperationType((RelationshipOperationType)value, diagnostics, context);
			case TOSCAPackage.REQUIREMENT_DEFINITIONS_TYPE:
				return validateRequirementDefinitionsType((RequirementDefinitionsType)value, diagnostics, context);
			case TOSCAPackage.REQUIREMENTS_TYPE:
				return validateRequirementsType((RequirementsType)value, diagnostics, context);
			case TOSCAPackage.REQUIREMENTS_TYPE1:
				return validateRequirementsType1((RequirementsType1)value, diagnostics, context);
			case TOSCAPackage.SOURCE_ELEMENT_TYPE:
				return validateSourceElementType((SourceElementType)value, diagnostics, context);
			case TOSCAPackage.SOURCE_INTERFACES_TYPE:
				return validateSourceInterfacesType((SourceInterfacesType)value, diagnostics, context);
			case TOSCAPackage.TAPPLIES_TO:
				return validateTAppliesTo((TAppliesTo)value, diagnostics, context);
			case TOSCAPackage.TARGET_ELEMENT_TYPE:
				return validateTargetElementType((TargetElementType)value, diagnostics, context);
			case TOSCAPackage.TARGET_INTERFACES_TYPE:
				return validateTargetInterfacesType((TargetInterfacesType)value, diagnostics, context);
			case TOSCAPackage.TARTIFACT_REFERENCE:
				return validateTArtifactReference((TArtifactReference)value, diagnostics, context);
			case TOSCAPackage.TARTIFACT_TEMPLATE:
				return validateTArtifactTemplate((TArtifactTemplate)value, diagnostics, context);
			case TOSCAPackage.TARTIFACT_TYPE:
				return validateTArtifactType((TArtifactType)value, diagnostics, context);
			case TOSCAPackage.TBOUNDARY_DEFINITIONS:
				return validateTBoundaryDefinitions((TBoundaryDefinitions)value, diagnostics, context);
			case TOSCAPackage.TCAPABILITY:
				return validateTCapability((TCapability)value, diagnostics, context);
			case TOSCAPackage.TCAPABILITY_DEFINITION:
				return validateTCapabilityDefinition((TCapabilityDefinition)value, diagnostics, context);
			case TOSCAPackage.TCAPABILITY_REF:
				return validateTCapabilityRef((TCapabilityRef)value, diagnostics, context);
			case TOSCAPackage.TCAPABILITY_TYPE:
				return validateTCapabilityType((TCapabilityType)value, diagnostics, context);
			case TOSCAPackage.TCONDITION:
				return validateTCondition((TCondition)value, diagnostics, context);
			case TOSCAPackage.TCONSTRAINT:
				return validateTConstraint((TConstraint)value, diagnostics, context);
			case TOSCAPackage.TDEFINITIONS:
				return validateTDefinitions((TDefinitions)value, diagnostics, context);
			case TOSCAPackage.TDEPLOYMENT_ARTIFACT:
				return validateTDeploymentArtifact((TDeploymentArtifact)value, diagnostics, context);
			case TOSCAPackage.TDEPLOYMENT_ARTIFACTS:
				return validateTDeploymentArtifacts((TDeploymentArtifacts)value, diagnostics, context);
			case TOSCAPackage.TDOCUMENTATION:
				return validateTDocumentation((TDocumentation)value, diagnostics, context);
			case TOSCAPackage.TENTITY_TEMPLATE:
				return validateTEntityTemplate((TEntityTemplate)value, diagnostics, context);
			case TOSCAPackage.TENTITY_TYPE:
				return validateTEntityType((TEntityType)value, diagnostics, context);
			case TOSCAPackage.TEXPORTED_INTERFACE:
				return validateTExportedInterface((TExportedInterface)value, diagnostics, context);
			case TOSCAPackage.TEXPORTED_OPERATION:
				return validateTExportedOperation((TExportedOperation)value, diagnostics, context);
			case TOSCAPackage.TEXTENSIBLE_ELEMENTS:
				return validateTExtensibleElements((TExtensibleElements)value, diagnostics, context);
			case TOSCAPackage.TEXTENSION:
				return validateTExtension((TExtension)value, diagnostics, context);
			case TOSCAPackage.TEXTENSIONS:
				return validateTExtensions((TExtensions)value, diagnostics, context);
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACT:
				return validateTImplementationArtifact((TImplementationArtifact)value, diagnostics, context);
			case TOSCAPackage.TIMPLEMENTATION_ARTIFACTS:
				return validateTImplementationArtifacts((TImplementationArtifacts)value, diagnostics, context);
			case TOSCAPackage.TIMPORT:
				return validateTImport((TImport)value, diagnostics, context);
			case TOSCAPackage.TINTERFACE:
				return validateTInterface((TInterface)value, diagnostics, context);
			case TOSCAPackage.TNODE_TEMPLATE:
				return validateTNodeTemplate((TNodeTemplate)value, diagnostics, context);
			case TOSCAPackage.TNODE_TYPE:
				return validateTNodeType((TNodeType)value, diagnostics, context);
			case TOSCAPackage.TNODE_TYPE_IMPLEMENTATION:
				return validateTNodeTypeImplementation((TNodeTypeImplementation)value, diagnostics, context);
			case TOSCAPackage.TOPERATION:
				return validateTOperation((TOperation)value, diagnostics, context);
			case TOSCAPackage.TPARAMETER:
				return validateTParameter((TParameter)value, diagnostics, context);
			case TOSCAPackage.TPLAN:
				return validateTPlan((TPlan)value, diagnostics, context);
			case TOSCAPackage.TPLANS:
				return validateTPlans((TPlans)value, diagnostics, context);
			case TOSCAPackage.TPOLICY:
				return validateTPolicy((TPolicy)value, diagnostics, context);
			case TOSCAPackage.TPOLICY_TEMPLATE:
				return validateTPolicyTemplate((TPolicyTemplate)value, diagnostics, context);
			case TOSCAPackage.TPOLICY_TYPE:
				return validateTPolicyType((TPolicyType)value, diagnostics, context);
			case TOSCAPackage.TPROPERTY_CONSTRAINT:
				return validateTPropertyConstraint((TPropertyConstraint)value, diagnostics, context);
			case TOSCAPackage.TPROPERTY_MAPPING:
				return validateTPropertyMapping((TPropertyMapping)value, diagnostics, context);
			case TOSCAPackage.TRELATIONSHIP_TEMPLATE:
				return validateTRelationshipTemplate((TRelationshipTemplate)value, diagnostics, context);
			case TOSCAPackage.TRELATIONSHIP_TYPE:
				return validateTRelationshipType((TRelationshipType)value, diagnostics, context);
			case TOSCAPackage.TRELATIONSHIP_TYPE_IMPLEMENTATION:
				return validateTRelationshipTypeImplementation((TRelationshipTypeImplementation)value, diagnostics, context);
			case TOSCAPackage.TREQUIRED_CONTAINER_FEATURE:
				return validateTRequiredContainerFeature((TRequiredContainerFeature)value, diagnostics, context);
			case TOSCAPackage.TREQUIRED_CONTAINER_FEATURES:
				return validateTRequiredContainerFeatures((TRequiredContainerFeatures)value, diagnostics, context);
			case TOSCAPackage.TREQUIREMENT:
				return validateTRequirement((TRequirement)value, diagnostics, context);
			case TOSCAPackage.TREQUIREMENT_DEFINITION:
				return validateTRequirementDefinition((TRequirementDefinition)value, diagnostics, context);
			case TOSCAPackage.TREQUIREMENT_REF:
				return validateTRequirementRef((TRequirementRef)value, diagnostics, context);
			case TOSCAPackage.TREQUIREMENT_TYPE:
				return validateTRequirementType((TRequirementType)value, diagnostics, context);
			case TOSCAPackage.TSERVICE_TEMPLATE:
				return validateTServiceTemplate((TServiceTemplate)value, diagnostics, context);
			case TOSCAPackage.TTAG:
				return validateTTag((TTag)value, diagnostics, context);
			case TOSCAPackage.TTAGS:
				return validateTTags((TTags)value, diagnostics, context);
			case TOSCAPackage.TTOPOLOGY_ELEMENT_INSTANCE_STATES:
				return validateTTopologyElementInstanceStates((TTopologyElementInstanceStates)value, diagnostics, context);
			case TOSCAPackage.TTOPOLOGY_TEMPLATE:
				return validateTTopologyTemplate((TTopologyTemplate)value, diagnostics, context);
			case TOSCAPackage.TYPES_TYPE:
				return validateTypesType((TypesType)value, diagnostics, context);
			case TOSCAPackage.VALID_SOURCE_TYPE:
				return validateValidSourceType((ValidSourceType)value, diagnostics, context);
			case TOSCAPackage.VALID_TARGET_TYPE:
				return validateValidTargetType((ValidTargetType)value, diagnostics, context);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER1:
				return validateMaxInstancesTypeMember1((MaxInstancesTypeMember1)value, diagnostics, context);
			case TOSCAPackage.TBOOLEAN:
				return validateTBoolean((TBoolean)value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1:
				return validateUpperBoundTypeMember1((UpperBoundTypeMember1)value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER11:
				return validateUpperBoundTypeMember11((UpperBoundTypeMember11)value, diagnostics, context);
			case TOSCAPackage.IMPORTED_URI:
				return validateImportedURI((String)value, diagnostics, context);
			case TOSCAPackage.MAX_INSTANCES_TYPE:
				return validateMaxInstancesType(value, diagnostics, context);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER0:
				return validateMaxInstancesTypeMember0((BigInteger)value, diagnostics, context);
			case TOSCAPackage.MAX_INSTANCES_TYPE_MEMBER1_OBJECT:
				return validateMaxInstancesTypeMember1Object((MaxInstancesTypeMember1)value, diagnostics, context);
			case TOSCAPackage.TBOOLEAN_OBJECT:
				return validateTBooleanObject((TBoolean)value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE:
				return validateUpperBoundType(value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE1:
				return validateUpperBoundType1(value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER0:
				return validateUpperBoundTypeMember0((BigInteger)value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER01:
				return validateUpperBoundTypeMember01((BigInteger)value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT:
				return validateUpperBoundTypeMember1Object((UpperBoundTypeMember1)value, diagnostics, context);
			case TOSCAPackage.UPPER_BOUND_TYPE_MEMBER1_OBJECT1:
				return validateUpperBoundTypeMember1Object1((UpperBoundTypeMember11)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArtifactReferencesType(ArtifactReferencesType artifactReferencesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(artifactReferencesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilitiesType(CapabilitiesType capabilitiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilitiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilitiesType1(CapabilitiesType1 capabilitiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilitiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCapabilityDefinitionsType(CapabilityDefinitionsType capabilityDefinitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(capabilityDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintsType(ConstraintsType constraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintsType1(ConstraintsType1 constraintsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constraintsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitionsType(DefinitionsType definitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedFromType(DerivedFromType derivedFromType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedFromType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedFromType1(DerivedFromType1 derivedFromType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedFromType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDerivedFromType2(DerivedFromType2 derivedFromType2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(derivedFromType2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludeType(ExcludeType excludeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(excludeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionsType(ExtensionsType extensionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplementationArtifactType(ImplementationArtifactType implementationArtifactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(implementationArtifactType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeType(IncludeType includeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputParametersType(InputParametersType inputParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputParametersType1(InputParametersType1 inputParametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputParametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceStateType(InstanceStateType instanceStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instanceStateType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfacesType(InterfacesType interfacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfacesType1(InterfacesType1 interfacesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interfacesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeOperationType(NodeOperationType nodeOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeOperationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNodeTypeReferenceType(NodeTypeReferenceType nodeTypeReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nodeTypeReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputParametersType(OutputParametersType outputParametersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputParametersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputParametersType1(OutputParametersType1 outputParametersType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputParametersType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanModelReferenceType(PlanModelReferenceType planModelReferenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planModelReferenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanModelType(PlanModelType planModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanType(PlanType planType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoliciesType(PoliciesType policiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(policiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoliciesType1(PoliciesType1 policiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(policiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesDefinitionType(PropertiesDefinitionType propertiesDefinitionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesDefinitionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType(PropertiesType propertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertiesType1(PropertiesType1 propertiesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertiesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyConstraintsType(PropertyConstraintsType propertyConstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyConstraintsType1(PropertyConstraintsType1 propertyConstraintsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyConstraintsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyMappingsType(PropertyMappingsType propertyMappingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyMappingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipConstraintsType(RelationshipConstraintsType relationshipConstraintsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipConstraintsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipConstraintType(RelationshipConstraintType relationshipConstraintType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipConstraintType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipOperationType(RelationshipOperationType relationshipOperationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationshipOperationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementDefinitionsType(RequirementDefinitionsType requirementDefinitionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementDefinitionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsType(RequirementsType requirementsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRequirementsType1(RequirementsType1 requirementsType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(requirementsType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceElementType(SourceElementType sourceElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSourceInterfacesType(SourceInterfacesType sourceInterfacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sourceInterfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTAppliesTo(TAppliesTo tAppliesTo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tAppliesTo, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetElementType(TargetElementType targetElementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetElementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetInterfacesType(TargetInterfacesType targetInterfacesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(targetInterfacesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTArtifactReference(TArtifactReference tArtifactReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tArtifactReference, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTArtifactTemplate(TArtifactTemplate tArtifactTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tArtifactTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTArtifactType(TArtifactType tArtifactType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tArtifactType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBoundaryDefinitions(TBoundaryDefinitions tBoundaryDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tBoundaryDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCapability(TCapability tCapability, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCapability, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCapabilityDefinition(TCapabilityDefinition tCapabilityDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCapabilityDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCapabilityRef(TCapabilityRef tCapabilityRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCapabilityRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCapabilityType(TCapabilityType tCapabilityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCapabilityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTCondition(TCondition tCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTConstraint(TConstraint tConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDefinitions(TDefinitions tDefinitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDefinitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeploymentArtifact(TDeploymentArtifact tDeploymentArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeploymentArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDeploymentArtifacts(TDeploymentArtifacts tDeploymentArtifacts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDeploymentArtifacts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTDocumentation(TDocumentation tDocumentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tDocumentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntityTemplate(TEntityTemplate tEntityTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntityTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTEntityType(TEntityType tEntityType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tEntityType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExportedInterface(TExportedInterface tExportedInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExportedInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExportedOperation(TExportedOperation tExportedOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExportedOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensibleElements(TExtensibleElements tExtensibleElements, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExtensibleElements, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtension(TExtension tExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTExtensions(TExtensions tExtensions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tExtensions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTImplementationArtifact(TImplementationArtifact tImplementationArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tImplementationArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTImplementationArtifacts(TImplementationArtifacts tImplementationArtifacts, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tImplementationArtifacts, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTImport(TImport tImport, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tImport, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTInterface(TInterface tInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tInterface, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNodeTemplate(TNodeTemplate tNodeTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNodeTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNodeType(TNodeType tNodeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNodeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTNodeTypeImplementation(TNodeTypeImplementation tNodeTypeImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tNodeTypeImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTOperation(TOperation tOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tOperation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTParameter(TParameter tParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tParameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlan(TPlan tPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPlans(TPlans tPlans, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPlans, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPolicy(TPolicy tPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPolicy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPolicyTemplate(TPolicyTemplate tPolicyTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPolicyTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPolicyType(TPolicyType tPolicyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPolicyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPropertyConstraint(TPropertyConstraint tPropertyConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPropertyConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTPropertyMapping(TPropertyMapping tPropertyMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tPropertyMapping, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRelationshipTemplate(TRelationshipTemplate tRelationshipTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRelationshipTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRelationshipType(TRelationshipType tRelationshipType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRelationshipType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRelationshipTypeImplementation(TRelationshipTypeImplementation tRelationshipTypeImplementation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRelationshipTypeImplementation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequiredContainerFeature(TRequiredContainerFeature tRequiredContainerFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequiredContainerFeature, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequiredContainerFeatures(TRequiredContainerFeatures tRequiredContainerFeatures, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequiredContainerFeatures, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequirement(TRequirement tRequirement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequirement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequirementDefinition(TRequirementDefinition tRequirementDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequirementDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequirementRef(TRequirementRef tRequirementRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequirementRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRequirementType(TRequirementType tRequirementType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tRequirementType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTServiceTemplate(TServiceTemplate tServiceTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tServiceTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTag(TTag tTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTags(TTags tTags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTags, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTopologyElementInstanceStates(TTopologyElementInstanceStates tTopologyElementInstanceStates, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTopologyElementInstanceStates, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTTopologyTemplate(TTopologyTemplate tTopologyTemplate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tTopologyTemplate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypesType(TypesType typesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidSourceType(ValidSourceType validSourceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validSourceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValidTargetType(ValidTargetType validTargetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(validTargetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxInstancesTypeMember1(MaxInstancesTypeMember1 maxInstancesTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBoolean(TBoolean tBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember1(UpperBoundTypeMember1 upperBoundTypeMember1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember11(UpperBoundTypeMember11 upperBoundTypeMember11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImportedURI(String importedURI, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxInstancesType(Object maxInstancesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaxInstancesType_MemberTypes(maxInstancesType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Max Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxInstancesType_MemberTypes(Object maxInstancesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0.isInstance(maxInstancesType)) {
				if (validateMaxInstancesTypeMember0((BigInteger)maxInstancesType, tempDiagnostics, context)) return true;
			}
			if (TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1.isInstance(maxInstancesType)) {
				if (validateMaxInstancesTypeMember1((MaxInstancesTypeMember1)maxInstancesType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0.isInstance(maxInstancesType)) {
				if (validateMaxInstancesTypeMember0((BigInteger)maxInstancesType, null, context)) return true;
			}
			if (TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER1.isInstance(maxInstancesType)) {
				if (validateMaxInstancesTypeMember1((MaxInstancesTypeMember1)maxInstancesType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxInstancesTypeMember0(BigInteger maxInstancesTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(maxInstancesTypeMember0, diagnostics, context);
		if (result || diagnostics != null) result &= validateMaxInstancesTypeMember0_Pattern(maxInstancesTypeMember0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaxInstancesTypeMember0_Pattern
	 */
	public static final  PatternMatcher [][] MAX_INSTANCES_TYPE_MEMBER0__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([1-9]+[0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Max Instances Type Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxInstancesTypeMember0_Pattern(BigInteger maxInstancesTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TOSCAPackage.Literals.MAX_INSTANCES_TYPE_MEMBER0, maxInstancesTypeMember0, MAX_INSTANCES_TYPE_MEMBER0__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaxInstancesTypeMember1Object(MaxInstancesTypeMember1 maxInstancesTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBooleanObject(TBoolean tBooleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundType(Object upperBoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpperBoundType_MemberTypes(upperBoundType, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Upper Bound Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundType_MemberTypes(Object upperBoundType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER0.isInstance(upperBoundType)) {
				if (validateUpperBoundTypeMember0((BigInteger)upperBoundType, tempDiagnostics, context)) return true;
			}
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1.isInstance(upperBoundType)) {
				if (validateUpperBoundTypeMember1((UpperBoundTypeMember1)upperBoundType, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER0.isInstance(upperBoundType)) {
				if (validateUpperBoundTypeMember0((BigInteger)upperBoundType, null, context)) return true;
			}
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER1.isInstance(upperBoundType)) {
				if (validateUpperBoundTypeMember1((UpperBoundTypeMember1)upperBoundType, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundType1(Object upperBoundType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUpperBoundType1_MemberTypes(upperBoundType1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Upper Bound Type1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundType1_MemberTypes(Object upperBoundType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER01.isInstance(upperBoundType1)) {
				if (validateUpperBoundTypeMember01((BigInteger)upperBoundType1, tempDiagnostics, context)) return true;
			}
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11.isInstance(upperBoundType1)) {
				if (validateUpperBoundTypeMember11((UpperBoundTypeMember11)upperBoundType1, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER01.isInstance(upperBoundType1)) {
				if (validateUpperBoundTypeMember01((BigInteger)upperBoundType1, null, context)) return true;
			}
			if (TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER11.isInstance(upperBoundType1)) {
				if (validateUpperBoundTypeMember11((UpperBoundTypeMember11)upperBoundType1, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember0(BigInteger upperBoundTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(upperBoundTypeMember0, diagnostics, context);
		if (result || diagnostics != null) result &= validateUpperBoundTypeMember0_Pattern(upperBoundTypeMember0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUpperBoundTypeMember0_Pattern
	 */
	public static final  PatternMatcher [][] UPPER_BOUND_TYPE_MEMBER0__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([1-9]+[0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Upper Bound Type Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember0_Pattern(BigInteger upperBoundTypeMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER0, upperBoundTypeMember0, UPPER_BOUND_TYPE_MEMBER0__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember01(BigInteger upperBoundTypeMember01, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(upperBoundTypeMember01, diagnostics, context);
		if (result || diagnostics != null) result &= validateUpperBoundTypeMember01_Pattern(upperBoundTypeMember01, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUpperBoundTypeMember01_Pattern
	 */
	public static final  PatternMatcher [][] UPPER_BOUND_TYPE_MEMBER01__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("([1-9]+[0-9]*)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Upper Bound Type Member01</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember01_Pattern(BigInteger upperBoundTypeMember01, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(TOSCAPackage.Literals.UPPER_BOUND_TYPE_MEMBER01, upperBoundTypeMember01, UPPER_BOUND_TYPE_MEMBER01__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember1Object(UpperBoundTypeMember1 upperBoundTypeMember1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpperBoundTypeMember1Object1(UpperBoundTypeMember11 upperBoundTypeMember1Object1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TOSCAValidator
