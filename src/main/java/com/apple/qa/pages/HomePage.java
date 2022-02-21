package com.apple.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Step;

public class HomePage extends CommonElements{
	
	@FindBy(xpath = "//div[@data-unit-id='iphone-13-pro']")
	WebElement IPhone13ProSection;
	
	@FindBy(xpath = "//div[@data-unit-id='watch-series-7']")
	WebElement WatchSection;
	
	@FindBy(xpath = "//div[@data-unit-id='macbook-pro']")
	WebElement MacBookProSection;
	
	@FindBy(xpath = "//span[contains(text(),'my account')]/following-sibling::span")
	WebElement AccountName;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]/div/ul[contains(@class,'list')]/li")
	List<WebElement> HeaderList;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	/*@Step("login with username: {0} and password: {1} step... ")
	public SignInPage clickSignIn(){
		clickSignInIcon();
		jseClick(SignInLink,"SignInLink");
		return new SignInPage();
	}*/
	
	/*@Step("click on signin icon step... ")
	public void clickSignInIcon(){
		click(SignInIcon,"SignInIcon");
	}*/
	
	public String getAccountName(){
		return AccountName.getText();
	}

	@Step("getting signin option list step... ")
	public List<WebElement> getHeaderList() {
		return HeaderList;
	}

	@Step("getting IPhone13 Pro Section step... ")
	public boolean isIPhone13ProPresent() {
		return isElementPresent(IPhone13ProSection);
	}
	
	@Step("getting Watch Section step... ")
	public boolean isWatchPresent() {
		return isElementPresent(WatchSection);
	}
	
	@Step("getting MacBookPro Section step... ")
	public boolean isMacBookProPresent() {
		return isElementPresent(MacBookProSection);
	}

}
