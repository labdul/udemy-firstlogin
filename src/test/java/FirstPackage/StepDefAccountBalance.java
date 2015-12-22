package FirstPackage;


import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefAccountBalance {
/*	WebDriver driver = new FirefoxDriver();
	
	@Given ("^I am in a Bovada Lint site$")
	public void launch_bovada_site() throws Throwable{
		driver.get("https://sports.lint.bovada.lv/");
		driver.manage().window().maximize();
		
	}
	
	@When("^I Login with \"([^\"]*)\"$")
	public void i_login_with(String username) throws Throwable{
		driver.findElement(By.cssSelector("#header-login-button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10, 500);
		WebElement login_submit = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-submit")));
		driver.findElement(By. cssSelector("#login-username")).clear();
		driver.findElement(By. cssSelector("#login-username")).sendKeys(username);
		driver.findElement(By. cssSelector("#login-password")).clear();
		driver.findElement(By. cssSelector("#login-password")).sendKeys("testing");
				login_submit.click();
				//Thread.sleep(2000L);
	}
	
	@Then("I should see \"([^\"]*)\" on the home page")
	public void account_balance_on_homepage(String balance) throws Throwable {
		//Thread.sleep(300L);
		//WebDriverWait wait = new WebDriverWait(driver, 20, 500);
		//WebElement vbalance = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".balance.ng-binding"))));
		 //String vbalance= driver.findElement(By.cssSelector(".balance.ng-binding")).getText();
		 //String balance_on_homepage= driver.findElement(By.cssSelector(".balance.ng-binding")).getText();
		
		
		WebDriverWait wait = new WebDriverWait(driver, 400); // The int here is the maximum time in seconds the element can wait.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".balance.ng-binding")));
		
		
		String balance_on_homepage= driver.findElement(By.cssSelector(".balance.ng-binding")).getText();
		
		
		 Assert.assertEquals(balance, balance_on_homepage);
		 
	}
	
	@Then("^I should see \"([^\"]*)\" on the Dashboard$")
	public void account_balance_on_dashborad(String balance2) throws Throwable {
		//WebDriverWait wait = new WebDriverWait(driver, 50, 500);
		//WebElement account_icon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".icon-account-profile")));
		driver.findElement(By.cssSelector(".icon-account-profile")).click();
		
		//Thread.sleep(3000L);
		
		WebDriverWait wait = new WebDriverWait(driver, 400); // The int here is the maximum time in seconds the element can wait.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".balance-number.ng-binding")));
		
		//WebElement vbalance2 = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".balance-number.ng-binding"))));
		String balance_dashboard = driver.findElement(By.cssSelector(".balance-number.ng-binding")).getText();
		 //String vbalance2= driver.findElement(By.cssSelector(".balance-number.ng-binding")).getText();
		 Assert.assertEquals(balance2, balance_dashboard);
		
		
	}
	@Before 
	public void do_beforetask(){
		System.out.println("This is a Before task");
	}
	@After
	public void do_aftertask() throws InterruptedException{
		Thread.sleep(4000);
		driver.close();
		System.out.println("This is after task done");
	
	}*/

}
