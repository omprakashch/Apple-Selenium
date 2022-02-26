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
import com.apple.qa.pages.TVAndHomePage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class TVAndHomePageTest  extends CommonElements{
	
	@Test(description = "Verifying TV & Home Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify TV & Home Page Displayed")
	@Story("Story Name: To Check TV & Home Page Displayed")
	public void verifyTVAndHomePageDisplayed(){
		ExecutionStartLog("verifyTVAndHomePageDisplayed");
		HomePage homePage = new HomePage();
		TVAndHomePage tvAndHomePage = homePage.clickTVAndHome();
		Assert.assertTrue(tvAndHomePage.getUrl().contains("tv-home"), "TV & Home Page Not Displayed");
		ExecutionEndLog("verifyTVAndHomePageDisplayed");
	}
	
}
