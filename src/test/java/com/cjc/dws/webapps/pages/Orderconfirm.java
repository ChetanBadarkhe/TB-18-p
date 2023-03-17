package com.cjc.dws.webapps.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class Orderconfirm
{
	static Logger log=Logger.getLogger(Orderconfirm.class.getName());
	WebDriver driver;
	public Orderconfirm(WebDriver driver)
		{
			this.driver=driver;
	}
	@FindBy(xpath="//*[@id=\"confirm-order-buttons-container\"]/input")
	WebElement conti1;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")
	WebElement conti2;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")
	WebElement conti3;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
	WebElement conti4;

	public void orderconf() throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,350)");
	    File f=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(f, new File("src/test/resources/Screenshots"));
		log.info("Screenshot taken successfull");
		log.warn("Warning");
		log.error("Error");
		Thread.sleep(2000);
		conti1.click();
		Thread.sleep(2000);
		   WebElement ab= conti2;
	         String  aaa=ab.getText();
	               log.info(aaa);
	               Thread.sleep(2000);
	      WebElement abc= conti3;
	         String  aa=abc.getText();
	               log.info(aa);
	               Thread.sleep(2000);
		conti4.click();
		Thread.sleep(2000);
}
}
