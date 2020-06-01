package seleniumtestcases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Gcrdatadriven {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://gcreddy.com/project/admin/login.php");
	}
	@Test(dataProvider="getdata")
	public void login(String username,String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		Assert.assertEquals("http://gcreddy.com/project/admin/index.php", driver.getCurrentUrl());
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		
		Object[][] data=Gcdataprovider.gettestdata("sheet1");
		return data;
		
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
