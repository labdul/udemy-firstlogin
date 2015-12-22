package com.Udemy;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyHomePage {
	WebDriver driver;
	
	@FindBy(linkText="Login")
	private WebElement first_login_link_locator;
	
	@FindBy(id="id_email")
	private WebElement email_locator;
	
	@FindBy(id="id_password")
	private WebElement password_locator;
	
	@FindBy(id="submit-id-submit")
	private WebElement login_submit_button_locator;
	
	
	public UdemyHomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_login_button() throws Throwable{
		first_login_link_locator.click();
	}
	
	public void enter_email_address() throws Throwable{
		email_locator.sendKeys("abdulsalam12000@yahoo.com");
	}
	
	public void enter_password() throws Throwable{
		password_locator.sendKeys("Olayinka1!");
	}
	
	public void click_submit_button() throws Throwable{
		login_submit_button_locator.click();
	}


	public void wait_for_visibility_of_email_textbox()throws Throwable{
		 WebDriverWait Wait = new WebDriverWait(driver,10);
		   Wait.until(ExpectedConditions.visibilityOf(email_locator));
	}
	
	
}
