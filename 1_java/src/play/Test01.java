package play;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test01 {

	public static void main(String[] args) {
		String addr = "http://www.hrd.go.kr/hrdp/ps/ppsao/PPSAO0100D.do";
		String test = "https://www.hrd.go.kr/hrdp/mb/pmbao/PMBAO0100T.do?loginCallbackURI=%2Fhrdp%2Fps%2Fppsco%2FPPSCO0103P.do";
		try {
			FileOutputStream fos = new FileOutputStream("temp.txt"); 
	        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); 
			BufferedWriter bw = new BufferedWriter(osw);
			 Response rs = (Response) Jsoup 
		                .connect(addr) 
		                .data("mode", "login") 
		                .data("kinds", "outlogin") 
		                .data("userloginId", "ehfkwlrnd1") 
		                .data("userloginPwd", "gkdlf1320**") 
		                .userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.90 Safari/537.36")
		                .method(Method.POST).execute(); 
			 Document doc = rs.parse(); 

		        Pattern p = Pattern.compile("alert\\((.+)\\)"); 
		        Matcher m = p.matcher(doc.html()); 
		        m.find(); 
		        
		        bw.write(m.group()); 
		        bw.flush(); 

		        Document mainPage = Jsoup.connect(test) 
		                .cookies(rs.cookies()).get(); 

		        System.out.println(mainPage.html()); 
		        System.out.println(m.group());  
			
			System.out.println("ok");
			
			//Document doc = Jsoup.connect(addr).get();
			//System.out.println(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
