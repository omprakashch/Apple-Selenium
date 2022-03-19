package com.apple.qa.pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class BuyIPhone13ProPage extends CommonElements{
	
	@FindBy(xpath = "//button[@title='Continue']")
	WebElement ContinueButton;
    
	String Size1 = "//input[@type='radio' and @value='";
	String Size2 = "']/../label";
	
	/*String Color1 = "//fieldset//span[text()='";
	String Color2 = "']/ancestor::label";
	
	String Capacity1 = "//fieldset//span[text()='";
	String Capacity2 = "']/ancestor::label";
	
	String Carrier1 = "//fieldset//span[text()='";
	String Carrier2 = "']/ancestor::label";*/
	
	String Configuration1 = "//fieldset//span[text()='";
	String Configuration2 = "']/ancestor::label";
	
	String SmartPhoneOption1 = "//span[contains(text(),'";
	String SmartPhoneOption2 = "')]/ancestor::label";
	
	String PaymentOption1 = "//span[contains(text(),'";
	String PaymentOption2 = "')]/ancestor::label";
	
	@FindBy(xpath = "//input[@data-autom='purchaseOptionfullPrice']/..")
	WebElement OneTimePaymentButton;
	
	@FindBy(xpath = "//div[contains(@class,'transition-enter')]//div[contains(@class,'inline-applecare-option')][1]/div/div[1]")
	WebElement AppleCarePlusButton;
	
	String Coverage1 = "//div[contains(@class,'transition-enter')]//div[contains(@class,'inline-applecare-option')][1]//div[contains(text(),'";
	String Coverage2 = "')]/ancestor::label/parent::li";

	
	
	public BuyIPhone13ProPage(){
		PageFactory.initElements(driver, this);
	}

	public BuyIPhoneAppleStorePage selectIPhone13ProWithConfiguration(String model, String color, String capacity, String carrier,
			String smartPhoneOption, String paymentOption, String coverage) {
		String size = null;
		if(model.equals("iPhone 13 Pro"))
		size = "6_1inch";
		else if(model.equals("iPhone 13 Pro Max"))
		size = "6_7inch";
		clickSize(size,model);
		clickColor(color);
		clickCapacity(capacity);
		clickCarrier(carrier);
		clickSmartPhoneOption(smartPhoneOption);
		clickPaymentOption(paymentOption);
		clickOneTimePayment();
		clickAppleCarePlus();
		clickCoverage(coverage);
		return clickContinue();
	//	return new BuyIPhoneAppleStorePage();
		
	}
	
	public void clickSize(String size, String model){
		click(Size1+size+Size2,"Model: "+model);
	}
	
	public void clickColor(String color){
		scrollToAndView(Configuration1+color+Configuration2,true);
		click(Configuration1+color+Configuration2,"Color: "+color);
	}
	
	public void clickCapacity(String capacity){
		scrollToAndView(Configuration1+capacity+Configuration2,true);
		click(Configuration1+capacity+Configuration2,"Capacity: "+capacity);
	}
	
	public void clickCarrier(String carrier){
		scrollToAndView(Configuration1+carrier+Configuration2,true);
		click(Configuration1+carrier+Configuration2,"Carrier: "+carrier);
	}
	
	public void clickSmartPhoneOption(String smartPhoneOption){
		scrollToAndView(SmartPhoneOption1+smartPhoneOption+SmartPhoneOption2,true);
		click(SmartPhoneOption1+smartPhoneOption+SmartPhoneOption2,"SmartPhoneOption: "+smartPhoneOption);
	}
	
	public void clickPaymentOption(String paymentOption){
		scrollToAndView(PaymentOption1+paymentOption+PaymentOption2,true);
		click(PaymentOption1+paymentOption+PaymentOption2,"PaymentOption: "+paymentOption);
	}
	
	public void clickOneTimePayment(){
		click(OneTimePaymentButton,"OneTimePaymentButton");
	}
	
	public void clickAppleCarePlus(){
		scrollToAndView(AppleCarePlusButton,true);
		click(AppleCarePlusButton,"AppleCarePlusButton");
	}
	
	public void clickCoverage(String coverage){
		click(Coverage1+coverage+Coverage2,"Coverage: "+coverage);
	}

	public BuyIPhoneAppleStorePage clickContinue(){
		scrollToAndView(ContinueButton,true);
		click(ContinueButton,"ContinueButton");
		return new BuyIPhoneAppleStorePage();
	}
}