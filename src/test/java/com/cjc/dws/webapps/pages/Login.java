package com.cjc.dws.webapps.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.cjc.dws.webapp.utility.Common;

public class Login 
{
WebDriver driver;
public Login(WebDriver driver)
{
this.driver=driver;
}
@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
WebElement lout;
@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
WebElement lin;
@FindBy(name="Email")
WebElement email1;
@FindBy(name="Password")
WebElement pass1;
@FindBy(name="RememberMe")
WebElement cbox;
@FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
WebElement login;
  public void logincheck() throws InterruptedException, IOException
{
	//driver.get("https://demowebshop.tricentis.com/login");
	lout.click();
	Thread.sleep(2000);
	lin.click();
	String un=Common.Username();
	String ps=Common.password();
	email1.sendKeys(un);
	pass1.sendKeys(ps);
	cbox.click();
	login.click();

}   
}
