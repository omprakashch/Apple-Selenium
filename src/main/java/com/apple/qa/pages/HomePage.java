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
	
	@FindBy(xpath = "//div[@data-unit-id='mac-studio']")
	WebElement MacStudioSection;
	
	@FindBy(xpath = "//div[@data-unit-id='ipad-air']")
	WebElement IPadAirSection;
	
	@FindBy(xpath = "//div[contains(@class,'tile-gift-card')]")
	WebElement GiftCardSection;
	
	@FindBy(xpath = "//h2[contains(text(),'iPhone 13 Pro')]/../div/a[contains(text(),'Learn more')]")
	WebElement LearnMoreLinkInIPhone13ProSection;
	
	@FindBy(xpath = "//figure[contains(@aria-label,'Unicef')]/..//a")
	WebElement UkraineCrisisMessage;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Shop iPhone 13 Pro')]")
	WebElement ShopLinkInIPhone13ProSection;
	
	
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


	@Step("getting IPhone13 Pro Section step... ")
	public boolean isIPhone13ProPresent() {
		return isElementPresent(IPhone13ProSection);
	}
	
	@Step("getting Watch Section step... ")
	public boolean isWatchPresent() {
		return isElementPresent(WatchSection);
	}
	
	@Step("getting MacBookPro Section step... ")
	public boolean isMacStudioPresent() {
		return isElementPresent(MacStudioSection);
	}

	public boolean isLearnMorePresentInIPhone13ProSection() {
		 return isElementPresent(LearnMoreLinkInIPhone13ProSection);
	}

	public String getUkraineCrisisMessage() {
		return getText(UkraineCrisisMessage).trim();
	}

	public BuyIPhone13ProPage clickShopInIPhone13ProSection() {
		click(ShopLinkInIPhone13ProSection,"ShopLinkInIPhone13ProSection");
		return new BuyIPhone13ProPage();
	}

	public boolean isGiftCardPresent() {
		 return isElementPresent(GiftCardSection);
	}

	public boolean isIPadAirPresent() {
		 return isElementPresent(IPadAirSection);
	}

}
