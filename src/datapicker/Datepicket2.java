package datapicker;
//  a[text()='9']  xpath of date select
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicket2 {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		String month="July 2020";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.expedia.ca/?pwaLob=wizard-hotel-pwa-v2");
		   
		   driver.findElement(By.id("d1-btn")).click();
		   Thread.sleep(2000);
		      		   
		  while(true)
		   {
			   String text=driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[1]")).getText();
			   
			   if(text.equals(month))
			   {
				   break;
				   
		   }
			   else
			   {
				   driver.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			   }
		   }
		  
		   List<WebElement> l=driver.findElements(By.xpath("//table[@class='uitk-new-date-picker-weeks']"));//take the xpath of the calender and get the text
		   
		   for(WebElement e:l)
		   {
			 String datetext=e.getText();//month and date are printed two values but we need to take only date so we need to split the values
			 
			String date[]= datetext.split("\n");
			
			if(date[1].equals(day))
			{
				e.click();
				break;
			}
			 
			 
		   }
		   
		 
	}

}
