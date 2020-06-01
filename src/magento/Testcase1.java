package magento;

import java.io.File;




import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Testcase1 {
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
	public void verifytile()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Home page");
	}
	@Test(priority=1)
	public void clickonmobilelink()
	{
	  driver.findElement(By.xpath("//ol[@class='nav-primary']//li[1]//a")).click();
		String mobiletitle=driver.getTitle();
		Assert.assertEquals(mobiletitle,"Mobile");
	}
	@Test(priority=2)
	public void sortby() throws Exception
	{
		
		driver.findElement(By.xpath("//ol[@class='nav-primary']//li[1]//a")).click();
		WebElement options=driver.findElement(By.xpath("//div[@class='sort-by']//select[@title='Sort By']"));
		Select sel=new Select(options);
		sel.selectByIndex(1);
		driver.findElement(By.xpath("//a[@class='sort-by-switcher sort-by-switcher--asc']")).click();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
