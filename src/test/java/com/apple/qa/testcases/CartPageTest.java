package com.apple.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apple.qa.pages.BuyIPadProPage;
import com.apple.qa.pages.BuyMacStudioPage;
import com.apple.qa.pages.CartPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.IPadPage;
import com.apple.qa.pages.IPadProAccessoriesPage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.pages.MacStudioAccessoriesPage;
import com.apple.qa.pages.MacStudioPage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class CartPageTest  extends CommonElements{
	
	@Test(description = "Verifying Mac Studio Added To Cart Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Mac Studio Added To Cart")
	@Story("Story Name: To Check Mac Studio Added To Cart")
	public void verifyMacStudioAddedToCart(){
		ExecutionStartLog("verifyMacStudioAddedToCart");
		HomePage homePage = new HomePage();
		MacPage macPage = homePage.clickMac();
		BuyMacStudioPage buyMacStudioPage = macPage.clickBuyInMacStudioSection();
		MacStudioPage macStudioPage = buyMacStudioPage.selectMacStudio("M1 Max");
		buyMacStudioPage = macStudioPage.selectMacStudioWithConfiguration("24-core","32GB","512GB","None","None");
		MacStudioAccessoriesPage macStudioAccessoriesPage = buyMacStudioPage.clickAddToBag();
		CartPage cartPage = macStudioAccessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("Mac Studio"), "Mac Studio Not Added To Cart");
		ExecutionEndLog("verifyMacStudioAddedToCart");
	}
	
	@Test(description = "Verifying IPad Pro Added To Cart Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify IPad Pro Added To Cart")
	@Story("Story Name: To Check IPad Pro Added To Cart")
	public void verifyIPadProAddedToCart(){
		ExecutionStartLog("verifyIPadProAddedToCart");
		HomePage homePage = new HomePage();
		IPadPage iPadPage = homePage.clickIPad();
		BuyIPadProPage buyIPadProPage = iPadPage.clickBuyInIPadProSection();
		buyIPadProPage.selectIPadProWithConfiguration("11-inch","Space Gray","128","Wi-Fi","No");
		buyIPadProPage.clickApplePencilAdd();
		buyIPadProPage.clickMagicKeyboardAdd("black","11-inch");
		IPadProAccessoriesPage iPadProAccessoriesPage = buyIPadProPage.clickAddToBag();
		CartPage cartPage = iPadProAccessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("iPad Pro"), "IPad Pro Not Added To Cart");
		ExecutionEndLog("verifyIPadProAddedToCart");
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
