package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobject.HomePage;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.LoginPage;

public class LoginPageTest extends BaseClass {

	IndexPage indexpage;
	LoginPage loginpge;
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
	
	  public void LoginTest() 
    
  {
		
	    indexpage = new IndexPage();
		loginpge = new LoginPage();
		homepage = new HomePage();
		loginpge= indexpage.ClickSignBtn();
		homepage=loginpge.login(prop.getProperty("username"),("password"));
		
		
		String actualUrl=homepage.getCurrenturl();
		String expectedurl="http://automationpractice.com/index.php?controller=my-account";
		Assert.assertEquals(actualUrl, expectedurl);
		
  }
}

