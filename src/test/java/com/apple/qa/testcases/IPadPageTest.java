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
import com.apple.qa.pages.IPadPage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class IPadPageTest  extends CommonElements{
	
	@Test(description = "Verifying IPad Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify IPad Page Displayed")
	@Story("Story Name: To Check IPad Page Displayed")
	public void verifyIPadPageDisplayed(){
		ExecutionStartLog("verifyIPadPageDisplayed");
		HomePage homePage = new HomePage();
		IPadPage iPadPage = homePage.clickIPad();
		Assert.assertTrue(iPadPage.getPageTitle().equals("iPad - Apple"), "IPad Page Not Displayed");
		ExecutionEndLog("verifyIPadPageDisplayed");
	}
	
	@Test(description = "Verifying Installment Message Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Installment Message")
	@Story("Story Name: To Check Install Message")
	public void verifyInstallmentMessage(){
		ExecutionStartLog("verifyInstallmentMessage");
		HomePage homePage = new HomePage();
		IPadPage iPadPage = homePage.clickIPad();
		Assert.assertTrue(iPadPage.getInstallmentMessage().contains("Get 3% Daily Cash back with Apple Card. And pay for your new iPad over 12 months"), "Installment Message Displayed Incorrectly");
		ExecutionEndLog("verifyInstallmentMessage");
	}
	
	@Test(description = "Verifying IPad Models Displayed Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify IPad Models Displayed")
	@Story("Story Name: To Check IPad Models Displayed")
	public void verifyIPadModelsDisplayed(){
		ExecutionStartLog("verifyIPadModelsDisplayed");
		HomePage homePage = new HomePage();
		IPadPage iPadPage = homePage.clickIPad();
		Assert.assertTrue(iPadPage.isIPadProPresent(), "IPadPro Not Displayed");
		Assert.assertTrue(iPadPage.isIPadAirPresent(), "IPadAir Not Displayed");
		Assert.assertTrue(iPadPage.isIPadPresent(), "IPad Not Displayed");
		Assert.assertTrue(iPadPage.isIPadMiniPresent(), "IPadMini Not Displayed");
		ExecutionEndLog("verifyIPadModelsDisplayed");
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
