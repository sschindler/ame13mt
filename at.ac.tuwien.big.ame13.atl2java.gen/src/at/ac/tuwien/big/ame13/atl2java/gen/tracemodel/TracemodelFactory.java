/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage
 * @generated
 */
public interface TracemodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemodelFactory eINSTANCE = at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transient Link Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Link Set</em>'.
	 * @generated
	 */
	TransientLinkSet createTransientLinkSet();

	/**
	 * Returns a new object of class '<em>Transient Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Link</em>'.
	 * @generated
	 */
	TransientLink createTransientLink();

	/**
	 * Returns a new object of class '<em>Transient Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Element</em>'.
	 * @generated
	 */
	TransientElement createTransientElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TracemodelPackage getTracemodelPackage();

} //TracemodelFactory
