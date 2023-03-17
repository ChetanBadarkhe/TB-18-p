package com.cjc.dws.webapps.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shippingaddress 
{
	static Logger log=Logger.getLogger(Shippingaddress.class.getName());
	WebDriver driver;
	public Shippingaddress(WebDriver driver)
		{
			this.driver=driver;
	    }
	@FindBy(xpath="//*[@id=\"shipping-buttons-container\"]/input")
	WebElement conti1;
	@FindBy(xpath="//*[@id=\"shipping-method-buttons-container\"]/input")
	WebElement conti2;
	public void shippingcheck() throws InterruptedException
	{
		Thread.sleep(2000);
		conti1.click();
		Thread.sleep(2000);
		conti2.click();
		Thread.sleep(2000);
		log.info("Shipping address check successfull");
}
}
