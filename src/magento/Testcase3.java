package magento;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase3 {
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
	public void addcart()
	{
		driver.findElement(By.xpath("//ol[@class='nav-primary']//li[1]//a")).click();
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/button/span/span")).click();
		driver.findElement(By.xpath("//tr[@class='first last odd']//td[4]/input")).sendKeys("1000");
		driver.findElement(By.xpath("//tr[@class='first last odd']//td[4]/button/span/span")).click();
		String errormessage=driver.findElement(By.xpath("//tr[@class='first last odd']/td[@class='product-cart-info']/p")).getText();
		Assert.assertEquals(errormessage,"* The maximum quantity allowed for purchase is 500.");
		driver.findElement(By.xpath("//button[@type='submit'][2]/span/span")).click();
		String emptycart=driver.findElement(By.xpath("//div[@class='page-title']/h1")).getText();
		System.out.println(emptycart);
		Assert.assertEquals(emptycart, "SHOPPING CART IS EMPTY");
	}
	
	@AfterMethod
	public void teradown()
	{
		driver.quit();
	}
}
