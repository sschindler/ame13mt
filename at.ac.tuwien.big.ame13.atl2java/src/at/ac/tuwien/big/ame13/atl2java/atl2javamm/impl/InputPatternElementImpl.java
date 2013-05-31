/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl#getInputPattern <em>Input Pattern</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl#getVar <em>Var</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputPatternElementImpl extends EObjectImpl implements InputPatternElement {
	/**
	 * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected String var = VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected SourceModel metamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputPatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.INPUT_PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPattern getInputPattern() {
		if (eContainerFeatureID() != Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN) return null;
		return (InputPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPattern(InputPattern newInputPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInputPattern, Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPattern(InputPattern newInputPattern) {
		if (newInputPattern != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN && newInputPattern != null)) {
			if (EcoreUtil.isAncestor(this, newInputPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInputPattern != null)
				msgs = ((InternalEObject)newInputPattern).eInverseAdd(this, Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS, InputPattern.class, msgs);
			msgs = basicSetInputPattern(newInputPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN, newInputPattern, newInputPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(String newVar) {
		String oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.INPUT_PATTERN_ELEMENT__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.INPUT_PATTERN_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (SourceModel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Atl2javaPackage.INPUT_PATTERN_ELEMENT__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(SourceModel newMetamodel) {
		SourceModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.INPUT_PATTERN_ELEMENT__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInputPattern((InputPattern)otherEnd, msgs);
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
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				return basicSetInputPattern(null, msgs);
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
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.INPUT_PATTERN__INPUT_PATTERN_ELEMENTS, InputPattern.class, msgs);
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
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				return getInputPattern();
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__VAR:
				return getVar();
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__TYPE:
				return getType();
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__METAMODEL:
				if (resolve) return getMetamodel();
				return basicGetMetamodel();
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
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				setInputPattern((InputPattern)newValue);
				return;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__VAR:
				setVar((String)newValue);
				return;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__METAMODEL:
				setMetamodel((SourceModel)newValue);
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
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				setInputPattern((InputPattern)null);
				return;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__VAR:
				setVar(VAR_EDEFAULT);
				return;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__METAMODEL:
				setMetamodel((SourceModel)null);
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
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__INPUT_PATTERN:
				return getInputPattern() != null;
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__VAR:
				return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT__METAMODEL:
				return metamodel != null;
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
		result.append(" (var: ");
		result.append(var);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //InputPatternElementImpl
