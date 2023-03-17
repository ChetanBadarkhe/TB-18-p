package com.cjc.dws.webapps.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logoutmethod 
{
	static Logger log =Logger.getLogger(logoutmethod.class.getName());
	WebDriver driver;
	public logoutmethod(WebDriver driver)
		{
			this.driver=driver;
	}
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	WebElement conti1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[2]/a")
	WebElement conti2;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/input[2]")
	WebElement conti3;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
	WebElement conti4;

	public void logoutcheck() throws InterruptedException
	{
		Thread.sleep(2000);
		conti1.click();
		Thread.sleep(2000);
		conti2.click();
		Thread.sleep(2000);
		conti3.click();
		driver.switchTo().alert().accept();
		log.info("address cleared successfull");
		Thread.sleep(10000);	
		conti4.click();
		Thread.sleep(2000);
		log.info("Logout Successfull");
}
}
