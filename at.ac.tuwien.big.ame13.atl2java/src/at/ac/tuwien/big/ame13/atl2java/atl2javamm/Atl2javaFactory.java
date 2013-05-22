/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage
 * @generated
 */
public interface Atl2javaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Atl2javaFactory eINSTANCE = at.ac.tuwien.big.ame13.atl2java.atl2javamm.impl.Atl2javaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation</em>'.
	 * @generated
	 */
	Transformation createTransformation();

	/**
	 * Returns a new object of class '<em>Input Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Pattern</em>'.
	 * @generated
	 */
	InputPattern createInputPattern();

	/**
	 * Returns a new object of class '<em>Output Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pattern</em>'.
	 * @generated
	 */
	OutputPattern createOutputPattern();

	/**
	 * Returns a new object of class '<em>Input Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Pattern Element</em>'.
	 * @generated
	 */
	InputPatternElement createInputPatternElement();

	/**
	 * Returns a new object of class '<em>Output Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Pattern Element</em>'.
	 * @generated
	 */
	OutputPatternElement createOutputPatternElement();

	/**
	 * Returns a new object of class '<em>Primitive Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Binding</em>'.
	 * @generated
	 */
	PrimitiveBinding createPrimitiveBinding();

	/**
	 * Returns a new object of class '<em>Navigation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Binding</em>'.
	 * @generated
	 */
	NavigationBinding createNavigationBinding();

	/**
	 * Returns a new object of class '<em>Outputpattern Element Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outputpattern Element Binding</em>'.
	 * @generated
	 */
	OutputpatternElementBinding createOutputpatternElementBinding();

	/**
	 * Returns a new object of class '<em>Resolve Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resolve Binding</em>'.
	 * @generated
	 */
	ResolveBinding createResolveBinding();

	/**
	 * Returns a new object of class '<em>Source Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source Model</em>'.
	 * @generated
	 */
	SourceModel createSourceModel();

	/**
	 * Returns a new object of class '<em>Target Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Model</em>'.
	 * @generated
	 */
	TargetModel createTargetModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Atl2javaPackage getAtl2javaPackage();

} //Atl2javaFactory
