package datapicker;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Icontriggerdatepicker {


	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="July 2020";
		String date="20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.globalsqa.com/demo-site/datepicker/#Icon%20Trigger");
		   
		 

		 // driver.findElement(arg0) screen optin-form-screen
		   WebDriverWait wait1 = new WebDriverWait(driver, 10);
		   WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']")));
		   
		  
	//	driver.findElement(By.id("datepicker")).click();

	}

}
