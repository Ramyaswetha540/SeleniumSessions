package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gcreddy {
	WebDriver driver;
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://gcreddy.com/project/admin/login.php");
	}
	
	public void login(String username,String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
	}
	
	public void invalidlogin(String username,String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
		
		String errormessage=driver.findElement(By.xpath("//td[@class='messageStackError']")).getText();
		if(errormessage.contains("Error: Invalid administrator login attempt."))
		{
			System.out.println("invalid username-pass");
		}else
		{
			System.out.println("fail");
		}
		
	}
	
	
	
	public void verifylogoff()
	{
	WebElement logoff=driver.findElement(By.xpath("//td[@class='headerBarContent'][2]//a"));
	if(logoff.isEnabled())
	{
		System.out.println("logoff link enabled");
	}
	String errormessage=driver.findElement(By.xpath("//td[@class='messageStackError']")).getText();
	System.out.println(errormessage);
	
	}
	
	
	public void capturecurrenturl()
	{
		String url=driver.getCurrentUrl();
		if (url.equals("http://gcreddy.com/project/admin/index.php"))
				{
			System.out.println("login successfull");
				}
	}
	
	public void teardown()
	{
		driver.quit();
	}

}
