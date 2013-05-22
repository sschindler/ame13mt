/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getRules <em>Rules</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getName <em>Name</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getSourceModel <em>Source Model</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getTargetModel <em>Target Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTransformation_Rules()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

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
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTransformation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Model</em>' containment reference.
	 * @see #setSourceModel(SourceModel)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTransformation_SourceModel()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel#getTransformation
	 * @model opposite="transformation" containment="true" required="true"
	 * @generated
	 */
	SourceModel getSourceModel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getSourceModel <em>Source Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Model</em>' containment reference.
	 * @see #getSourceModel()
	 * @generated
	 */
	void setSourceModel(SourceModel value);

	/**
	 * Returns the value of the '<em><b>Target Model</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Model</em>' containment reference.
	 * @see #setTargetModel(TargetModel)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTransformation_TargetModel()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel#getTransformation
	 * @model opposite="transformation" containment="true" required="true"
	 * @generated
	 */
	TargetModel getTargetModel();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getTargetModel <em>Target Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Model</em>' containment reference.
	 * @see #getTargetModel()
	 * @generated
	 */
	void setTargetModel(TargetModel value);

} // Transformation
