package com.apple.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class VisionPage extends CommonElements{
	
	@FindBy(xpath = "//nav[contains(@id,'chapternav')]/div/ul[contains(@class,'items')]/li")
	List<WebElement> OnlyOnAppleHeaderList;
	
	@FindBy(xpath = "//h2[contains(@class,'typography-exp-headline')]//following-sibling::div/a")
	List<WebElement> PaymentOptionsList;
	
	@FindBy(xpath = "//section[contains(@class,'more-experiences')]")
	WebElement ExperiencesText;
	
	
	public VisionPage(){
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getOnlyOnAppleHeaderList() {
		return OnlyOnAppleHeaderList;
	}

	public List<WebElement> getPaymentOptionsList() {
		scrollToAndView(ExperiencesText,true);
		return PaymentOptionsList;
	}

}