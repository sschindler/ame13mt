/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.*;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracemodelFactoryImpl extends EFactoryImpl implements TracemodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TracemodelFactory init() {
		try {
			TracemodelFactory theTracemodelFactory = (TracemodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://tracemodel/1.0"); 
			if (theTracemodelFactory != null) {
				return theTracemodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TracemodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TracemodelPackage.TRANSIENT_LINK_SET: return createTransientLinkSet();
			case TracemodelPackage.TRANSIENT_LINK: return createTransientLink();
			case TracemodelPackage.TRANSIENT_ELEMENT: return createTransientElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientLinkSet createTransientLinkSet() {
		TransientLinkSetImpl transientLinkSet = new TransientLinkSetImpl();
		return transientLinkSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientLink createTransientLink() {
		TransientLinkImpl transientLink = new TransientLinkImpl();
		return transientLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientElement createTransientElement() {
		TransientElementImpl transientElement = new TransientElementImpl();
		return transientElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemodelPackage getTracemodelPackage() {
		return (TracemodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TracemodelPackage getPackage() {
		return TracemodelPackage.eINSTANCE;
	}

} //TracemodelFactoryImpl
