package at.ac.tuwien.big.ame13.atl2java.gen;

import at.ac.tuwien.big.ame13.atl2java.atl2javamm.Transformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Atl2javaGenerator implements IGenerator {
  private String PACKAGE_PATH = "/at/ac/tuwien/big/ame13/atl2java/gen/";
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject object : _contents) {
      {
        Transformation t = ((Transformation) object);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(this.PACKAGE_PATH, "");
        String _name = t.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        _builder.append(_firstUpper, "");
        _builder.append("Transformation.java");
        CharSequence _generateTransformationCode = this.generateTransformationCode(t);
        fsa.generateFile(_builder.toString(), _generateTransformationCode);
      }
    }
  }
  
  public CharSequence generateTransformationCode(final Transformation t) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method value is undefined for the type Atl2javaGenerator"
      + "\nThe method value is undefined for the type Atl2javaGenerator"
      + "\nThe method value is undefined for the type Atl2javaGenerator"
      + "\nThe method value is undefined for the type Atl2javaGenerator"
      + "\nThe method value is undefined for the type Atl2javaGenerator"
      + "\nThe method value is undefined for the type Atl2javaGenerator"
      + "\nThe method value is undefined for the type Atl2javaGenerator");
  }
}
