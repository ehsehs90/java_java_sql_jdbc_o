package day06;
import java.io.IOException;
import java.net.MalformedURLException;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class Crawl {
	 private final WebClient WEB_CLIENT = new WebClient(BrowserVersion.INTERNET_EXPLORER_7);
	 private final String username;
	 private final String password;
	 
	 Crawl(String username, String password){
	        this.username = username;
	        this.password = password;
	        WEB_CLIENT.getCookieManager().setCookiesEnabled(true);
	 }
	 
	 public void login(){
	        String loginURL = "https://www.hrd.go.kr/hrdp/mb/pmbao/PMBAO0100T.do?loginCallbackURI=%2Fhrdp%2Fps%2Fppsco%2FPPSCO0103P.do";       
	        try {
	            HtmlPage loginPage = WEB_CLIENT.getPage(loginURL);
	            HtmlForm loginForm = loginPage.getFirstByXPath("//form[@id='userloginForm']");
	            loginForm.getInputByName("userloginId").setValueAttribute(username);
	            loginForm.getInputByName("userloginPwd").setValueAttribute(password);
	            loginForm.getElementsByTagName("button").get(0).click();

	        } catch (FailingHttpStatusCodeException e) {
	            e.printStackTrace();
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String get(String URL){
	        try {
	            return WEB_CLIENT.getPage(URL).getWebResponse().getContentAsString();
	        } catch (FailingHttpStatusCodeException e) {
	            e.printStackTrace();
	        } catch (MalformedURLException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
