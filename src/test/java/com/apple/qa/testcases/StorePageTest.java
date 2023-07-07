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
import com.apple.qa.pages.StorePage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class StorePageTest  extends CommonElements{
	
	@Test(description = "Verifying Store Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Store Page Displayed")
	@Story("Story Name: To Check Store Page Displayed")
	public void verifyStorePageDisplayed(){
		ExecutionStartLog("verifyStorePageDisplayed");
		HomePage homePage = new HomePage();
		StorePage storePage = homePage.clickStore();
		Assert.assertTrue(storePage.getPageTitle().equals("Apple Store Online - Apple"), "Store Page Not Displayed");
		ExecutionEndLog("verifyWatchPageDisplayed");
	}
	
	@Test(description = "Verifying Quick Links Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Quick Links")
	@Story("Story Name: To Check Quick Links")
	public void verifyQuickLinks(){
		ExecutionStartLog("verifyQuickLinks");
		HomePage homePage = new HomePage();
		StorePage storePage = homePage.clickStore();
		Assert.assertTrue(storePage.getQuickLink(1).equals("Order Status"), "Order Status Link Not Displayed");
		Assert.assertTrue(storePage.getQuickLink(2).equals("Shopping Help"), "Shopping Help Link Not Displayed");
		Assert.assertTrue(storePage.getQuickLink(3).equals("Returns"), "Returns Link Not Displayed");
		Assert.assertTrue(storePage.getQuickLink(4).equals("Your Saves"), "Your Saves Link Not Displayed");
		ExecutionEndLog("verifyQuickLinks");
	}
	
	@Test(description = "Verifying Find An Apple Store And Other Retailer Links Displayed Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Find An Apple Store And Other Retailer Links Displayed")
	@Story("Story Name: To Check Find An Apple Store And Other Retailer Links Displayed")
	public void verifyFindAnAppleStoreAndOtherRetailerLinksDisplayed(){
		ExecutionStartLog("verifyFindAnAppleStoreAndOtherRetailerLinksDisplayed");
		HomePage homePage = new HomePage();
		StorePage storePage = homePage.clickStore();
		Assert.assertTrue(storePage.isFindAnAppleStorePresent(), "Find An Apple Store Link Not Displayed");
		Assert.assertTrue(storePage.isOtherRetailerPresent(), "Other Retailer Link Not Displayed");
		ExecutionEndLog("verifyFindAnAppleStoreAndOtherRetailerLinksDisplayed");
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
