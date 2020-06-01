package javascritexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
		
		
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		  ChromeDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://newtours.demoaut.com/");
		  
	driver.findElement(By.name("userName")).sendKeys("ramya");
	driver.findElement(By.name("password")).sendKeys("swetha");
    //  driver.findElement(By.name("login")).click();
    
WebElement r=driver.findElement(By.linkText("REGISTER"));
      		
     //flash(loginbutton, driver);
     //gettitle
       System.out.println(getTitleByJS(driver));  
     //generatealert
     // generateAlert(driver, "There is issue with login button");
       //refreshBrowserByJS(driver);
       //get innert text
       System.out.println(getPageInnerText(driver));
       //scrollpagedown
      // scrollPageDown(driver);
       //scrollintoelement
       //scrollIntoView(r, driver); we need to pass the element which is last in the page
	}


	public static void flash(WebElement element,WebDriver driver)
	{
	    JavascriptExecutor js=((JavascriptExecutor)driver);
	    String backgroundcolor=element.getCssValue("backgroundColour");
	    
	    for(int i=0;i<10;i++)
	    {
	    	changeColor("rgb(0,200,0)",element,driver);
	    	changeColor(backgroundcolor,element,driver);
	    }
    }


	private static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'"+ element);
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
		}
	}
		public static String getTitleByJS(WebDriver driver)
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			String s=js.executeScript("return document.title;").toString();
			
			return s;
				}
		
		   public static void generateAlert(WebDriver driver, String message){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("alert('"+message+"')");
		    }
		   public static void refreshBrowserByJS(WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("history.go(0)");
		    }
		   
		   public static String getPageInnerText(WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		    	return pageText;
		    }    
		   
		   public static void scrollPageDown(WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		    }
		   public static void scrollIntoView(WebElement element, WebDriver driver){
		    	JavascriptExecutor js = ((JavascriptExecutor) driver);
		    	js.executeScript("arguments[0].scrollIntoView(true);", element);
		    }
		  
		    
	}  