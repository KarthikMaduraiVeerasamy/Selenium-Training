Feature: To validate the FaceBook Login functionality
Scenario: To validate login with valid username & invalid password
Given to launch chrome browser and maximize window
When to launch the URL of the facebook application
And To pass vaild username in email field
And To pass invalid password in password field
And Click the Login button
And To check whether browser navigates to Fb Homepage or not
Then Close the browser
