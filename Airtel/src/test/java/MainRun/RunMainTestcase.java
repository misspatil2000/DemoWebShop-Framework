package MainRun;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.demowebshop.genericutility.BaseClass;
import com.demowebshop.pomrepository.AddAddressPage;
import com.demowebshop.pomrepository.AddToCartPage;
import com.demowebshop.pomrepository.CreateAccountPage;
import com.demowebshop.pomrepository.HomePage;
import com.demowebshop.pomrepository.LoginPage;
import com.demowebshop.pomrepository.OrderConfirmPage;
import com.demowebshop.pomrepository.ShippingCartPage;
import com.demowebshop.pomrepository.WelcomePage;

public class RunMainTestcase extends BaseClass {
	public WelcomePage WelcomePage ; 
	public HomePage homePage;
	public AddToCartPage addToCart;
	public ShippingCartPage shippingCart;
	public AddAddressPage addAddress;
	public OrderConfirmPage confirmOrder;
	    @Test(priority = 1)
	    public void createAccount() throws Throwable {
//		SoftAssert softAssert = new SoftAssert();
//		softAssert.assertEquals(driver.getTitle(), "Demo Web Shop. Register", "Fail");
	    	WelcomePage =  new WelcomePage(driver);
	    	WelcomePage.getregisterLink().click();
		CreateAccountPage createAccountPage = new CreateAccountPage(driver);
		createAccountPage.getFemaleRadioButton().click();
		createAccountPage.getfirstNameTextfield().sendKeys(executeExcelFile.readStringCell("register", 0, 1));
		createAccountPage.getlastNameTextfield().sendKeys(executeExcelFile.readStringCell("register", 1, 1));
		createAccountPage.getemailTextfield().sendKeys(executeExcelFile.readStringCell("register", 2, 1));
		createAccountPage.getPasswordTextfield().sendKeys(executeExcelFile.readStringCell("register", 3, 1));
		createAccountPage.getConfirmPasswordTextfield().sendKeys(executeExcelFile.readStringCell("register", 4, 1));
		createAccountPage.getRegisterButton().click();
		homePage = new HomePage(driver);
		homePage.getlogOutButton().click();
//		softAssert.assertAll();
	}
	
	@Test(priority = 2)
	public void loginAccount() throws IOException
	{
		LoginPage loginPage = new LoginPage(driver);
		WelcomePage.getloginLink().click();
		loginPage.getemailTextfield().sendKeys(executeExcelFile.readStringCell("register", 2, 1));
		loginPage.getpasswordTextfield().sendKeys(executeExcelFile.readStringCell("register", 3, 1));
		loginPage.getloginButton().click();
	}
	
	@Test(priority =3)
	public void orderProduct()
	{
		homePage = new HomePage(driver);
		homePage.getbookLink().click();
		new Select(homePage.getsortByDropDown()).selectByIndex(3);
		new Select(homePage.getdisplayDropDown()).selectByVisibleText("12");;
		homePage.getbookTitle().click();
		addToCart = new AddToCartPage(driver);
		addToCart.getaddToCartButton().click();
	}
	
	@Test(priority = 4)
	public void shippingCart() 
	{
		homePage = new HomePage(driver);
		homePage.getshippingCartLink().click();
		shippingCart = new ShippingCartPage(driver);
		shippingCart.gettermsCheckBox().click();
		shippingCart.getcheckOutButton().click();
	}
	
	@Test(priority = 5)
	public void addAddress() throws EncryptedDocumentException, IOException, InterruptedException
	{
		addAddress = new AddAddressPage(driver);
		new Select(addAddress.getcountryDropDown()).selectByVisibleText("India");;
		addAddress.getcityTextfield().sendKeys(executeExcelFile.readStringCell("register", 6, 1));
		addAddress.getaddress1().sendKeys(executeExcelFile.readStringCell("register", 7, 1));
		addAddress.getzipCode().sendKeys(executeExcelFile.readNumericCell("register", 8, 1));
		addAddress.getphoneNumberTextfield().sendKeys(executeExcelFile.readNumericCell("register", 9, 1));
		addAddress.getbAddressContinueButton().click();
		addAddress.getSAddressContinueButton().click();
		addAddress.getsMethodContinueButton().click();
		addAddress.getCODRadioButton().click();
		addAddress.getpMethodContinueButton().click();
		addAddress.getpInfoContinueButton().click();
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 400).perform();
		FileUtils.copyFile(addAddress.gettakeSSorderDetails().getScreenshotAs(OutputType.FILE), new File("./errorshot/" + LocalDateTime.now().toString().replace(':', '-') + "orderdetails.png"));
		addAddress.getconfirmButton().click();
		
//		confirmOrder = new OrderConfirmPage(driver);
//		FileUtils.copyFile(confirmOrder.getorderConfirmMessage().getScreenshotAs(OutputType.FILE), new File("./errorshot/" + LocalDateTime.now().toString().replace(':', '-') + "thankyou.png"));
		
		
	}

}