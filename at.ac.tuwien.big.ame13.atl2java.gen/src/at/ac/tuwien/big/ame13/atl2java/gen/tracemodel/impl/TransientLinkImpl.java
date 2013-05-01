/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transient Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl#getLinkSet <em>Link Set</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl#getTargetElements <em>Target Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl#getSourceElements <em>Source Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransientLinkImpl extends EObjectImpl implements TransientLink {
	/**
	 * The cached value of the '{@link #getTargetElements() <em>Target Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientElement> targetElements;

	/**
	 * The cached value of the '{@link #getSourceElements() <em>Source Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceElements()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientElement> sourceElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.TRANSIENT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientLinkSet getLinkSet() {
		if (eContainerFeatureID() != TracemodelPackage.TRANSIENT_LINK__LINK_SET) return null;
		return (TransientLinkSet)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinkSet(TransientLinkSet newLinkSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLinkSet, TracemodelPackage.TRANSIENT_LINK__LINK_SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkSet(TransientLinkSet newLinkSet) {
		if (newLinkSet != eInternalContainer() || (eContainerFeatureID() != TracemodelPackage.TRANSIENT_LINK__LINK_SET && newLinkSet != null)) {
			if (EcoreUtil.isAncestor(this, newLinkSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLinkSet != null)
				msgs = ((InternalEObject)newLinkSet).eInverseAdd(this, TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS, TransientLinkSet.class, msgs);
			msgs = basicSetLinkSet(newLinkSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemodelPackage.TRANSIENT_LINK__LINK_SET, newLinkSet, newLinkSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientElement> getTargetElements() {
		if (targetElements == null) {
			targetElements = new EObjectContainmentWithInverseEList<TransientElement>(TransientElement.class, this, TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS, TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET);
		}
		return targetElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientElement> getSourceElements() {
		if (sourceElements == null) {
			sourceElements = new EObjectContainmentWithInverseEList<TransientElement>(TransientElement.class, this, TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS, TracemodelPackage.TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE);
		}
		return sourceElements;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getTargetFromSource(EObject object) {
		Iterator<TransientElement> teIter2 = this.getTargetElements().iterator();
		while(teIter2.hasNext()){
			TransientElement teTemp = teIter2.next();
			if(teTemp.getValue().equals(object)){
				return this.getSourceElements().get(0).getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSourceFromTarget(EObject object) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getSourceElementByVar(String var) {
		Iterator<TransientElement> teIter2 = this.getSourceElements().iterator();
		while(teIter2.hasNext()){
			TransientElement teTemp = teIter2.next();
			if(teTemp.getValue().equals(var)){
				return teTemp.getValue();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EObject getTargetElementByVar(String var) {
		Iterator<TransientElement> teIter2 = this.getTargetElements().iterator();
		while(teIter2.hasNext()){
			TransientElement teTemp = teIter2.next();
			if(teTemp.getValue().equals(var)){
				return teTemp.getValue();
			}
		}
		return null;
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLinkSet((TransientLinkSet)otherEnd, msgs);
			case TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetElements()).basicAdd(otherEnd, msgs);
			case TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceElements()).basicAdd(otherEnd, msgs);
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				return basicSetLinkSet(null, msgs);
			case TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS:
				return ((InternalEList<?>)getTargetElements()).basicRemove(otherEnd, msgs);
			case TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS:
				return ((InternalEList<?>)getSourceElements()).basicRemove(otherEnd, msgs);
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				return eInternalContainer().eInverseRemove(this, TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS, TransientLinkSet.class, msgs);
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				return getLinkSet();
			case TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS:
				return getTargetElements();
			case TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS:
				return getSourceElements();
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				setLinkSet((TransientLinkSet)newValue);
				return;
			case TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS:
				getTargetElements().clear();
				getTargetElements().addAll((Collection<? extends TransientElement>)newValue);
				return;
			case TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS:
				getSourceElements().clear();
				getSourceElements().addAll((Collection<? extends TransientElement>)newValue);
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				setLinkSet((TransientLinkSet)null);
				return;
			case TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS:
				getTargetElements().clear();
				return;
			case TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS:
				getSourceElements().clear();
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
			case TracemodelPackage.TRANSIENT_LINK__LINK_SET:
				return getLinkSet() != null;
			case TracemodelPackage.TRANSIENT_LINK__TARGET_ELEMENTS:
				return targetElements != null && !targetElements.isEmpty();
			case TracemodelPackage.TRANSIENT_LINK__SOURCE_ELEMENTS:
				return sourceElements != null && !sourceElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransientLinkImpl
