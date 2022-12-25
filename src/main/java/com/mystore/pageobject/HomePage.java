package com.mystore.pageobject;

//import javax.swing.Action;
import com.mystore.actiondriver.Action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class HomePage extends BaseClass{

	Action action= new Action();
	
	@FindBy(xpath="//span[text()=\"My wishlists\"]")
	WebElement Mywhilist;
	
	@FindBy(xpath="//span[text()=\"Order history and details\"]")
	WebElement orderandhistory;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatemywhislist() 
	{
		
		return Action.isDisplayed(driver,Mywhilist);
	}
	public String getCurrenturl() 
	{
		String hompgeUrl=driver.getCurrentUrl();
		return hompgeUrl;
	}
}
