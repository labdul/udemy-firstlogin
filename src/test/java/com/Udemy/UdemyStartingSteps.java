package com.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class UdemyStartingSteps extends DriverFactory {
	
	
	
    @Before
    public void beforeScenario() {
       driver = new DriverFactory().getDriver();
        System.out.println("this will run before the actual scenario");
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
        System.out.println("this will run after scneario is finished, even if it failed");
    }
	

	@Given("^I am on the Udemy site$")
	public void i_am_on_the_Udemy_site() throws Throwable {
		
	  driver.get("https://www.udemy.com");
	   driver.manage().window().maximize();

	}

}
