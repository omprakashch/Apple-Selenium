package com.apple.qa.pages;

import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class OnlyOnApplePage extends CommonElements{
	
	@FindBy(xpath = "//nav[contains(@id,'chapternav')]/div/ul[contains(@class,'items')]/li")
	List<WebElement> OnlyOnAppleHeaderList;
	
	@FindBy(xpath = "//h2[contains(@class,'typography-exp-headline')]//following-sibling::div/a")
	List<WebElement> PaymentOptionsList;
	
	@FindBy(xpath = "//section[contains(@class,'more-experiences')]")
	WebElement ExperiencesText;
	
	
	public OnlyOnApplePage(){
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getOnlyOnAppleHeaderList() {
		return OnlyOnAppleHeaderList;
	}

	public List<WebElement> getPaymentOptionsList() {
		scrollToAndView(ExperiencesText);
		return PaymentOptionsList;
	}

}