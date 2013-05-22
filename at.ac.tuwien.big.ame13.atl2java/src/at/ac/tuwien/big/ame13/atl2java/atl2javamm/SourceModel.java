/**
 */
package at.ac.tuwien.big.ame13.atl2java.atl2javamm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel#getTransformation <em>Transformation</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getSourceModel()
 * @model
 * @generated
 */
public interface SourceModel extends Model {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getSourceModel <em>Source Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Atl2javaPackage#getSourceModel_Transformation()
	 * @see at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation#getSourceModel
	 * @model opposite="sourceModel" required="true" transient="false"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.atl2javamm.SourceModel#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

} // SourceModel
