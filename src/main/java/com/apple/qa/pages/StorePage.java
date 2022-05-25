package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class StorePage extends CommonElements{
	
	@FindBy(xpath = "//h2[contains(text(),'Quick Links')]")
	WebElement QuickLinks;
	
	@FindBy(xpath = "//a[contains(text(),'Find an Apple Store')]")
	WebElement FindAnAppleStoreLink;
	
	@FindBy(xpath = "//a[contains(text(),'other retailer')]")
	WebElement OtherRetailerLink;
	
	@FindBy(xpath = "//span[contains(text(),'Apple Store Online')]")
	WebElement AppleOnlineStoreText;
	
	String QuickLinkOption1 = "//div[contains(@class,'quicklinks-items')]//li[";
	String QuickLinkOption2 = "]/a";
	
	public StorePage(){
		PageFactory.initElements(driver, this);
	}

	public String getQuickLink(int option) {
		scrollToAndView(QuickLinks,true);
		return getText(QuickLinkOption1 +option+QuickLinkOption2).trim();
	}

	public boolean isFindAnAppleStorePresent() {
		scrollToAndView(AppleOnlineStoreText,true);
		return isElementPresent(FindAnAppleStoreLink);
	}
	
	public boolean isOtherRetailerPresent() {
		return isElementPresent(OtherRetailerLink);
	}

}