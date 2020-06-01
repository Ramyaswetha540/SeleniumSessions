package magento;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;



public class Testcase5 {
	WebDriver driver;
	
	  public String firstName = "aayaans";    // Firstname and Lastname will be placed    
	  public String lastName = "adatars";  // in a TestData EXCEL file at some stage
	  
	@BeforeMethod
	public void startup()
	{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://live.demoguru99.com/index.php/");
      }
	
	@Test
	public void accountlink() throws Exception
	{
		
	//account 
		
	driver.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[@class='label']")).click();
	//myaccount
	
	driver.findElement(By.xpath("//div[@id='header-account']/div/ul/li/a")).click();
	
	  // switching to new window
    for (String handle : driver.getWindowHandles()) {
    	driver.switchTo().window(handle);
    	}
    
    //create account
    
    driver.findElement(By.linkText("CREATE AN ACCOUNT")).click();
    
    // switching to new window
    for (String handle : driver.getWindowHandles()) {
    	driver.switchTo().window(handle);
    	}
    
 // 3b. and fill New User information 
    driver.findElement(By.id("firstname")).clear();	   
    driver.findElement(By.id("firstname")).sendKeys(firstName); 
    driver.findElement(By.id("lastname")).clear();	    
    driver.findElement(By.id("lastname")).sendKeys(lastName);
    driver.findElement(By.id("email_address")).clear();
    driver.findElement(By.id("email_address")).sendKeys("aayaans@yahoo.com");
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("aswarasa23");
    driver.findElement(By.id("confirmation")).clear();
    driver.findElement(By.id("confirmation")).sendKeys("aswarasa23");
    
    // 4. Click Register
    driver.findElement(By.xpath("//button[@title='Register']")).click();
    Thread.sleep(2000);
    
    // switching to new window
    for (String handle : driver.getWindowHandles()) {
    	driver.switchTo().window(handle);
    	}
    
    String welcome=("Hello, " + firstName + " " + lastName + "!");
    String welcomemessage=driver.findElement(By.xpath("//div[@class='welcome-msg']/p")).getText();
    
   System.out.println(welcomemessage);
		
    Assert.assertEquals(welcomemessage,welcome);

//switching to new window
for (String handle : driver.getWindowHandles()) {
	driver.switchTo().window(handle);
	}
	
//tv link

driver.findElement(By.linkText("TV"));
// switching to new window
for (String handle : driver.getWindowHandles()) {
	driver.switchTo().window(handle);
	}

//wishlist
driver.findElement(By.linkText("Add to Wishlist")).click();

// switching to new window
for (String handle : driver.getWindowHandles()) {
	driver.switchTo().window(handle);
	}

driver.findElement(By.xpath("//div[@class='buttons-set buttons-set2']//button[@class='button btn-share']/span/span")).click();

//switching to new window
for (String handle : driver.getWindowHandles()) {
	driver.switchTo().window(handle);
	}
//sharelist email
driver.findElement(By.xpath("//ul[@class='form-list']/li/div/textarea[@name='emails']")).sendKeys("support@guru99.com");
//sharelist message
driver.findElement(By.xpath("//ul[@class='form-list']/li/div/textarea[@name='message']")).sendKeys("Hey Mary!! this LCD TV looks ok, check it out !!.. cheers .. Berry");

driver.findElement(By.xpath("//div[@class='buttons-set form-buttons']/button[@title='Share Wishlist']/span/span")).click();

String successmessage=driver.findElement(By.xpath("//ul[@class='messages']/li/ul/li/span")).getText();

Assert.assertEquals(successmessage,"Your Wishlist has been shared.");


	}
	
//	@DataProvider
//	public Object[][] getdata()
//	{
//		Object data[][]=Dataprovider.getTestData("sheet1");
//		return data;
//	}
	
	
	@AfterMethod
	public void teradown()
	{
		driver.quit();
	}
}
