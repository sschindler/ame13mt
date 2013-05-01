/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Atl2javaFactoryImpl extends EFactoryImpl implements Atl2javaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Atl2javaFactory init() {
		try {
			Atl2javaFactory theAtl2javaFactory = (Atl2javaFactory)EPackage.Registry.INSTANCE.getEFactory("http://atl2java.ame13.big.tuwien.ac.at/1.0"); 
			if (theAtl2javaFactory != null) {
				return theAtl2javaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Atl2javaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atl2javaFactoryImpl() {
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
			case Atl2javaPackage.RULE: return createRule();
			case Atl2javaPackage.TRANSFORMATION: return createTransformation();
			case Atl2javaPackage.INPUT_PATTERN: return createInputPattern();
			case Atl2javaPackage.OUTPUT_PATTERN: return createOutputPattern();
			case Atl2javaPackage.INPUT_PATTERN_ELEMENT: return createInputPatternElement();
			case Atl2javaPackage.OUTPUT_PATTERN_ELEMENT: return createOutputPatternElement();
			case Atl2javaPackage.FILTER: return createFilter();
			case Atl2javaPackage.BINDING: return createBinding();
			case Atl2javaPackage.MODEL: return createModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPattern createInputPattern() {
		InputPatternImpl inputPattern = new InputPatternImpl();
		return inputPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPattern createOutputPattern() {
		OutputPatternImpl outputPattern = new OutputPatternImpl();
		return outputPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPatternElement createInputPatternElement() {
		InputPatternElementImpl inputPatternElement = new InputPatternElementImpl();
		return inputPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPatternElement createOutputPatternElement() {
		OutputPatternElementImpl outputPatternElement = new OutputPatternElementImpl();
		return outputPatternElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atl2javaPackage getAtl2javaPackage() {
		return (Atl2javaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Atl2javaPackage getPackage() {
		return Atl2javaPackage.eINSTANCE;
	}

} //Atl2javaFactoryImpl
