package com.Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class UdemyLoogSteps {
/*	WebDriver driver = new FirefoxDriver();
	
	
	@Given("^I am on the Udemy site$")
	public void i_am_on_the_Udemy_site() throws Throwable {
		
	   driver.get("https://www.udemy.com/");
	   driver.manage().window().maximize();

	}

	@When("^i click on Login link$")
	public void i_click_on_Login_link() throws Throwable {
	    driver.findElement(By.linkText("Login")).click();
	    
	}

	@When("^enter valid email address$")
	public void enter_valid_email_address() throws Throwable {
	   WebDriverWait Wait = new WebDriverWait(driver,10);
	   Wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_email")));
	   driver.findElement(By.id("id_email")).sendKeys("abdulsalam12000@yahoo.com");
	   
	}

	@When("^enter valid password$")
	public void enter_valid_password() throws Throwable {
		   driver.findElement(By.id("id_password")).sendKeys("Olayinka1!");
	}

	@When("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
		driver.findElement(By.id("submit-id-submit")).click();
	}

	@Then("^i am logged in$")
	public void i_am_logged_in() throws Throwable {
		 WebDriverWait Wait = new WebDriverWait(driver,10);
		   Wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Browse Courses")));

		   
		   String browse_courses_link = driver.findElement(By.linkText("Browse Courses")).getText();
		   Assert.assertEquals("fail", "Browse Courses", browse_courses_link);
		   System.out.println (browse_courses_link);
		
		Boolean search_input_isdisplayed = (driver.findElement(By.xpath(".//*[@id='searchbox']/input")).isDisplayed());
		Assert.assertTrue(search_input_isdisplayed);
		   System.out.println (search_input_isdisplayed);
		
		
		Boolean udemy_logo_isdisplayed = (driver.findElement(By.cssSelector(".udemy-logo")).isDisplayed());
		Assert.assertTrue(udemy_logo_isdisplayed);
		System.out.println (udemy_logo_isdisplayed);
		
		String become_an_instructor_text = driver.findElement(By.cssSelector(".white-link.sb.become-ins-link")).getText();
		Assert.assertEquals("fail", "Become an Instructor", become_an_instructor_text);
		System.out.println (become_an_instructor_text);
		
		
		Boolean bell_icon_isdisplayed = (driver.findElement(By.cssSelector(".icon-bell-alt")).isDisplayed());
		Assert.assertTrue(bell_icon_isdisplayed);
		System.out.println (bell_icon_isdisplayed);
		Thread.sleep(3000);
		driver.quit();
		
		
	}
*/
}
