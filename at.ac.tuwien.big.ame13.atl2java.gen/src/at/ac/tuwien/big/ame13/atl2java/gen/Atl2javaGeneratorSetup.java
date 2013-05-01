package at.ac.tuwien.big.ame13.atl2java.gen;

import org.eclipse.xtext.ISetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Atl2javaGeneratorSetup implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		return Guice.createInjector(new Atl2javaGeneratorModule());
	}

}
