package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass {
	Action action= new Action();
	
	@FindBy( xpath ="//a[normalize-space()='Sign in']")
	WebElement SignInButton;
	
	@FindBy(id = "search_query_top")
	WebElement SearchElement;
	
	@FindBy(name = "submit_search")
	WebElement SearchBtn;
	
	
	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public LoginPage ClickSignBtn() 
	{
		Action.fluentWait(SignInButton,10);
		Action.click(driver, SignInButton);
		return new LoginPage();
		
	}
	 public String getMystoreTitle()
	   {
		    
		String MystoreTitle=driver.getTitle();  
		return MystoreTitle; 
		   
	   }   
	public SearchResultPage SearchElement(String Productname) 
	{
		
		Action.type(SearchElement, Productname);
		Action.click(driver, SearchBtn);
	
		   return new SearchResultPage();
	  
	}
	
}
