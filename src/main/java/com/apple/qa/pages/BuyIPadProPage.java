package com.apple.qa.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class BuyIPadProPage extends CommonElements{
	
	@FindBy(xpath = "//span[contains(text(),'Apple Pencil')]/parent::button/following-sibling::div//span[contains(text(),'Add')]")
	WebElement ApplePencilAddButton;
    
	String Model1 = "//div[contains(text(),'";
	String Model2 = "')]/ancestor::label";
	
	String Color1 = "//span[contains(text(),'";
	String Color2 = "')]/ancestor::label";
	
	String Storage1 = "//span[contains(text(),'";
	String Storage2 = "')]/ancestor::label";
	
	String Connectivity1 = "//span[text()='";
	String Connectivity2 = "']/ancestor::label";
	
	String EngraveOption1 = "//span[contains(text(),'";
	String EngraveOption2 = "')]/ancestor::label";
	
	String KeyboardColor1 = "//h3[contains(text(),'Pro ";
	String KeyboardColor2 = "')]/../following-sibling::div//input[@type='radio' and @value='";
	String KeyboardColor3 = "']/..//label";
	
	String MagicKeyboardAdd1 = "//span[contains(text(),'Pro ";
	String MagicKeyboardAdd2 = "')]/ancestor::button";
	
	@FindBy(xpath = "//button[@name='add-to-cart']")
	WebElement AddToBagButton;
	
	public BuyIPadProPage(){
		PageFactory.initElements(driver, this);
	}

	public void selectIPadProWithConfiguration(String model, String color, String storage, String connectivity,
			String engraveOption) {
		selectModel(model);
		selectColor(color);
		selectStorage(storage);
		selectConnectivity(connectivity);
		selectEngraveOption(engraveOption);	
	}
	
	public void selectModel(String model){
		click(Model1+model+Model2,"Model: "+model);
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
		driver.navigate().refresh();
		click(EngraveOption1+engraveOption+EngraveOption2,"EngraveOption: "+engraveOption);	
	}

	public void clickApplePencilAdd() {
		scrollToAndView(ApplePencilAddButton,true);
		click(ApplePencilAddButton,"ApplePencilAddButton");	
	}

	public void clickMagicKeyboardAdd(String color,String model) {
		selectKeyboardColor(color,model);
		click(MagicKeyboardAdd1+model+MagicKeyboardAdd2,"Magic Keyboard Add Button of IPad Display : "+model);	
	}
	
	public void selectKeyboardColor(String color,String model){
		click(KeyboardColor1+model+KeyboardColor2+color+KeyboardColor3,"Keyboard Color: "+color+" For IPad Display "+model);	
	}

	public IPadProAccessoriesPage clickAddToBag() {
		driver.navigate().refresh();
		scrollToAndView(AddToBagButton,true);
		click(AddToBagButton,"AddToBagButton");	
		return new IPadProAccessoriesPage();
	}
}