package com.mystore.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddToCartPage extends BaseClass {

	Action action= new Action();
	
	@FindBy(id="quantity_wanted")
	WebElement Quantity;
	
	@FindBy(name="group_1")
	WebElement Size;
	
	@FindBy(xpath="//span[text()=\"Add to cart\"]")
    WebElement AddtocartBtn;
	
	//@FindBy(xpath="//h2[normalize-space()='Product successfully added to your shopping cart']")
	//WebElement Validateaddtocart;
	
	@FindBy(xpath="//span[contains(text(),'Proceed to checkout')]")
	WebElement Validateaddtocart;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	WebElement proccedtoceckoutbtn;
	
	@FindBy(xpath="//a[@class=\"logout\"]")
	WebElement logoubtn;
	
	
	public AddToCartPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterquantity(String quantity) 
	{
	Action.type(Quantity, quantity);
	}
	
	public void selectsize(String size) 
	{
		Action.selectByVisibleText(size, Size);
	}
	
	public void ClickonAddtocart() 
	{
		
		Action.click(driver, AddtocartBtn);
	}
	public boolean validateAddtocart() 
	{
		Action.fluentWait(Validateaddtocart, 10);
		 return Action.isDisplayed(driver, Validateaddtocart);
	}
	public OrderPage clickProcedtoCheckout() 
	{
		
		Action.JSClick(driver, proccedtoceckoutbtn);
		return new OrderPage();
	}
	public void clickonlogout() 
	{
		
		Action.click(driver, logoubtn);
	}
}

 