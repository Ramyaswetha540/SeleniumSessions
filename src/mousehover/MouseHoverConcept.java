package mousehover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverConcept {
	
	
	public static void main(String[] args) throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://learn.letskodeit.com/p/practice");
	  
	  
	  WebElement w=driver.findElement(By.id("mousehover"));
	  
	  Actions action=new Actions(driver);
     action.moveToElement(w).build().perform();
     
     driver.findElement(By.linkText("Top")).click();
}
}
