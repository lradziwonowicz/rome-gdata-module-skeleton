/**
 * 
 */
package feeds.module.gdata;

import com.sun.syndication.feed.module.Module;

/**
 * @author Lukasz Radziwonowicz
 * 
 */
public interface GDataModule extends Module {
	public static final String URI = "http://schemas.google.com/g/2005";

	public String getThumbnail();

	public void setThumbnail(String thumbnailUrl);

}
