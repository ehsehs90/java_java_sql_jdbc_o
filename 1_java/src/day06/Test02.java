package day06;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test02 {

	public static void main(String[] args) {
		Account a1 = new Account("484-910021-06905", 1000);
		a1.print();
		
		Account a2 = new Account("110-335-055786", -100);
		a2.print();
		
		Account a3 = new Account();
		a3.print();
		
		String addr = "http://www.hrd.go.kr/hrdp/ps/ppsao/PPSAO0100D.do";
		String test = "https://www.hrd.go.kr/hrdp/mb/pmbao/PMBAO0100T.do?loginCallbackURI=%2Fhrdp%2Fps%2Fppsco%2FPPSCO0103P.do";
		try {
			Document doc = Jsoup.connect(addr).get();
			System.out.println(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
