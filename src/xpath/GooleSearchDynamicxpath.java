//package xpath;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class GooleSearchDynamicxpath {
//	
//	public static void main(String[] args)
//	{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
//		  ChromeDriver driver=new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.get("https://www.google.com/");
//		  
//		  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("//input[@class='gLFyf gsfi']");
//		  
//	List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li//div/descendant::div[@class='sbl1']/span[text()='sbl1']")	  
//	}
//	
//}
