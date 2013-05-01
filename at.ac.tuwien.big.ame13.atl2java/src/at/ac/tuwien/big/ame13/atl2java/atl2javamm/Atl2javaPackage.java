/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaFactory
 * @model kind="package"
 * @generated
 */
public interface Atl2javaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "atl2javamm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://atl2java.ame13.big.tuwien.ac.at/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "atl2java";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Atl2javaPackage eINSTANCE = at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Input Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INPUT_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Output Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OUTPUT_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ABSTRACT = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RULES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Source Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SOURCE_MODELS = 2;

	/**
	 * The feature id for the '<em><b>Target Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TARGET_MODELS = 3;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternImpl <em>Input Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getInputPattern()
	 * @generated
	 */
	int INPUT_PATTERN = 2;

	/**
	 * The feature id for the '<em><b>Input Pattern Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN__INPUT_PATTERN_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN__RULE = 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN__FILTER = 2;

	/**
	 * The number of structural features of the '<em>Input Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternImpl <em>Output Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getOutputPattern()
	 * @generated
	 */
	int OUTPUT_PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Output Pattern Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN__RULE = 1;

	/**
	 * The number of structural features of the '<em>Output Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl <em>Input Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getInputPatternElement()
	 * @generated
	 */
	int INPUT_PATTERN_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Input Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN_ELEMENT__INPUT_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN_ELEMENT__VAR = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN_ELEMENT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN_ELEMENT__MODEL = 3;

	/**
	 * The number of structural features of the '<em>Input Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PATTERN_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl <em>Output Pattern Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getOutputPatternElement()
	 * @generated
	 */
	int OUTPUT_PATTERN_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Ouput Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ELEMENT__BINDINGS = 1;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ELEMENT__VAR = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ELEMENT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ELEMENT__MODEL = 4;

	/**
	 * The number of structural features of the '<em>Output Pattern Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PATTERN_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.FilterImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 6;

	/**
	 * The feature id for the '<em><b>Input Pattern</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__INPUT_PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.BindingImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 7;

	/**
	 * The feature id for the '<em><b>Output Pattern Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OUTPUT_PATTERN_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Transformation Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TRANSFORMATION_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Transformation Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__TRANSFORMATION_TARGET = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getTransformation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Transformation();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getInputPattern <em>Input Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getInputPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_InputPattern();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getOutputPattern <em>Output Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getOutputPattern()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_OutputPattern();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#isAbstract()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Abstract();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getRules()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Rules();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getName()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getSourceModels <em>Source Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Models</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getSourceModels()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_SourceModels();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getTargetModels <em>Target Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Models</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getTargetModels()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_TargetModels();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern <em>Input Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern
	 * @generated
	 */
	EClass getInputPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern#getInputPatternElements <em>Input Pattern Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Pattern Elements</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern#getInputPatternElements()
	 * @see #getInputPattern()
	 * @generated
	 */
	EReference getInputPattern_InputPatternElements();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern#getRule()
	 * @see #getInputPattern()
	 * @generated
	 */
	EReference getInputPattern_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern#getFilter()
	 * @see #getInputPattern()
	 * @generated
	 */
	EReference getInputPattern_Filter();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern <em>Output Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern
	 * @generated
	 */
	EClass getOutputPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern#getOutputPatternElements <em>Output Pattern Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Pattern Elements</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern#getOutputPatternElements()
	 * @see #getOutputPattern()
	 * @generated
	 */
	EReference getOutputPattern_OutputPatternElements();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern#getRule()
	 * @see #getOutputPattern()
	 * @generated
	 */
	EReference getOutputPattern_Rule();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement <em>Input Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Pattern Element</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement
	 * @generated
	 */
	EClass getInputPatternElement();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getInputPattern <em>Input Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Input Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getInputPattern()
	 * @see #getInputPatternElement()
	 * @generated
	 */
	EReference getInputPatternElement_InputPattern();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getVar()
	 * @see #getInputPatternElement()
	 * @generated
	 */
	EAttribute getInputPatternElement_Var();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getType()
	 * @see #getInputPatternElement()
	 * @generated
	 */
	EAttribute getInputPatternElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement#getModel()
	 * @see #getInputPatternElement()
	 * @generated
	 */
	EAttribute getInputPatternElement_Model();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement <em>Output Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Pattern Element</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement
	 * @generated
	 */
	EClass getOutputPatternElement();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getOuputPattern <em>Ouput Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Ouput Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getOuputPattern()
	 * @see #getOutputPatternElement()
	 * @generated
	 */
	EReference getOutputPatternElement_OuputPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getBindings()
	 * @see #getOutputPatternElement()
	 * @generated
	 */
	EReference getOutputPatternElement_Bindings();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getVar()
	 * @see #getOutputPatternElement()
	 * @generated
	 */
	EAttribute getOutputPatternElement_Var();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getType()
	 * @see #getOutputPatternElement()
	 * @generated
	 */
	EAttribute getOutputPatternElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getModel()
	 * @see #getOutputPatternElement()
	 * @generated
	 */
	EAttribute getOutputPatternElement_Model();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Filter#getInputPattern <em>Input Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Input Pattern</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Filter#getInputPattern()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_InputPattern();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Filter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Filter#getExpression()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_Expression();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getOutputPatternElement <em>Output Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Output Pattern Element</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getOutputPatternElement()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_OutputPatternElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getFeature()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Feature();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getValue()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_Value();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getPath()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Path();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metamodel</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getMetamodel()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Metamodel();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getTransformationSource <em>Transformation Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation Source</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getTransformationSource()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_TransformationSource();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getTransformationTarget <em>Transformation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation Target</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getTransformationTarget()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_TransformationTarget();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Atl2javaFactory getAtl2javaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.RuleImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TRANSFORMATION = eINSTANCE.getRule_Transformation();

		/**
		 * The meta object literal for the '<em><b>Input Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__INPUT_PATTERN = eINSTANCE.getRule_InputPattern();

		/**
		 * The meta object literal for the '<em><b>Output Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OUTPUT_PATTERN = eINSTANCE.getRule_OutputPattern();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ABSTRACT = eINSTANCE.getRule_Abstract();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.TransformationImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RULES = eINSTANCE.getTransformation_Rules();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Source Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__SOURCE_MODELS = eINSTANCE.getTransformation_SourceModels();

		/**
		 * The meta object literal for the '<em><b>Target Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__TARGET_MODELS = eINSTANCE.getTransformation_TargetModels();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternImpl <em>Input Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getInputPattern()
		 * @generated
		 */
		EClass INPUT_PATTERN = eINSTANCE.getInputPattern();

		/**
		 * The meta object literal for the '<em><b>Input Pattern Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PATTERN__INPUT_PATTERN_ELEMENTS = eINSTANCE.getInputPattern_InputPatternElements();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PATTERN__RULE = eINSTANCE.getInputPattern_Rule();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PATTERN__FILTER = eINSTANCE.getInputPattern_Filter();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternImpl <em>Output Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getOutputPattern()
		 * @generated
		 */
		EClass OUTPUT_PATTERN = eINSTANCE.getOutputPattern();

		/**
		 * The meta object literal for the '<em><b>Output Pattern Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN__OUTPUT_PATTERN_ELEMENTS = eINSTANCE.getOutputPattern_OutputPatternElements();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN__RULE = eINSTANCE.getOutputPattern_Rule();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl <em>Input Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.InputPatternElementImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getInputPatternElement()
		 * @generated
		 */
		EClass INPUT_PATTERN_ELEMENT = eINSTANCE.getInputPatternElement();

		/**
		 * The meta object literal for the '<em><b>Input Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_PATTERN_ELEMENT__INPUT_PATTERN = eINSTANCE.getInputPatternElement_InputPattern();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PATTERN_ELEMENT__VAR = eINSTANCE.getInputPatternElement_Var();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PATTERN_ELEMENT__TYPE = eINSTANCE.getInputPatternElement_Type();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT_PATTERN_ELEMENT__MODEL = eINSTANCE.getInputPatternElement_Model();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl <em>Output Pattern Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.OutputPatternElementImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getOutputPatternElement()
		 * @generated
		 */
		EClass OUTPUT_PATTERN_ELEMENT = eINSTANCE.getOutputPatternElement();

		/**
		 * The meta object literal for the '<em><b>Ouput Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN_ELEMENT__OUPUT_PATTERN = eINSTANCE.getOutputPatternElement_OuputPattern();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_PATTERN_ELEMENT__BINDINGS = eINSTANCE.getOutputPatternElement_Bindings();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PATTERN_ELEMENT__VAR = eINSTANCE.getOutputPatternElement_Var();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PATTERN_ELEMENT__TYPE = eINSTANCE.getOutputPatternElement_Type();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_PATTERN_ELEMENT__MODEL = eINSTANCE.getOutputPatternElement_Model();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.FilterImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Input Pattern</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__INPUT_PATTERN = eINSTANCE.getFilter_InputPattern();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__EXPRESSION = eINSTANCE.getFilter_Expression();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.BindingImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Output Pattern Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__OUTPUT_PATTERN_ELEMENT = eINSTANCE.getBinding_OutputPatternElement();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__FEATURE = eINSTANCE.getBinding_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__VALUE = eINSTANCE.getBinding_Value();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.ModelImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__PATH = eINSTANCE.getModel_Path();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__METAMODEL = eINSTANCE.getModel_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Transformation Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TRANSFORMATION_SOURCE = eINSTANCE.getModel_TransformationSource();

		/**
		 * The meta object literal for the '<em><b>Transformation Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__TRANSFORMATION_TARGET = eINSTANCE.getModel_TransformationTarget();

	}

} //Atl2javaPackage
