package Find;

import java.net.MalformedURLException;
import java.net.URL;

public class crawlerMain {
	public static void main(String[] args) {
		Visit v = new Visit();
		URL url;
		try {
			url = new URL("http://shalladay-iis1.student.neumont.edu");		
			Crawler crawl = new Crawler(url, 45, v);
			crawl.Crawl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
