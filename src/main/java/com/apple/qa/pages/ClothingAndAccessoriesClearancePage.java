package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class ClothingAndAccessoriesClearancePage extends CommonElements{

	@FindBy(xpath = "//div[text()='Clothing & Accessories Clearance']")
	WebElement ClothingAndAccessoriesClearanceLink;
	
	
	public ClothingAndAccessoriesClearancePage(){
		PageFactory.initElements(driver, this);
	}
	
	public ClothingAndAccessoriesClearancePage clickSignIn(){
		click(ClothingAndAccessoriesClearanceLink,"ClothingAndAccessoriesClearanceLink");
		return new ClothingAndAccessoriesClearancePage();
	}
}