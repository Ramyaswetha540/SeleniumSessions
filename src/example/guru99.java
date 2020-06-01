package example;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class guru99 {

	
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("http://www.demo.guru99.com/V4/");
		   
		   driver.findElement(By.name("uid")).sendKeys("mngr251793");
		   driver.findElement(By.name("password")).sendKeys("dEdyras");
		   driver.findElement(By.name("btnLogin")).click();
		   String title=driver.getTitle();
		   System.out.println(title);
		 
	}
}
