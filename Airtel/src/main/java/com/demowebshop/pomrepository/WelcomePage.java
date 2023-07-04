package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WebDriver driver;
	
	public WelcomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	public WebElement getregisterLink()
	{
		return registerLink;
	}
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;
	public WebElement getloginLink()
	{
		return loginLink;
	}
	
}
