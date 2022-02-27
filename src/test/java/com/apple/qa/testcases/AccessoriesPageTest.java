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
import com.apple.qa.pages.AccessoriesPage;
import com.apple.qa.pages.HomePage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class AccessoriesPageTest  extends CommonElements{
	
	@Test(description = "Verifying Accessories Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Accessories Page Displayed")
	@Story("Story Name: To Check Accessories Page Displayed")
	public void verifyAccessoriesPageDisplayed(){
		ExecutionStartLog("verifyAccessoriesPageDisplayed");
		HomePage homePage = new HomePage();
		AccessoriesPage accessoriesPage = homePage.clickAccessories();
		Assert.assertTrue(accessoriesPage.getPageTitle().contains("Apple Accessories"), "Accessories Page Not Displayed");
		ExecutionEndLog("verifyAccessoriesPageDisplayed");
	}
	
	@Test(description = "Verifying BrowseByCategory Options Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify BrowseByCategory Options")
	@Story("Story Name: To Check BrowseByCategory Options")
	public void verifyBrowseByCategoryOptions(){
		ExecutionStartLog("verifyBrowseByCategoryOptions");
		HomePage homePage = new HomePage();
		AccessoriesPage accessoriesPage = homePage.clickAccessories();
		accessoriesPage.clickBrowseByCategory();
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(1).equals("Made by Apple"), "Made By Apple Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(2).equals("What’s New"), "What's New Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(3).equals("Cases & Protection"), "Cases & Protection Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(4).equals("Headphones & Speakers"), "Headphones & Speakers Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(5).equals("Apple Watch Bands"), "Apple Watch Brands Option Not Displayed");
		ExecutionEndLog("verifyBrowseByCategoryOptions");
	}
	
	@Test(description = "Verifying BrowseByProduct Options Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify BrowseByProduct Options")
	@Story("Story Name: To Check BrowseByProduct Options")
	public void verifyBrowseByProductOptions(){
		ExecutionStartLog("verifyBrowseByProductOptions");
		HomePage homePage = new HomePage();
		AccessoriesPage accessoriesPage = homePage.clickAccessories();
		accessoriesPage.clickBrowseByProduct();
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(1).equals("Mac"), "Mac Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(2).equals("iPad"), "iPad Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(3).equals("iPhone"), "iPhone Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(4).equals("Watch"), "Watch Option Not Displayed");
		Assert.assertTrue(accessoriesPage.getBrowseByCategory(5).equals("TV & Home"), "TV & Home Option Not Displayed");
		ExecutionEndLog("verifyBrowseByProductOptions");
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
