package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class RegistrationPage extends BaseClass{
	
	Action action= new Action();
	
	@FindBy(xpath = "//h1[text()='Create an account']")
	 WebElement formTitle;
	
	/*
	
	@FindBy(id = "uniform-id_gender1")
	 WebElement mr;
	
	@FindBy(id = "id_gender2")
	 WebElement mrs;

	@FindBy(name = "customer_firstname")
	 WebElement firstName;

	@FindBy(name = "customer_lastname")
	 WebElement lastName;

	@FindBy(name = "passwd")
	 WebElement passWord;

	@FindBy(name = "days")
	 WebElement days;

	@FindBy(name = "months")
	 WebElement months;

	@FindBy(name = "years")
	 WebElement years;

	@FindBy(name = "firstname")
	 WebElement customerNirstName;

	@FindBy(name = "lastname")
	 WebElement customerLastName;

	@FindBy(name = "company")
	 WebElement companyName;

	@FindBy(name = "address1")
	 WebElement address;

	@FindBy(name = "city")
	 WebElement city;

	@FindBy(name = "id_state")
	 WebElement state;

	@FindBy(name = "postcode")
	 WebElement postCode;

	@FindBy(name = "id_country")
	 WebElement country;

	@FindBy(name = "phone")
	 WebElement phone;

	@FindBy(name = "phone_mobile")
	 WebElement mobile;

	@FindBy(name = "alias")
	 WebElement ref;

	@FindBy(name = "submitAccount")
	 WebElement registerBtn;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void createAccount(String gender,String fName, 
			String lName, 
			String pswd, 
			String day, 
			String month, 
			String year,
			String comPany, 
			String addr, 
			String cityString, 
			String stateName, 
			String zip, 
			String countryName,
			String mobilePhone) throws Throwable {
		if(gender.equalsIgnoreCase("Mr")) {
			action.click(driver, mr);
		} else {
			action.click(driver, mrs);
		}
		action.type(firstName, fName);
		action.type(lastName, lName);
		action.type(passWord, pswd);
		action.selectByValue(days, day);
		action.selectByValue(months, month);
		action.selectByValue(years, year);
		action.type(companyName, comPany);
		action.type(address, addr);
		action.type(city, cityString);
		action.selectByVisibleText(stateName, state);
		action.type(postCode, zip);
		action.selectByVisibleText(countryName, country);
		action.type(mobile, mobilePhone);
	}
	
	public HomePage valiadteregistration() 
	{
		registerBtn.click();
		return new HomePage();
		
	}
	*/
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	/*
	public boolean verifyregisterpage() 
	{
		return Action.isDisplayed(driver, formTitle);
		
	}
	*/
	public boolean validateAcountCreatePage() throws Throwable {
		 return action.isDisplayed(driver, formTitle);
	}
		 
}

