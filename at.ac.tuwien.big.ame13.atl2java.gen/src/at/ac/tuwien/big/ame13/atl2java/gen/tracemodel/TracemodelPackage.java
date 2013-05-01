/**
 */
package at.ac.tuwien.big.ame13.atl2java.gen.tracemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelFactory
 * @model kind="package"
 * @generated
 */
public interface TracemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tracemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://tracemodel/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TracemodelPackage eINSTANCE = at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkSetImpl <em>Transient Link Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkSetImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl#getTransientLinkSet()
	 * @generated
	 */
	int TRANSIENT_LINK_SET = 0;

	/**
	 * The feature id for the '<em><b>Transient Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_LINK_SET__TRANSIENT_LINKS = 0;

	/**
	 * The number of structural features of the '<em>Transient Link Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_LINK_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl <em>Transient Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl#getTransientLink()
	 * @generated
	 */
	int TRANSIENT_LINK = 1;

	/**
	 * The feature id for the '<em><b>Link Set</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_LINK__LINK_SET = 0;

	/**
	 * The feature id for the '<em><b>Target Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_LINK__TARGET_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Source Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_LINK__SOURCE_ELEMENTS = 2;

	/**
	 * The number of structural features of the '<em>Transient Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_LINK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl <em>Transient Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl#getTransientElement()
	 * @generated
	 */
	int TRANSIENT_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_ELEMENT__VAR = 0;

	/**
	 * The feature id for the '<em><b>Transient Link Target</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET = 1;

	/**
	 * The feature id for the '<em><b>Transient Link Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_ELEMENT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>Transient Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_ELEMENT_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet <em>Transient Link Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient Link Set</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet
	 * @generated
	 */
	EClass getTransientLinkSet();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet#getTransientLinks <em>Transient Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transient Links</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet#getTransientLinks()
	 * @see #getTransientLinkSet()
	 * @generated
	 */
	EReference getTransientLinkSet_TransientLinks();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink <em>Transient Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient Link</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink
	 * @generated
	 */
	EClass getTransientLink();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getLinkSet <em>Link Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Link Set</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getLinkSet()
	 * @see #getTransientLink()
	 * @generated
	 */
	EReference getTransientLink_LinkSet();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getTargetElements <em>Target Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Elements</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getTargetElements()
	 * @see #getTransientLink()
	 * @generated
	 */
	EReference getTransientLink_TargetElements();

	/**
	 * Returns the meta object for the containment reference list '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getSourceElements <em>Source Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Elements</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink#getSourceElements()
	 * @see #getTransientLink()
	 * @generated
	 */
	EReference getTransientLink_SourceElements();

	/**
	 * Returns the meta object for class '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement <em>Transient Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient Element</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement
	 * @generated
	 */
	EClass getTransientElement();

	/**
	 * Returns the meta object for the attribute '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getVar()
	 * @see #getTransientElement()
	 * @generated
	 */
	EAttribute getTransientElement_Var();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkTarget <em>Transient Link Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transient Link Target</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkTarget()
	 * @see #getTransientElement()
	 * @generated
	 */
	EReference getTransientElement_TransientLinkTarget();

	/**
	 * Returns the meta object for the container reference '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkSource <em>Transient Link Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transient Link Source</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getTransientLinkSource()
	 * @see #getTransientElement()
	 * @generated
	 */
	EReference getTransientElement_TransientLinkSource();

	/**
	 * Returns the meta object for the reference '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement#getValue()
	 * @see #getTransientElement()
	 * @generated
	 */
	EReference getTransientElement_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TracemodelFactory getTracemodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkSetImpl <em>Transient Link Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkSetImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl#getTransientLinkSet()
		 * @generated
		 */
		EClass TRANSIENT_LINK_SET = eINSTANCE.getTransientLinkSet();

		/**
		 * The meta object literal for the '<em><b>Transient Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_LINK_SET__TRANSIENT_LINKS = eINSTANCE.getTransientLinkSet_TransientLinks();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl <em>Transient Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientLinkImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl#getTransientLink()
		 * @generated
		 */
		EClass TRANSIENT_LINK = eINSTANCE.getTransientLink();

		/**
		 * The meta object literal for the '<em><b>Link Set</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_LINK__LINK_SET = eINSTANCE.getTransientLink_LinkSet();

		/**
		 * The meta object literal for the '<em><b>Target Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_LINK__TARGET_ELEMENTS = eINSTANCE.getTransientLink_TargetElements();

		/**
		 * The meta object literal for the '<em><b>Source Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_LINK__SOURCE_ELEMENTS = eINSTANCE.getTransientLink_SourceElements();

		/**
		 * The meta object literal for the '{@link at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl <em>Transient Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TransientElementImpl
		 * @see at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.impl.TracemodelPackageImpl#getTransientElement()
		 * @generated
		 */
		EClass TRANSIENT_ELEMENT = eINSTANCE.getTransientElement();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSIENT_ELEMENT__VAR = eINSTANCE.getTransientElement_Var();

		/**
		 * The meta object literal for the '<em><b>Transient Link Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_ELEMENT__TRANSIENT_LINK_TARGET = eINSTANCE.getTransientElement_TransientLinkTarget();

		/**
		 * The meta object literal for the '<em><b>Transient Link Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_ELEMENT__TRANSIENT_LINK_SOURCE = eINSTANCE.getTransientElement_TransientLinkSource();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_ELEMENT__VALUE = eINSTANCE.getTransientElement_Value();

	}

} //TracemodelPackage
