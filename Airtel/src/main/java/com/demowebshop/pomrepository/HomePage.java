package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logOutButton;
	public WebElement getlogOutButton()
	{
		return logOutButton;
	}
	
	
	@FindBy(xpath ="//ul[@class='top-menu']//a[@href='/books']")
	private WebElement bookLink;
	public WebElement getbookLink()
	{
		return bookLink;
	}
	
	@FindBy(xpath = "//select[@id='products-orderby']")
	private WebElement sortByDropDown;
	public WebElement getsortByDropDown()
	{
		return sortByDropDown;
	}
	
	@FindBy(xpath ="//select[@id='products-pagesize']")
	private WebElement displayDropDown;
	public WebElement getdisplayDropDown()
	{
		return displayDropDown;
	}
	
	@FindBy(xpath = "//a[text()='Fiction']")
	private WebElement bookTitle;
	public WebElement getbookTitle()
	{
		return bookTitle;
	}
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shippingCartLink;
	public WebElement getshippingCartLink()
	{
		return shippingCartLink;
	}
}
