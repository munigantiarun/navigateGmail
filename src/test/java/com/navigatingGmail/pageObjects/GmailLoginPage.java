package com.navigatingGmail.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {
	WebDriver ldriver;
	
	public GmailLoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}

	
	@FindBy(linkText = "Gmail")
	@CacheLookup
	WebElement gmailLink;
	
	@FindBy(linkText = "Sign in")
	@CacheLookup
	WebElement signinLink;
	
	@FindBy(css = "span.VfPpkd-vQzf8d")
	@CacheLookup
	WebElement button;
	
	
	
	public void openGmail(String gLink)
	{
		gmailLink.click();
	}
	
	public void signIn(String sgnIn) {
		signinLink.click();
	}
	
	public void clickNextButton(String nxtBtn) {
		button.click();
	}
	
}