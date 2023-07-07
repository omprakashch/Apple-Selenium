package com.apple.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.apple.qa.pages.BuyIPhone14ProPage;
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
		BuyIPhone14ProPage buyIPhone14ProPage = homePage.clickBuyInIPhone14ProSection();
		BuyIPhoneAppleStorePage buyIPhoneAppleStorePage = buyIPhone14ProPage.selectIPhone14ProWithConfiguration("iPhone 14 Pro","Silver","256","Sprint","No","Pay in full","Two years of coverage");
	    Assert.assertTrue(buyIPhoneAppleStorePage.getPageTitle().equals("Buy iPhone - Apple Store"), "Buy IPhone Aple Store Page Not Displayed");
	    ExecutionEndLog("verifyBuyIPhoneAppleStorePageDisplayed");
	}	
}

