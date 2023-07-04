package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingCartPage {

	public WebDriver driver;
	public ShippingCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='termsofservice']")
	private WebElement termsCheckBox;
	public WebElement gettermsCheckBox()
	{
		return termsCheckBox;
	}
	
	@FindBy(xpath ="//button[@id='checkout']")
	private WebElement checkOutButton;
	public WebElement getcheckOutButton()
	{
		return checkOutButton;
	}
	
	
	
}
