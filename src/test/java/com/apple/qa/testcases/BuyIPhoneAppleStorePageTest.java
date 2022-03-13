package com.apple.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apple.qa.pages.BuyIPhone13ProPage;
import com.apple.qa.pages.BuyIPhoneAppleStorePage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.util.CommonElements;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class BuyIPhoneAppleStorePageTest extends CommonElements {
	@Test(description = "Verifying Buy IPhone Apple Store Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Buy IPhone Apple Store Page Displayed")
	@Story("Story Name: To Check Buy IPhone Apple Store Page Displayed")
	public void verifyBuyIPhoneAppleStorePageDisplayed(){
		ExecutionStartLog("verifyBuyIPhoneAppleStorePageDisplayed");
		HomePage homePage = new HomePage();
		BuyIPhone13ProPage buyIPhone13ProPage = homePage.clickShopInIPhone13ProSection();
		BuyIPhoneAppleStorePage buyIPhoneAppleStorePage = buyIPhone13ProPage.selectIPhone13ProWithConfiguration("iPhone 13 Pro","Silver","256","Sprint","No","Pay in full","Two years of coverage");
	    Assert.assertTrue(buyIPhoneAppleStorePage.getPageTitle().equals("Buy iPhone - Apple Store"), "Buy IPhone Aple Store Page Not Displayed");
	    ExecutionEndLog("verifyBuyIPhoneAppleStorePageDisplayed");
	}	
}

