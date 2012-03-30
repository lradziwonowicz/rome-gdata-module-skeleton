/**
 * 
 */
package feeds.module.gdata;

import com.sun.syndication.feed.module.ModuleImpl;

/**
 * @author Lukasz Radziwonowicz
 * 
 */
public class GDataModuleImpl extends ModuleImpl implements GDataModule {

	private String thumbnail;

	public GDataModuleImpl() {
		super(GDataModule.class, GDataModule.URI);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.feed.CopyFrom#getInterface()
	 */
	@Override
	public Class getInterface() {
		return GDataModule.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.feed.CopyFrom#copyFrom(java.lang.Object)
	 */
	@Override
	public void copyFrom(Object obj) {
		GDataModule module = (GDataModule) obj;
		this.setThumbnail(module.getThumbnail());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see feeds.module.gdata.GDataModule#getThumbnail()
	 */
	@Override
	public String getThumbnail() {
		return thumbnail;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see feeds.module.gdata.GDataModule#setThumbnail()
	 */
	@Override
	public void setThumbnail(String thumbnailUrl) {
		this.thumbnail = thumbnailUrl;
	}

}
