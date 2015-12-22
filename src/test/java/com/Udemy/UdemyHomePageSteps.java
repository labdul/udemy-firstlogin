package com.Udemy;



import cucumber.api.java.en.When;

public class UdemyHomePageSteps extends DriverFactory {
	
	@When("^i click on Login link$")
	public void i_click_on_Login_link() throws Throwable {
		new UdemyHomePage(driver).click_login_button();
	}
	
	@When("^enter valid email address$")
	public void enter_valid_email_address() throws Throwable {
		new UdemyHomePage(driver).wait_for_visibility_of_email_textbox();
	   new UdemyHomePage(driver).enter_email_address();
	   
	}
	
	@When("^enter valid password$")
	public void enter_valid_password() throws Throwable {
		new UdemyHomePage(driver).enter_password();
	}
	
	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		new UdemyHomePage(driver).click_submit_button();
	}

	
	
	

}
