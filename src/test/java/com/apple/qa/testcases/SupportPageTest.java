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
import com.apple.qa.pages.SupportPage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class SupportPageTest  extends CommonElements{
	
	@Test(description = "Verifying Support Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Support Page Displayed")
	@Story("Story Name: To Check Support Page Displayed")
	public void verifySupportPageDisplayed(){
		ExecutionStartLog("verifySupportPageDisplayed");
		HomePage homePage = new HomePage();
		SupportPage supportPage = homePage.clickSupport();
		Assert.assertTrue(supportPage.getPageTitle().equals("Official Apple Support"), "Support Page Not Displayed");
		ExecutionEndLog("verifySupportPageDisplayed");
	}
	
	@Test(description = "Verifying Search For Topics Input Field Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Search For Topics Input Field")
	@Story("Story Name: To Check Search For Topics Input Field Displayed")
	public void verifySearchForTopicsInputField(){
		ExecutionStartLog("verifySearchForTopicsInputField");
		HomePage homePage = new HomePage();
		SupportPage supportPage = homePage.clickSupport();
		Assert.assertTrue(supportPage.isSearchForTopicsPresent(), "Search For Topics Input Field Not Displayed");
		ExecutionEndLog("verifySearchForTopicsInputField");
	}
	
	@Test(description = "Verifying Gift Card Scam Message Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Gift Card Scam Message")
	@Story("Story Name: To Check Gift Card Scam Message")
	public void verifyGiftCardScamMessage(){
		ExecutionStartLog("verifyGiftCardScamMessage");
		HomePage homePage = new HomePage();
		SupportPage supportPage = homePage.clickSupport();
		Assert.assertTrue(supportPage.getGiftCardScamMessage().equals("Be aware of gift card scams"), "Gift Card Scam Message Displayed Incorrectly");
		ExecutionEndLog("verifyGiftCardScamMessage");
	}
	
}
