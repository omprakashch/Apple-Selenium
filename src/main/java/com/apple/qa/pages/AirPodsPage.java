package com.apple.qa.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class AirPodsPage extends CommonElements{
	
	@FindBy(xpath = "//nav[contains(@id,'chapternav')]/div/ul[contains(@class,'items')]/li")
	List<WebElement> AirPodsHeaderList;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Check eligibility')]")
	WebElement CheckEligibilityLink;
	
	@FindBy(xpath = "//a[contains(text(),'Learn')]")
	WebElement LearnMoreLink;
	
	@FindBy(xpath = "//a[@aria-label='Buy AirPods Max']")
	WebElement BuyLinkInAirPodsMaxSection;
	
	public AirPodsPage(){
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getAirPodsHeaderList() {
		return AirPodsHeaderList;
	}

	public boolean isCheckEligibilityPresent() {
		return isElementPresent(CheckEligibilityLink);
	}

	public BuyAirPodsMaxPage clickBuyInAirPodsMaxSection() {
		click(BuyLinkInAirPodsMaxSection,"Buy Link In AirPods Max Section");
		return new BuyAirPodsMaxPage();
	}

	public boolean isLearnMorePresent() {
		return isElementPresent(LearnMoreLink);
	}

}