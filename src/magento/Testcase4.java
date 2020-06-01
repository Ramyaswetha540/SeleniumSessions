package magento;

import java.io.File;



import java.util.Iterator;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Testcase4 {
	WebDriver driver;
	@BeforeMethod
	public void startup()
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://live.demoguru99.com/index.php/");
      }
	
	
	@Test
	public void popupwindow() throws Exception
	{
		driver.findElement(By.xpath("//ol[@class='nav-primary']//li[1]//a")).click();
	    driver.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']//li[2]/a")).click();
	    driver.findElement(By.xpath("//ul[@class='products-grid products-grid--max-4-col first last odd']/li[2]/div/div[@class='actions']/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//div[@class='actions']/button[@title='Compare']/span/span")).click();
	    
	  //  String parentwindow=driver.getWindowHandle();
		
		Set<String> windowhandler=driver.getWindowHandles();
		
		Iterator<String> itr= windowhandler.iterator();
		String parentwindow=itr.next();
		System.out.println(parentwindow);
		String window=itr.next();
		System.out.println(window);
		
		driver.switchTo().window(window);
		
		String title= driver.getTitle();
		System.out.println(title);
		
		//Assert.assertEquals(title, "pop up titleProducts Comparison List - Magento Commerce");
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		driver.close();
		driver.switchTo().window(parentwindow);
	}
	
	
	
	
	
	@AfterMethod
	public void teradown()
	{
		driver.quit();
	}
}
