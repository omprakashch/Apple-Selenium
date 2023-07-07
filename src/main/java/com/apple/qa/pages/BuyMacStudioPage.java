package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class BuyMacStudioPage extends CommonElements{
	
	@FindBy(xpath = "//button[@title='Continue']")
	WebElement ContinueButton;
	
	@FindBy(xpath = "//span[text()='Mac Studio']/../../following-sibling::div//button")
	WebElement AddToBag;
	
	String Select1 = "//img[contains(@alt,'";
	String Select2 = "')]/ancestor::h2/following-sibling::div//button[@type='submit']";
	
	public BuyMacStudioPage(){
		PageFactory.initElements(driver, this);
	}

	public MacStudioPage selectMacStudio(String model) {
		click(Select1+model+Select2,"Model: "+model);
		return new MacStudioPage();
	}

	public MacStudioAccessoriesPage clickAddToBag() {
		click(AddToBag,"AddToBag");
		return new MacStudioAccessoriesPage();
	}
}