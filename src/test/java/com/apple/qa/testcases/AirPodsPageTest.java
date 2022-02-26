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
import com.apple.qa.pages.AirPodsPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AirPodsPageTest  extends CommonElements{
	
	@Test(description = "Verifying AirPods Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify AirPods Page Displayed")
	@Story("Story Name: To Check AirPods Page Displayed")
	public void verifyAirPodsPageDisplayed(){
		ExecutionStartLog("verifyAirPodsPageDisplayed");
		HomePage homePage = new HomePage();
		AirPodsPage airPodsPage = homePage.clickAirPods();
		Assert.assertTrue(airPodsPage.getPageTitle().equals("AirPods - Apple"), "AirPods Page Not Displayed");
		ExecutionEndLog("verifyAirPodsPageDisplayed");
	}
	
	@Test(description = "Verifying AirPods Header List Count Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify AirPods Header List Count")
	@Story("Story Name: To Check AirPods Header List Count")
	public void verifyAirPodsHeaderListCount(){
		ExecutionStartLog("verifyAirPodsHeaderListCount");
		HomePage homePage = new HomePage();
		AirPodsPage airPodsPage = homePage.clickAirPods();
		Assert.assertTrue(airPodsPage.getAirPodsHeaderList().size()==6, "AirPods Header List Count is Incorrect");
		ExecutionEndLog("verifyAirPodsHeaderListCount");
	}
	
	@Test(description = "Verifying Check eligibility Link Displayed Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Check eligibility Link Displayed")
	@Story("Story Name: To Check Check eligibility Link Displayed")
	public void verifyCheckEligibilityLinkDisplayed(){
		ExecutionStartLog("verifyCheckEligibilityLinkDisplayed");
		HomePage homePage = new HomePage();
		AirPodsPage airPodsPage = homePage.clickAirPods();
		Assert.assertTrue(airPodsPage.isCheckEligibilityPresent(), "Check Eligibility Link Not Displayed");
		ExecutionEndLog("verifyCheckEligibilityLinkDisplayed");
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
