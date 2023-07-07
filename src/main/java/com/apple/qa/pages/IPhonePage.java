package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class IPhonePage extends CommonElements{
		
	@FindBy(xpath = "//section[contains(@class,'accessories')]/div[1]")
	WebElement FeaturedAccessoriesSection;
	
	@FindBy(xpath = "//section[contains(@class,'accessories')]/h2")
	WebElement FeaturedAccessoriesText;
	
	@FindBy(xpath = "//h2[contains(text(),'Ways to save')]")
	WebElement WaysToSaveIphone;
	
	@FindBy(xpath = "//div[contains(@data-analytics-section-engagement,'name:daily cash back with apple card')]/div[1]//h3")
	WebElement InstallmentText;
	
	
	public IPhonePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean isFeaturedAccessoriesPresent() {
		scrollToAndView(FeaturedAccessoriesText,true);
		return isElementPresent(FeaturedAccessoriesSection);
	}
	
	public String getInstallmentMessage() {
		scrollToAndView(WaysToSaveIphone,true);
		return getText(InstallmentText).replaceAll("\\s+", " ").trim();
	}

}