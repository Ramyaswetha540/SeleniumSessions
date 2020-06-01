package datapicker;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepick3 {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="August 2020";
		String date="20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demos.telerik.com/kendo-ui/datetimepicker/index");
		   
		// Alert alert=driver.switchTo().alert();
		   WebElement acceptcookies=driver.findElement(By.xpath("//button[@title='Accept Cookies']"));
		   acceptcookies.click();
		   driver.findElement(By.xpath("//span[@class='k-picker-wrap k-state-default']//span[@class='k-link k-link-date']")).click();
		   Thread.sleep(2000);
		   
		   while(true)
		   {
				      
		   String text=driver.findElement(By.xpath("//div[@class='k-header']//a[@class='k-link k-nav-fast']")).getText();
		   
		     if(text.equals(month))
		     {
		    	 break;
		     }
		     else
		     {
		    	
		    	 
		    	 driver.findElement(By.xpath("//div[@class='k-header']//a[@class='k-link k-nav-next']/span")).click();
//		    	 WebDriverWait wait1 = new WebDriverWait(driver, 10);
//				 WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='k-header']//a[@class='k-link k-nav-next']/span']")));
//				 element1.click();
	         }
		   
		     driver.findElement(By.xpath("//table[@class='k-content k-month']/tbody/tr/td[contains(text(),"+date+"")).click();
		     
		   }
    
	}
}