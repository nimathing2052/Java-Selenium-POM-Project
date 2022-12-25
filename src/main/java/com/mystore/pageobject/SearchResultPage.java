package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class SearchResultPage extends BaseClass
{
	Action action= new Action();
	
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']")
	WebElement productresult;
	
	
	public SearchResultPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean productavaliability() 
	{
		
		return Action.isDisplayed(driver, productresult);
	}
	
	public AddToCartPage clickonproduct() 
	{
		Action.click(driver, productresult);
		return new AddToCartPage();
	}
}
