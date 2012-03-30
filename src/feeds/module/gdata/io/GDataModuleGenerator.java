/**
 * 
 */
package feeds.module.gdata.io;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.jdom.Element;
import org.jdom.Namespace;

import com.sun.syndication.feed.module.Module;
import com.sun.syndication.io.ModuleGenerator;

import feeds.module.gdata.GDataModule;

/**
 * @author Lukasz Radziwonowicz
 * 
 */
public class GDataModuleGenerator implements ModuleGenerator {

	// boilerplate code
	private static final Namespace NAMESPACE = Namespace.getNamespace("gd", GDataModule.URI);
	private static final Set NAMESPACES;
	static {
		Set<Namespace> namespaces = new HashSet<Namespace>();
		namespaces.add(NAMESPACE);
		NAMESPACES = Collections.unmodifiableSet(namespaces);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.io.ModuleGenerator#getNamespaceUri()
	 */
	@Override
	public String getNamespaceUri() {
		return GDataModule.URI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.io.ModuleGenerator#getNamespaces()
	 */
	@Override
	public Set getNamespaces() {
		return NAMESPACES;
	}

	public GDataModuleGenerator() {
	}

	public void generate(Module module, Element element) {
		// MyModule myModule = (MyModule) module;
		// if (myModule.getTag() != null) {
		// Element myElement = new Element("tag", NAMESPACE);
		// myElement.setText(myModule.getTag());
		// element.addContent(myElement);
		// }
	}

}
