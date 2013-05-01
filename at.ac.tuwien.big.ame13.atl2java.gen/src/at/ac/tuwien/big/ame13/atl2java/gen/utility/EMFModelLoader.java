package at.ac.tuwien.big.ame13.atl2java.gen.utility;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;


public class EMFModelLoader {
	 
	public EMFModelLoader() {

	}
	
	public Resource loadModel(String MMFile, String MFile) {
	
		ResourceSet resSet = this.getResourceSEt(MMFile);
		return resSet.getResource(URI.createURI(MFile), true);

	}

	public Resource loadMetamodel(String MMFile) {
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		
		return resSet.getResource(URI.createURI(MMFile), true);

	}
	
	private ResourceSet getResourceSEt(String MMFile) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new EcoreResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource metamodel = resSet.getResource(URI.createURI(MMFile), true);
		EPackage ep0 = (EPackage) metamodel.getContents().get(0); 
		resSet.getPackageRegistry().put(ep0.getNsURI(), ep0);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put
		("xmi", new XMIResourceFactoryImpl(){ public Resource createResource(URI uri)
		{   XMIResource xmiResource = new XMIResourceImpl(uri);
			return xmiResource;
		} });
		return resSet;
	}
}