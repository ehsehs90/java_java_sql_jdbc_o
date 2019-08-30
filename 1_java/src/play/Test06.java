package play;

import java.io.IOException;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test06 {

	public static void main(String[] args) throws IOException {
		String url1 = "http://hrd.go.kr/hrdp/ma/pmmao/indexNew.do";
		String url2 = "https://hrd.go.kr/hrdp/mb/pmbao/PMBAO0100T.do";
		String url3 = "https://hrd.go.kr/hrdp/mb/pmbao/login.do";
		String mypage = "http://hrd.go.kr/hrdp/ps/ppsco/PPSCO0103P.do";
		
		Document doc = Jsoup.connect(url3).get();
		System.out.println(doc);
	}

}
