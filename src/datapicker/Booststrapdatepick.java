package datapicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booststrapdatepick {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="April 2020";
		String date="22";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		   
		   driver.findElement(By.xpath("//input[@class='form-control']")).click();
		   
		   while(true)
		   {
			   
		   
		String text=driver.findElement(By.xpath("//table[@class='table-condensed']/thead/tr[2]/th[@class='datepicker-switch']")).getText();
		   
		   if(text.equals(month))
		   {
			   break;
		   }
		   else
		   {
			   driver.findElement(By.xpath("//table[@class='table-condensed']/thead/tr[2]/th[@class='prev']")).click();
		   }
		   }  
		   
		   driver.findElement(By.xpath("//table[@class='table-condensed']/tbody/tr/td[contains(text(),"+date+")]")).click();
	}
}
