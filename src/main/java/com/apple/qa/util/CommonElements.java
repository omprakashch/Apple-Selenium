package com.apple.qa.util;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apple.qa.pages.AccessoriesPage;
import com.apple.qa.pages.AirPodsPage;
import com.apple.qa.pages.ClearancePage;
import com.apple.qa.pages.IPadPage;
import com.apple.qa.pages.IPhonePage;
import com.apple.qa.pages.MacPage;
import com.apple.qa.pages.OnlyOnApplePage;
import com.apple.qa.pages.StorePage;
import com.apple.qa.pages.SupportPage;
import com.apple.qa.pages.TVAndHomePage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Step;

public class CommonElements extends TestUtil{
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'store')]")
	WebElement StoreLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'mac')]")
	WebElement MacLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'ipad')]")
	WebElement IPadLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'iphone')]")
	WebElement IPhoneLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'watch')]")
	WebElement WatchLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'airpods')]")
	WebElement AirPodsLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'tv-home')]")
	WebElement TVAndHomeLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'services')]")
	WebElement OnlyOnAppleLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@href,'accessories')]")
	WebElement AccessoriesLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]//a[contains(@data-analytics-title,'support')]")
	WebElement SupportLink;
	
	@FindBy(xpath = "//nav[contains(@id,'globalnav')]/div/ul[contains(@class,'list')]/li")
	List<WebElement> HeaderList;
	
	
	public CommonElements(){
		PageFactory.initElements(driver, this);
	}
	
	@Step("getting signin option list step... ")
	public List<WebElement> getHeaderList() {
		return HeaderList;
	}
	
	public StorePage clickStore(){
		click(StoreLink,"StoreLink");
		return new StorePage();
	}
	
	public MacPage clickMac(){
		click(MacLink,"MacLink");
		return new MacPage();
	}
	
	public IPadPage clickIPad(){
		click(IPadLink,"IPadLink");
		return new IPadPage();
	}
	
	public IPhonePage clickIPhone(){
		click(IPhoneLink,"IPhoneLink");
		return new IPhonePage();
	}
	
	public WatchPage clickWatch(){
		click(WatchLink,"WatchLink");
		return new WatchPage();
	}
	
	public AirPodsPage clickAirPods(){
		click(AirPodsLink,"AirPodsLink");
		return new AirPodsPage();
	}
	
	public TVAndHomePage clickTVAndHome(){
		click(TVAndHomeLink,"TVAndHomeLink");
		return new TVAndHomePage();
	}
	
	public OnlyOnApplePage clickOnlyOnApple(){
		click(OnlyOnAppleLink,"OnlyOnAppleLink");
		return new OnlyOnApplePage();
	}
	
	public AccessoriesPage clickAccessories(){
		click(AccessoriesLink,"AccessoriesLink");
		return new AccessoriesPage();
	}
		
	public SupportPage clickSupport(){
		click(SupportLink,"SupportLink");
		return new SupportPage();
	}
}