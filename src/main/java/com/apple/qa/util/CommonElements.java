package com.apple.qa.util;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.pages.ClearancePage;

import com.apple.qa.util.TestUtil;

import io.qameta.allure.Step;

public class CommonElements extends TestUtil{
	
	@FindBy(xpath = "//a[@id='categories'][2]")
	WebElement Categories;
	
	@FindBy(xpath = "//a[@aria-label='deals menu' or @aria-label='Deals']")
	WebElement Deals;
	
	@FindBy(xpath = "//a[@id='trending']")
	WebElement WhatsNew;
	
	@FindBy(xpath = "//a[@id='pickupAndDelivery']")
	WebElement PickupAndDelivery;
	
	@FindBy(xpath = "//input[@id='search']")
	WebElement SearchInputField;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement SearchIcon;
	
	@FindBy(xpath = "//div[text()='Clearance']")
	WebElement Clearance;
	
	@FindBy(xpath = "//div[text()='Weekly Ad']")
	WebElement WeeklyAd;
	
	@FindBy(xpath = "//div[text()='Top Deals']")
	WebElement TopDeals;
	
	@FindBy(xpath = "//div[text()='RedCard Exclusives']")
	WebElement RedCardExclusives;
	
	@FindBy(xpath = "//div[text()='Target Circle Offers']")
	WebElement TargetCircleOffers;
	
	@FindBy(xpath = "//div[@id='footer']")
	WebElement FooterSection;
	
	@FindBy(xpath = "//span[contains(text(),'Trending items')]/../../../../../../..")
	WebElement TrendingItemsSection;
	
	@FindBy(xpath = "//span[contains(text(),'Trending items')]/../../../../../../../li")
	List<WebElement> TrendingItemsList;
	
	
	public CommonElements(){
		PageFactory.initElements(driver, this);
	}
	
	public ClearancePage clickClearnce(){
		click(Deals,"Deals");
		jseClick(Clearance,"Clearance");
		return new ClearancePage();
	}
	
	@Step("getting trending items list step... ")
	public List<WebElement> getTrendingItemsList(){
		scroll(10);
		return TrendingItemsList;
	}
}