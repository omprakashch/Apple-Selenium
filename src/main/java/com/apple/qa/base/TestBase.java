package com.apple.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.apple.qa.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public  EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static long PAGE_LOAD_TIMEOUT = 90;
	public static long IMPLICIT_WAIT = 60;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	Logger log = Logger.getLogger(TestBase.class);
	public static String browserName = null;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/apple/qa/config/config.properties");
			prop.load(ip);	
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
	}
	@BeforeMethod
	public void initialization(){
		ExecutionStartLog("TestCaseExecution");
		browserName = prop.getProperty("browser");
		if(browserName.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/Chrome/chromedriver.exe");
		driver = new ChromeDriver();
		}
		else{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/Drivers/Firefox/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		log.info("*********Launching "+browserName+" browser********");
		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT,TimeUnit.SECONDS); 
		driver.manage().timeouts().setScriptTimeout(PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		//tdriver.set(driver);
		//driver = getDriver();
		driver.get(prop.getProperty("url"));
		log.info("Navigating to url "+prop.getProperty("url"));
}
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	
	public void ExecutionStartLog(String message){
	log.info("*******Strating"+message+"*******");	
	}
	
    public void ExecutionEndLog(String message){
    log.info("********Ending"+message+"********");	
	}
	
	@AfterMethod
	public void tearDown(){
	driver.quit();
	log.info("********Closing The Browser********");	
	ExecutionEndLog("TestCaseExecution");
	}
}