package com.Udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UdemyCoursePage {
	
	WebDriver driver;
	
	@FindBy(linkText="Browse Courses")
	private WebElement browse_course_link_locator;
	
	@FindBy(xpath=".//*[@id='searchbox']/input")
	private WebElement search_input_box_locator;
	
	@FindBy(css=".udemy-logo")
	private WebElement udemy_logo_locator;
	
	@FindBy(css=".white-link.sb.become-ins-link")
	private WebElement become_an_instructor_text_locator;
	
	@FindBy(css=".icon-bell-alt")
	private WebElement bell_icon_locator;
	
	@FindBy(linkText="My Courses")
	private WebElement my_courses_link_locator;
	
	
	public UdemyCoursePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void wait_for_visibility_of_browse_course() throws Throwable {
		WebDriverWait Wait = new WebDriverWait(driver,10);
		   Wait.until(ExpectedConditions.visibilityOf(browse_course_link_locator));
	} 
	
	public String get_browser_course_link() throws Throwable{
		return browse_course_link_locator.getText();
	}
	
	public Boolean search_input_isdisplayed() throws Throwable{
		return search_input_box_locator.isDisplayed();
	}
	
	public Boolean udemy_logo_isdisplayed() throws Throwable{
		return udemy_logo_locator.isDisplayed();
	}
	
	public String become_an_instructor_text() throws Throwable{
		return become_an_instructor_text_locator.getText();
	}
	
	public Boolean bell_icon_isdisplayed() throws Throwable{
		return bell_icon_locator.isDisplayed();
	}
	
	
	
	

}
