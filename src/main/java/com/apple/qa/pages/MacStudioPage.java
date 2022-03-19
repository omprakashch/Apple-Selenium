package com.apple.qa.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class MacStudioPage extends CommonElements{
	
	@FindBy(xpath = "//button[text()='Continue']")
	WebElement Continue;
	
	String Chip1 = "//div[contains(text(),'";
	String Chip2 = " GPU')]/ancestor::label/../..";
	
	String Memory1 = "//div[contains(text(),'";
	String Memory2 = "')]/ancestor::label/../..";
	
	String Storage1 = "//div[contains(text(),'";
	String Storage2 = "')]/ancestor::label/../..";
	
	String FinalCutProOption1 = "//span[contains(text(),'Final')]/ancestor::button/following-sibling::div//div[contains(text(),'";
	String FinalCutProOption2 = "')]/ancestor::label";
	
	String LogicProOption1 = "//span[contains(text(),'Logic')]/ancestor::button/following-sibling::div//div[contains(text(),'";
	String LogicProOption2 = "')]/ancestor::label";
	
	
	public MacStudioPage(){
		PageFactory.initElements(driver, this);
	}

	public BuyMacStudioPage selectMacStudioWithConfiguration(String chip, String memory, String storage, String finalCutProOption,
			String logicProOption) {
		clickChip(chip);
		clickMemory(memory);
		clickStorage(storage);
		clickFinalCutProOption(finalCutProOption);
		clickLogicProOption(logicProOption);
		return clickContinue();
	}
	
	public void clickChip(String chip){
		scrollToAndView(Chip1+chip+Chip2,true);
		click(Chip1+chip+Chip2,"Chip: "+chip);
	}
	
	public void clickMemory(String memory){
		scrollToAndView(Memory1+memory+Memory2,true);
		click(Memory1+memory+Memory2,"Memory: "+memory);
	}
	
	public void clickStorage(String storage){
		scrollToAndView(Storage1+storage+Storage2,true);
		click(Storage1+storage+Storage2,"Storage: "+storage);
	}
	
	public void clickFinalCutProOption(String finalCutProOption){
		scrollToAndView(FinalCutProOption1+finalCutProOption+FinalCutProOption2,true);
		click(FinalCutProOption1+finalCutProOption+FinalCutProOption2,"FinalCutProOption: "+finalCutProOption);
	}
	
	public void clickLogicProOption(String logicProOption){
		scrollToAndView(LogicProOption1+logicProOption+LogicProOption2,true);
		click(LogicProOption1+logicProOption+LogicProOption2,"LogicProOption: "+logicProOption);
	}
	
	public BuyMacStudioPage clickContinue(){
		click(Continue,"Continue");
		return new BuyMacStudioPage();
	}

}