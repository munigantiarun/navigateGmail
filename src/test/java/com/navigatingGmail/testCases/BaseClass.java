package com.navigatingGmail.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.navigatingGmail.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	
	public String gURL = readConfig.openGooglePage();

	public WebDriver driver;
	
	public static Logger logger;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",readConfig.getChromePath() );
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("Navigating Gmail");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
//		driver.quit();
	}
	
	
	
}
