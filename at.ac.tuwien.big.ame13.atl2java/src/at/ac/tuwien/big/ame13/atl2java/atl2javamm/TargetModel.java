/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTargetModel()
 * @model
 * @generated
 */
public interface TargetModel extends Model {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getTargetModel <em>Target Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getTargetModel_Transformation()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getTargetModel
	 * @model opposite="targetModel" required="true" transient="false"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.TargetModel#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

} // TargetModel
