package com.apple.qa.pages;

import java.util.Hashtable;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.apple.qa.base.TestBase;
import com.apple.qa.util.CommonElements;
import com.apple.qa.util.TestUtil;

public class TVAndHomePage extends CommonElements{
	
	@FindBy(xpath = "//nav[contains(@id,'chapternav')]/div/ul[contains(@class,'items')]/li")
	List<WebElement> TVAndHomeHeaderList;
	
	@FindBy(xpath = "//h1[contains(text(),'The future')]")
	WebElement FutureText;
	
	@FindBy(xpath = "//div[contains(@class,'homepod-mini')]")
	WebElement HomePodMiniSection;
	
	
	public TVAndHomePage(){
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getTVAndHomeHeaderList() {
		return TVAndHomeHeaderList;
	}

	public boolean isHomePodMiniPresent() {
		scrollToAndView(FutureText,true);
		return isElementPresent(HomePodMiniSection);
	}

}