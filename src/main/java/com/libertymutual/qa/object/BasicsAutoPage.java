package com.libertymutual.qa.object;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libertymutual.qa.commons.CommonFunctions;

public class BasicsAutoPage {

	CommonFunctions commons;
	WebDriver driver;

	public BasicsAutoPage(WebDriver driver, CommonFunctions commons) {
		PageFactory.initElements(driver, this);
		this.commons = commons;
		this.driver = driver;

	}

	@FindBy(linkText = "Hi there! Let’s start with some basics")
	WebElement headerElement;

	@FindBy(name = "//input[@name='address']")
	WebElement addressElement;

	@FindBy(xpath = "//input[@class='char-10']")
	WebElement aptElement;

	@FindBy(id = "nextButton-0")
	WebElement continue1Element;

	@FindBy(name = "firstName")
	WebElement firstNameElement;

	@FindBy(name = "lastName")
	WebElement lastNameElement;

	@FindBy(xpath = "//select[@name='month']")
	WebElement monthElement;

	@FindBy(xpath = "//input[@name='day']")
	WebElement dayElement;

	@FindBy(xpath = "//input[@name='year']")
	WebElement yearElement;

	@FindBy(xpath = "//input[@name='email']")
	WebElement emailElement;

	@FindBy(id = "nextButton-1")
	WebElement continue2Element;

	@FindBy(id = "year-vehicle-0_selectNode")
	WebElement carYearElement;

	@FindBy(id = "make-vehicle-0_selectNode")
	WebElement carMakeElement;

	@FindBy(id = "model-vehicle-0_selectNode")
	WebElement carModelElement;

	@FindBy(id = "fullModelName-vehicle-0_selectNode")
	WebElement carTrimElement;

	@FindBy(id = "bodyStyle-vehicle-0_selectNode")
	WebElement carBodyElement;

	private void getHeaderText(String expectedHeaderText) {
		assertEquals(commons.getText(headerElement), expectedHeaderText);
	}

	private void inputAddress(String address) {
		commons.inputValues(addressElement, address);
	}

	private void inputApt(String apt) {
		commons.inputValues(aptElement, apt);
	}

	private void clickContinue1() {
		commons.click(continue1Element);
	}

	private void inputFirstName(String firstName) {
		commons.inputValues(firstNameElement, firstName);
	}

	private void inputLastName(String lastName) {
		commons.inputValues(lastNameElement, lastName);
	}

	private void selectMonth(String month) {
		commons.selectDropdown(monthElement, month);
	}

	private void inputDay(String day) {
		commons.inputValues(dayElement, day);

	}

	private void inputYear(String year) {
		commons.inputValues(yearElement, year);

	}

	private void inputEmail(String email) {
		commons.inputValues(emailElement, email);

	}

	private void clickContinue2() {
		commons.click(continue2Element);
	}

	private void selectCarYear(String carYear) {
		commons.selectDropdown(carYearElement, carYear);
	}

	private void selectCarMake(String carMake) {
		commons.selectDropdown(carMakeElement, carMake);
	}

	private void selectCarModel(String carModel) {
		commons.selectDropdown(carModelElement, carModel);
	}

	private void selectCarTrim(String carTrim) {
		commons.selectDropdown(carTrimElement, carTrim);
	}

	private void selectCarBody(String carBody) {
		commons.selectDropdown(carBodyElement, carBody);

	}

	private void verifyPageTitle(String expectedPageTitle) {
		assertEquals(commons.getTitle(driver), expectedPageTitle);
		
	}

	public void basicAutoSteps(String expectedHeaderText, String address, String apt, String firstName, String lastName, String month, 
			String day, String year, String email, String carYear, String carMake, String carModel, String carTrim,String carBody, String expectedPageTitle){
		
		getHeaderText(expectedHeaderText);
		inputAddress(address);
		inputApt(apt);
		clickContinue1();
		inputFirstName(firstName);
		inputLastName(lastName);
		selectMonth(month);
		inputDay(day);
		inputYear(carYear);
		inputEmail(email);
		clickContinue2();
		selectCarYear(carYear);
		selectCarMake(carMake);
		selectCarModel(carModel);
		selectCarTrim(carTrim);
		selectCarBody(carBody);
		clickContinue1();
		verifyPageTitle(expectedPageTitle);
	}
}
