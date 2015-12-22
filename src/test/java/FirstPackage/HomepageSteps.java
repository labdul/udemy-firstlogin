package FirstPackage;

import junit.framework.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageSteps extends DriverFactory{
	
	@When("^I Login with \"([^\"]*)\"$")
	public void i_login_with(String username) throws Throwable{
		new SportsHomepage(driver).click_login_button();
		new SportsHomepage(driver).wait_for_Welcome_back_pop_up();
		new SportsHomepage(driver).enter_username(username);
		new SportsHomepage(driver).enter_password("testing");
		new SportsHomepage(driver).click_login_submit_button();
		
		
	}
	
	@Then("I should see \"([^\"]*)\" on the home page")
	public void account_balance_on_homepage(String balance) throws Throwable {
		String balance_on_homepage = new SportsHomepage(driver).get_balance_on_homepage();
		Assert.assertEquals(balance, balance_on_homepage);
	}
	
	
	@When ("I click on the account profile")
	public void when_click_account_profile_icon() throws Throwable {
		new SportsHomepage(driver).click_account_profile_icon();
	}
	
	@And("browser should be closed")
	public void closeBrowser() throws Throwable {
		new SportsHomepage(driver).close_driver();
		
	}
	
	@And("I log out")
	public void log_out() throws Throwable {
		new SportsHomepage(driver).click_log_out();
		
	}

	

}
