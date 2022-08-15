package com.libertymutual.qa.object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libertymutual.qa.commons.CommonFunctions;



public class HomePage {

	CommonFunctions commons;
	WebDriver driver;

	public HomePage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
		this.driver = driver;

	}
	
	@FindBy(className = "jsx-155250305 jsx-391436929 lm-Logo--horizontal")
	WebElement logoElement;
	
	@FindBy(xpath = "//input[@aria-label='Get Auto Insurance']")
	WebElement autoElement;
	
	@FindBy(xpath = "//input[@id='quote-zipCode-input']")
	WebElement zipElement;
	
	@FindBy(xpath = "//button[text()='Get my price']")
	WebElement getPricElement;
	
	private void  verifyLogo() {
	commons.isDisplayed(logoElement);
	}
	
	private void clickAuto() {
		commons.click(autoElement);
	}
	
	private void inputZip(String zip) {
		commons.inputValues(autoElement, zip);
	}
	
	private void clickGetPrice() {
		commons.click(autoElement);
	}
	
	public void  homepageSteps1(String zip) {
		verifyLogo();
		clickAuto();
		inputZip(zip);
		clickGetPrice();
		
	}
}
