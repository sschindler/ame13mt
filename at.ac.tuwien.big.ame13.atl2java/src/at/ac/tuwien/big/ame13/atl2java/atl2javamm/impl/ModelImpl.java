/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model;
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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl#getPath <em>Path</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl#getMetamodel <em>Metamodel</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl#getTransformationSource <em>Transformation Source</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl#getTransformationTarget <em>Transformation Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelImpl extends EObjectImpl implements Model {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	 * The default value of the '{@link #getMetamodel() <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected static final String METAMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetamodel() <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetamodel()
	 * @generated
	 * @ordered
	 */
	protected String metamodel = METAMODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Atl2javaPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.MODEL__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetamodel() {
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(String newMetamodel) {
		String oldMetamodel = metamodel;
		metamodel = newMetamodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.MODEL__METAMODEL, oldMetamodel, metamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformationSource() {
		if (eContainerFeatureID() != Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE) return null;
		return (Transformation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationSource(Transformation newTransformationSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransformationSource, Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationSource(Transformation newTransformationSource) {
		if (newTransformationSource != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE && newTransformationSource != null)) {
			if (EcoreUtil.isAncestor(this, newTransformationSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransformationSource != null)
				msgs = ((InternalEObject)newTransformationSource).eInverseAdd(this, Atl2javaPackage.TRANSFORMATION__SOURCE_MODELS, Transformation.class, msgs);
			msgs = basicSetTransformationSource(newTransformationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE, newTransformationSource, newTransformationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getTransformationTarget() {
		if (eContainerFeatureID() != Atl2javaPackage.MODEL__TRANSFORMATION_TARGET) return null;
		return (Transformation)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformationTarget(Transformation newTransformationTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransformationTarget, Atl2javaPackage.MODEL__TRANSFORMATION_TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformationTarget(Transformation newTransformationTarget) {
		if (newTransformationTarget != eInternalContainer() || (eContainerFeatureID() != Atl2javaPackage.MODEL__TRANSFORMATION_TARGET && newTransformationTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTransformationTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransformationTarget != null)
				msgs = ((InternalEObject)newTransformationTarget).eInverseAdd(this, Atl2javaPackage.TRANSFORMATION__TARGET_MODELS, Transformation.class, msgs);
			msgs = basicSetTransformationTarget(newTransformationTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Atl2javaPackage.MODEL__TRANSFORMATION_TARGET, newTransformationTarget, newTransformationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransformationSource((Transformation)otherEnd, msgs);
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransformationTarget((Transformation)otherEnd, msgs);
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
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				return basicSetTransformationSource(null, msgs);
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				return basicSetTransformationTarget(null, msgs);
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
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.TRANSFORMATION__SOURCE_MODELS, Transformation.class, msgs);
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				return eInternalContainer().eInverseRemove(this, Atl2javaPackage.TRANSFORMATION__TARGET_MODELS, Transformation.class, msgs);
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
			case Atl2javaPackage.MODEL__PATH:
				return getPath();
			case Atl2javaPackage.MODEL__NAME:
				return getName();
			case Atl2javaPackage.MODEL__METAMODEL:
				return getMetamodel();
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				return getTransformationSource();
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				return getTransformationTarget();
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
			case Atl2javaPackage.MODEL__PATH:
				setPath((String)newValue);
				return;
			case Atl2javaPackage.MODEL__NAME:
				setName((String)newValue);
				return;
			case Atl2javaPackage.MODEL__METAMODEL:
				setMetamodel((String)newValue);
				return;
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				setTransformationSource((Transformation)newValue);
				return;
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				setTransformationTarget((Transformation)newValue);
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
			case Atl2javaPackage.MODEL__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case Atl2javaPackage.MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Atl2javaPackage.MODEL__METAMODEL:
				setMetamodel(METAMODEL_EDEFAULT);
				return;
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				setTransformationSource((Transformation)null);
				return;
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				setTransformationTarget((Transformation)null);
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
			case Atl2javaPackage.MODEL__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case Atl2javaPackage.MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Atl2javaPackage.MODEL__METAMODEL:
				return METAMODEL_EDEFAULT == null ? metamodel != null : !METAMODEL_EDEFAULT.equals(metamodel);
			case Atl2javaPackage.MODEL__TRANSFORMATION_SOURCE:
				return getTransformationSource() != null;
			case Atl2javaPackage.MODEL__TRANSFORMATION_TARGET:
				return getTransformationTarget() != null;
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
		result.append(" (path: ");
		result.append(path);
		result.append(", name: ");
		result.append(name);
		result.append(", metamodel: ");
		result.append(metamodel);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
