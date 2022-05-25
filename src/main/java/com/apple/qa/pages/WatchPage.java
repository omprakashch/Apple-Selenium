package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class WatchPage extends CommonElements{
	
	@FindBy(xpath = "//h2[contains(text(),'Health app')]/../../following-sibling::div")
	WebElement HealthAppSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Health app')]")
	WebElement HealthAppText;
	
	@FindBy(xpath = "//h2[contains(text(),'Apple Research app')]/../../following-sibling::div")
	WebElement AppleResearchAppSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Apple Research app')]")
	WebElement AppleResearchAppText;
	
	
	@FindBy(xpath = "//span[text()='Apple Watch Nike']/..")
	WebElement AppleWatchNikeLink;
	
	
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
	
	public AppleWatchNikePage clickAppleWatchNike() {
		scrollToAndView(AppleWatchNikeLink,true);
		click(AppleWatchNikeLink,"AppleWatchNikeLink");
		return new AppleWatchNikePage();
	}

}