/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding#getInputPatternElement <em>Input Pattern Element</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getNavigationBinding()
 * @model
 * @generated
 */
public interface NavigationBinding extends Binding {
	/**
	 * Returns the value of the '<em><b>Input Pattern Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Pattern Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Pattern Element</em>' reference.
	 * @see #setInputPatternElement(InputPatternElement)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getNavigationBinding_InputPatternElement()
	 * @model required="true"
	 * @generated
	 */
	InputPatternElement getInputPatternElement();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding#getInputPatternElement <em>Input Pattern Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Pattern Element</em>' reference.
	 * @see #getInputPatternElement()
	 * @generated
	 */
	void setInputPatternElement(InputPatternElement value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getNavigationBinding_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // NavigationBinding
