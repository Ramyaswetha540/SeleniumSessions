package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtableconcept {
	
	public static void main(String[] args) throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
	  ChromeDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://learn.letskodeit.com/p/practice");
	  
	  List <WebElement> th=driver.findElements(By.xpath("//table/tbody/tr/th"));
	  
	  
	  for(int i=0;i<th.size();i++)
	  {
		  System.out.println(th.get(i).getText());
	  }
	  
//	  List<WebElement>  tr=driver.findElements(By.xpath("//table/tbody/tr/td"));
//	  
//	  for(int j=0;j<tr.size();j++)
//	  {
//		  System.out.println(tr.get(j).getText());
//	  }
	  
	  int index=0;
		for(int k=1;k<=th.size();k++)
		{
			if(th.get(k-1).getText().equals("Price"))
					{
				index=k;
				break;
					}
			
		}
WebElement w=driver.findElement(By.xpath("//table/tbody/tr[3]/td["+index+"]"));	
System.out.println(w.getText());
WebElement w1=driver.findElement(By.xpath("//table/tbody/tr[2]/td["+index+"]"));
System.out.println(w1.getText());
}
}
