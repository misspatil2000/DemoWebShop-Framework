package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmPage {
	public WebDriver driver;
	public OrderConfirmPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "OrderConformPage")
	private WebElement orderConfirmMessage;
	public WebElement getorderConfirmMessage()
	{
		return orderConfirmMessage;
	}
}	
