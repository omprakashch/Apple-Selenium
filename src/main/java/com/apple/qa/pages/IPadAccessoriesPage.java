package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class IPadAccessoriesPage extends CommonElements{
	
	@FindBy(xpath = "//button[text()='Review Bag']")
	WebElement ReviewBag;
	
	public IPadAccessoriesPage(){
		PageFactory.initElements(driver, this);
	}

	public CartPage clickReviewBag() {
		click(ReviewBag,"ReviewBag");
		return new CartPage();
	}
}