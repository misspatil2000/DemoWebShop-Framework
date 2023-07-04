package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='Email']")
	private WebElement emailTextfield;
	public WebElement getemailTextfield()
	{
		return emailTextfield;
	}
	
	@FindBy(xpath ="//input[@id='Password']")
	private WebElement passwordTextfield;
	public WebElement getpasswordTextfield()
	{
		return passwordTextfield;
	}
	
	@FindBy(xpath="//input[contains(@class,'button-1 l')]")
	private WebElement loginButton;
	public WebElement getloginButton()
	{
		return loginButton;
	}
}
