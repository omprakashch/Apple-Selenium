package com.apple.qa.testcases;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apple.qa.base.TestBase;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class MacPageTest  extends CommonElements{
	
	@Test(description = "Verifying Mac Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Mac Page Displayed")
	@Story("Story Name: To Check Mac Page Displayed")
	public void verifyMacPageDisplayed(){
		ExecutionStartLog("verifyMacPageDisplayed");
		HomePage homePage = new HomePage();
		MacPage macPage = homePage.clickMac();
		Assert.assertTrue(macPage.getPageTitle().equals("Mac - Apple"), "Mac Page Not Displayed");
		ExecutionEndLog("verifyMacPageDisplayed");
	}
	
	@Test(description = "Verifying Laptop Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Laptop Section")
	@Story("Story Name: To Check Laptop Section")
	public void verifyLaptopSection(){
		ExecutionStartLog("verifyLaptopSection");
		HomePage homePage = new HomePage();
		MacPage macPage = homePage.clickMac();
		Assert.assertTrue(macPage.isLaptopSectionPresent(), "Laptop Section Not Displayed");
		ExecutionEndLog("verifyLaptopSection");
	}
	
	@Test(description = "Verifying Desktop Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Desktop Section")
	@Story("Story Name: To Check Desktop Section")
	public void verifyDesktopSection(){
		ExecutionStartLog("verifyDesktopSection");
		HomePage homePage = new HomePage();
		MacPage macPage = homePage.clickMac();
		macPage.clickDesktop();
		Assert.assertTrue(macPage.isDesktopSectionPresent(), "Desktop Section Not Displayed");	
		ExecutionEndLog("verifyDesktopSection");
	}

	/*
	@DataProvider
	public Object[][] getTargetTestData(){
		Object data[][] = TestUtil.getTestData("Registration");
		return data;
	}
	
	@Test(dataProvider = "getTargetTestData")
	public void verifyAccountCreationFunctionality(String email, String firstName, String lastName, String password){
		ExecutionStartLog("verifyAccountCreationFunctionality");
		HomePage homePage = new HomePage();
		SignInPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("username", "password");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");
		ExecutionEndLog("verifyAccountCreationFunctionality");
	}*/
	
}
