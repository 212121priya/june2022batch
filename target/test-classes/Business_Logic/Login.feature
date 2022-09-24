Feature: Login functionality

Background: User cancel initial Login window
Given User provide browser name as "Chrome" and exe location as "E:\\Automation Suppot\\chromedriver.exe"
Given User enter url as "https://www.flipkart.com"
Given User cancel initial login window

@SmokeTest
Scenario: Login functionality with valid creadentials
When user navigate on Login tab
When click on MyProfile
When user enter "9373265935" as username
When user enter "sachin@13" as password
When user click on Login butten
Then Application shows user profile to user
