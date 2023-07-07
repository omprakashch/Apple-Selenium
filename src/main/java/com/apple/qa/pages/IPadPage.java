package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class IPadPage extends CommonElements{
	
	@FindBy(xpath = "//div[contains(@class,'ipad-pro device')]")
	WebElement IPadProSection;
	
	@FindBy(xpath = "//div[contains(@class,'ipad-air device')]")
	WebElement IPadAirSection;
	
	@FindBy(xpath = "//div[contains(@class,'ipad-10-9 device')]")
	WebElement IPadSection;
	
	@FindBy(xpath = "//div[contains(@class,'ipad-mini device')]")
	WebElement IPadMiniSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Which iPad')]")
	WebElement WhichIPadText;
	
	@FindBy(xpath = "//div[contains(@data-analytics-section-engagement,'name:daily cash back with apple card')]/div[1]//h2")
	WebElement InstallmentText;
	
	@FindBy(xpath = "//span[text()='New']/../following-sibling::a[@aria-label='Buy iPad Pro']")
	WebElement BuyLinkInIPadProSection;
	
	@FindBy(xpath = "//section[contains(@class,'ipad')]//a[contains(@aria-label,'Buy iPad') and not(contains(@aria-label,'Pro'))]")
	WebElement BuyLinkInIPadSection;
	
	
	
	
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
	
	public BuyIPadPage clickBuyInIPadSection() {
		click(BuyLinkInIPadSection,"Buy Link In IPadSection");
		return new BuyIPadPage();
	}
	

}