package at.ac.tuwien.big.ame13.atl2java.gen;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Module;

public class Atl2javaGeneratorSupport extends
		AbstractGenericResourceSupport {
	@Override
	protected Module createGuiceModule() {
		return new Atl2javaGeneratorModule();
	}
}
