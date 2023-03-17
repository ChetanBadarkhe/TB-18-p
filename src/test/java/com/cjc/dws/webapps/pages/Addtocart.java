package com.cjc.dws.webapps.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocart
{
	static Logger log=Logger.getLogger(Addtocart.class.getName());
	WebDriver driver;
public Addtocart(WebDriver driver)
	{
		this.driver=driver;
}
  @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")
  WebElement book;
  @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")
  WebElement add;
  @FindBy(xpath="//*[@id=\"topcartlink\"]/a/span[1]")
  WebElement cartcontains;
  @FindBy(xpath="//*[@id=\"termsofservice\"]")
  WebElement cbox;
  @FindBy(xpath="//*[@id=\"checkout\"]")
  WebElement check;

public void cartcheck() throws InterruptedException 
{
	Thread.sleep(2000);
	book.click();
	add.click();
	log.info("purchase item added successfully");
	log.error("ERROR");
	log.warn("Warning");
	Thread.sleep(2000);
	cartcontains.click();
	Thread.sleep(2000);
	cbox.click();
	Thread.sleep(2000);
	check.click();
    log.info("purchase item check successfully");
}
}
