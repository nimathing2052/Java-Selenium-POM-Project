package com.mystore.testcases;

//import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobject.HomePage;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.LoginPage;
import com.mystore.pageobject.RegistrationPage;

public class RegistrationPageTest extends BaseClass{
	
	IndexPage indexpage;
	LoginPage loginPage;
	RegistrationPage registrationpage;
	HomePage homepage;

	
	@BeforeMethod
public void setup() 
	
	
	{
		launchApp();
	
	}
	
	
	@AfterMethod
	public void teardown() 
	{
		
		driver.quit();
	}
	@Test
	public void verifyCreateAccountPageTest() throws Throwable  {
		
		indexpage= new IndexPage();
		loginPage=indexpage.ClickSignBtn();
		registrationpage=loginPage.createNewAccount("man@gmail.com");
		boolean result=registrationpage.validateAcountCreatePage();
		Assert.assertTrue(result);
		
	}


	


	/*
	
	@Test
	public void createAccountTest() throws Throwable {
		
		indexpage= new IndexPage();
		loginPage=indexpage.ClickSignBtn();
		registrationpage=loginPage.createNewAccount(("Email"));
		registrationpage.createAccount(
				("Gender"),
				("FirstName"),
				("LastName"),
				("SetPassword"),
				("Day"),
				("Month"),
				("Year"),
				("Company"),
				("Address"),
				("City"),
				("State"),
				("Zipcode"),
				("Country"),
				("MobilePhone"));
		homepage=registrationpage.valiadteregistration();
}
*/
}