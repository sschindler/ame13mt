/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transient Link Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet#getTransientLinks <em>Transient Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientLinkSet()
 * @model
 * @generated
 */
public interface TransientLinkSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Transient Links</b></em>' containment reference list.
	 * The list contents are of type {@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink}.
	 * It is bidirectional and its opposite is '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getLinkSet <em>Link Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient Links</em>' containment reference list.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelPackage#getTransientLinkSet_TransientLinks()
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getLinkSet
	 * @model opposite="linkSet" containment="true"
	 * @generated
	 */
	EList<TransientLink> getTransientLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TransientLink getLinkBySourceElement(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TransientLink getLinkByTargetElement(EObject object);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ruleRequired="true"
	 * @generated
	 */
	EList<TransientLink> getLinksByRule(String rule);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	TransientLink getLinkBySourceElements(Map<String, EObject> objects);

} // TransientLinkSet
