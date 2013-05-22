/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm.util;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage
 * @generated
 */
public class Atl2javaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Atl2javaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atl2javaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Atl2javaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Atl2javaSwitch<Adapter> modelSwitch =
		new Atl2javaSwitch<Adapter>() {
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseTransformation(Transformation object) {
				return createTransformationAdapter();
			}
			@Override
			public Adapter caseInputPattern(InputPattern object) {
				return createInputPatternAdapter();
			}
			@Override
			public Adapter caseOutputPattern(OutputPattern object) {
				return createOutputPatternAdapter();
			}
			@Override
			public Adapter caseInputPatternElement(InputPatternElement object) {
				return createInputPatternElementAdapter();
			}
			@Override
			public Adapter caseOutputPatternElement(OutputPatternElement object) {
				return createOutputPatternElementAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter casePrimitiveBinding(PrimitiveBinding object) {
				return createPrimitiveBindingAdapter();
			}
			@Override
			public Adapter caseNavigationBinding(NavigationBinding object) {
				return createNavigationBindingAdapter();
			}
			@Override
			public Adapter caseOutputpatternElementBinding(OutputpatternElementBinding object) {
				return createOutputpatternElementBindingAdapter();
			}
			@Override
			public Adapter caseResolveBinding(ResolveBinding object) {
				return createResolveBindingAdapter();
			}
			@Override
			public Adapter caseSourceModel(SourceModel object) {
				return createSourceModelAdapter();
			}
			@Override
			public Adapter caseTargetModel(TargetModel object) {
				return createTargetModelAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation
	 * @generated
	 */
	public Adapter createTransformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern <em>Input Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPattern
	 * @generated
	 */
	public Adapter createInputPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern <em>Output Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern
	 * @generated
	 */
	public Adapter createOutputPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement <em>Input Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement
	 * @generated
	 */
	public Adapter createInputPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement <em>Output Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement
	 * @generated
	 */
	public Adapter createOutputPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.PrimitiveBinding <em>Primitive Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.PrimitiveBinding
	 * @generated
	 */
	public Adapter createPrimitiveBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding <em>Navigation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding
	 * @generated
	 */
	public Adapter createNavigationBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputpatternElementBinding <em>Outputpattern Element Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputpatternElementBinding
	 * @generated
	 */
	public Adapter createOutputpatternElementBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.ResolveBinding <em>Resolve Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.ResolveBinding
	 * @generated
	 */
	public Adapter createResolveBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel
	 * @generated
	 */
	public Adapter createSourceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel
	 * @generated
	 */
	public Adapter createTargetModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Atl2javaAdapterFactory
