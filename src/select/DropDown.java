package select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://learn.letskodeit.com/p/practice");
		  
		  WebElement w=driver.findElement(By.id("carselect"));
		  
		  Select sel=new Select(w);
		  sel.selectByIndex(2);
		//  sel.selectByValue("Benz");
		  
		  
		  //multiselect
		  
		  WebElement wb=driver.findElement(By.id("multiple-select-example"));
		  
		  Select select=new Select(wb);
		  select.selectByIndex(1);
		  select.selectByVisibleText("Peach");
		  
	}

}
