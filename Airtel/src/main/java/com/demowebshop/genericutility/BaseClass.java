package com.demowebshop.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;

	public PropertiesFile executePropertiesFile = new PropertiesFile();
	public PrePostCondition executePrePostcondition = new PrePostCondition();
	public ExcelFile executeExcelFile = new ExcelFile();

	@BeforeTest
	public void configBeforeMethod() throws IOException {
		String browserName = executePropertiesFile.readData("browser");
		if (browserName.equals("Chrome"))
		driver = new ChromeDriver();
		else if (browserName.equals("Edge"))
			driver = new EdgeDriver();
		else
			driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get(executePropertiesFile.readData("url"));
		executePrePostcondition.WindImplicitlyWait(driver);
	}

	@AfterTest
	public void configAfterMethod() {
		driver.manage().window().minimize();
		driver.quit();


	}

}
