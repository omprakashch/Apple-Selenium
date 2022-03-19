package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class MacPage extends CommonElements{
	
	@FindBy(xpath = "//div[@id='compare-gallery-notebook']")
	WebElement NotebookSection;
	
	@FindBy(xpath = "//span[text()='Desktop']/..")
	WebElement DesktopTab;
	
	@FindBy(xpath = "//div[@id='compare-gallery-desktop']")
	WebElement DesktopSection;
	
	@FindBy(xpath = "//h2[contains(text(),'Which Mac')]")
	WebElement WhichMacText;
	
	@FindBy(xpath = "//p[contains(@class,'hero-product')]//a[text()='Buy' and contains(@aria-label,'Mac Studio')]")
	WebElement BuyLinkInMacStudioSection;
	
	
	public MacPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean isNotebookSectionPresent() {
		scrollToAndView(WhichMacText,true);
		return isElementPresent(NotebookSection);
	}
	
	public boolean isDesktopSectionPresent() {
		scrollToAndView(WhichMacText,true);
		return isElementPresent(DesktopSection);
	}
	
	public void clickDesktop(){
		click(DesktopTab,"Desktop Tab");
	}

	public BuyMacStudioPage clickBuyInMacStudioSection() {
		click(BuyLinkInMacStudioSection,"Buy Link In MacStudioSection");
		return new BuyMacStudioPage();
		
	}

}