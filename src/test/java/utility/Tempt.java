package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt {
	
		public static void main(String[] args) throws InterruptedException 
		{
			
	    System.setProperty("webdriver.chrome.driver", "E:\\Automation Suppot\\chromedriver.exe");
			
		ChromeDriver driver=new ChromeDriver();
			
	    driver.manage().window().maximize();
			
		
		//opening application	
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//click on login page
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act=new Actions(driver);
    	//navigate my profile	
	    WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
		
		act.moveToElement(abc).build().perform();
		Thread.sleep(5000);
		
		//click on my profile
		driver.findElement(By.xpath("(//*[@class='_2NOVgj'])[1]")).click();	 
		
		//provide user name 
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9373265935");
		
		//provide password
		driver.findElementByXPath("//*[@type='password']").sendKeys("sachin@13");
		
		//click on login button
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
		
        }	
}