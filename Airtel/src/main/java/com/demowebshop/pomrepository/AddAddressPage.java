package com.demowebshop.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage {

	public WebDriver driver;
	public AddAddressPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryDropDown;
	public WebElement getcountryDropDown()
	{
		return countryDropDown;
	}
	
	@FindBy(id ="BillingNewAddress_City")
	private WebElement cityTextfield;
	public WebElement getcityTextfield()
	{
		return cityTextfield;
	}
	
	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1;
	public WebElement getaddress1()
	{
		return address1;
	}
	
	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipCode;
	public WebElement getzipCode()
	{
		return zipCode;
	}
	
	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneNumberTextfield;
	public WebElement getphoneNumberTextfield()
	{
		return phoneNumberTextfield;
	}
	
	@FindBy(xpath = "//div[@id='billing-buttons-container']/input")
	private WebElement bAddressContinueButton;
	public WebElement getbAddressContinueButton()
	{
		return bAddressContinueButton;
	}
	
	@FindBy(xpath = "//div[@id='shipping-buttons-container']/input")
	private WebElement getSAddressContinueButton;
	public WebElement getSAddressContinueButton()
	{
		return getSAddressContinueButton;
	}
	
	@FindBy(xpath = "//p[@class='back-link']/following-sibling::input[contains(@class,'shipping-method')]")
	private WebElement sMethodContinueButton;
	public WebElement getsMethodContinueButton()
	{
		return sMethodContinueButton;
	}
	
	@FindBy(xpath = "//label[contains(.,'Cash On Delivery')]/preceding-sibling::input")
	private WebElement CODRadioButton;
	public WebElement getCODRadioButton()
	{
		return CODRadioButton;
	}
	
	@FindBy(xpath = "//input[contains(@class,'payment-method-next-step-button')]")
	private WebElement pMethodContinueButton;
	public WebElement getpMethodContinueButton()
	{
		return pMethodContinueButton;
	}
	
	@FindBy(xpath = "//span[contains(.,'Loading next step')]/preceding-sibling::input[contains(@class,'payment-info-next-step')]")
	private WebElement pInfoContinueButton;
	public WebElement getpInfoContinueButton()
	{
		return pInfoContinueButton;
	}
	
	@FindBy(xpath = "//div[@class='order-summary-content']")
	private WebElement takeSSorderDetails;
	public WebElement gettakeSSorderDetails()
	{
		return takeSSorderDetails;
	}
	
	@FindBy(xpath = "//input[contains(@class,'confirm-order-next-step-button')]")
	private WebElement confirmButton;
	public WebElement getconfirmButton()
	{
		return confirmButton;
	}
	
	@FindBy(xpath = "//li[contains(.,'Order number')]")
	private WebElement orderNumber;
	public WebElement getorderNumber()
	{
		return orderNumber;
	}
}
