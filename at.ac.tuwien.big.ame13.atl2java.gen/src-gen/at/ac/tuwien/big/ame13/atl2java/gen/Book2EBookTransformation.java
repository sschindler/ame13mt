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

public class Book2EBookTransformation {

	private static String sourceModel = "testmodel/modelBook.xmi";
	private static String targetModel = "testmodel/outputmodelBook2EBook.xmi";

	@SuppressWarnings({ "unused", "unchecked" })
	public static void main(String[] args) throws IOException {
		
		// load models
		EMFModelLoader mLoader = new EMFModelLoader();
		Resource srcM = mLoader.loadModel("testmodel/Book.ecore", sourceModel);
		
		// Resource srcMM = mLoader.loadMetamodel("testmodel/Book.ecore");
		
		Resource trgMM = mLoader.loadMetamodel("testmodel/Ebook.ecore");
		
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
		// HashMap<trgObject,HashMap<trgFeature,outputpatternelement_value>
		HashMap<EObject,HashMap<String,String>> oPEBindings = new HashMap<EObject,HashMap<String,String>>();
		HashMap<String,String> oPEBHM;
		// HashMap<trgObject,HashMap<trgFeature,resolution_value>
		HashMap<EObject,HashMap<String,String>> rBindings = new HashMap<EObject,HashMap<String,String>>();
		HashMap<String,String> rBHM;
		
		// HashMap<srcObject,transientlink>
		HashMap<EObject,TransientLink> tLinkBySrcObj = new HashMap<EObject,TransientLink>();
		
		// contains the number of source elements defined by each input pattern type of this rule
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
			tLinkBySrcObj.put(srcObj, tl);
			
			// creating all target elements and saving the transient target elements in the link
			trgObj = createTargetElement(trgMM, "Model");
			tte = tFactory.createTransientElement();
			tte.setValue(trgObj);
			tte.setVar("mb");
			tl.getTargetElements().add(tte);
			
			if(rBindings.containsKey(trgObj)) {
				rBHM = rBindings.get(trgObj);
				// if there is already a resolve binding for this feature don't overwrite the existing value
				if(!rBHM.containsKey("b")) {
					rBHM.put("b", "ma.a");
					rBindings.put(trgObj, rBHM);
				}
			} else {
				rBHM = new HashMap<String,String>();
				rBHM.put("b", "ma.a");
				rBindings.put(trgObj, rBHM);
			}
			if(rBindings.containsKey(trgObj)) {
				rBHM = rBindings.get(trgObj);
				// if there is already a resolve binding for this feature don't overwrite the existing value
				if(!rBHM.containsKey("y")) {
					rBHM.put("y", "ma.x");
					rBindings.put(trgObj, rBHM);
				}
			} else {
				rBHM = new HashMap<String,String>();
				rBHM.put("y", "ma.x");
				rBindings.put(trgObj, rBHM);
			}
			tls.getTransientLinks().add(tl);
		}
		// contains the number of source elements defined by each input pattern type of this rule
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
			tLinkBySrcObj.put(srcObj, tl);
			
			// creating all target elements and saving the transient target elements in the link
			trgObj = createTargetElement(trgMM, "B");
			tte = tFactory.createTransientElement();
			tte.setValue(trgObj);
			tte.setVar("b");
			tl.getTargetElements().add(tte);
			
