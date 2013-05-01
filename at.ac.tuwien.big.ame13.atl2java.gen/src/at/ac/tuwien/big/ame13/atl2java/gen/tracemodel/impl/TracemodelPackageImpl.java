/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelFactory;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TracemodelPackageImpl extends EPackageImpl implements TracemodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientLinkSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TracemodelPackageImpl() {
		super(eNS_URI, TracemodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TracemodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TracemodelPackage init() {
		if (isInited) return (TracemodelPackage)EPackage.Registry.INSTANCE.getEPackage(TracemodelPackage.eNS_URI);

		// Obtain or create and register package
		TracemodelPackageImpl theTracemodelPackage = (TracemodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TracemodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TracemodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTracemodelPackage.createPackageContents();

		// Initialize created meta-data
		theTracemodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTracemodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TracemodelPackage.eNS_URI, theTracemodelPackage);
		return theTracemodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransientLinkSet() {
		return transientLinkSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientLinkSet_TransientLinks() {
		return (EReference)transientLinkSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransientLink() {
		return transientLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientLink_LinkSet() {
		return (EReference)transientLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientLink_TargetElements() {
		return (EReference)transientLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientLink_SourceElements() {
		return (EReference)transientLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransientElement() {
		return transientElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransientElement_Var() {
		return (EAttribute)transientElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientElement_TransientLinkTarget() {
		return (EReference)transientElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientElement_TransientLinkSource() {
		return (EReference)transientElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransientElement_Value() {
		return (EReference)transientElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracemodelFactory getTracemodelFactory() {
		return (TracemodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transientLinkSetEClass = createEClass(TRANSIENT_LINK_SET);
		createEReference(transientLinkSetEClass, TRANSIENT_LINK_SET__TRANSIENT_LINKS);

		transientLinkEClass = createEClass(TRANSIENT_LINK);
		createEReference(transientLinkEClass, TRANSIENT_LINK__LINK_SET);
		createEReference(transientLinkEClass, TRANSIENT_LINK__TARGET_ELEMENTS);
		createEReference(transientLinkEClass, TRANSIENT_LINK__SOURCE_ELEMENTS);

		transientElementEClass = createEClass(TRANSIENT_ELEMENT);
		createEAttribute(transientElementEClass, TRANSIENT_ELEMENT__VAR);
		createEReference(transientElementEClass, TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET);
		createEReference(transientElementEClass, TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE);
		createEReference(transientElementEClass, TRANSIENT_ELEMENT__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(transientLinkSetEClass, TransientLinkSet.class, "TransientLinkSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransientLinkSet_TransientLinks(), this.getTransientLink(), this.getTransientLink_LinkSet(), "transientLinks", null, 0, -1, TransientLinkSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(transientLinkSetEClass, this.getTransientLink(), "getLinkBySourceElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transientLinkSetEClass, this.getTransientLink(), "getLinkByTargetElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transientLinkSetEClass, this.getTransientLink(), "getLinksByRule", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "rule", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transientLinkSetEClass, this.getTransientLink(), "getLinkBySourceElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "objects", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transientLinkEClass, TransientLink.class, "TransientLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransientLink_LinkSet(), this.getTransientLinkSet(), this.getTransientLinkSet_TransientLinks(), "linkSet", null, 1, 1, TransientLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransientLink_TargetElements(), this.getTransientElement(), this.getTransientElement_TransientLinkTarget(), "targetElements", null, 0, -1, TransientLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransientLink_SourceElements(), this.getTransientElement(), this.getTransientElement_TransientLinkSource(), "sourceElements", null, 0, -1, TransientLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(transientLinkEClass, ecorePackage.getEObject(), "getTargetFromSource", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transientLinkEClass, ecorePackage.getEObject(), "getSourceFromTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "object", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transientLinkEClass, ecorePackage.getEObject(), "getSourceElementByVar", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "var", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(transientLinkEClass, ecorePackage.getEObject(), "getTargetElementByVar", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "var", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transientElementEClass, TransientElement.class, "TransientElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransientElement_Var(), ecorePackage.getEString(), "var", null, 1, 1, TransientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransientElement_TransientLinkTarget(), this.getTransientLink(), this.getTransientLink_TargetElements(), "transientLinkTarget", null, 0, 1, TransientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransientElement_TransientLinkSource(), this.getTransientLink(), this.getTransientLink_SourceElements(), "transientLinkSource", null, 0, 1, TransientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransientElement_Value(), ecorePackage.getEObject(), null, "value", null, 1, 1, TransientElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TracemodelPackageImpl
