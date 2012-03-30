/**
 * 
 */
package app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.feed.synd.SyndPerson;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import feeds.module.gdata.GDataModule;

/**
 * @author Lukasz Radziwonowicz
 * 
 */
public class TestModule {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SyndFeedInput input = new SyndFeedInput();
			input.setPreserveWireFeed(true);
			SyndFeed feed;
			feed = input.build(new XmlReader(new URL("http://googleblog.blogspot.com/feeds/posts/default?max-results=5")));

			System.out.println(feed.toString());
			SyndPerson person;
			if (feed.getAuthors().size() > 0) {
				person = ((List<SyndPerson>) feed.getAuthors()).get(0);

				GDataModule gDataModule = (GDataModule) person.getModule(GDataModule.URI);
				System.out.println("Thumbnails url: " + gDataModule.getThumbnail());
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
