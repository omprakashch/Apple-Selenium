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
import com.apple.qa.pages.SignInPage;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class HomePageTest  extends CommonElements{
	
	@Test(description = "Verifying IPhone 13 Pro Section Test")
	@Severity(SeverityLevel.BLOCKER)
	@Description("Test Case Description: Verify IPhone 13 Pro Section")
	@Story("Story Name: To Check IPhone 13 Pro Section")
	public void verifyIPhone13ProSection(){
		ExecutionStartLog("verifyIPhone13ProSection");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.isIPhone13ProPresent(), "IPhone 13 Pro Section Not Displayed");
		ExecutionEndLog("verifyIPhone13ProSection");
	}
	
	@Test(description = "Verifying Watch Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Watch Section")
	@Story("Story Name: To Check Watch Section")
	public void verifyWatchSection(){
		ExecutionStartLog("verifyWatchSection");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.isWatchPresent(), "Watch Section Not Displayed");
		ExecutionEndLog("verifyWatchSection");
	}
	
	@Test(description = "Verifying MacBook Pro Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify MacBook Pro Section")
	@Story("Story Name: To Check MacBook Pro Section")
	public void verifyMacBookProSection(){
		ExecutionStartLog("verifyMacBookProSection");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.isMacBookProPresent(), "MacBook Pro Section Not Displayed");	
		ExecutionEndLog("verifyMacBookProSection");
	}
	
	@Test(description = "Verifying HeaderList Count Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Header List Count")
	@Story("Story Name: To Check Header List Count")
	public void verifyHeaderListCount(){
		ExecutionStartLog("verifyHeaderListCount");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.getHeaderList().size()==12, "Header List Count Displayed Incorrectly");	
		ExecutionEndLog("verifyHeaderListCount");
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
