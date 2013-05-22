/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Pattern Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getOuputPattern <em>Ouput Pattern</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getBindings <em>Bindings</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getVar <em>Var</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getOutputPatternElement()
 * @model
 * @generated
 */
public interface OutputPatternElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Ouput Pattern</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern#getOutputPatternElements <em>Output Pattern Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ouput Pattern</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ouput Pattern</em>' container reference.
	 * @see #setOuputPattern(OutputPattern)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getOutputPatternElement_OuputPattern()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPattern#getOutputPatternElements
	 * @model opposite="outputPatternElements" required="true" transient="false"
	 * @generated
	 */
	OutputPattern getOuputPattern();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getOuputPattern <em>Ouput Pattern</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ouput Pattern</em>' container reference.
	 * @see #getOuputPattern()
	 * @generated
	 */
	void setOuputPattern(OutputPattern value);

	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getOutputPatternElement <em>Output Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getOutputPatternElement_Bindings()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding#getOutputPatternElement
	 * @model opposite="outputPatternElement" containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var</em>' attribute.
	 * @see #setVar(String)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getOutputPatternElement_Var()
	 * @model required="true"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getOutputPatternElement_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // OutputPatternElement
