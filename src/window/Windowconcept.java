package window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowconcept {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://learn.letskodeit.com/p/practice");
		
	driver.findElement(By.id("openwindow")).click();
	String parentwindow=driver.getWindowHandle();
	
	Set<String> window=driver.getWindowHandles();
	
	
	for(String windows:window)
	{
		System.out.println(windows);
		driver.switchTo().window(windows);
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals("Let's Kode It"))
	//if(driver.getCurrentUrl().equals("https://letskodeit.teachable.com/courses)"))
				{
			driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();		
				}
	}
	
	
	driver.close();
	driver.switchTo().window(parentwindow);
	driver.quit();  
		  
	}

}


