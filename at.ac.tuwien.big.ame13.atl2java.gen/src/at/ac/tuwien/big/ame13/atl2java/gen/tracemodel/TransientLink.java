/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transient Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getLinkSet <em>Link Set</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getTargetElements <em>Target Elements</em>}</li>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getSourceElements <em>Source Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientLink()
 * @model
 * @generated
 */
public interface TransientLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Link Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet#getTransientLinks <em>Transient Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Set</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Set</em>' container reference.
	 * @see #setLinkSet(TransientLinkSet)
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientLink_LinkSet()
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet#getTransientLinks
	 * @model opposite="transientLinks" required="true" transient="false"
	 * @generated
	 */
	TransientLinkSet getLinkSet();

	/**
	 * Sets the value of the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getLinkSet <em>Link Set</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Set</em>' container reference.
	 * @see #getLinkSet()
	 * @generated
	 */
	void setLinkSet(TransientLinkSet value);

	/**
	 * Returns the value of the '<em><b>Target Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkTarget <em>Transient Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientLink_TargetElements()
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkTarget
	 * @model opposite="transientLinkTarget" containment="true"
	 * @generated
	 */
	EList<TransientElement> getTargetElements();

	/**
	 * Returns the value of the '<em><b>Source Elements</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkSource <em>Transient Link Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Elements</em>' containment reference list.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientLink_SourceElements()
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkSource
	 * @model opposite="transientLinkSource" containment="true"
	 * @generated
	 */
	EList<TransientElement> getSourceElements();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	EObject getTargetFromSource(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model objectRequired="true"
	 * @generated
	 */
	EObject getSourceFromTarget(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" varRequired="true"
	 * @generated
	 */
	EObject getSourceElementByVar(String var);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model varRequired="true"
	 * @generated
	 */
	EObject getTargetElementByVar(String var);

} // TransientLink
