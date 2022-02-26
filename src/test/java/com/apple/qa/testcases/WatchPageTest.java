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
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class WatchPageTest  extends CommonElements{
	
	@Test(description = "Verifying Watch Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Watch Page Displayed")
	@Story("Story Name: To Check Watch Page Displayed")
	public void verifyWatchPageDisplayed(){
		ExecutionStartLog("verifyWatchPageDisplayed");
		HomePage homePage = new HomePage();
		WatchPage watchPage = homePage.clickWatch();
		Assert.assertTrue(watchPage.getPageTitle().equals("Watch - Apple"), "Watch Page Not Displayed");
		ExecutionEndLog("verifyWatchPageDisplayed");
	}
	
	@Test(description = "Verifying Health App Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Health App Section")
	@Story("Story Name: To Check Health App Section")
	public void verifyHealthAppSection(){
		ExecutionStartLog("verifyHealthAppSection");
		HomePage homePage = new HomePage();
		WatchPage watchPage = homePage.clickWatch();
		Assert.assertTrue(watchPage.isHealthAppPresent(), "Health App Section Not Displayed");
		ExecutionEndLog("verifyHealthAppSection");
	}
	
	@Test(description = "Verifying Apple Research App Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Apple Research App Section")
	@Story("Story Name: To Check Apple Research App Section")
	public void verifyAppleResearchAppSection(){
		ExecutionStartLog("verifyAppleResearchAppSection");
		HomePage homePage = new HomePage();
		WatchPage watchPage = homePage.clickWatch();
		Assert.assertTrue(watchPage.isAppleResearchAppPresent(), "Apple Research App Section Not Displayed");
		ExecutionEndLog("verifyAppleResearchAppSection");
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
