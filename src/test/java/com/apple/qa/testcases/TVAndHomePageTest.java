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
	
	@Test(description = "Verifying TV & Home Header List Count Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify TV & Home Header List Count")
	@Story("Story Name: To Check TV & Home Header List Count")
	public void verifyTVAndHomeHeaderListCount(){
		ExecutionStartLog("verifyTVAndHomeHeaderListCount");
		HomePage homePage = new HomePage();
		TVAndHomePage tvAndHomePage = homePage.clickTVAndHome();
		Assert.assertTrue(tvAndHomePage.getTVAndHomeHeaderList().size()==7, "TV & Home Header List Count is Incorrect");
		ExecutionEndLog("verifyTVAndHomeHeaderListCount");
	}
	
	@Test(description = "Verifying HomePod Mini Section Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify HomePod Mini Section")
	@Story("Story Name: To Check HomePod Mini Section")
	public void verifyHomePodMiniSection(){
		ExecutionStartLog("verifyHomePodMiniSection");
		HomePage homePage = new HomePage();
		TVAndHomePage tvAndHomePage = homePage.clickTVAndHome();
		Assert.assertTrue(tvAndHomePage.isHomePodMiniPresent(), "HomePod Mini Section Not Displayed");
		ExecutionEndLog("verifyHomePodMiniSection");
	}
	
}
