package play;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Scraping {

	public static void main(String[] args) throws IOException {
		String url1 = "https://hrd.go.kr/hrdp/mb/pmbao/PMBAO0100T.do";
		
		Document doc = Jsoup.connect(url1).get();
		String userloginId = doc.selectFirst("#userloginId").val();
		String userloginPwd = doc.selectFirst("#userloginPwd").val();
		
		System.out.println();
		/*
		Connection.Response loginPageResponse = Jsoup.connect(url1)
                .timeout(3000)
                .header("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4")
                .method(Connection.Method.GET)
                .execute();
                */
	}

}
