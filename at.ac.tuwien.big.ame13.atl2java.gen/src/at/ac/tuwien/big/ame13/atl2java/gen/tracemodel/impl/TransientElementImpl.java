/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transient Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl#getVar <em>Var</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl#getTransientLinkTarget <em>Transient Link Target</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl#getTransientLinkSource <em>Transient Link Source</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransientElementImpl extends EObjectImpl implements TransientElement {
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
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected EObject value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.TRANSIENT_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRANSIENT_ELEMENT__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientLink getTransientLinkTarget() {
		if (eContainerFeatureID() != TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET) return null;
		return (TransientLink)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransientLinkTarget(TransientLink newTransientLinkTarget, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransientLinkTarget, TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientLinkTarget(TransientLink newTransientLinkTarget) {
		if (newTransientLinkTarget != eInternalContainer() || (eContainerFeatureID() != TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET && newTransientLinkTarget != null)) {
			if (EcoreUtil.isAncestor(this, newTransientLinkTarget))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransientLinkTarget != null)
				msgs = ((InternalEObject)newTransientLinkTarget).eInverseAdd(this, TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS, TransientLink.class, msgs);
			msgs = basicSetTransientLinkTarget(newTransientLinkTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET, newTransientLinkTarget, newTransientLinkTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientLink getTransientLinkSource() {
		if (eContainerFeatureID() != TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE) return null;
		return (TransientLink)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransientLinkSource(TransientLink newTransientLinkSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransientLinkSource, TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransientLinkSource(TransientLink newTransientLinkSource) {
		if (newTransientLinkSource != eInternalContainer() || (eContainerFeatureID() != TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE && newTransientLinkSource != null)) {
			if (EcoreUtil.isAncestor(this, newTransientLinkSource))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransientLinkSource != null)
				msgs = ((InternalEObject)newTransientLinkSource).eInverseAdd(this, TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS, TransientLink.class, msgs);
			msgs = basicSetTransientLinkSource(newTransientLinkSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE, newTransientLinkSource, newTransientLinkSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracemodelPackage.TRANSIENT_ELEMENT__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(EObject newValue) {
		EObject oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRANSIENT_ELEMENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransientLinkTarget((TransientLink)otherEnd, msgs);
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransientLinkSource((TransientLink)otherEnd, msgs);
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
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				return basicSetTransientLinkTarget(null, msgs);
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				return basicSetTransientLinkSource(null, msgs);
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
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				return eInternalContainer().eInverseRemove(this, TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS, TransientLink.class, msgs);
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				return eInternalContainer().eInverseRemove(this, TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS, TransientLink.class, msgs);
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
			case TracemodelPackage.TRANSIENT_ELEMENT__VAR:
				return getVar();
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				return getTransientLinkTarget();
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				return getTransientLinkSource();
			case TracemodelPackage.TRANSIENT_ELEMENT__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
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
			case TracemodelPackage.TRANSIENT_ELEMENT__VAR:
				setVar((String)newValue);
				return;
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				setTransientLinkTarget((TransientLink)newValue);
				return;
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				setTransientLinkSource((TransientLink)newValue);
				return;
			case TracemodelPackage.TRANSIENT_ELEMENT__VALUE:
				setValue((EObject)newValue);
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
			case TracemodelPackage.TRANSIENT_ELEMENT__VAR:
				setVar(VAR_EDEFAULT);
				return;
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				setTransientLinkTarget((TransientLink)null);
				return;
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				setTransientLinkSource((TransientLink)null);
				return;
			case TracemodelPackage.TRANSIENT_ELEMENT__VALUE:
				setValue((EObject)null);
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
			case TracemodelPackage.TRANSIENT_ELEMENT__VAR:
				return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET:
				return getTransientLinkTarget() != null;
			case TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE:
				return getTransientLinkSource() != null;
			case TracemodelPackage.TRANSIENT_ELEMENT__VALUE:
				return value != null;
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
		result.append(')');
		return result.toString();
	}

} //TransientElementImpl
