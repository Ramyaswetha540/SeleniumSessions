package datapicker;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdowndatepick {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="August 2020";
		String date="20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
		 Thread.sleep(2000);
		   Alert al=driver.switchTo().alert();
		   
		   String alerttext=al.getText();
	//String captionbox=driver.findElement(By.xpath("//div[@class='screen optin-form-screen']")).getText();
		
	if(alerttext.contains("FREE Tutorials, CheatSheets, Jobs & Trainings. JOIN US"))
	{
	
	driver.findElement(By.xpath("//a[@id='close-icon']")).click();
		   
	}
		   driver.findElement(By.id("datepicker")).click();
		   
		    List<WebElement> months=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
		   
		    
		    for(int i=0;i<months.size();i++)
		    {
		    	if(months.get(i).getText().contains("Jul"))
		    	{
		    		months.get(i).click();	
		    	}
		    
		    }
		    
		    List<WebElement> year=driver.findElements(By.xpath("//select[@class='ui-datepicker-year']"));
		    
		    for(int j=0;j<year.size();j++)
		    {
		    	if(year.get(j).getText().contains("2019"))
		    			{
		    		
		    		year.get(j).click();
		    			}
		     }
		    
		  driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'21')]")).click(); 
		   
		   
}
}