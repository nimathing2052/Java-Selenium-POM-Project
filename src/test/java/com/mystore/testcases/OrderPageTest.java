package com.mystore.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobject.AddToCartPage;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.LoginPage;
import com.mystore.pageobject.SearchResultPage;

public class OrderPageTest extends BaseClass{
	IndexPage indexpage;
	LoginPage loginPage;
	SearchResultPage searchresultpage;
	AddToCartPage addToCartpage;


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
	public void Verifyproceedtocheckout(){
		
		indexpage = new IndexPage();
		searchresultpage=indexpage.SearchElement("t-shirt");
		addToCartpage=searchresultpage.clickonproduct();
		addToCartpage.enterquantity("2");
		addToCartpage.selectsize("M");
		addToCartpage.ClickonAddtocart();
		addToCartpage.clickProcedtoCheckout();
		
	}

}
