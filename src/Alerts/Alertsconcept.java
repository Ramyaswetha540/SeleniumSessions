package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsconcept {
	
		public static void main(String[] args) throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://learn.letskodeit.com/p/practice");
	  
	  driver.findElement(By.id("alertbtn")).click();
	  Alert alert=driver.switchTo().alert();
	  alert.accept();
	  driver.quit();
	  
	  
	}
}
