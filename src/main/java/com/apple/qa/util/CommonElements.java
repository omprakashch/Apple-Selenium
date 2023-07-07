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
import com.apple.qa.pages.VisionPage;
import com.apple.qa.pages.StorePage;
import com.apple.qa.pages.SupportPage;
import com.apple.qa.pages.TVAndHomePage;
import com.apple.qa.pages.WatchPage;
import com.apple.qa.util.TestUtil;

import io.qameta.allure.Step;

public class CommonElements extends TestUtil{
	
	@FindBy(xpath = "//span[text()='Store']/ancestor::a")
	WebElement StoreLink;
	
	@FindBy(xpath = "//span[text()='Mac']/ancestor::a")
	WebElement MacLink;
	
	@FindBy(xpath = "//span[text()='iPad']/ancestor::a")
	WebElement IPadLink;
	
	@FindBy(xpath = "//span[text()='iPhone']/ancestor::a")
	WebElement IPhoneLink;
	
	@FindBy(xpath = "//span[text()='Watch']/ancestor::a")
	WebElement WatchLink;
	
	@FindBy(xpath = "//span[text()='Vision']/ancestor::a")
	WebElement VisionLink;
	
	@FindBy(xpath = "//span[text()='AirPods']/ancestor::a")
	WebElement AirPodsLink;
	
	@FindBy(xpath = "//span[text()='TV & Home']/ancestor::a")
	WebElement TVAndHomeLink;
	
	@FindBy(xpath = "//span[text()='Accessories']/ancestor::a")
	WebElement AccessoriesLink;
	
	@FindBy(xpath = "//span[text()='Support']/ancestor::a")
	WebElement SupportLink;
	
	@FindBy(xpath = "//*[@class='globalnav-link-text' or contains(@class,'globalnav-link-search') or contains(@class,'globalnav-link-bag')]")
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
	
	public VisionPage clickVision(){
		click(VisionLink,"VisionLink");
		return new VisionPage();
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