			if(nBindings.containsKey(trgObj)) {
				nBHM = nBindings.get(trgObj);
				// if there is already a navigation binding for this feature don't overwrite the existing value
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
		// contains the number of source elements defined by each input pattern type of this rule
		sizeList = new ArrayList<Integer>();
			Vector<EObject> srcElementsBook = sourceElements.get("Book");
			sizeList.add(srcElementsBook.size());
		Collections.sort(sizeList);
		minSize = sizeList.get(0);

		for(int i = 0; i < minSize; i++) {
			// further problem: how should we know which input element we should take, e.g. for the binding (if we have several input pattern elements;
			// just the smallest occurrences of the input elements are matched)
			
			tl = tFactory.createTransientLink();
			
			// saving all transient source elements in the link
			srcObj = srcElementsBook.get(i);
			tse = tFactory.createTransientElement();
			tse.setValue(srcObj);
			tse.setVar("x");
			tl.getSourceElements().add(tse);
			tLinkBySrcObj.put(srcObj, tl);
			
			// creating all target elements and saving the transient target elements in the link
			trgObj = createTargetElement(trgMM, "Ebook");
			tte = tFactory.createTransientElement();
			tte.setValue(trgObj);
			tte.setVar("y");
			tl.getTargetElements().add(tte);
			
			if(nBindings.containsKey(trgObj)) {
				nBHM = nBindings.get(trgObj);
				// if there is already a navigation binding for this feature don't overwrite the existing value
				if(!nBHM.containsKey("label")) {
					nBHM.put("label", "x.title");
					nBindings.put(trgObj, nBHM);
				}
			} else {
				nBHM = new HashMap<String,String>();
				nBHM.put("label", "x.title");
				nBindings.put(trgObj, nBHM);
			}
			if(nBindings.containsKey(trgObj)) {
				nBHM = nBindings.get(trgObj);
				// if there is already a navigation binding for this feature don't overwrite the existing value
				if(!nBHM.containsKey("info")) {
					nBHM.put("info", "x.author");
					nBindings.put(trgObj, nBHM);
				}
			} else {
				nBHM = new HashMap<String,String>();
				nBHM.put("info", "x.author");
				nBindings.put(trgObj, nBHM);
			}
			if(nBindings.containsKey(trgObj)) {
				nBHM = nBindings.get(trgObj);
				// if there is already a navigation binding for this feature don't overwrite the existing value
				if(!nBHM.containsKey("date")) {
					nBHM.put("date", "x.published");
					nBindings.put(trgObj, nBHM);
				}
			} else {
				nBHM = new HashMap<String,String>();
				nBHM.put("date", "x.published");
				nBindings.put(trgObj, nBHM);
			}
			pBF = trgObj.eClass().getEStructuralFeature("category");
			trgObj.eSet(pBF, "Thriller");
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
						
						// navigation string: var.feature
						String[] navigation = nBinding.get(nBindingFeature).split("\\.");
						
						EObject navElement = null;
						// tl.getSourceElementByVar(navigation[0]) in TransientLinkImpl.java faulty (getValue() instead of getVar())
						EList<TransientElement> tempList = tl.getSourceElements();
						for(TransientElement tempTE : tempList) {
							if(tempTE.getVar().equals(navigation[0])) {
								navElement = tempTE.getValue();
								break;
							}
						}
						
						EStructuralFeature f2 = navElement.eClass().getEStructuralFeature(navigation[1]);
						Object f2Value = navElement.eGet(f2);
						// f2Value of primitve type (e.g. f2Value instanceof String)
						obj.eSet(f, f2Value);
					}
				}
				if(oPEBindings.containsKey(obj)) {
					HashMap<String,String> oPEBinding = oPEBindings.get(obj);
					Set<String> oPEBindingFeatures = oPEBinding.keySet();
					for(String oPEBindingFeature : oPEBindingFeatures) {
						EStructuralFeature f = obj.eClass().getEStructuralFeature(oPEBindingFeature);
						
						// output pattern element string: var
						String var = oPEBinding.get(oPEBindingFeature);
						
						EObject varElement = null;
						// search target elements
						EList<TransientElement> tempList = tl.getTargetElements();
						for(TransientElement tempTE : tempList) {
							if(tempTE.getVar().equals(var)) {
								varElement = tempTE.getValue();
								break;
							}
						}
						
						obj.eSet(f, varElement);
					}
				}
				if(rBindings.containsKey(obj)) {
					HashMap<String,String> rBinding = rBindings.get(obj);
					Set<String> rBindingFeatures = rBinding.keySet();
					for(String rBindingFeature : rBindingFeatures) {
						EStructuralFeature f = obj.eClass().getEStructuralFeature(rBindingFeature);
						
						// resolve string: var.feature
						String[] navigation = rBinding.get(rBindingFeature).split("\\.");
						
						EObject resElement = null;
						EList<TransientElement> tempList = tl.getSourceElements();
						for(TransientElement tempTE : tempList) {
							if(tempTE.getVar().equals(navigation[0])) {
								resElement = tempTE.getValue();
								break;
							}
						}
						
						EStructuralFeature f2 = resElement.eClass().getEStructuralFeature(navigation[1]);
						Object f2Value = resElement.eGet(f2);
						
						if(f2Value instanceof EObject) 
						{
							// f2Value is one object
							
							EObject f2Object = (EObject) f2Value;
							TransientLink tlTemp = tLinkBySrcObj.get(f2Object);
							
							if(tlTemp != null) {
								EList<TransientElement> targets = tlTemp.getTargetElements();
								if(targets.size() > 1) {
									Vector<EObject> f2TList = new Vector<EObject>();
									for(TransientElement target : targets) {
										f2TList.add(target.getValue());
									}
									obj.eSet(f, f2TList);
								} else {
									EObject f2TObject = targets.get(0).getValue();
									obj.eSet(f, f2TObject);
								}
							}
						}
						else if(f2Value instanceof EList)
						{
							// f2Value is a list of objects
							
							EList<EObject> f2List = (EList<EObject>) f2Value;
							
							Vector<EObject> f2TList = new Vector<EObject>();
							for(EObject srcElement : f2List) {
								TransientLink tlTemp = tLinkBySrcObj.get(srcElement);
								if(tlTemp != null) {
									EList<TransientElement> targets = tlTemp.getTargetElements();
									for(TransientElement target : targets) {
										f2TList.add(target.getValue());
									}
								}
							}
							
							obj.eSet(f, f2TList);
						}
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

	@SuppressWarnings("unused")
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
		Resource resource = resourceSet.createResource(URI.createFileURI(targetModel));
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
