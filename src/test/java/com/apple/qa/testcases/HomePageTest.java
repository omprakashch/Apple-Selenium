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
	
	@Test(description = "Verifying MacStudio Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify MacStudio Section")
	@Story("Story Name: To Check MacStudio Section")
	public void verifyMacStudioSection(){
		ExecutionStartLog("verifyMacStudioSection");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.isMacStudioPresent(), "MacStudio Section Not Displayed");	
		ExecutionEndLog("verifyMacStudioSection");
	}
	
	@Test(description = "Verifying HeaderList Count Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Header List Count")
	@Story("Story Name: To Check Header List Count")
	public void verifyHeaderListCount(){
		ExecutionStartLog("verifyHeaderListCount");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.getHeaderList().size()==13, "Header List Count Displayed Incorrectly");	
		ExecutionEndLog("verifyHeaderListCount");
	}
	
	@Test(description = "Verifying Learn more Displayed in Iphone 13 Pro Section Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Learn more Displayed in Iphone 13 Pro Section")
	@Story("Story Name: To Check Learn more Displayed in Iphone 13 Pro Section")
	public void verifyLearnMoreDisplayedInIPhone13ProSection(){
		ExecutionStartLog("verifyLearnMoreDisplayedInIPhone13ProSection");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.isLearnMorePresentInIPhone13ProSection(), "Learn More Link Not Displayed In IPhone13 Pro Section");	
		ExecutionEndLog("verifyLearnMoreDisplayedInIPhone13ProSection");
	}
	
	@Test(description = "Verifying Ukraine Crisis Message Test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify Ukraine Crisis Message")
	@Story("Story Name: To Check Ukraine Crisis Message")
	public void verifyUkraineCrisisMessage(){
		ExecutionStartLog("verifyUkraineCrisisMessage");
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.getUkraineCrisisMessage().equals("Donate to support families affected by the crisis in Ukraine"), "Learn More Link Not Displayed In IPhone13 Pro Section");	
		ExecutionEndLog("verifyUkraineCrisisMessage");
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
