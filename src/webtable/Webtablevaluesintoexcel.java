package webtable;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import datadrivennaveen.Xls_Reader;

public class Webtablevaluesintoexcel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.w3schools.com/html/html_tables.asp");
		  
		  
		  
		  
		  //xpath of first coloums of all rows check the pattern of xpath
		  //*[@id="customers"]/tbody/tr[2]/td[1]
		  //*[@id="customers"]/tbody/tr[3]/td[1]
		  
		  String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		  String afterXpath="]/td[1]";
		  
		//*[@id="customers"]/tbody/tr[2]/td[2]
		  ////*[@id="customers"]/tbody/tr[3]/td[2]
		  
		  String beforeXpathcontact="//*[@id=\"customers\"]/tbody/tr[";
		  String afterXpathcontact="]/td[2]";
	
		  
		  //*[@id="customers"]/tbody/tr[2]/td[3]
			//*[@id="customers"]/tbody/tr[5]/td[3]
			  
		  String beforeXpathcountry="//*[@id=\"customers\"]/tbody/tr[";
		  String afterXpathcountry="]/td[3]";
		  
		   
		  List<WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));//gives total no of rows in this arraylist
		  System.out.println("total no of rows"+rows.size());
		
		  int rowcount=(rows.size()-1);
		  
		  Xls_Reader reader=new Xls_Reader("C:\\Users\\14388\\eclipse-workspace\\SeleniumSessions\\src\\webtable\\webtablexl.xlsx");
		 
		  if(!reader.isSheetExist("tabledata"))
		  {
			  reader.addSheet("tabledata");
		  }
		  
		  
		  reader.addColumn("tabledata", "Company");
		  reader.addColumn("tabledata", "Contact");
		  reader.addColumn("tabledata","Country");
		  reader.addColumn("tabledata", "Status");
		  
		  for(int i=2;i<=rowcount;i++)
		  {
			  String actualXpath=beforeXpath+i+afterXpath;
			  String name=driver.findElement(By.xpath(actualXpath)).getText();
			  System.out.println(name);
			  reader.setCellData("tabledata", "Company",i,name);
			  
		  	   
			  String actuaclxpathcontact=beforeXpathcontact+i+afterXpathcontact;
			  String contact=driver.findElement(By.xpath(actuaclxpathcontact)).getText();
		      System.out.println(contact);
		    
		      reader.setCellData("tabledata","Contact",i,contact);
		   		  		 
	          String actualxpathcountry=beforeXpathcountry+i+afterXpathcountry;
              String country=driver.findElement(By.xpath(actualxpathcountry)).getText();
			  System.out.println(country);
			 
			  reader.setCellData("tabledata","Country", i, country);
		  
		  } 
		   
		   
		   
		  
	}

}