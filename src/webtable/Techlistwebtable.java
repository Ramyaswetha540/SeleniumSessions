package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistwebtable {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
			
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		   
		   List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		   System.out.println(rows.size());
		   System.out.println(rows.get(0).getText());
		  
		   List<WebElement> header=driver.findElements(By.xpath("//table/thead/tr/th"));   
		  	   
		   
		   
		   int index=0;
		   for(int k=1;k<header.size();k++)
		   {
			   if(header.get(k-1).getText().equals("City"))
			   {
				   index=k;
				   break;
			   }
		   }
		   
	WebElement w=driver.findElement(By.xpath("//table/tbody/tr[2]/td["+index+"]"));
	System.out.println(w.getText());
		   
		   
}
}
