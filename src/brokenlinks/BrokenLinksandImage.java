package brokenlinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksandImage {

	public static void main(String[] args) throws MalformedURLException, IOException {

		  System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3).exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/");
		  
		  //get the links and image
		  List <WebElement> linkslist=driver.findElements(By.tagName("a"));
		  
		  System.out.println(linkslist.size());
		  
		  List <WebElement> actuallinks=new ArrayList<WebElement>();
  //iterate linkslist-exculde all links and image which don't have href's
		  for(int i=0;i<linkslist.size();i++)
   {
	   if(linkslist.get(i).getAttribute("href")!=null)//&&(!linkslist.get(i).getAttribute("href").conatains("javascript")))//if javscript avaliable in links they we need to exculde them also
{
	actuallinks.add(linkslist.get(i));
}
   }
		  System.out.println("actuallinks:"+actuallinks.size());
		  //check href url with httponnection api
		  //200-ok
		  //404-not found
		  //500-internal error
		  //400-bad
		  for(int j=0;j<actuallinks.size();j++)
		  {
			  HttpURLConnection connection=(HttpURLConnection) new URL(actuallinks.get(j).getAttribute("href")).openConnection();
			  connection.connect();
			   String response=connection.getResponseMessage();
			   connection.disconnect();
			   System.out.println(actuallinks.get(j).getAttribute("href")+" "+response);
			   
			   
		  }
	}

}
