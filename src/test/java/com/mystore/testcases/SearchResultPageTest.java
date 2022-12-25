package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobject.HomePage;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.LoginPage;
import com.mystore.pageobject.RegistrationPage;
import com.mystore.pageobject.SearchResultPage;

public class SearchResultPageTest extends BaseClass{

	IndexPage indexpage;
	LoginPage loginPage;
	RegistrationPage registrationpage;
	HomePage homepage;
	SearchResultPage searchresultpage;

	
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
	public void productavaliabilitytest() 
	{
		indexpage = new IndexPage();
		searchresultpage = new SearchResultPage();
		searchresultpage=indexpage.SearchElement("t-shirt");
		boolean result =searchresultpage.productavaliability();
		Assert.assertTrue(result);
	}
}
