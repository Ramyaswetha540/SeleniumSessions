package datapicker;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQuerydatepick {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="April 2020";
		String date="22";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		   
		   driver.findElement(By.id("from")).click();
		   
		   
		   List<WebElement> monthname= driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
		
		  for(int i=0;i<monthname.size();i++)
		  {
			  if(monthname.get(i).getText().contains("June"))
			  {
				 monthname.get(i).click(); 
			  }
		  }
		 
		   driver.findElement(By.xpath("//tbody/tr/td/a[contains(text(),"+date+")]")).click();
		   
		   driver.findElement(By.id("to")).click();
		  

		   List<WebElement> tomonthname= driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
		
		  for(int i=0;i<tomonthname.size();i++)
		  {
			  if(tomonthname.get(i).getText().contains("June"))
			  {
				 tomonthname.get(i).click(); 
			  }
		  }
					   
		   driver.findElement(By.xpath("//table/tbody/tr/td/a[contains(text(),'18')]")).click();
	}

}
