package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class IPadPage extends CommonElements{
	
	@FindBy(xpath = "//div[@class='ipad-pro device']")
	WebElement IPadProSection;
	
	@FindBy(xpath = "//div[@class='ipad-air device']")
	WebElement IPadAirSection;
	
	@FindBy(xpath = "//div[@class='ipad-10-2 device']")
	WebElement IPadSection;
	
	@FindBy(xpath = "//div[@class='ipad-mini device']")
	WebElement IPadMiniSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Which iPad')]")
	WebElement WhichIPadText;
	
	@FindBy(xpath = "//div[contains(@data-analytics-section-engagement,'name:daily cash back with apple card')]/div[1]//h2")
	WebElement InstallmentText;
	
	@FindBy(xpath = "//h2[contains(text(),'iPad Pro')]/..//a[contains(text(),'Buy')]")
	WebElement BuyLinkInIPadProSection;
	
	@FindBy(xpath = "//section[contains(@class,'ipad-mini')]//a[contains(@aria-label,'Buy iPad mini')]")
	WebElement BuyLinkInIPadMiniSection;
	
	
	
	
	public IPadPage(){
		PageFactory.initElements(driver, this);
	}

	public boolean isIPadProPresent() {
		scrollToAndView(WhichIPadText,true);
		return isElementPresent(IPadProSection);
	}
	
	public boolean isIPadAirPresent() {
		return isElementPresent(IPadAirSection);
	}
	
	public boolean isIPadPresent() {
		return isElementPresent(IPadSection);
	}
	
	public boolean isIPadMiniPresent() {
		return isElementPresent(IPadMiniSection);
	}

	public String getInstallmentMessage() {
		scrollToAndView(InstallmentText,true);
		return getText(InstallmentText).replaceAll("\\s+", " ").trim();
	}

	public BuyIPadProPage clickBuyInIPadProSection() {
		click(BuyLinkInIPadProSection,"Buy Link In IPadProSection");
		return new BuyIPadProPage();
	}
	
	public BuyIPadMiniPage clickBuyInIPadMiniSection() {
		click(BuyLinkInIPadMiniSection,"Buy Link In IPadMiniSection");
		return new BuyIPadMiniPage();
	}
	

}