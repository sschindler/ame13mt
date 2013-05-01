package at.ac.tuwien.big.ame13.atl2java.gen;

// ATL code to be expressed as Java Code

//-- @path MM=/A2B/A.ecore
//-- @path MM1=/A2B/B.ecore
//
//module A2B;
//create OUT : MM1 from IN : MM;
//
//rule Model2Model {
//	from
//		modelA : MM!Model
//	to 
//		modelB : MM1!Model (
//			b <- modelA.a
//		)
//}
//
//rule A2B {
//	from
//		a : MM!A
//	to 
//		b : MM1!B (
//			id <- a.name
//		)
//}


import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

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
		Resource srcM = mLoader.loadModel("/testmodel/A.ecore", "testmodel/modelA.xmi");
		
		Resource srcMM = mLoader.loadMetamodel("/testmodel/A.ecore");
		
		Resource trgMM = mLoader.loadMetamodel("/testmodel/B.ecore");
		
		// get company factory
		EFactory efactory = ((EPackage)trgMM.getContents().get(0)).getEFactoryInstance();
		TracemodelFactory tFactory = TracemodelFactory.eINSTANCE;
		TransientLinkSet tls = tFactory.createTransientLinkSet();	
		
		// Creation Phase
		Vector<EObject> match = getElements4Type(srcM, "A");
		Iterator<EObject> matchIter = match.iterator();	
		while(matchIter.hasNext()){
			EObject src = matchIter.next();
			EObject trg = createTargetElement(trgMM, "B");
			TransientLink tl = tFactory.createTransientLink();
			TransientElement tse = tFactory.createTransientElement();
			TransientElement tte = tFactory.createTransientElement();
			tse.setValue(src);
			tte.setValue(trg);
			tl.getSourceElements().add(tse);
			tl.getTargetElements().add(tte);
			tls.getTransientLinks().add(tl);
			
		}
		
		match = getElements4Type(srcM, "Model");
		matchIter = match.iterator();
		while(matchIter.hasNext()){
			EObject src = matchIter.next();
			EObject trg = createTargetElement(trgMM, "Model");
			TransientLink tl = tFactory.createTransientLink();
			TransientElement tse = tFactory.createTransientElement();
			TransientElement tte = tFactory.createTransientElement();
			tse.setValue(src);
			tte.setValue(trg);
			tl.getSourceElements().add(tse);
			tl.getTargetElements().add(tte);
			tls.getTransientLinks().add(tl);
		}
		
		// Initialization Phase 
		Iterator<TransientLink> traces = tls.getTransientLinks().iterator();
		while(traces.hasNext()){
			TransientLink tl = traces.next();
			Iterator<TransientElement> teIter = tl.getTargetElements().iterator();
			while(teIter.hasNext()){
				EObject obj = teIter.next().getValue();
				if(obj.eClass().getName().equals("Model")){
					EStructuralFeature f = obj.eClass().getEStructuralFeature("b");
					Vector<EObject> trgObjs = new Vector<EObject>();
					Vector<EObject> srcObjs = getElements4Type(srcM, "A");
					Iterator<EObject> srcObjsIter = srcObjs.iterator();
					while(srcObjsIter.hasNext()){
						EObject srcObj = srcObjsIter.next();
						TransientLink tlTemp = tls.getLinkBySourceElement(srcObj);
						trgObjs.add(tlTemp.getTargetElements().get(0).getValue());
					}
					obj.eSet(f, trgObjs);
				}
				else if(obj.eClass().getName().equals("B")){
					EStructuralFeature f = obj.eClass().getEStructuralFeature("id");
					EStructuralFeature f2 = tl.getSourceElements().get(0).getValue().eClass().getEStructuralFeature("name");
					obj.eSet(f, tl.getSourceElements().get(0).getValue().eGet(f2));
				}
			}
		}
				
		EObject rootElement = EcoreUtil.getRootContainer( tls.getTransientLinks().get(0).getTargetElements().get(0).getValue());
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
		while(iter.hasNext()){
			EObject obj = iter.next();
			if(obj.eClass().getName().equals(typeName)){
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

	
	public static EClass getEClassFromMM(Resource MM, String className){
		
		TreeIterator<EObject> iter = MM.getAllContents();
		while(iter.hasNext()){
			EObject obj = iter.next();
			if(obj instanceof EClass){
				EClass clazz = (EClass) obj;
				if(clazz.getName().equals(className)){
					return clazz;
				}
			}
		}
		return null;
	}
	
	
}
