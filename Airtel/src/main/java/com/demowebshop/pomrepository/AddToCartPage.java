package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	public WebDriver driver;
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[contains(@id,'add-to-cart-button')]")
	private WebElement addToCartButton;
	public WebElement getaddToCartButton()
	{
		return addToCartButton;
	}
	
	
}
