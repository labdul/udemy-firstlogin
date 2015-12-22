package com.Udemy;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class UdemyCoursePageSteps extends DriverFactory{
	
	
	@Then("^i am logged in$")
	public void i_am_logged_in() throws Throwable {
		
		new UdemyCoursePage(driver).wait_for_visibility_of_browse_course();
		
		 Assert.assertEquals("fail", "Browse Courses", new UdemyCoursePage(driver).get_browser_course_link());
		   System.out.println (new UdemyCoursePage(driver).get_browser_course_link() + " is displayed");
		   
			Assert.assertTrue(new UdemyCoursePage(driver).search_input_isdisplayed());
			   System.out.println ("Is search input box displayed? " + new UdemyCoursePage(driver).search_input_isdisplayed());
		
			Assert.assertTrue(new UdemyCoursePage(driver).udemy_logo_isdisplayed());
			   System.out.println ("Is udemy logo displayed? " + new UdemyCoursePage(driver).udemy_logo_isdisplayed());
			   
			   Assert.assertEquals("fail", "Become an Instructor", new UdemyCoursePage(driver).become_an_instructor_text());
			   System.out.println (new UdemyCoursePage(driver).become_an_instructor_text() + " is displayed");
			   
			   Assert.assertTrue(new UdemyCoursePage(driver).bell_icon_isdisplayed());
			   System.out.println ("Is bell icon displayed? " + new UdemyCoursePage(driver).bell_icon_isdisplayed());
			   
	}
	

}
