package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class SupportPage extends CommonElements{
	
	@FindBy(xpath = "//label[contains(text(),'Search Support')]/following-sibling::input[@placeholder='Search Support']")
	WebElement SearchForTopicsInputField;
	
	@FindBy(xpath = "//h3[contains(text(),'Beware of counterfeit parts')]")
	WebElement BewareOfCounterPartsMessage;
	
	@FindBy(xpath = "//h3[contains(text(),'gift card scams')]")
	WebElement GiftCardScamMessage;
	
	
	public SupportPage(){
		PageFactory.initElements(driver, this);
	}

	public boolean isSearchForTopicsPresent() {
		scrollToAndView(SearchForTopicsInputField,true);
		return isElementPresent(SearchForTopicsInputField);
	}

	public String getGiftCardScamMessage() {
		scrollToAndView(BewareOfCounterPartsMessage,true);
		return getText(GiftCardScamMessage).trim();
	}

}