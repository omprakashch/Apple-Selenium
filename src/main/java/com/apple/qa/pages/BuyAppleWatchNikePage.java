package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class BuyAppleWatchNikePage extends CommonElements{
	
	String Watch1 = "//div[@role='main']/div[4]/div/div/div/div[1]//div[contains(@class,'select-grid')]//li[";
	String Watch2 = "]//button";
	
	String CaseSize1 = "//h2[text()='Case Size']/../..//span[text()='";
	String CaseSize2 = "']/ancestor::label";
	
	String Connectivity1 = "//h2[text()='Connectivity']/../..//span[text()='";
	String Connectivity2 = "']/ancestor::label";
	
	
	@FindBy(xpath = "//span[text()='Check availability']/..")
	WebElement CheckAvailabilityLink;
	
	@FindBy(xpath = "//button[@name='add-to-cart']")
	WebElement AddToBagButton;
	
	public BuyAppleWatchNikePage(){
		PageFactory.initElements(driver, this);
	}

	public void selectAppleWatchNikeWithConfiguration(String caseSize, String connectivity) {
		selectCase(caseSize);
		selectConnectivity(connectivity);	
	}
	
	
	public void selectCase(String caseSize){
		click(CaseSize1+caseSize+CaseSize2,"Case Size: "+caseSize);
	}
	
	public void selectConnectivity(String connectivity){
		click(Connectivity1+connectivity+Connectivity2,"Connectivity: "+connectivity);
	}


	public AccessoriesPage clickAddToBag() {
		//driver.navigate().refresh();
		scrollToAndView(CheckAvailabilityLink,true);
		click(AddToBagButton,"AddToBagButton");	
		return new AccessoriesPage();
	}

	public void clickWatch(int option) {
		click(Watch1+option+Watch2,"Watch: "+option);
	}

}