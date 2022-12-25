package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobject.IndexPage;

public class IndexPageTest extends BaseClass {
	IndexPage indexpage;
	
	
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
	public void verifytitle() 
	{
		indexpage = new IndexPage();
		
		String Mytitle=indexpage.getMystoreTitle();
		
		Assert.assertEquals(Mytitle,"My Store");
	}

}
