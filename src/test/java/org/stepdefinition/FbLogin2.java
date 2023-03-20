package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin2 extends BaseClass {
	@Given("to launch chrome browser and maximize window")
	public void to_launch_chrome_browser_and_maximize_window() {
	 launchBrowser();
	 windowMaximize();
	 }

	@When("to launch the URL of the facebook application")
	public void to_launch_the_URL_of_the_facebook_application() {
	launchUrl("https://en-gb.facebook.com/");  
	}

	@When("To pass vaild username in email field")
	public void to_pass_vaild_username_in_email_field() {
	FbLoginPojo f = new FbLoginPojo();
	passText("karthik@gmail.com", f.getVarRef());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		FbLoginPojo f = new FbLoginPojo();
		passText("1234567", f.getPassword());  
	}

	@When("Click the Login button")
	public void click_the_Login_button() {
		FbLoginPojo f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());}

	@When("To check whether browser navigates to Fb Homepage or not")
	public void to_check_whether_browser_navigates_to_Fb_Homepage_or_not() {
	System.out.println("Check Your Login Credentials");   
	}

	@Then("Close the browser")
	public void close_the_browser() {
	closeEntireBrowser();  
	}

}
