/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl#getInputPattern <em>Input Pattern</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl#getOutputPattern <em>Output Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends EObjectImpl implements Rule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInputPattern() <em>Input Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPattern()
	 * @generated
	 * @ordered
	 */
	protected InputPattern inputPattern;

	/**
	 * The cached value of the '{@link #getOutputPattern() <em>Output Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPattern()
	 * @generated
	 * @ordered
	 */
	protected OutputPattern outputPattern;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformation() {
		if (eContainerFeatureID() != Atl2javaPackage.RULE__TRANSFORMATION) return null;
		return (Transformation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation(Transformation newTransformation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransformation, Atl2javaPackage.RULE__TRANSFORMATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation(Transformation newTransformation) {
		if (newTransformation != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.RULE__TRANSFORMATION && newTransformation != null)) {
			if (EcoreUtil.isAncestor(this, newTransformation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransformation != null)
				msgs = ((InternalEObject)newTransformation).eInverseAdd(this, Atl2javaPackage.TRANSFORMATION__RULES, Transformation.class, msgs);
			msgs = basicSetTransformation(newTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.RULE__TRANSFORMATION, newTransformation, newTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPattern getInputPattern() {
		return inputPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPattern(InputPattern newInputPattern, NotificationChain msgs) {
		InputPattern oldInputPattern = inputPattern;
		inputPattern = newInputPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Atl2javaPackage.RULE__INPUT_PATTERN, oldInputPattern, newInputPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPattern(InputPattern newInputPattern) {
		if (newInputPattern != inputPattern) {
			NotificationChain msgs = null;
			if (inputPattern != null)
				msgs = ((InternalEObject)inputPattern).eInverseRemove(this, Atl2javaPackage.INPUT_PATTERN__RULE, InputPattern.class, msgs);
			if (newInputPattern != null)
				msgs = ((InternalEObject)newInputPattern).eInverseAdd(this, Atl2javaPackage.INPUT_PATTERN__RULE, InputPattern.class, msgs);
			msgs = basicSetInputPattern(newInputPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.RULE__INPUT_PATTERN, newInputPattern, newInputPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPattern getOutputPattern() {
		return outputPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPattern(OutputPattern newOutputPattern, NotificationChain msgs) {
		OutputPattern oldOutputPattern = outputPattern;
		outputPattern = newOutputPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Atl2javaPackage.RULE__OUTPUT_PATTERN, oldOutputPattern, newOutputPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPattern(OutputPattern newOutputPattern) {
		if (newOutputPattern != outputPattern) {
			NotificationChain msgs = null;
			if (outputPattern != null)
				msgs = ((InternalEObject)outputPattern).eInverseRemove(this, Atl2javaPackage.OUTPUT_PATTERN__RULE, OutputPattern.class, msgs);
			if (newOutputPattern != null)
				msgs = ((InternalEObject)newOutputPattern).eInverseAdd(this, Atl2javaPackage.OUTPUT_PATTERN__RULE, OutputPattern.class, msgs);
			msgs = basicSetOutputPattern(newOutputPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.RULE__OUTPUT_PATTERN, newOutputPattern, newOutputPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Atl2javaPackage.RULE__TRANSFORMATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransformation((Transformation)otherEnd, msgs);
			case Atl2javaPackage.RULE__INPUT_PATTERN:
				if (inputPattern != null)
					msgs = ((InternalEObject)inputPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Atl2javaPackage.RULE__INPUT_PATTERN, null, msgs);
				return basicSetInputPattern((InputPattern)otherEnd, msgs);
			case Atl2javaPackage.RULE__OUTPUT_PATTERN:
				if (outputPattern != null)
					msgs = ((InternalEObject)outputPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Atl2javaPackage.RULE__OUTPUT_PATTERN, null, msgs);
				return basicSetOutputPattern((OutputPattern)otherEnd, msgs);
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
			case Atl2javaPackage.RULE__TRANSFORMATION:
				return basicSetTransformation(null, msgs);
			case Atl2javaPackage.RULE__INPUT_PATTERN:
				return basicSetInputPattern(null, msgs);
			case Atl2javaPackage.RULE__OUTPUT_PATTERN:
				return basicSetOutputPattern(null, msgs);
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
			case Atl2javaPackage.RULE__TRANSFORMATION:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.TRANSFORMATION__RULES, Transformation.class, msgs);
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
			case Atl2javaPackage.RULE__NAME:
				return getName();
			case Atl2javaPackage.RULE__TRANSFORMATION:
				return getTransformation();
			case Atl2javaPackage.RULE__INPUT_PATTERN:
				return getInputPattern();
			case Atl2javaPackage.RULE__OUTPUT_PATTERN:
				return getOutputPattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Atl2javaPackage.RULE__NAME:
				setName((String)newValue);
				return;
			case Atl2javaPackage.RULE__TRANSFORMATION:
				setTransformation((Transformation)newValue);
				return;
			case Atl2javaPackage.RULE__INPUT_PATTERN:
				setInputPattern((InputPattern)newValue);
				return;
			case Atl2javaPackage.RULE__OUTPUT_PATTERN:
				setOutputPattern((OutputPattern)newValue);
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
			case Atl2javaPackage.RULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Atl2javaPackage.RULE__TRANSFORMATION:
				setTransformation((Transformation)null);
				return;
			case Atl2javaPackage.RULE__INPUT_PATTERN:
				setInputPattern((InputPattern)null);
				return;
			case Atl2javaPackage.RULE__OUTPUT_PATTERN:
				setOutputPattern((OutputPattern)null);
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
			case Atl2javaPackage.RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Atl2javaPackage.RULE__TRANSFORMATION:
				return getTransformation() != null;
			case Atl2javaPackage.RULE__INPUT_PATTERN:
				return inputPattern != null;
			case Atl2javaPackage.RULE__OUTPUT_PATTERN:
				return outputPattern != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
