/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl;

import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transient Link Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkSetImpl#getTransientLinks <em>Transient Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransientLinkSetImpl extends EObjectImpl implements TransientLinkSet {
	/**
	 * The cached value of the '{@link #getTransientLinks() <em>Transient Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransientLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<TransientLink> transientLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientLinkSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemodelPackage.Literals.TRANSIENT_LINK_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransientLink> getTransientLinks() {
		if (transientLinks == null) {
			transientLinks = new EObjectContainmentWithInverseEList<TransientLink>(TransientLink.class, this, TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS, TracemodelPackage.TRANSIENT_LINK__LINK_SET);
		}
		return transientLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TransientLink getLinkBySourceElement(EObject object) {
		Iterator<TransientLink> tlIter = this.getTransientLinks().iterator();
		while(tlIter.hasNext()){
			TransientLink tlTemp = tlIter.next();
			Iterator<TransientElement> teIter2 = tlTemp.getSourceElements().iterator();
			while(teIter2.hasNext()){
				TransientElement teTemp = teIter2.next();
				if(teTemp.getValue().equals(object)){
					return tlTemp;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TransientLink getLinkByTargetElement(EObject object) {
		Iterator<TransientLink> tlIter = this.getTransientLinks().iterator();
		while(tlIter.hasNext()){
			TransientLink tlTemp = tlIter.next();
			Iterator<TransientElement> teIter2 = tlTemp.getTargetElements().iterator();
			while(teIter2.hasNext()){
				TransientElement teTemp = teIter2.next();
				if(teTemp.getValue().equals(object)){
					return tlTemp;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TransientLink> getLinksByRule(String rule) {

		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TransientLink getLinkBySourceElements(Map<String, EObject> objects) {
		Iterator<TransientLink> tlIter = this.getTransientLinks().iterator();
		while(tlIter.hasNext()){
			TransientLink tlTemp = tlIter.next();
			Iterator<TransientElement> teIter2 = tlTemp.getSourceElements().iterator();
			Iterator<Entry<String, EObject>> objIter = objects.entrySet().iterator();

			boolean match = false;
			if(objects.size() == tlTemp.getSourceElements().size()){
				match = true;
				while(teIter2.hasNext() & objIter.hasNext()){
					TransientElement teTemp = teIter2.next();
					EObject object = objIter.next().getValue();
					if(!teTemp.getValue().equals(object)){
						match = false;
						break;
					}
				}
			}
			if(match){
				return tlTemp;
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
			case TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransientLinks()).basicAdd(otherEnd, msgs);
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
			case TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS:
				return ((InternalEList<?>)getTransientLinks()).basicRemove(otherEnd, msgs);
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
			case TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS:
				return getTransientLinks();
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
			case TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS:
				getTransientLinks().clear();
				getTransientLinks().addAll((Collection<? extends TransientLink>)newValue);
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
			case TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS:
				getTransientLinks().clear();
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
			case TracemodelPackage.TRANSIENT_LINK_SET__TRANSIENT_LINKS:
				return transientLinks != null && !transientLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransientLinkSetImpl
