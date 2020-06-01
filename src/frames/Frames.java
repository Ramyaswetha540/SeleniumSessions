package frames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://learn.letskodeit.com/p/practice");
	  
	WebElement frame=driver.findElement(By.id("courses-iframe"));
	  
	driver.switchTo().frame(frame);
	  
	driver.findElement(By.id("search-courses")).sendKeys("Selenium Webdriver"); 
	driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(frame);
	
	driver.findElement(By.xpath("//div[@class='course-listing-title']")).click();
	driver.navigate().back();
	  
	  driver.quit();
	  
	  
}
}
