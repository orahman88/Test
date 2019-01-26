package com.pftc.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogInPage extends BasePage {
	


	
	public FacebookLogInPage(WebDriver driver) {
		super(driver);
		
	}







	@FindBy(name = "firstname")
	public static WebElement fname;
	
	
	@FindBy(name = "lastname")
	public static WebElement lname;
	
	
	@FindBy(name = "reg_email__")
	public static WebElement email;
	
	
	@FindBy(name = "reg_email_confirmation__")
	public static WebElement emailComfirmation;
	
	@FindBy(name = "reg_passwd__")
	public static WebElement password;
	
	
	@FindBy(id = "month")
	public static WebElement month;
	
	
	
	@FindBy(id = "day")
	public static WebElement day;
	
	@FindBy(id = "year")
	public static WebElement year;
	
	
	@FindBy(name = "sex")
	public static WebElement female;
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
