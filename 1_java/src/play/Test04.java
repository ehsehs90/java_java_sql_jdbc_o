package play;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

public class Test04 {

	public static void main(String[] args) throws IOException {
		String html = "<p><a href='http://example.com/'"
		         +" onclick='checkData()'>Link</a></p>";
		
		Document doc = Jsoup.parse(html);
		
		System.out.println("Initial HTML: " + html);
		String safeHtml = Jsoup.clean(html, Whitelist.basic());
		
		System.out.println("Cleaned HTML: " +safeHtml);
		
	}
}
