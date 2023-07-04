package com.demowebshop.genericutility;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class PrePostCondition {

	public void WindImplicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
}
