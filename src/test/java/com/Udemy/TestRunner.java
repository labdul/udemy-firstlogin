package com.Udemy;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	//CucumberOptions(format={"html:output"})
	@CucumberOptions(features = {"src/test/java/featurefiles/Udemylogin.feature"}, 
	tags="@Login",
	glue = "com.Udemy",
	//strict = true,
	format = {"pretty", "html:target/CucumberHTMLReport", "json:target/Cucmber.json"}
			) 
	
	
	
	
	//format={"pretty"})

	//Running files: https://github.com/cucumber/cucumber-eclipse
	//http://www.srccodes.com/p/article/48/cucumber-test-behavior-driven-development-bdd-feature-step-runner-glue-gherkin-data-table-scenario-given-when-then
	
	
	public class TestRunner {
		
	}
	
