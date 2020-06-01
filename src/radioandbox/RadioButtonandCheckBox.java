package radioandbox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonandCheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://learn.letskodeit.com/p/practice");
		  
		  driver.findElement(By.id("hondaradio")).click();
		  driver.findElement(By.id("benzcheck")).click();
	}

}
