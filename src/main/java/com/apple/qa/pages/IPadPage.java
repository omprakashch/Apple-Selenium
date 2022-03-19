package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

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
	
	@FindBy(xpath = "//nav[contains(@aria-label,'iPad family')]/following-sibling::main/div[2]//p")
	WebElement InstallmentText;
	
	@FindBy(xpath = "//h2[contains(text(),'iPad Pro')]/..//a[contains(text(),'Buy')]")
	WebElement BuyLinkInIPadProSection;
	
	
	
	
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
		return getText(InstallmentText);
	}

	public BuyIPadProPage clickBuyInIPadProSection() {
		click(BuyLinkInIPadProSection,"Buy Link In IPadProSection");
		return new BuyIPadProPage();
	}
	

}