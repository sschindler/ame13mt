/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternImpl#getOutputPatternElements <em>Output Pattern Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPatternImpl extends EObjectImpl implements OutputPattern {
	/**
	 * The cached value of the '{@link #getOutputPatternElements() <em>Output Pattern Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPatternElements()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPatternElement> outputPatternElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.OUTPUT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPatternElement> getOutputPatternElements() {
		if (outputPatternElements == null) {
			outputPatternElements = new EObjectContainmentWithInverseEList<OutputPatternElement>(OutputPatternElement.class, this, Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN);
		}
		return outputPatternElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != Atl2javaPackage.OUTPUT_PATTERN__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, Atl2javaPackage.OUTPUT_PATTERN__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.OUTPUT_PATTERN__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, Atl2javaPackage.RULE__OUTPUT_PATTERN, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.OUTPUT_PATTERN__RULE, newRule, newRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputPatternElements()).basicAdd(otherEnd, msgs);
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRule((Rule)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS:
				return ((InternalEList<?>)getOutputPatternElements()).basicRemove(otherEnd, msgs);
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				return basicSetRule(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.RULE__OUTPUT_PATTERN, Rule.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS:
				return getOutputPatternElements();
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				return getRule();
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
			case Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS:
				getOutputPatternElements().clear();
				getOutputPatternElements().addAll((Collection<? extends OutputPatternElement>)newValue);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				setRule((Rule)newValue);
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
			case Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS:
				getOutputPatternElements().clear();
				return;
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				setRule((Rule)null);
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
			case Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS:
				return outputPatternElements != null && !outputPatternElements.isEmpty();
			case Atl2javaPackage.OUTPUT_PATTERN__RULE:
				return getRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputPatternImpl
