package at.ac.tuwien.big.ame13.atl2java.gen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TracemodelFactory;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientElement;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLink;
import at.ac.tuwien.big.ame13.atl2java.gen.tracemodel.TransientLinkSet;

import at.ac.tuwien.big.ame13.atl2java.gen.utility.EMFModelLoader;

public class A2BTransformation {

	public static void main(String[] args) throws IOException {
		
		// load models
		EMFModelLoader mLoader = new EMFModelLoader();
		Resource srcM = mLoader.loadModel("testmodel/A.ecore", "testmodel/modelA.xmi");
		
		// Resource srcMM = mLoader.loadMetamodel("testmodel/A.ecore");
		
		Resource trgMM = mLoader.loadMetamodel("testmodel/B.ecore");
		
		// get company factory
		TracemodelFactory tFactory = TracemodelFactory.eINSTANCE;
		TransientLinkSet tls = tFactory.createTransientLinkSet();
		
		/**
	 	 * creation phase
	 	 */
		// get all elements from the source model
		
		HashMap<String,Vector<EObject>> sourceElements = new HashMap<String,Vector<EObject>>();
		
		TreeIterator<EObject> iter = srcM.getAllContents();
		Vector<EObject> temp;
		while(iter.hasNext()) {
			EObject obj = iter.next();
			if(sourceElements.containsKey(obj.eClass().getName())) {
				temp = sourceElements.get(obj.eClass().getName());
				temp.add(obj);
				sourceElements.put(obj.eClass().getName(), temp);
			} else {
				temp = new Vector<EObject>();
				temp.add(obj);
				sourceElements.put(obj.eClass().getName(), temp);
			}
		}
		
		/**
	 	 * creation helpers:
	 	 */
		// list with number of each element type's occurrence
		ArrayList<Integer> sizeList;
		// minimum number of all element type's occurrence
		int minSize;
		// transient link
		TransientLink tl;
		// source object
		EObject srcObj;
		// target object
		EObject trgObj;
		// transient source element
		TransientElement tse;
		// transient target element
		TransientElement tte;
		
		/**
	 	 * initialization helpers:
	 	 */
		EStructuralFeature pBF;
		// HashMap<trgObject,HashMap<trgFeature,navigation_value>
		HashMap<EObject,HashMap<String,String>> nBindings = new HashMap<EObject,HashMap<String,String>>();
		HashMap<String,String> nBHM;
		HashMap<EObject,HashMap<String,String>> oPEBindings = new HashMap<EObject,HashMap<String,String>>();
		HashMap<String,String> oPEBHM;
		
		sizeList = new ArrayList<Integer>();
			Vector<EObject> srcElementsModel = sourceElements.get("Model");
			sizeList.add(srcElementsModel.size());
		Collections.sort(sizeList);
		minSize = sizeList.get(0);

		for(int i = 0; i < minSize; i++) {
			// further problem: how should we know which input element we should take, e.g. for the binding (if we have several input pattern elements;
			// just the smallest occurrences of the input elements are matched)
			
			tl = tFactory.createTransientLink();
			
			// saving all transient source elements in the link
			srcObj = srcElementsModel.get(i);
			tse = tFactory.createTransientElement();
			tse.setValue(srcObj);
			tse.setVar("ma");
			tl.getSourceElements().add(tse);

			trgObj = createTargetElement(trgMM, "Model");
			tte = tFactory.createTransientElement();
			tte.setValue(trgObj);
			tte.setVar("mb");
			tl.getTargetElements().add(tte);
			
			if(nBindings.containsKey(trgObj)) {
				nBHM = nBindings.get(trgObj);
				if(!nBHM.containsKey("b")) {
					nBHM.put("b", "ma.a");
					nBindings.put(trgObj, nBHM);
				}
			} else {
				nBHM = new HashMap<String,String>();
				nBHM.put("b", "ma.a");
				nBindings.put(trgObj, nBHM);
			}
			tls.getTransientLinks().add(tl);
		}
		sizeList = new ArrayList<Integer>();
			Vector<EObject> srcElementsA = sourceElements.get("A");
			sizeList.add(srcElementsA.size());
		Collections.sort(sizeList);
		minSize = sizeList.get(0);

		for(int i = 0; i < minSize; i++) {
			// further problem: how should we know which input element we should take, e.g. for the binding (if we have several input pattern elements;
			// just the smallest occurrences of the input elements are matched)
			
			tl = tFactory.createTransientLink();
			
			// saving all transient source elements in the link
			srcObj = srcElementsA.get(i);
			tse = tFactory.createTransientElement();
			tse.setValue(srcObj);
			tse.setVar("a");
			tl.getSourceElements().add(tse);

			trgObj = createTargetElement(trgMM, "B");
			tte = tFactory.createTransientElement();
			tte.setValue(trgObj);
			tte.setVar("b");
			tl.getTargetElements().add(tte);
			
			if(nBindings.containsKey(trgObj)) {
				nBHM = nBindings.get(trgObj);
				if(!nBHM.containsKey("id")) {
					nBHM.put("id", "a.name");
					nBindings.put(trgObj, nBHM);
				}
			} else {
				nBHM = new HashMap<String,String>();
				nBHM.put("id", "a.name");
				nBindings.put(trgObj, nBHM);
			}
			tls.getTransientLinks().add(tl);
		}
		
		/**
	 	 * initialization phase
	 	 */
		Iterator<TransientLink> traces = tls.getTransientLinks().iterator();
		while(traces.hasNext()) {
			tl = traces.next();
			Iterator<TransientElement> teIter = tl.getTargetElements().iterator();
			while(teIter.hasNext()) {
				// target object
				EObject obj = teIter.next().getValue();
				if(nBindings.containsKey(obj)) {
					HashMap<String,String> nBinding = nBindings.get(obj);
					Set<String> nBindingFeatures = nBinding.keySet();
					for(String nBindingFeature : nBindingFeatures) {
						EStructuralFeature f = obj.eClass().getEStructuralFeature(nBindingFeature);
						String[] navigation = nBinding.get(nBindingFeature).split("\\.");
						
						EObject navElement = null;
						// TODO tl.getSourceElementByVar(navigation[0]) in TransientLinkImpl.java faulty (getValue() instead of getVar())
						EList<TransientElement> testList = tl.getSourceElements();
						for(TransientElement testTE : testList) {
							if(testTE.getVar().equals(navigation[0])) {
								navElement = testTE.getValue();
								break;
							}
						}
						
						if(navElement == null) {
							// navigation by target element
							testList = tl.getTargetElements();
							for(TransientElement testTE : testList) {
								if(testTE.getVar().equals(navigation[0])) {
									navElement = testTE.getValue();
									break;
								}
							}
						}
						
						EStructuralFeature f2 = navElement.eClass().getEStructuralFeature(navigation[1]);
						Object f2Value = navElement.eGet(f2);
						if(f2Value instanceof String) {
							obj.eSet(f, f2Value);
						} else if(f2Value instanceof EList) {
							EList<EObject> f2List = (EList<EObject>) f2Value;
							Vector<EObject> f2TList = new Vector<EObject>();
							for(EObject srcElement : f2List) {
								TransientLink tlTemp = tls.getLinkBySourceElement(srcElement);
								EList<TransientElement> targets = tlTemp.getTargetElements();
								for(TransientElement target : targets) {
									f2TList.add(target.getValue());
								}
							}
							obj.eSet(f, f2TList);
						}
					}
				}
				if(oPEBindings.containsKey(obj)) {
					HashMap<String,String> oPEBinding = oPEBindings.get(obj);
					Set<String> oPEBindingFeatures = oPEBinding.keySet();
					for(String oPEBindingFeature : oPEBindingFeatures) {
						EStructuralFeature f = obj.eClass().getEStructuralFeature(oPEBindingFeature);
						String var = oPEBinding.get(oPEBindingFeature);
						
						EObject varElement = null;
						
						// search target elements
						EList<TransientElement> testList = tl.getTargetElements();
						for(TransientElement testTE : testList) {
							if(testTE.getVar().equals(var)) {
								varElement = testTE.getValue();
								break;
							}
						}
						
						obj.eSet(f, varElement);
					}
				}
			}
		}
		
		EObject rootElement = EcoreUtil.getRootContainer(tls.getTransientLinks().get(0).getTargetElements().get(0).getValue());
		saveResource(rootElement);
	}

	private static EObject createTargetElement(Resource MM, String className) {
		EFactory efactory = ((EPackage)MM.getContents().get(0)).getEFactoryInstance();
		EClass clazz = getEClassFromMM(MM, className);
		EObject obj = efactory.create(clazz);
		return obj;
	}

	private static Vector<EObject> getElements4Type(Resource srcM, String typeName) {
		Vector<EObject> match = new Vector<EObject>();
		
		TreeIterator<EObject> iter = srcM.getAllContents();
		while(iter.hasNext()) {
			EObject obj = iter.next();
			if(obj.eClass().getName().equals(typeName)) {
				match.add(obj);
			}
		}
		return match;
	}

	private static void saveResource(EObject rootElement) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource resource = resourceSet.createResource(URI.createFileURI("testmodel/modelB.xmi"));
		resource.getContents().add(rootElement);
		resource.save(null);
	}

	public static EClass getEClassFromMM(Resource MM, String className) {
		
		TreeIterator<EObject> iter = MM.getAllContents();
		while(iter.hasNext()) {
			EObject obj = iter.next();
			if(obj instanceof EClass) {
				EClass clazz = (EClass) obj;
				if(clazz.getName().equals(className)) {
					return clazz;
				}
			}
		}
		return null;
	}
}
