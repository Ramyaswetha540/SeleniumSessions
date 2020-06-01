package displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISDisplayed {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://learn.letskodeit.com/p/practice");
		  
		  driver.findElement(By.id("displayed-text")).sendKeys("selenium");
		  driver.findElement(By.id("hide-textbox")).click();
		  Thread.sleep(2000);
		  boolean b=driver.findElement(By.id("displayed-text")).isDisplayed();
		  System.out.println(b);
		  driver.findElement(By.id("show-textbox")).click();
		  Thread.sleep(2000);
		 boolean b1= driver.findElement(By.id("displayed-text")).isDisplayed();
		 System.out.println(b1);
	}

}
