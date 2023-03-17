package com.cjc.dws.webapps.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Register
	{
	static Logger log=Logger.getLogger(Register.class.getName());
	WebDriver driver;
	@FindBy(xpath = "//input[@value='M']")
	WebElement gender;
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement fname;
	@FindBy(name = "LastName")
	WebElement lname;
	@FindBy(name = "Email")
	WebElement email;
	@FindBy(name = "Password")
	WebElement pass;
	@FindBy(name = "ConfirmPassword")
	WebElement cpass;
	@FindBy(name = "register-button")
	WebElement register;
    public Register(WebDriver driver)
	{
		this.driver=driver;
		}
	public void registercheck(String a,String b,String c,String d,String e)
	{
		gender.click();
		fname.sendKeys(a);
		lname.sendKeys(b);
		email.sendKeys(c);
		pass.sendKeys(d);
		cpass.sendKeys(e);
		register.click();
     log.info("Register successfull");
	}


}
