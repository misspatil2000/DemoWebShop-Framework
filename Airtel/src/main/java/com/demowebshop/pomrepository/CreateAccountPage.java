package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {
	public WebDriver driver;
	
	public CreateAccountPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextfield;
	public WebElement getfirstNameTextfield()
	{
		return firstNameTextfield;
	}
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextfield;
	public WebElement getlastNameTextfield()
	{
		return lastNameTextfield;
	}
	
	@FindBy(id="Email")
	private WebElement emailTextfield;
	public WebElement getemailTextfield()
	{
		return emailTextfield;
	}
	
	@FindBy(id="Password")
	private WebElement PasswordTextfield;
	public WebElement getPasswordTextfield()
	{
		return PasswordTextfield;
	}
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextfield;
	public WebElement getConfirmPasswordTextfield()
	{
		return ConfirmPasswordTextfield;
	}
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	public WebElement getRegisterButton()
	{
		return registerButton;
	}
}
