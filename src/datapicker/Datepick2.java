package datapicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Datepick2 {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="July 2020";
		String date="20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.globalsqa.com/demo-site/datepicker/");
    
		   
		   //org.openqa.selenium.ElementNotInteractableException-if this exception occurs then u need to use webdriverwait and specify the element xpath to be clickable
		   //in this date picker app i was unable to click the webelement which is in the frame so first i have taken the webelement of the frame
		   //and switch the frame next to click the element present in the frame i used webdriver wait as i am getting the exception when i used this it works
		  
		   
		   WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));   
		   driver.switchTo().frame(frame);
	   
		   WebDriverWait wait1 = new WebDriverWait(driver, 10);
		   WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='datepicker']")));
		  
		   element1.click();
		   
		   
	
	 
	 driver.findElement(By.xpath("//input[@id='datepicker']")).click();

	 
	 
	 Thread.sleep(2000);
	
	 while(true)
	 {
		 ////div[@class='ui-datepicker-title']
		 
	String text=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();//xpath of may2020
		 
	 if(text.equals(month))
	 {
		 break;
	 }
	 else
       {
			driver.findElement(By.xpath("//a[@title='Next']")).click();;

			   
      }
	 }
	Thread.sleep(2000);
	//WebElement dateclick=driver.findElement(By.xpath("//tbody/tr/td[contains(text(),"+date+")]"));
// org.openqa.selenium.NoSuchElementException occured when finding the common xpath for selectind date until july it is exceuting but date not selecting	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	WebElement dateclick= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr/td[contains(text(),"+date+")]")));
	dateclick.click();
      
	 
	 
 }
}


