package play;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Test05 {
	public static void main(String[] args) throws IOException {
		String url1 = "http://hrd.go.kr/hrdp/ma/pmmao/indexNew.do";
		String url2 = "https://hrd.go.kr/hrdp/mb/pmbao/PMBAO0100T.do";
		String url3 = "https://hrd.go.kr//hrdp/mb/pmbao/login.do";
		String mypage = "http://hrd.go.kr/hrdp/ps/ppsco/PPSCO0103P.do";
		String login = "http://www2.iteach4u.kr/2017/_include/_loginto_change_server.php?authkey=LzIwMTcv&a1=ehfkwlrnd&a2=2874b1ba82df4ecc7a1dacff8492203b&secretcode=6b51e4ca3f77d55baa56a67b0f7ec5d3";
		
		Connection.Response loginPageResponse = Jsoup.connect(url2)
                .timeout(3000)
                .header("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4")
                .method(Connection.Method.GET)
                .execute();
		
		Map<String, String> loginTryCookie = loginPageResponse.cookies();
		//cookie
		System.out.println(loginTryCookie);
		
		String userAgent = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.133 Safari/537.36";
		Map<String, String> data = new HashMap<>();
		data.put("userloginId", "ehfkwlrnd1");
		data.put("userloginPwd", "gkdlf1320**");
		
		Connection.Response response = Jsoup.connect(url2)
                .userAgent(userAgent)
                .timeout(3000)
                .header("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4")
                .cookies(loginTryCookie)
                .data(data)
                .method(Connection.Method.POST)
                .execute();
		
		Map<String, String> loginCookie = response.cookies();
		//cookie
		System.out.println(loginCookie);
		
		//System.out.println(response.parse());
		
		Document adminPageDocument = Jsoup.connect(mypage)
                .userAgent(userAgent)
                .header("Accept-Language", "ko-KR,ko;q=0.8,en-US;q=0.6,en;q=0.4")
                .cookies(loginCookie) 
                .get();
		
		//System.out.println(adminPageDocument);
		/*
		Connection.Response res = Jsoup.connect(mypage)
				.data("userid", "ehfkwlrnd")
				.data("pwd", "gkdlf1320")
				.data("login", "Login")
				.method(Connection.Method.POST)
				.execute();
		Document doc = res.parse();
		System.out.println(doc);
		
		*/
		/*
		Document doc = Jsoup.connect(url3)
		          .data("userid", "ehfkwlrnd")
		          .data("pwd", "gkdlf1320")
		          .data("auto_login", "true")
		          .post();
		          
		System.out.println(doc);
		  */
		//Document doc = Jsoup.parse(login);
		//System.out.println(doc);
		//.data("cookieexists", "true")
		//.cookies(response.cookies())
		//.data("login", "Login")
		/*
		Connection.Response response = Jsoup.connect(url2)
				.method(Connection.Method.GET)
				.execute(); 
		Document doc2 = response.parse();
		System.out.println(doc2);*/
		
		//Element loginForm = doc.selectFirst("div > form[name=loginForm]");
		//System.out.println(loginForm);
	}
}
