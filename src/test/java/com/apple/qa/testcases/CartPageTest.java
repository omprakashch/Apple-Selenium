package com.apple.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.apple.qa.pages.AccessoriesPage;
import com.apple.qa.pages.AirPodsMaxAccessoriesPage;
import com.apple.qa.pages.AirPodsPage;
import com.apple.qa.pages.AppleWatchNikePage;
import com.apple.qa.pages.BuyAirPodsMaxPage;
import com.apple.qa.pages.BuyAppleWatchNikePage;
import com.apple.qa.pages.BuyIPadPage;
import com.apple.qa.pages.BuyIPadProPage;
import com.apple.qa.pages.BuyMacStudioPage;
import com.apple.qa.pages.CartPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.IPadAccessoriesPage;
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
		MacStudioPage macStudioPage = buyMacStudioPage.selectMacStudio("Max");
		buyMacStudioPage = macStudioPage.selectMacStudioWithConfiguration("24-core","32GB","512GB","None","None");
		MacStudioAccessoriesPage macStudioAccessoriesPage = buyMacStudioPage.clickAddToBag();
		CartPage cartPage = macStudioAccessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("Mac Studio"), "Mac Studio Not Added To Cart");
		ExecutionEndLog("verifyMacStudioAddedToCart");
	}
	
	@Test(description = "Verifying IPad Pro & Magic Keyboard Added To Cart Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify IPad Pro And Magic Keyboard Added To Cart")
	@Story("Story Name: To Check IPad Pro And Magic Keyboard Added To Cart")
	public void verifyIPadProAndMagicKeyboardAddedToCart(){
		ExecutionStartLog("verifyIPadProAndMagicKeyboardAddedToCart");
		HomePage homePage = new HomePage();
		IPadPage iPadPage = homePage.clickIPad();
		BuyIPadProPage buyIPadProPage = iPadPage.clickBuyInIPadProSection();
		buyIPadProPage.selectIPadProWithConfiguration("11-inch","Space Gray","128","Wi-Fi","No");
		buyIPadProPage.clickApplePencilAdd();
		buyIPadProPage.clickMagicKeyboardAdd("black","11-inch");
		IPadProAccessoriesPage iPadProAccessoriesPage = buyIPadProPage.clickAddToBag();
		CartPage cartPage = iPadProAccessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("iPad Pro"), "IPad Pro Not Added To Cart");
		Assert.assertTrue(cartPage.getProductName(3).contains("Magic Keyboard"), "Magic Keyboard Not Added To Cart");
		ExecutionEndLog("verifyIPadProAndMagicKeyboardAddedToCart");
	}
	
	@Test(description = "Verifying AirPods Max & Apple Care Added To Cart Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify AirPods Max And Apple Care Added To Cart")
	@Story("Story Name: To Check AirPods Max And Apple Care Added To Cart")
	public void verifyAirPodsMaxAndAppleCareAddedToCart(){
		ExecutionStartLog("verifyAirPodsMaxAndAppleCareAddedToCart");
		HomePage homePage = new HomePage();
		AirPodsPage airPodsPage = homePage.clickAirPods();
		BuyAirPodsMaxPage buyAirPodsMaxPage = airPodsPage.clickBuyInAirPodsMaxSection();
		buyAirPodsMaxPage.selectAirPodsMaxWithConfiguration("Pink","Add","Hi Prakash");
		buyAirPodsMaxPage.clickAppleCarePlusAdd();
		AirPodsMaxAccessoriesPage airPodsMaxAccessoriesPage = buyAirPodsMaxPage.clickAddToBag();
		CartPage cartPage = airPodsMaxAccessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("AirPods Max"), "AirPods Max Not Added To Cart");
		Assert.assertTrue(cartPage.getAppleCarePlusMessage(1).contains("AppleCare+"), "Apple Care Not Added To Cart");
		ExecutionEndLog("verifyAirPodsMaxAndAppleCareAddedToCart");
	}
	
	@Test(description = "Verifying IPad Added To Cart Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify IPad Added To Cart")
	@Story("Story Name: To Check IPad Added To Cart")
	public void verifyIPadAddedToCart(){
		ExecutionStartLog("verifyIPadAddedToCart");
		HomePage homePage = new HomePage();
		IPadPage iPadPage = homePage.clickIPad();
		BuyIPadPage buyIPadPage = iPadPage.clickBuyInIPadSection();
		buyIPadPage.selectIPadWithConfiguration("Space Gray","64","Wi-Fi","No");
		IPadAccessoriesPage iPadAccessoriesPage = buyIPadPage.clickAddToBag();
		CartPage cartPage = iPadAccessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("iPad"), "iPad Not Added To Cart");
		ExecutionEndLog("verifyIPadMiniAddedToCart");
	}
	
	@Test(description = "Verifying Apple Watch Nike Added To Cart Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Apple Watch Nike Added To Cart")
	@Story("Story Name: To Check Apple Watch Nike Added To Cart")
	public void verifyAppleWatchNikeAddedToCart(){
		ExecutionStartLog("verifyAppleWatchNikeAddedToCart");
		HomePage homePage = new HomePage();
		WatchPage watchPage = homePage.clickWatch();
		AppleWatchNikePage appleWatchNikePage = watchPage.clickAppleWatchNike();
		BuyAppleWatchNikePage buyAppleWatchNikePage = appleWatchNikePage.clickBuy();
		buyAppleWatchNikePage.clickWatch(1);
		buyAppleWatchNikePage.selectAppleWatchNikeWithConfiguration("41mm","GPS");
		AccessoriesPage accessoriesPage = buyAppleWatchNikePage.clickAddToBag();
		CartPage cartPage = accessoriesPage.clickReviewBag();
		Assert.assertTrue(cartPage.getProductName(1).contains("Apple Watch Nike"), "Apple Watch Nike Not Added To Cart");
		ExecutionEndLog("verifyAppleWatchNikeAddedToCart");
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
