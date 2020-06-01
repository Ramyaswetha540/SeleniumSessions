package datapicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatapickerDemo {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
		String month="July,2020";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://phptravels.net/home");
		   
		   driver.findElement(By.id("checkin")).click();
		   Thread.sleep(2000);
		   //first capture the month webelement based on the month we have to click arrow mark to reach required month
		   while(true)
		   {
		   String text=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]/i")).getText();
		   
		   if(text.equals(month))
		   {
			   break;
		   }
		   else
		   {
			   driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]/svg/path")).click();
		   }
		   
		   }
		   
		   driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div[2]/div[23]")).click();//this is not customized//you need to take customized xpath
		   
		   
		

	}

}
