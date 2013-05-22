/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends EObjectImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

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
	 * The cached value of the '{@link #getSourceModel() <em>Source Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceModel()
	 * @generated
	 * @ordered
	 */
	protected SourceModel sourceModel;

	/**
	 * The cached value of the '{@link #getTargetModel() <em>Target Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetModel()
	 * @generated
	 * @ordered
	 */
	protected TargetModel targetModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, Atl2javaPackage.TRANSFORMATION__RULES, Atl2javaPackage.RULE__TRANSFORMATION);
		}
		return rules;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.TRANSFORMATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceModel getSourceModel() {
		return sourceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceModel(SourceModel newSourceModel, NotificationChain msgs) {
		SourceModel oldSourceModel = sourceModel;
		sourceModel = newSourceModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL, oldSourceModel, newSourceModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceModel(SourceModel newSourceModel) {
		if (newSourceModel != sourceModel) {
			NotificationChain msgs = null;
			if (sourceModel != null)
				msgs = ((InternalEObject)sourceModel).eInverseRemove(this, Atl2javaPackage.SOURCE_MODEL__TRANSFORMATION, SourceModel.class, msgs);
			if (newSourceModel != null)
				msgs = ((InternalEObject)newSourceModel).eInverseAdd(this, Atl2javaPackage.SOURCE_MODEL__TRANSFORMATION, SourceModel.class, msgs);
			msgs = basicSetSourceModel(newSourceModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL, newSourceModel, newSourceModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetModel getTargetModel() {
		return targetModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetModel(TargetModel newTargetModel, NotificationChain msgs) {
		TargetModel oldTargetModel = targetModel;
		targetModel = newTargetModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Atl2javaPackage.TRANSFORMATION__TARGET_MODEL, oldTargetModel, newTargetModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetModel(TargetModel newTargetModel) {
		if (newTargetModel != targetModel) {
			NotificationChain msgs = null;
			if (targetModel != null)
				msgs = ((InternalEObject)targetModel).eInverseRemove(this, Atl2javaPackage.TARGET_MODEL__TRANSFORMATION, TargetModel.class, msgs);
			if (newTargetModel != null)
				msgs = ((InternalEObject)newTargetModel).eInverseAdd(this, Atl2javaPackage.TARGET_MODEL__TRANSFORMATION, TargetModel.class, msgs);
			msgs = basicSetTargetModel(newTargetModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.TRANSFORMATION__TARGET_MODEL, newTargetModel, newTargetModel));
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
			case Atl2javaPackage.TRANSFORMATION__RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
			case Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL:
				if (sourceModel != null)
					msgs = ((InternalEObject)sourceModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL, null, msgs);
				return basicSetSourceModel((SourceModel)otherEnd, msgs);
			case Atl2javaPackage.TRANSFORMATION__TARGET_MODEL:
				if (targetModel != null)
					msgs = ((InternalEObject)targetModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Atl2javaPackage.TRANSFORMATION__TARGET_MODEL, null, msgs);
				return basicSetTargetModel((TargetModel)otherEnd, msgs);
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
			case Atl2javaPackage.TRANSFORMATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL:
				return basicSetSourceModel(null, msgs);
			case Atl2javaPackage.TRANSFORMATION__TARGET_MODEL:
				return basicSetTargetModel(null, msgs);
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
			case Atl2javaPackage.TRANSFORMATION__RULES:
				return getRules();
			case Atl2javaPackage.TRANSFORMATION__NAME:
				return getName();
			case Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL:
				return getSourceModel();
			case Atl2javaPackage.TRANSFORMATION__TARGET_MODEL:
				return getTargetModel();
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
			case Atl2javaPackage.TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case Atl2javaPackage.TRANSFORMATION__NAME:
				setName((String)newValue);
				return;
			case Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL:
				setSourceModel((SourceModel)newValue);
				return;
			case Atl2javaPackage.TRANSFORMATION__TARGET_MODEL:
				setTargetModel((TargetModel)newValue);
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
			case Atl2javaPackage.TRANSFORMATION__RULES:
				getRules().clear();
				return;
			case Atl2javaPackage.TRANSFORMATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL:
				setSourceModel((SourceModel)null);
				return;
			case Atl2javaPackage.TRANSFORMATION__TARGET_MODEL:
				setTargetModel((TargetModel)null);
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
			case Atl2javaPackage.TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
			case Atl2javaPackage.TRANSFORMATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Atl2javaPackage.TRANSFORMATION__SOURCE_MODEL:
				return sourceModel != null;
			case Atl2javaPackage.TRANSFORMATION__TARGET_MODEL:
				return targetModel != null;
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

} //TransformationImpl
