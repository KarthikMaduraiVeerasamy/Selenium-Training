package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveNegativeFb extends BaseClass {
	FbLoginPojo f;
	@Given("User has to launch chrome browser and maximize window")
	public void user_has_to_launch_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("User has to launch the facebook url")
	public void user_has_to_launch_the_facebook_url() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass data {string} in the email field")
	public void user_has_to_pass_data_in_the_email_field(String em) {
	    f = new FbLoginPojo();
	    passText(em, f.getVarRef());
	}

	@When("User has to pass data {string} in the password field")
	public void user_has_to_pass_data_in_the_password_field(String pas) {
		f = new FbLoginPojo();
	    passText(pas, f.getPassword());   
	}

	@When("User has to click the Login button")
	public void user_has_to_click_the_Login_button() {
		f = new FbLoginPojo();
	    clickBtn(f.getLoginBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	   closeEntireBrowser(); 
	}

}
