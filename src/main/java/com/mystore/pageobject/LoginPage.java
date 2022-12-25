package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class LoginPage extends BaseClass {

	Action action= new Action();
	
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="SubmitLogin")
	 WebElement signInBtn;
	
	@FindBy(name="email_create")
	 WebElement emailForNewAccount;
	
	@FindBy(name="SubmitCreate")
	 WebElement createNewAccountBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

   public HomePage login(String uname, String pwd) 
	
	{
		
		Action.type(username,uname);
		Action.type(password, pwd);
		Action.click(driver, signInBtn);
		return new HomePage();
		
	}


   public RegistrationPage createNewAccount(String newEmail)  {
	action.type(emailForNewAccount, newEmail);
	action.click(driver, createNewAccountBtn);
	return new RegistrationPage();
}
}
