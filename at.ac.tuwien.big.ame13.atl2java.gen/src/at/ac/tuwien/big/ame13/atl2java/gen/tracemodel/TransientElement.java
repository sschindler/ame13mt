/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transient Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getVar <em>Var</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkTarget <em>Transient Link Target</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkSource <em>Transient Link Source</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientElement()
 * @model
 * @generated
 */
public interface TransientElement extends EObject {
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
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientElement_Var()
	 * @model required="true"
	 * @generated
	 */
	String getVar();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getVar <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var</em>' attribute.
	 * @see #getVar()
	 * @generated
	 */
	void setVar(String value);

	/**
	 * Returns the value of the '<em><b>Transient Link Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Link Target</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Link Target</em>' container reference.
	 * @see #setTransientLinkTarget(TransientLink)
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientElement_TransientLinkTarget()
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getTargetElements
	 * @model opposite="targetElements" transient="false"
	 * @generated
	 */
	TransientLink getTransientLinkTarget();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkTarget <em>Transient Link Target</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Link Target</em>' container reference.
	 * @see #getTransientLinkTarget()
	 * @generated
	 */
	void setTransientLinkTarget(TransientLink value);

	/**
	 * Returns the value of the '<em><b>Transient Link Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Link Source</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Link Source</em>' container reference.
	 * @see #setTransientLinkSource(TransientLink)
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientElement_TransientLinkSource()
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getSourceElements
	 * @model opposite="sourceElements" transient="false"
	 * @generated
	 */
	TransientLink getTransientLinkSource();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkSource <em>Transient Link Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient Link Source</em>' container reference.
	 * @see #getTransientLinkSource()
	 * @generated
	 */
	void setTransientLinkSource(TransientLink value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EObject)
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientElement_Value()
	 * @model required="true"
	 * @generated
	 */
	EObject getValue();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EObject value);

} // TransientElement
