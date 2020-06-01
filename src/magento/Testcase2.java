package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase2 {
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
	public void mobilepage()
	{
		driver.findElement(By.xpath("//ol[@class='nav-primary']//li[1]//a")).click();
		
	    String SonyXperia=driver.findElement(By.xpath("//div[@class='price-box']//span[@id='product-price-1']/span[@class='price']")).getText();
		driver.findElement(By.xpath("//a[@title='Sony Xperia']")).click();
		String price=driver.findElement(By.xpath("//div[@class='price-box']//span[@class='price']")).getText();
		Assert.assertEquals(SonyXperia,price,"both price are equal");
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
