package com.navigatingGmail.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.navigatingGmail.pageObjects.GmailLoginPage;

public class TestCaseNextBtn_001 extends BaseClass {

	@Test
	public void googlePage() {
		driver.get(gURL);
		
		GmailLoginPage gl = new GmailLoginPage(driver);
		
		gl.openGmail(null);
		logger.info("Navigated to Signin page!");
		gl.signIn(null);
		logger.info("Sign in page opened");
		gl.clickNextButton(null);
		
		String nurl = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
		if (driver.getCurrentUrl().contentEquals(nurl)) {

			Assert.assertTrue(false);
			logger.info("NextButton is not clicked!");
		}
		else {
			Assert.assertTrue(true);
			logger.info("NextButton is clicked!");
		}
		
	}
	
}
