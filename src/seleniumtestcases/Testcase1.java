package seleniumtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {
	
	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		 driver.manage().window().maximize();
	     driver.findElement(By.linkText("Create account")).click();
	     String url=driver.getCurrentUrl();
	     if(url.contains("wikipedia.org"))
	    		 {
	    	 System.out.println("internal link of wikipedia-pass");
	    		 }
	     else
	     {
	    	 System.out.println("external link of wikipedia-fail");
	     }
	     driver.navigate().back();
	     driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/table[2]/tbody/tr[10]/td/span[1]/a")).click();
	     String newurl=driver.getCurrentUrl();
	     if(newurl.equals("https://www.selenium.dev/"))
	     {
	    	 System.out.println("test pass");
	     }else {
	    	 System.out.println("fail");
	     }
	    	 driver.quit();
	     }

	}


