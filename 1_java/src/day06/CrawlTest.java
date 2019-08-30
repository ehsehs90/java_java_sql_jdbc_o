package day06;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class CrawlTest {

	public static void main(String[] args) {
        Crawl client = new Crawl("ehfkwlrnd1", "gkdlf1320**");
        //client.login();
        /*
        String page = client.get("http://www.hrd.go.kr/hrdp/ps/ppsco/PPSCO0103P.do");
        Elements messages = Jsoup.parse(page).select("div.md");

        //For each message in messages, let's print out message and a new line.
        for(Element message : messages){
            System.out.println(message.text() + "\n");
        }*/

	}

}
