package com.cjc.dws.webapps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Paymentmethod 
{
	WebDriver driver;
	public Paymentmethod(WebDriver driver)
		{
			this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"payment-method-buttons-container\"]/input")
	WebElement conti1;
	@FindBy(xpath="//*[@id=\"payment-info-buttons-container\"]/input")
	WebElement conti2;
	public void paymentcheck() throws InterruptedException
	{
		Thread.sleep(2000);
		conti1.click();
		Thread.sleep(2000);
		conti2.click();
		Thread.sleep(2000);
}
}
