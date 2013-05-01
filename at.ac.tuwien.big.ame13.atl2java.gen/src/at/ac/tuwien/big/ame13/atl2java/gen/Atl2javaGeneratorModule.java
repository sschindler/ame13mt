package at.ac.tuwien.big.ame13.atl2java.gen;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class Atl2javaGeneratorModule extends
		AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return "at.ac.tuwien.big.me12.csv.csvmm.CSVPackage";
	}

	@Override
	protected String getFileExtensions() {
		return "csvmodel";
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return Atl2javaGenerator.class;
	}

	public Class<? extends ResourceSet> bindResourceSet() {
		return ResourceSetImpl.class;
	}

}
