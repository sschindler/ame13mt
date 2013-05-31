/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel;

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
 * An implementation of the model object '<em><b>Output Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl#getOuputPattern <em>Ouput Pattern</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl#getBindings <em>Bindings</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputPatternElementImpl extends EObjectImpl implements OutputPatternElement {
	/**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> bindings;

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
	protected TargetModel metamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputPatternElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.OUTPUT_PATTERN_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPattern getOuputPattern() {
		if (eContainerFeatureID() != Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN) return null;
		return (OutputPattern)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOuputPattern(OutputPattern newOuputPattern, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOuputPattern, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOuputPattern(OutputPattern newOuputPattern) {
		if (newOuputPattern != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN && newOuputPattern != null)) {
			if (EcoreUtil.isAncestor(this, newOuputPattern))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOuputPattern != null)
				msgs = ((InternalEObject)newOuputPattern).eInverseAdd(this, Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS, OutputPattern.class, msgs);
			msgs = basicSetOuputPattern(newOuputPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN, newOuputPattern, newOuputPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Binding> getBindings() {
		if (bindings == null) {
			bindings = new EObjectContainmentWithInverseEList<Binding>(Binding.class, this, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS, Atl2javaPackage.BINDING__OUTPUT_PATTERN_ELEMENT);
		}
		return bindings;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModel getMetamodel() {
		if (metamodel != null && metamodel.eIsProxy()) {
			InternalEObject oldMetamodel = (InternalEObject)metamodel;
			metamodel = (TargetModel)eResolveProxy(oldMetamodel);
			if (metamodel != oldMetamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__METAMODEL, oldMetamodel, metamodel));
			}
		}
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModel basicGetMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(TargetModel newMetamodel) {
		TargetModel oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__METAMODEL, oldMetamodel, metamodel));
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
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOuputPattern((OutputPattern)otherEnd, msgs);
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBindings()).basicAdd(otherEnd, msgs);
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
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				return basicSetOuputPattern(null, msgs);
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS, OutputPattern.class, msgs);
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
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				return getOuputPattern();
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS:
				return getBindings();
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__NAME:
				return getName();
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__TYPE:
				return getType();
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__METAMODEL:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				setOuputPattern((OutputPattern)newValue);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends Binding>)newValue);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__TYPE:
				setType((String)newValue);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__METAMODEL:
				setMetamodel((TargetModel)newValue);
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
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				setOuputPattern((OutputPattern)null);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS:
				getBindings().clear();
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__METAMODEL:
				setMetamodel((TargetModel)null);
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
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN:
				return getOuputPattern() != null;
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__BINDINGS:
				return bindings != null && !bindings.isEmpty();
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT__METAMODEL:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //OutputPatternElementImpl
