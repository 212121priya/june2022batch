package cucumbermap;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.SeleniumOperations;

public class Login
{
	@Given ("^User provide browser name as \"(.*)\" and exe location as \"(.*)\"$")
  public void bLaunch(String name, String location) 
            {
		 Object[] input=new Object[2];
	           input[0]=name ;
	           input[1]=location;
	        SeleniumOperations.browserLaunch(input);
           }
	
	@Given ("^User enter url as \"(.*)\"$")
	        public void openApp(String url)
	        {
		 Object[] input1=new Object[1];
 		   input1[0]=url;
 		 SeleniumOperations.openApplication(input1);     
            }

	@Given ("^User cancel initial login window$")
	        public void openApp() throws InterruptedException
	        {
		 Object[] input2=new Object[1];
		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		   SeleniumOperations.clickOnElement(input2);     

	        }

	@When ("^user navigate on Login tab$")
	      public void clickone()
	      {
		Object[] input3=new Object[1];
        input3[0]="//*[@class='_1_3w1N']";
        SeleniumOperations.mouseOverAction(input3);

	      }

	@When ("^click on MyProfile$")
	      public void clickOnElement() throws InterruptedException
	      {
		 Object[] input4=new Object[1];
         input4[0]="(//*[@class='_2NOVgj'])[1]";
         SeleniumOperations.clickOnElement(input4);     

	      }

	@When ("^user enter \"(.*)\" as username$")
	      public void sendText(String username) throws InterruptedException
	      {
		 Object[] input5=new Object[2];
	           input5[0]="//*[@class='_2IX_2- VJZDxU']";
	           input5[1]=username;
	        SeleniumOperations.sendText(input5);
	  
	      }

	@When ("^user enter \"(.*)\" as password$")
	       public void sendTextt(String password) throws InterruptedException
	       {
	        Object[] input6=new Object[2];
             input6[0]="//*[@type='password']";
             input6[1]=password;
             SeleniumOperations.sendText(input6);  
         
           }
	
	@When ("^user click on Login butten$")
	        public void clicktwo() throws InterruptedException
	        {
		        Object[] input7=new Object[1];
                input7[0]="(//*[text()='Login'])[3]";
                SeleniumOperations.clickOnElement(input7);         	           

	        }	
	@Then ("^Application shows user profile to user$")
	        public void valid() throws InterruptedException
	         {
		       Object[] input8=new Object[2];
               input8[0]="//*[text()='Priya Shejwal']";

               input8[1]="Priya Shejwal";

               SeleniumOperations.sendText(input8);  
    	
	}

}
