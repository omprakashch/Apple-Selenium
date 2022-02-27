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

public class AccessoriesPage extends CommonElements{
	
	@FindBy(xpath = "//nav[contains(@id,'chapternav')]/div/ul[contains(@class,'items')]/li")
	List<WebElement> AirPodsHeaderList;
	
	@FindBy(xpath = "//button[@data-autom='Browse by Category']")
	WebElement BrowseByCategoryTab;
	
	@FindBy(xpath = "//button[@data-autom='Browse by Product']")
	WebElement BrowseByProductTab;
	
	@FindBy(xpath = "//input[@data-autom='searchInputBox']")
	WebElement SearchAccessoriesInputField;
	
	String BrowseByCategoryOption1 = "//button[@data-autom='Browse by Category']/../../../../following-sibling::div/ul/div/li[";
	String BrowseByCategoryOption2 = "]/a/span";
	
	String BrowseByProductOption1 = "//button[@data-autom='Browse by Product']/../../../../following-sibling::div/ul/div/li[";
	String BrowseByProductOption2 = "]/a/span";
	
	
	public AccessoriesPage(){
		PageFactory.initElements(driver, this);
	}

	public void clickBrowseByCategory() {
		scrollToAndView(SearchAccessoriesInputField);
		click(BrowseByCategoryTab,"BrowseByCategoryTab");	
	}
	
	public void clickBrowseByProduct() {
		scrollToAndView(SearchAccessoriesInputField);
		click(BrowseByProductTab,"BrowseByProductTab");	
	}

	public String getBrowseByCategory(int Option) {
		return getText(BrowseByCategoryOption1+Option+BrowseByCategoryOption2).trim();
	}
	
	public String getBrowseByProduct(int Option) {
		return getText(BrowseByProductOption1+Option+BrowseByProductOption2).trim();
	}

}