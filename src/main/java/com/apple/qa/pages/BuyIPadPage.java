package com.apple.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;

public class BuyIPadPage extends CommonElements{
	
	@FindBy(xpath = "//span[contains(text(),'Apple Pencil')]/parent::button/following-sibling::div//span[contains(text(),'Add')]")
	WebElement ApplePencilAddButton;
    
	String Model1 = "//div[contains(text(),'";
	String Model2 = "')]/ancestor::label";
	
	String Color1 = "//span[text()='Finish']/parent::h2/../..//span[text()='";
	String Color2 = "']/parent::label";
	
	String Storage1 = "//h2[text()='Storage']/../..//span[text()='";
	String Storage2 = "']/parent::label";
	
	String Connectivity1 = "//h2[text()='Connectivity']/../..//span[text()='";
	String Connectivity2 = "']/parent::label";
	
	String EngraveOption1 = "//span[text()='";
	String EngraveOption2 = " Engraving']";
	
	
	@FindBy(xpath = "//span[text()='Check availability']/..")
	WebElement CheckAvailabilityLink;
	
	@FindBy(xpath = "//button[@name='add-to-cart']")
	WebElement AddToBagButton;
	
	public BuyIPadPage(){
		PageFactory.initElements(driver, this);
	}

	public void selectIPadWithConfiguration(String color, String storage, String connectivity,
			String engraveOption) {
		selectColor(color);
		selectStorage(storage);
		selectConnectivity(connectivity);
		selectEngraveOption(engraveOption);	
	}
	
	
	public void selectColor(String color){
		click(Color1+color+Color2,"Color: "+color);
	}
	
	public void selectStorage(String storage){
		click(Storage1+storage+Storage2,"Storage: "+storage);
	}
	
	public void selectConnectivity(String connectivity){
		click(Connectivity1+connectivity+Connectivity2,"Connectivity: "+connectivity);
	}
	
	public void selectEngraveOption(String engraveOption){
		//driver.navigate().refresh();
		click(EngraveOption1+engraveOption+EngraveOption2,"EngraveOption: "+engraveOption);	
	}

	public void clickApplePencilAdd() {
		scrollToAndView(ApplePencilAddButton,true);
		click(ApplePencilAddButton,"ApplePencilAddButton");	
	}


	public IPadAccessoriesPage clickAddToBag() {
		//driver.navigate().refresh();
		scrollToAndView(CheckAvailabilityLink,true);
		click(AddToBagButton,"AddToBagButton");	
		return new IPadAccessoriesPage();
	}

}