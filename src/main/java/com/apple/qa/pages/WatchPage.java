package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class WatchPage extends CommonElements{
	
	@FindBy(xpath = "//h2[contains(text(),'Health app')]/../../following-sibling::div")
	WebElement HealthAppSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Health app')]")
	WebElement HealthAppText;
	
	@FindBy(xpath = "//h2[contains(text(),'Apple Research app')]/../../following-sibling::div")
	WebElement AppleResearchAppSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Apple Research app')]")
	WebElement AppleResearchAppText;
	
	
	public WatchPage(){
		PageFactory.initElements(driver, this);
	}

	public boolean isHealthAppPresent() {
		scrollToAndView(HealthAppText,true);
		return isElementPresent(HealthAppSection);
	}
	
	public boolean isAppleResearchAppPresent() {
		scrollToAndView(AppleResearchAppText,true);
		return isElementPresent(AppleResearchAppSection);
	}

}