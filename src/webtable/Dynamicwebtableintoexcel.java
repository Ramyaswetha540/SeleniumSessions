package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicwebtableintoexcel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		driver.manage().window().maximize();
		
		//1.take the table count
		
		List<WebElement>list=driver.findElements(By.xpath("//table[@id='example']"));
		
		System.out.println(list.size());
		
		
		// This is for first coloum-name
		//*[@id="example"]/tbody/tr[1]/td[1]
		//*[@id="example"]/tbody/tr[3]/td[1]
		//*[@id="example"]/tbody/tr[5]/td[1]
		
		//name-
//		String beforexpath="//*[@id=\"example\"]/tbody/tr[";
//		String afterxpath="]/td[1]";
//		
//		for(int i=2;i<list.size();i++)
//		{
//			String actualxpath=beforexpath+i+afterxpath;
//			     String names=driver.findElement(By.xpath(actualxpath)).getText();
//			     System.out.println(names);
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		//position
		
		//*[@id="example"]/tbody/tr[1]/td[2]
		//*[@id="example"]/tbody/tr[3]/td[2]
		//*[@id="example"]/tbody/tr[7]/td[2]
		
		

	}

}
