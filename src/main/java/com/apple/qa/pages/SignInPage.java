package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class SignInPage extends CommonElements{
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement emailInputField;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordInputField;
	
	@FindBy(xpath = "//button[@id='login']")
	WebElement signInButton;
	
	@FindBy(xpath = "//a[contains(text(),'Skip')]")
	WebElement skipLink;
	
	
	public SignInPage(){
		PageFactory.initElements(driver, this);
	}
	
	public HomePage Login(String userName, String password){
		enterText(emailInputField,prop.getProperty(userName),"User Name");
		enterText(passwordInputField,prop.getProperty(password),"Password");
		logInfo("Entered User Name "+userName+" and Password "+password);
		click(signInButton,"signInButton");
		//click(skipLink);
		return new HomePage();
	}

}