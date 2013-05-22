/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaFactory;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputpatternElementBinding;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.PrimitiveBinding;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.ResolveBinding;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel;
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Atl2javaPackageImpl extends EPackageImpl implements Atl2javaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPatternElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputpatternElementBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolveBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetModelEClass = null;

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
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Atl2javaPackageImpl() {
		super(eNS_URI, Atl2javaFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Atl2javaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Atl2javaPackage init() {
		if (isInited) return (Atl2javaPackage)EPackage.Registry.INSTANCE.getEPackage(Atl2javaPackage.eNS_URI);

		// Obtain or create and register package
		Atl2javaPackageImpl theAtl2javaPackage = (Atl2javaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Atl2javaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Atl2javaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAtl2javaPackage.createPackageContents();

		// Initialize created meta-data
		theAtl2javaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAtl2javaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Atl2javaPackage.eNS_URI, theAtl2javaPackage);
		return theAtl2javaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Transformation() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_InputPattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_OutputPattern() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_Rules() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_Name() {
		return (EAttribute)transformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_SourceModel() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_TargetModel() {
		return (EReference)transformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPattern() {
		return inputPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPattern_InputPatternElements() {
		return (EReference)inputPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPattern_Rule() {
		return (EReference)inputPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPattern() {
		return outputPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPattern_OutputPatternElements() {
		return (EReference)outputPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPattern_Rule() {
		return (EReference)outputPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPatternElement() {
		return inputPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputPatternElement_InputPattern() {
		return (EReference)inputPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPatternElement_Var() {
		return (EAttribute)inputPatternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputPatternElement_Type() {
		return (EAttribute)inputPatternElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPatternElement() {
		return outputPatternElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPatternElement_OuputPattern() {
		return (EReference)outputPatternElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputPatternElement_Bindings() {
		return (EReference)outputPatternElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPatternElement_Var() {
		return (EAttribute)outputPatternElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutputPatternElement_Type() {
		return (EAttribute)outputPatternElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_OutputPatternElement() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Feature() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Value() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Path() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Metamodel() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveBinding() {
		return primitiveBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationBinding() {
		return navigationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputpatternElementBinding() {
		return outputpatternElementBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolveBinding() {
		return resolveBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceModel() {
		return sourceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceModel_Transformation() {
		return (EReference)sourceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetModel() {
		return targetModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetModel_Transformation() {
		return (EReference)targetModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atl2javaFactory getAtl2javaFactory() {
		return (Atl2javaFactory)getEFactoryInstance();
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
		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NAME);
		createEReference(ruleEClass, RULE__TRANSFORMATION);
		createEReference(ruleEClass, RULE__INPUT_PATTERN);
		createEReference(ruleEClass, RULE__OUTPUT_PATTERN);

		transformationEClass = createEClass(TRANSFORMATION);
		createEReference(transformationEClass, TRANSFORMATION__RULES);
		createEAttribute(transformationEClass, TRANSFORMATION__NAME);
		createEReference(transformationEClass, TRANSFORMATION__SOURCE_MODEL);
		createEReference(transformationEClass, TRANSFORMATION__TARGET_MODEL);

		inputPatternEClass = createEClass(INPUT_PATTERN);
		createEReference(inputPatternEClass, INPUT_PATTERN__INPUT_PATTERN_ELEMENTS);
		createEReference(inputPatternEClass, INPUT_PATTERN__RULE);

		outputPatternEClass = createEClass(OUTPUT_PATTERN);
		createEReference(outputPatternEClass, OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS);
		createEReference(outputPatternEClass, OUTPUT_PATTERN__RULE);

		inputPatternElementEClass = createEClass(INPUT_PATTERN_ELEMENT);
		createEReference(inputPatternElementEClass, INPUT_PATTERN_ELEMENT__INPUT_PATTERN);
		createEAttribute(inputPatternElementEClass, INPUT_PATTERN_ELEMENT__VAR);
		createEAttribute(inputPatternElementEClass, INPUT_PATTERN_ELEMENT__TYPE);

		outputPatternElementEClass = createEClass(OUTPUT_PATTERN_ELEMENT);
		createEReference(outputPatternElementEClass, OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN);
		createEReference(outputPatternElementEClass, OUTPUT_PATTERN_ELEMENT__BINDINGS);
		createEAttribute(outputPatternElementEClass, OUTPUT_PATTERN_ELEMENT__VAR);
		createEAttribute(outputPatternElementEClass, OUTPUT_PATTERN_ELEMENT__TYPE);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__OUTPUT_PATTERN_ELEMENT);
		createEAttribute(bindingEClass, BINDING__FEATURE);
		createEAttribute(bindingEClass, BINDING__VALUE);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__PATH);
		createEAttribute(modelEClass, MODEL__NAME);
		createEAttribute(modelEClass, MODEL__METAMODEL);

		primitiveBindingEClass = createEClass(PRIMITIVE_BINDING);

		navigationBindingEClass = createEClass(NAVIGATION_BINDING);

		outputpatternElementBindingEClass = createEClass(OUTPUTPATTERN_ELEMENT_BINDING);

		resolveBindingEClass = createEClass(RESOLVE_BINDING);

		sourceModelEClass = createEClass(SOURCE_MODEL);
		createEReference(sourceModelEClass, SOURCE_MODEL__TRANSFORMATION);

		targetModelEClass = createEClass(TARGET_MODEL);
		createEReference(targetModelEClass, TARGET_MODEL__TRANSFORMATION);
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
		primitiveBindingEClass.getESuperTypes().add(this.getBinding());
		navigationBindingEClass.getESuperTypes().add(this.getBinding());
		outputpatternElementBindingEClass.getESuperTypes().add(this.getBinding());
		resolveBindingEClass.getESuperTypes().add(this.getBinding());
		sourceModelEClass.getESuperTypes().add(this.getModel());
		targetModelEClass.getESuperTypes().add(this.getModel());

		// Initialize classes and features; add operations and parameters
		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Transformation(), this.getTransformation(), this.getTransformation_Rules(), "transformation", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_InputPattern(), this.getInputPattern(), this.getInputPattern_Rule(), "inputPattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_OutputPattern(), this.getOutputPattern(), this.getOutputPattern_Rule(), "outputPattern", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransformation_Rules(), this.getRule(), this.getRule_Transformation(), "rules", null, 0, -1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_SourceModel(), this.getSourceModel(), this.getSourceModel_Transformation(), "sourceModel", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_TargetModel(), this.getTargetModel(), this.getTargetModel_Transformation(), "targetModel", null, 1, 1, Transformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPatternEClass, InputPattern.class, "InputPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPattern_InputPatternElements(), this.getInputPatternElement(), this.getInputPatternElement_InputPattern(), "inputPatternElements", null, 0, -1, InputPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputPattern_Rule(), this.getRule(), this.getRule_InputPattern(), "rule", null, 1, 1, InputPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPatternEClass, OutputPattern.class, "OutputPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPattern_OutputPatternElements(), this.getOutputPatternElement(), this.getOutputPatternElement_OuputPattern(), "outputPatternElements", null, 0, -1, OutputPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPattern_Rule(), this.getRule(), this.getRule_OutputPattern(), "rule", null, 1, 1, OutputPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPatternElementEClass, InputPatternElement.class, "InputPatternElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputPatternElement_InputPattern(), this.getInputPattern(), this.getInputPattern_InputPatternElements(), "inputPattern", null, 1, 1, InputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputPatternElement_Var(), ecorePackage.getEString(), "var", null, 1, 1, InputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputPatternElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, InputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputPatternElementEClass, OutputPatternElement.class, "OutputPatternElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputPatternElement_OuputPattern(), this.getOutputPattern(), this.getOutputPattern_OutputPatternElements(), "ouputPattern", null, 1, 1, OutputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputPatternElement_Bindings(), this.getBinding(), this.getBinding_OutputPatternElement(), "bindings", null, 0, -1, OutputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputPatternElement_Var(), ecorePackage.getEString(), "var", null, 1, 1, OutputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOutputPatternElement_Type(), ecorePackage.getEString(), "type", null, 1, 1, OutputPatternElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_OutputPatternElement(), this.getOutputPatternElement(), this.getOutputPatternElement_Bindings(), "outputPatternElement", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Feature(), ecorePackage.getEString(), "feature", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Value(), ecorePackage.getEString(), "value", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Path(), ecorePackage.getEString(), "path", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Metamodel(), ecorePackage.getEString(), "metamodel", null, 1, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveBindingEClass, PrimitiveBinding.class, "PrimitiveBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationBindingEClass, NavigationBinding.class, "NavigationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputpatternElementBindingEClass, OutputpatternElementBinding.class, "OutputpatternElementBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resolveBindingEClass, ResolveBinding.class, "ResolveBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceModelEClass, SourceModel.class, "SourceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceModel_Transformation(), this.getTransformation(), this.getTransformation_SourceModel(), "transformation", null, 1, 1, SourceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetModelEClass, TargetModel.class, "TargetModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetModel_Transformation(), this.getTransformation(), this.getTransformation_TargetModel(), "transformation", null, 1, 1, TargetModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Atl2javaPackageImpl
