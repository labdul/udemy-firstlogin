package FirstPackage;


//import cucumber.api.java.After;
//import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class StartingSteps extends DriverFactory {

	@Given ("^I am in a Bovada Lint site$")
	public void launch_bovada_site() throws Throwable{
		driver.get("https://sports.lint.bovada.lv/");
		driver.manage().window().maximize();
	}
	


}
