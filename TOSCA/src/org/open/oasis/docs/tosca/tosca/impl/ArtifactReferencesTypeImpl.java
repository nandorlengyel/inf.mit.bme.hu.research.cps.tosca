/**
 */
package org.open.oasis.docs.tosca.tosca.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.open.oasis.docs.tosca.tosca.ArtifactReferencesType;
import org.open.oasis.docs.tosca.tosca.TArtifactReference;
import org.open.oasis.docs.tosca.tosca.TOSCAPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact References Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.open.oasis.docs.tosca.tosca.impl.ArtifactReferencesTypeImpl#getArtifactReference <em>Artifact Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactReferencesTypeImpl extends MinimalEObjectImpl.Container implements ArtifactReferencesType {
	/**
	 * The cached value of the '{@link #getArtifactReference() <em>Artifact Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArtifactReference()
	 * @generated
	 * @ordered
	 */
	protected EList<TArtifactReference> artifactReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactReferencesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TOSCAPackage.Literals.ARTIFACT_REFERENCES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TArtifactReference> getArtifactReference() {
		if (artifactReference == null) {
			artifactReference = new EObjectContainmentEList<TArtifactReference>(TArtifactReference.class, this, TOSCAPackage.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE);
		}
		return artifactReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE:
				return ((InternalEList<?>)getArtifactReference()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE:
				return getArtifactReference();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE:
				getArtifactReference().clear();
				getArtifactReference().addAll((Collection<? extends TArtifactReference>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE:
				getArtifactReference().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TOSCAPackage.ARTIFACT_REFERENCES_TYPE__ARTIFACT_REFERENCE:
				return artifactReference != null && !artifactReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactReferencesTypeImpl
