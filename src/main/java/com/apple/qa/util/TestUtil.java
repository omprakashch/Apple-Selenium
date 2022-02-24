package com.apple.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.apple.qa.base.TestBase;

public class TestUtil extends TestBase{
	
	static String currectDir = System.getProperty("user.dir");
	public static String TESTDATA_SHEET_PATH = currectDir+"/src/main/java/com/target/qa/testdata/TargetTestData.xlsx";

	static Workbook book;
	static Sheet sheet;
	static JavascriptExecutor js;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	public WebElement getElement(String objPath){
		WebElement element = null;
		if(objPath.startsWith("//"))
			element = driver.findElement(By.xpath(objPath));
		else if(objPath.startsWith("#"))
			element = driver.findElement(By.cssSelector(objPath));
		else
			element = driver.findElement(By.id(objPath));
		return element;	
	}
	
	public void click(String elementPath){
		WebDriverWait wait = new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementPath)));
		getElement(elementPath).click();
	}
	
	public void click(WebElement element,String elementName){
		WebDriverWait wait = new WebDriverWait(driver,25);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		logInfo("Clicked On "+elementName);
	}
	
	public String getText(String elementPath){
		return getElement(elementPath).getText();
	}
	
	public String getText(WebElement element){
		return element.getText();
	}
	
	public String getAttribute(String elementPath){
		return getElement(elementPath).getAttribute("value");
	}
	
	public String getAttribute(WebElement element){
		return element.getAttribute("value");
	}
	
	public void enterText(String elementPath, String inputText,String elementName){
		getElement(elementPath).sendKeys(inputText);
		logInfo("Entered "+elementName);
	}
	
	public void enterText(WebElement element, String inputText,String elementName){
		element.sendKeys(inputText);
		logInfo("Entered "+elementName);
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public void pause(long sec){
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void scrollToAndView(String elementPath){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", getElement(elementPath));
	}
	
	public void scrollToAndView(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public void scroll(int iteration){
		for(int i=1;i<=iteration;i++){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		}
	}
	
	public void jseClick(String elementPath,String elementName){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", getElement(elementPath));
		logInfo("Clicked On "+elementName);
	}
	
	public void jseClick(WebElement element,String elementName){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		logInfo("Clicked On "+elementName);
	}
	
	public boolean isElementPresent(String elementPath){
		boolean flag = false;
		try{
			flag = getElement(elementPath).isDisplayed();
		}
		catch(Exception e){
			flag = false;
		}
		return flag;
	}
	
	public boolean isElementPresent(WebElement element){
		boolean flag = false;
		try{
			flag = element.isDisplayed();
		}
		catch(Exception e){
			flag = false;
		}
		return flag;
	}
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		}  catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		// System.out.println(sheet.getLastRowNum() + "--------" +
		// sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	public static String takeScreenshotAtEndOfTest() throws IOException {
	File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String destination = "/TestReport/screenshots/" + System.currentTimeMillis() + ".png";
	FileUtils.copyFile(srcFile, new File(destination));	
	return destination;
	}
	
	public void logInfo(String info){
		ExtentTestManager.getTest().log(Status.INFO, info);
	}
}