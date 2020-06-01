package magento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase6 {
	
	WebDriver driver;
	
	public static String email="Berry123@tpg.com.au";
	public static String password="mar8mar";//these values should be save din excel file

	@BeforeMethod
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://live.demoguru99.com/index.php/");
  
    }
	@Test
	public void purchaseproduct()
	{
		//account 
		
		driver.findElement(By.xpath("//div[@class='account-cart-wrapper']/a/span[@class='label']")).click();
		//myaccount
		
		driver.findElement(By.xpath("//div[@id='header-account']/div/ul/li/a")).click();
		
		  // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
	   //login 
	    driver.findElement(By.xpath("//ul[@class='form-list']/li/div/input[@name='login[username]']")).sendKeys(email);
	    
	    driver.findElement(By.xpath("//ul[@class='form-list']/li/div/input[@name='login[password]']")).sendKeys(password);
	    
	    
	    driver.findElement(By.xpath("//button[@title='Login']")).click();
	    
	   //clcik tv
	    driver.findElement(By.linkText("TV")).click();
	    
	 // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
	    
	    //add wishlist
	    driver.findElement(By.xpath("//li[@class='item last'][1]/div/div[@class='actions']/ul/li[1]/a")).click();
	    
	    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
	    
	    //click on mywishlistlink leftside
	    
	    driver.findElement(By.xpath("//div[@class='block-content']/ul/li[8]")).click();
	    
	   	    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
	    //click on add to cart
	    driver.findElement(By.xpath("//td[@class='wishlist-cell4 customer-wishlist-item-cart']/div/button")).click();
	    
	 // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
	    //click proceed to check out
	   
	     
	    driver.findElement(By.linkText("Proceed to Checkout")).click();
	    // switching to new window
	    for (String handle : driver.getWindowHandles()) {
	    	driver.switchTo().window(handle);
	    	}
	    //billing info continue
	    driver.findElement(By.xpath("//div[@class='fieldset']//button[@title='Continue']/span/span")).click();
	   //shipping info edit
	    driver.findElement(By.xpath("//li[@id='opc-shipping']/div/a")).click();
	    //shipping info continue
	    driver.findElement(By.xpath("//div[@id='checkout-step-shipping']/form/div/button/span")).click();
	    //shipping methods
	    driver.findElement(By.xpath("//div[@id='checkout-step-shipping_method']/form/div/button/span/span")).click();
	    //payment method
	    driver.findElement(By.xpath("//*[@id=\"p_method_checkmo\"]")).click();
	    //payment continue
	    driver.findElement(By.xpath("//div[@id='checkout-step-payment']/div[@class='buttons-set']/button/span/span")).click();
	    
	    
	}
	

}
