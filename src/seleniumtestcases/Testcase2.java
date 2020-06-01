package seleniumtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Testcase2 extends gcreddy{
	
	
	public void onlinecatalog()
	{
		
		WebElement catalog=driver.findElement(By.xpath("//td[@class='headerBarContent']//a[2]"));
	    catalog.click();	
	}
	
	    public void currenturl()
	    {
		
		String catalogurl=driver.getCurrentUrl();
		if(catalogurl.equals("http://gcreddy.com/project/"))
		{
			System.out.println("user is on user interface-pass");
		
		}else
		{
	
		}
		
		
	}

}
