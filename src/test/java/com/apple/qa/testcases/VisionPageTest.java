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
import com.apple.qa.pages.VisionPage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class VisionPageTest  extends CommonElements{
	
	@Test(description = "Verifying Apple Vision Pro Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Apple Vision Pro Page Displayed")
	@Story("Story Name: To Check Apple Vision Pro Page Displayed")
	public void verifyAppleVisionProPageDisplayed(){
		ExecutionStartLog("verifyAppleVisionProPageDisplayed");
		HomePage homePage = new HomePage();
		VisionPage visionPage = homePage.clickVision();
		Assert.assertTrue(visionPage.getPageTitle().equals("Apple Vision Pro - Apple"), "Apple Vision Pro Page Not Displayed");
		ExecutionEndLog("verifyAppleVisionProPageDisplayed");
	}
	
	@Test(description = "Verifying OnlyOnApple Header List Count Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify OnlyOnApple Header List Count")
	@Story("Story Name: To Check OnlyOnApple Header List Count")
	public void verifyOnlyOnAppleHeaderListCount(){
		ExecutionStartLog("verifyOnlyOnAppleHeaderListCount");
		HomePage homePage = new HomePage();
		VisionPage onlyOnApplePage = homePage.clickVision();
		Assert.assertTrue(onlyOnApplePage.getOnlyOnAppleHeaderList().size()==10, "OnlyOnApple Header List Count is Incorrect");
		ExecutionEndLog("verifyOnlyOnAppleHeaderListCount");
	}
	
	@Test(description = "Verifying PaymentOptions List Count Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify PaymentOptions List Count")
	@Story("Story Name: To Check PaymentOptions List Count")
	public void verifyPaymentOptionsListCount(){
		ExecutionStartLog("verifyPaymentOptionsListCount");
		HomePage homePage = new HomePage();
		VisionPage onlyOnApplePage = homePage.clickVision();
		Assert.assertTrue(onlyOnApplePage.getPaymentOptionsList().size()==3, "Payment Options List Count is Incorrect");
		ExecutionEndLog("verifyPaymentOptionsListCount");
	}
	
}
