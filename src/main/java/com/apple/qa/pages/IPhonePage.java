package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class IPhonePage extends CommonElements{
	
	@FindBy(xpath = "//div[@id='compare-gallery-notebook']")
	WebElement NotebookSection;
	
	@FindBy(xpath = "//span[text()='Desktop']/..")
	WebElement DesktopTab;
	
	@FindBy(xpath = "//section[contains(@class,'accessories')]/div[1]")
	WebElement FeaturedAccessoriesSection;
	
	@FindBy(xpath = "//section[contains(@class,'accessories')]/h2")
	WebElement FeaturedAccessoriesText;
	
	@FindBy(xpath = "//nav[contains(@id,'chapternav')]/following-sibling::main/div[3]//p")
	WebElement InstallmentText;
	
	
	public IPhonePage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean isFeaturedAccessoriesPresent() {
		scrollToAndView(FeaturedAccessoriesText);
		return isElementPresent(FeaturedAccessoriesSection);
	}
	
	public String getInstallmentMessage() {
		return getText(InstallmentText);
	}

}