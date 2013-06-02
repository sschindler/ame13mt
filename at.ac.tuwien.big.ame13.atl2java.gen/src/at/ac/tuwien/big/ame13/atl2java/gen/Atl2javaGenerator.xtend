package at.ac.tuwien.big.ame13.atl2java.gen

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.EObject
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Rule
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.InputPatternElement
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputPatternElement
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.NavigationBinding
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.ResolveBinding
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.PrimitiveBinding
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.OutputpatternElementBinding
import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Binding

class Atl2javaGenerator implements IGenerator {
	
	String PACKAGE_PATH = "/at/ac/tuwien/big/ame13/atl2java/gen/";

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(EObject object : resource.contents) {
			var Transformation t = object as Transformation;
			fsa.generateFile('''«PACKAGE_PATH»«t.name.toFirstUpper»Transformation.java''',t.generateTransformationCode);
		}
	}
	
	def generateTransformationCode(Transformation t)'''
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
	
	public class «t.name.toFirstUpper»Transformation {
	
		@SuppressWarnings({ "unused", "unchecked" })
		public static void main(String[] args) throws IOException {
			
			// load models
			EMFModelLoader mLoader = new EMFModelLoader();
			Resource srcM = mLoader.loadModel("«t.sourceModel.path»/«t.sourceModel.metamodel»", "testmodel/modelA.xmi");
			
			// Resource srcMM = mLoader.loadMetamodel("«t.sourceModel.path»/«t.sourceModel.metamodel»");
			
			Resource trgMM = mLoader.loadMetamodel("«t.targetModel.path»/«t.targetModel.metamodel»");
			
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
			
			«FOR Rule rule : t.rules»
			sizeList = new ArrayList<Integer>();
				«FOR InputPatternElement ipe : rule.inputPattern.inputPatternElements»
				Vector<EObject> srcElements«ipe.type» = sourceElements.get("«ipe.type»");
				sizeList.add(srcElements«ipe.type».size());
				«ENDFOR»
			Collections.sort(sizeList);
			minSize = sizeList.get(0);

			for(int i = 0; i < minSize; i++) {
				// further problem: how should we know which input element we should take, e.g. for the binding (if we have several input pattern elements;
				// just the smallest occurrences of the input elements are matched)
				
				tl = tFactory.createTransientLink();
				
				// saving all transient source elements in the link
				«FOR InputPatternElement ipe : rule.inputPattern.inputPatternElements»
				srcObj = srcElements«ipe.type».get(i);
				tse = tFactory.createTransientElement();
				tse.setValue(srcObj);
				tse.setVar("«ipe.name»");
				tl.getSourceElements().add(tse);
				tLinkBySrcObj.put(srcObj, tl);
				«ENDFOR»

				«FOR OutputPatternElement ope : rule.outputPattern.outputPatternElements»
				trgObj = createTargetElement(trgMM, "«ope.type»");
				tte = tFactory.createTransientElement();
				tte.setValue(trgObj);
				tte.setVar("«ope.name»");
				tl.getTargetElements().add(tte);
				
				«FOR Binding binding : ope.bindings»
				«IF binding instanceof PrimitiveBinding»
				pBF = trgObj.eClass().getEStructuralFeature("«binding.feature»");
				trgObj.eSet(pBF, "«(binding as PrimitiveBinding).value»");
				«ELSEIF binding instanceof NavigationBinding»
				«IF binding instanceof ResolveBinding»
				if(rBindings.containsKey(trgObj)) {
					rBHM = rBindings.get(trgObj);
					if(!rBHM.containsKey("«binding.feature»")) {
						rBHM.put("«binding.feature»", "«(binding as ResolveBinding).inputPatternElement.name».«(binding as ResolveBinding).value»");
						rBindings.put(trgObj, rBHM);
					}
				} else {
					rBHM = new HashMap<String,String>();
					rBHM.put("«binding.feature»", "«(binding as ResolveBinding).inputPatternElement.name».«(binding as ResolveBinding).value»");
					rBindings.put(trgObj, rBHM);
				}
				«ELSE»
				if(nBindings.containsKey(trgObj)) {
					nBHM = nBindings.get(trgObj);
					if(!nBHM.containsKey("«binding.feature»")) {
						nBHM.put("«binding.feature»", "«(binding as NavigationBinding).inputPatternElement.name».«(binding as NavigationBinding).value»");
						nBindings.put(trgObj, nBHM);
					}
				} else {
					nBHM = new HashMap<String,String>();
					nBHM.put("«binding.feature»", "«(binding as NavigationBinding).inputPatternElement.name».«(binding as NavigationBinding).value»");
					nBindings.put(trgObj, nBHM);
				}
				«ENDIF»
				«ELSEIF binding instanceof OutputpatternElementBinding»
				if(oPEBindings.containsKey(trgObj)) {
					oPEBHM = oPEBindings.get(trgObj);
					if(!oPEBHM.containsKey("«binding.feature»")) {
						oPEBHM.put("«binding.feature»", "«(binding as OutputpatternElementBinding).value.name»");
						oPEBindings.put(trgObj, oPEBHM);
					}
				} else {
					oPEBHM = new HashMap<String,String>();
					oPEBHM.put("«binding.feature»", "«(binding as OutputpatternElementBinding).value.name»");
					oPEBindings.put(trgObj, oPEBHM);
				}
				«ENDIF»
				«ENDFOR»
				«ENDFOR»
				tls.getTransientLinks().add(tl);
			}
			«ENDFOR»
			
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
							EList<TransientElement> tempList = tl.getSourceElements();
							for(TransientElement tempTE : tempList) {
								if(tempTE.getVar().equals(navigation[0])) {
									navElement = tempTE.getValue();
									break;
								}
							}
							
							if(navElement == null) {
								// navigation by target element
								tempList = tl.getTargetElements();
								for(TransientElement tempTE : tempList) {
									if(tempTE.getVar().equals(navigation[0])) {
										navElement = tempTE.getValue();
										break;
									}
								}
							}
							
							EStructuralFeature f2 = navElement.eClass().getEStructuralFeature(navigation[1]);
							Object f2Value = navElement.eGet(f2);
							// f2Value instanceof String
							obj.eSet(f, f2Value);
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
							String[] navigation = rBinding.get(rBindingFeature).split("\\.");
							
							EObject resElement = null;
							EList<TransientElement> tempList = tl.getSourceElements();
							for(TransientElement tempTE : tempList) {
								if(tempTE.getVar().equals(navigation[0])) {
									resElement = tempTE.getValue();
									break;
								}
							}
							
							boolean resFromTargetElements = false;
							
							if(resElement == null) {
								// resolving by target element
								tempList = tl.getTargetElements();
								for(TransientElement tempTE : tempList) {
									if(tempTE.getVar().equals(navigation[0])) {
										resElement = tempTE.getValue();
										resFromTargetElements = true;
										break;
									}
								}
							}
							
							EStructuralFeature f2 = resElement.eClass().getEStructuralFeature(navigation[1]);
							Object f2Value = resElement.eGet(f2);
							// TODO Test for EObject or Object
							if(f2Value instanceof EObject) {
								if(!resFromTargetElements) {
									EObject f2Object = (EObject) f2Value;
									TransientLink tlTemp = tLinkBySrcObj.get(f2Object);
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
								} else {
									obj.eSet(f, f2Value);
								}
							} else if(f2Value instanceof EList) {
								if(!resFromTargetElements) {
									EList<EObject> f2List = (EList<EObject>) f2Value;
									Vector<EObject> f2TList = new Vector<EObject>();
									for(EObject srcElement : f2List) {
										TransientLink tlTemp = tLinkBySrcObj.get(srcElement);
										EList<TransientElement> targets = tlTemp.getTargetElements();
										for(TransientElement target : targets) {
											f2TList.add(target.getValue());
										}
									}
									obj.eSet(f, f2TList);
								} else {
									obj.eSet(f, f2Value);
								}
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
	'''
}
