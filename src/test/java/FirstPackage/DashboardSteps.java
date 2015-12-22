package FirstPackage;

import junit.framework.Assert;
//import cucumber.api.java.After;
import cucumber.api.java.en.Then;

public class DashboardSteps extends DriverFactory{
	

	@Then("^I should see \"([^\"]*)\" on the Dashboard$")
	public void account_balance_on_dashborad(String balance2) throws Throwable {
		String balance_on_dashboard = new DashboardPage(driver).get_balance_on_dashboard();

		Assert.assertEquals(balance2, balance_on_dashboard);
		new DashboardPage(driver).close_dashboard();
	}
		

}
