package Find; 

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkFinder {
	static String line;

	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream(new File("neumont.edu"));
			processPage(in);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void processPage(InputStream in) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		try {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			} 
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Iterator<String> getLinks() {
		String pattern = "<a";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		boolean matches = m.find();
	}
}
