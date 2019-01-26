package com.pftc.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.pftc.pageObject.FacebookLogInPage;
import com.pftc.pageObject.Hooks;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDef {
	public WebDriver driver;
	
	
	 public FacebookStepDef()
	    {
	    	driver = Hooks.driver;
	    	
	    }
	
	
	
	@Given("^User navigate to facebook login page$")
	public void user_navigate_to_facebook_login_page() throws Throwable {
		
		driver.get("https://www.facebook.com/");
		
		
		
	}

	@When("^User fill Up all the information$")
	public void user_fill_Up_all_the_information() throws Throwable {
		
		PageFactory.initElements(driver, FacebookLogInPage.class);
		
		
		FacebookLogInPage.fname.sendKeys("Mihad");
		FacebookLogInPage.lname.sendKeys("Rah");
		FacebookLogInPage.email.sendKeys("Rah@gmail.com");
		FacebookLogInPage.emailComfirmation.sendKeys("Rah@gmail.com");
		FacebookLogInPage.password.sendKeys("Rah@gmail.com");
		Select monthSelect = new Select(FacebookLogInPage.month); 
		monthSelect.selectByVisibleText("Jan");
		
		Select daySelect = new Select(FacebookLogInPage.day); 
		daySelect.selectByValue("10");
		
		Select yearSelect = new Select(FacebookLogInPage.year); 
		yearSelect.selectByVisibleText("1980");
		
		FacebookLogInPage.female.click();
		
		
	}

	@Then("^User Click on Sign Up Button$")
	public void user_Click_on_Sign_Up_Button() throws Throwable {
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
