package datadrivennaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataReadingFromXl {

	
	static WebDriver driver;

	public static void main(String[] args) {
	
	  
	  Xls_Reader reader=new Xls_Reader("C:\\Users\\14388\\eclipse-workspace\\SeleniumSessions\\src\\testutitlity\\newcustomer.xlsx");
	  reader.getRowCount("sheet1");
	  for(int rowNum=1;rowNum<=3;rowNum++)
	  {
	  String firstname =reader.getCellData("sheet1",0, rowNum);
	  System.out.println(firstname);
	  
	  String lastname =reader.getCellData("sheet1",1, rowNum);
	  System.out.println(lastname);
	  
	  String phone =reader.getCellData("sheet1",2, rowNum);
	  System.out.println(phone);
	  
	  String email =reader.getCellData("sheet1",3, rowNum);
	  System.out.println(email);
	  
	  String username =reader.getCellData("sheet1",4, rowNum);
	  System.out.println(username);
	  
	  String password =reader.getCellData("sheet1",5, rowNum);
	  System.out.println(password);
	  
			  
			  
		
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://newtours.demoaut.com/mercuryregister.php");
		 driver.manage().window().maximize();
		 
		 
		driver.findElement(By.name("firstName")).sendKeys(firstname);
		driver.findElement(By.name("lastName")).sendKeys(lastname);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("phone")).sendKeys(password);
		

	}

}
}
