package com.apple.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class AppleWatchNikePage extends CommonElements{
	
	@FindBy(xpath = "//span[text()='Apple Watch Nike']/parent::a[text()='Buy']")
	WebElement BuyLink;
	
	public AppleWatchNikePage(){
		PageFactory.initElements(driver, this);
	}

	public BuyAppleWatchNikePage clickBuy() {
		click(BuyLink,"BuyLink");	
		return new BuyAppleWatchNikePage();
	}

}