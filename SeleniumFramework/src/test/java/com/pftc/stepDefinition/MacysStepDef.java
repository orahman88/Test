package com.pftc.stepDefinition;

import org.openqa.selenium.WebDriver;

import com.pftc.pageObject.Hooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class MacysStepDef {
	
	public WebDriver driver;
	
	
	 public MacysStepDef()
	    {
	    	driver = Hooks.driver;
	    	
	    }
	
	
	 
	 @Given("^User navigate to Create Account Page$")
	 public void user_navigate_to_Create_Account_Page() throws Throwable {
	    driver.get("https://www.macys.com/");
	 }
	 
	 
	 @When("^User Click on My Account$")
	 public void user_Click_on_My_Account() throws Throwable {
	     
	 }

	 @Then("^User Click on Create Account$")
	 public void user_Click_on_Create_Account() throws Throwable {
	    
	 }

	 @Then("^User Fill Up All the Information$")
	 public void user_Fill_Up_All_the_Information() throws Throwable {
	    
	 }


	
	

}
