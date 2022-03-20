package com.apple.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class CartPage extends CommonElements{
	
	String ProductName1 = "//ol[@data-autom='bag-items']/li[";
	String ProductName2 = "]//h2/a";
	
	String AppleCarePlus1 = "//ol[@data-autom='bag-items']/li[";
	String AppleCarePlus2 = "]//h3";
	
	public CartPage(){
		PageFactory.initElements(driver, this);
	}

	public String getProductName(int option) {
		return getText(ProductName1+option+ProductName2);
	}

	public String getAppleCarePlusMessage(int option) {
		return getText(AppleCarePlus1+option+AppleCarePlus2);
	}

}