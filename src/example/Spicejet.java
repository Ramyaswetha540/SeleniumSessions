package example;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws Exception {
					
			System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
			  
			 WebDriver driver =new ChromeDriver();
			  
			  driver.get("https://www.spicejet.com/");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
			  driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
			  Thread.sleep(2000);
			  
			  List <WebElement> lis=driver.findElements(By.xpath("(//div[@class='dropdownDiv'])[1]//li"));
			  
			  for(int i=0;i<lis.size();i++)
			  {
				  
				  System.out.println(lis.get(i).getText());
				  
				  if(lis.get(i).getText().equals(" Bengaluru (BLR)"))
				  {
					driver.findElement(By.linkText(" Bengaluru (BLR)")).click();
				  }
			  }

	}

}
