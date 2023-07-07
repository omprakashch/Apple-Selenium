package com.apple.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

import io.qameta.allure.Step;

public class HomePage extends CommonElements{
	
	@FindBy(xpath = "//div[@data-unit-id='iphone-14-pro']")
	WebElement IPhone14ProSection;
	
	@FindBy(xpath = "//div[contains(@data-unit-id,'watch-series-8')]")
	WebElement WatchSection;
	
	@FindBy(xpath = "//div[@data-unit-id='mac-studio']")
	WebElement MacStudioSection;
	
	@FindBy(xpath = "//div[@data-unit-id='ipad-pro']")
	WebElement IPadProSection;
	
	@FindBy(xpath = "//div[contains(@class,'tile-gift-card')]")
	WebElement GiftCardSection;
	
	@FindBy(xpath = "//h2[contains(text(),'iPhone 14 Pro')]/../div/a[contains(text(),'Learn more')]")
	WebElement LearnMoreLinkInIPhone14ProSection;
	
	@FindBy(xpath = "//figure[contains(@aria-label,'Unicef')]/..//a")
	WebElement UkraineCrisisMessage;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Buy iPhone 14 Pro')]")
	WebElement BuyLinkInIPhone14ProSection;
	
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


	@Step("getting IPhone14 Pro Section step... ")
	public boolean isIPhone14ProPresent() {
		return isElementPresent(IPhone14ProSection);
	}
	
	@Step("getting Watch Section step... ")
	public boolean isWatchPresent() {
		return isElementPresent(WatchSection);
	}
	
	@Step("getting MacBookPro Section step... ")
	public boolean isMacStudioPresent() {
		return isElementPresent(MacStudioSection);
	}

	public boolean isLearnMorePresentInIPhone14ProSection() {
		 return isElementPresent(LearnMoreLinkInIPhone14ProSection);
	}

	public String getUkraineCrisisMessage() {
		return getText(UkraineCrisisMessage).trim();
	}

	public BuyIPhone14ProPage clickBuyInIPhone14ProSection() {
		click(BuyLinkInIPhone14ProSection,"BuyLinkInIPhone14ProSection");
		return new BuyIPhone14ProPage();
	}

	public boolean isGiftCardPresent() {
		 return isElementPresent(GiftCardSection);
	}

	public boolean isIPadProPresent() {
		 return isElementPresent(IPadProSection);
	}

}
