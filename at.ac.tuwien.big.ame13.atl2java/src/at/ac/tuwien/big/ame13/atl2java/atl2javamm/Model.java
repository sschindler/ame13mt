/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getPath <em>Path</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getMetamodel <em>Metamodel</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getModel()
 * @model abstract="true"
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getModel_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getModel_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metamodel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metamodel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metamodel</em>' attribute.
	 * @see #setMetamodel(String)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getModel_Metamodel()
	 * @model required="true"
	 * @generated
	 */
	String getMetamodel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Model#getMetamodel <em>Metamodel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metamodel</em>' attribute.
	 * @see #getMetamodel()
	 * @generated
	 */
	void setMetamodel(String value);

} // Model
