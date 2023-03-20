@Sanity
Feature: To validate the FaceBook Login functionality
Scenario: To validate login with valid username & invalid password
Given to launch chrome browser and maximize window
When to launch the URL of the facebook application
And To pass vaild username in email field
And To pass invalid password in password field
And Click the Login button
And To check whether browser navigates to Fb Homepage or not
Then Close the browser

@Smoke
Scenario Outline: To validate the positive and negative combinations of login functionality
Given User has to launch chrome browser and maximize window
When User has to launch the facebook url
And User has to pass data "<emaildata>" in the email field 
And User has to pass data "<pasworddata>" in the password field 
And User has to click the Login button
Then User has to close the browser

Examples:
|emaildata       |pasworddata|
|karthi@gmail.com|karthi12345|
|suresh@gmail.com|suresh12345|
|dinesh@gmail.com|dinesh12345|
|ramesh@gmail.com|ramesh12345|
|ganesh@gmail.com|ganesh12345|