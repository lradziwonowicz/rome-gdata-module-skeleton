/**
 * 
 */
package feeds.module.gdata.io;

import org.jdom.Element;
import org.jdom.Namespace;

import com.sun.syndication.feed.module.Module;
import com.sun.syndication.io.ModuleParser;

import feeds.module.gdata.GDataModule;
import feeds.module.gdata.GDataModuleImpl;

/**
 * @author Lukasz Radziwonowicz
 * 
 */
public class GDataModuleParser implements ModuleParser {

	// public GDataModuleParser(){
	// super();
	// }

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.io.ModuleParser#getNamespaceUri()
	 */
	@Override
	public String getNamespaceUri() {
		return GDataModule.URI;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.io.ModuleParser#parse(org.jdom.Element)
	 */
	@Override
	public Module parse(Element element) {
		Namespace gdNS = Namespace.getNamespace("gd", GDataModule.URI);
		GDataModule gDataModule = new GDataModuleImpl();
		Element image = element.getChild("image", gdNS);
		// if (element.getNamespace().equals(gdNS)) {
		if (image != null) {
			if (image.getAttributeValue("rel").equals(GDataModule.URI + "#thumbnail")) {
				gDataModule.setThumbnail(image.getAttributeValue("src"));
			}
		}
		// }
		return gDataModule;
	}
}
