/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement;
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
 * An implementation of the model object '<em><b>Input Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternImpl#getInputPatternElements <em>Input Pattern Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternImpl#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPatternImpl extends EObjectImpl implements InputPattern {
	/**
	 * The cached value of the '{@link #getInputPatternElements() <em>Input Pattern Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPatternElements()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPatternElement> inputPatternElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.INPUT_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPatternElement> getInputPatternElements() {
		if (inputPatternElements == null) {
			inputPatternElements = new EObjectContainmentWithInverseEList<InputPatternElement>(InputPatternElement.class, this, Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS, Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN);
		}
		return inputPatternElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule getRule() {
		if (eContainerFeatureID() != Atl2javaPackage.INPUT_PATTERN__RULE) return null;
		return (Rule)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRule(Rule newRule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRule, Atl2javaPackage.INPUT_PATTERN__RULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRule(Rule newRule) {
		if (newRule != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.INPUT_PATTERN__RULE && newRule != null)) {
			if (EcoreUtil.isAncestor(this, newRule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRule != null)
				msgs = ((InternalEObject)newRule).eInverseAdd(this, Atl2javaPackage.RULE__INPUT_PATTERN, Rule.class, msgs);
			msgs = basicSetRule(newRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.INPUT_PATTERN__RULE, newRule, newRule));
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
			case Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputPatternElements()).basicAdd(otherEnd, msgs);
			case Atl2javaPackage.INPUT_PATTERN__RULE:
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
			case Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS:
				return ((InternalEList<?>)getInputPatternElements()).basicRemove(otherEnd, msgs);
			case Atl2javaPackage.INPUT_PATTERN__RULE:
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
			case Atl2javaPackage.INPUT_PATTERN__RULE:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.RULE__INPUT_PATTERN, Rule.class, msgs);
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
			case Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS:
				return getInputPatternElements();
			case Atl2javaPackage.INPUT_PATTERN__RULE:
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
			case Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS:
				getInputPatternElements().clear();
				getInputPatternElements().addAll((Collection<? extends InputPatternElement>)newValue);
				return;
			case Atl2javaPackage.INPUT_PATTERN__RULE:
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
			case Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS:
				getInputPatternElements().clear();
				return;
			case Atl2javaPackage.INPUT_PATTERN__RULE:
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
			case Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS:
				return inputPatternElements != null && !inputPatternElements.isEmpty();
			case Atl2javaPackage.INPUT_PATTERN__RULE:
				return getRule() != null;
		}
		return super.eIsSet(featureID);
	}

} //InputPatternImpl
