package com.apple.qa.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class BuyAirPodsMaxPage extends CommonElements{
	
	@FindBy(xpath = "//input[contains(@data-autom,'Engraveline')]")
	WebElement EngraveMessage;
	
	String Color1 = "//span[contains(text(),'";
	String Color2 = "')]/parent::label";
	
	String EngraveOption1 = "//span[contains(text(),'";
	String EngraveOption2 = "')]/ancestor::label";
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement SaveButton;
	
	@FindBy(xpath = "//button[contains(@data-autom,'applecare')]")
	WebElement AppleCarePlusAddButton;
	
	@FindBy(xpath = "//button[contains(@data-autom,'overlay_add')]")
	WebElement AppleCarePlusAddButtonInOverLay;
	
	@FindBy(xpath = "//button[contains(@data-autom,'add-to-cart')]")
	WebElement AddToBagButton;
	
	public BuyAirPodsMaxPage(){
		PageFactory.initElements(driver, this);
	}

	public void selectColor(String color){
		click(Color1+color+Color2,"Color: "+color);
	}
	
	public void selectEngraveOption(String engraveOption){
		Actions builder = new Actions(driver);
		try{
		builder.moveToElement(getElement(EngraveOption1+engraveOption+EngraveOption2)).click().build().perform();
		}
		catch(StaleElementReferenceException e){
		builder.moveToElement(getElement(EngraveOption1+engraveOption+EngraveOption2)).click().build().perform();	
		}	
	}

	public void selectAirPodsMaxWithConfiguration(String color, String option, String engraveMessage) {
		selectColor(color);
		selectEngraveOption(option);
		enterEngraveMesssage(engraveMessage);
	}
	
	public void enterEngraveMesssage(String engraveMessage){
		enterText(EngraveMessage,engraveMessage,engraveMessage);
		click(SaveButton,"SaveButton");	
	}

	public void clickAppleCarePlusAdd() {
		//scrollToAndView(AppleCarePlusAddButton,true);
		click(AppleCarePlusAddButton,"AppleCarePlusAddButton");	
		click(AppleCarePlusAddButtonInOverLay,"AppleCarePlusAddButtonInOverLay");
	}

	public AirPodsMaxAccessoriesPage clickAddToBag() {
		try{
		scrollToAndView(AddToBagButton,true);
		click(AddToBagButton,"AddToBagButton");
		}
		catch(StaleElementReferenceException e){
		click(AddToBagButton,"AddToBagButton");	
		}
		return new AirPodsMaxAccessoriesPage();
	}
}