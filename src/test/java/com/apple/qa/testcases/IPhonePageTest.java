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
import com.apple.qa.pages.IPadPage;
import com.apple.qa.pages.IPhonePage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class IPhonePageTest  extends CommonElements{
	
	@Test(description = "Verifying IPhone Page Displayed Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify IPhone Page Displayed")
	@Story("Story Name: To Check IPhone Page Displayed")
	public void verifyIPhonePageDisplayed(){
		ExecutionStartLog("verifyIPhonePageDisplayed");
		HomePage homePage = new HomePage();
		IPhonePage iPhonePage = homePage.clickIPhone();
		Assert.assertTrue(iPhonePage.getPageTitle().equals("iPhone - Apple"), "IPhone Page Not Displayed");
		ExecutionEndLog("verifyIPhonePageDisplayed");
	}
	
	@Test(description = "Verifying Featured Accessories Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Featured Accessories Section")
	@Story("Story Name: To Check Featured Accessories Section")
	public void verifyFeaturedAccessoriesSection(){
		ExecutionStartLog("verifyFeaturedAccessoriesSection");
		HomePage homePage = new HomePage();
		IPhonePage iPhonePage = homePage.clickIPhone();
		Assert.assertTrue(iPhonePage.isFeaturedAccessoriesPresent(), "Featured Accessories Section Not Displayed");
		ExecutionEndLog("verifyFeaturedAccessoriesSection");
	}
	
	@Test(description = "Verifying Installment Message Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify Installment Message")
	@Story("Story Name: To Check Install Message")
	public void verifyInstallmentMessage(){
		ExecutionStartLog("verifyInstallmentMessage");
		HomePage homePage = new HomePage();
		IPhonePage iPhonePage = homePage.clickIPhone();
		Assert.assertTrue(iPhonePage.getInstallmentMessage().contains("Get 3% Daily Cash back with Apple Card."), "Installment Message Displayed Incorrectly");
		ExecutionEndLog("verifyInstallmentMessage");
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
