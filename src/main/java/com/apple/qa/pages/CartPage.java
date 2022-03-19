package com.apple.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class CartPage extends CommonElements{

	@FindBy(xpath = "//div[text()='Clothing & Accessories Clearance']")
	WebElement ClothingAndAccessoriesClearanceLink;
	
	String ProductName1 = "//ol[@data-autom='bag-items']/li[";
	String ProductName2 = "]//h2/a";
	
	public CartPage(){
		PageFactory.initElements(driver, this);
	}

	public String getProductName(int option) {
		return getText(ProductName1+option+ProductName2);
	}

}