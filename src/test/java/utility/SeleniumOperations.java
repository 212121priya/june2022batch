
package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	
	//browserLaunch
	          public static void browserLaunch(Object[]inputParameters)
	          {
	        	  try{
	        	  String bName=(String) inputParameters[0];
	        	  String webDriverExePath=(String) inputParameters[1];
	        	  
	        	  if(bName.equalsIgnoreCase("Chrome"))
	        	  {
	        	  System.setProperty("webdriver.chrome.driver", webDriverExePath);
	        	   driver=new ChromeDriver();
	        	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        	  driver.manage().window().maximize();
	        	  }
	        	  else if(bName.equalsIgnoreCase("Firefox"))
	        	  {
		        	  System.setProperty("webdriver.gecko.driver", webDriverExePath);
		        	   driver=new FirefoxDriver();
		        	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                       driver.manage().window().maximize();
		        	  }
	          }
	        	  catch(Exception e)
	        	  {
	        		  System.out.print(e);
	        	  }
	          }
	
	          //openApplication
	          public static void openApplication(Object[]inputParameters)
	          {
	        	  try{
	        	  String strgUrl=(String) inputParameters[0];        	
	        	  driver.get(strgUrl);	
	        	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	          }
	        	  catch(Exception e)
	        	  {
	        		  System.out.print(e);
                  }
	          }
	          //click
	          public static void clickOnElement(Object[]inputParameters) throws InterruptedException
	          {
	        	  try{
	        	  String locator=(String) inputParameters[0];       	
	        	  Thread.sleep(2000);
	        	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	        	  driver.findElement(By.xpath(locator)).click();
	          }
	          catch(Exception e)
        	  {
        		  System.out.print(e);
              }
              }               
	          
	          
	          //mouseOver
	          public static void mouseOverAction(Object[]inputParameters)
	          {
	        	  try{
	        	  String locator=(String) inputParameters[0];            	
	        	  
	        	  Actions act=new Actions(driver);
	      		
	      		WebElement abc=driver.findElement(By.xpath(locator));
	      		
	      		act.moveToElement(abc).build().perform();	
	        	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	        	  
	          }
	        	  catch(Exception e)
	        	  {
	        		  System.out.print(e);
	              }
	              }     
	          	          
	          //send keys
	          public static void sendText(Object[]inputParameters) throws InterruptedException
	          {
	        	  try{
	        	  Thread.sleep(2000);
	      		
	        	  String locator=(String) inputParameters[0];    
	        	  String sendText=(String) inputParameters[1];           	  
	        	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	        	  driver.findElement(By.xpath(locator)).sendKeys(sendText);
	          }
	        	  catch(Exception e)
	        	  {
	        		  System.out.print(e);
	              }
	              }     
	          //validation
	          
	          public static void validation(Object[]inputParameters)
	          {
	        	  try{
	          String xpath=(String) inputParameters[0];    
        	  String giventext=(String) inputParameters[1]; 
       	      driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

              String findedText=driver.findElement(By.xpath(xpath)).getText();
              if(findedText.equalsIgnoreCase(giventext))
              {
            	System.out.println("Test case pass");  
              }
              
              else
              {
              	System.out.println("Test case fail");  
  
              }
            }
	        	  catch(Exception e)
	        	  {
	        		  System.out.print(e);
	              }
	              }   
}