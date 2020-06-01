package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
		  driver.findElement(By.id("dropdownMenuButton")).click();
List <WebElement> list= driver.findElements(By.xpath("//div[contains(@class,'dropdown-menu')]and[@aria-labelledby='dropdownMenuButton']//a"));
System.out.println(list.size());
for(int i=0;i<list.size();i++)
{
	if(list.get(i).getText().contains("Action"))
	{
		list.get(i).click();
	}
}
	}

}
