package com.cjc.dws.webapps.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Billingaddress 
{
	WebDriver driver;
	public Billingaddress(WebDriver driver)
	{
		this.driver=driver;
     }
	 @FindBy(xpath="//*[@id=\"BillingNewAddress_Company\"]")
	 WebElement comp;
	 @FindBy(xpath="//*[@id=\"BillingNewAddress_CountryId\"]")
	 WebElement dropdown;
     @FindBy(xpath="//*[@id=\"BillingNewAddress_City\"]")
	 WebElement city;
     @FindBy(xpath="//*[@id=\"BillingNewAddress_Address1\"]")
	 WebElement addr1;
     @FindBy(xpath="//*[@id=\"BillingNewAddress_Address2\"]")
	 WebElement addr2;
     @FindBy(xpath="//*[@id=\"BillingNewAddress_ZipPostalCode\"]")
	 WebElement zip;
     @FindBy(xpath="//*[@id=\"BillingNewAddress_PhoneNumber\"]")
	 WebElement phone;
     @FindBy(xpath="//*[@id=\"BillingNewAddress_FaxNumber\"]")
	 WebElement fax;
     @FindBy(xpath="//*[@id=\"billing-buttons-container\"]/input")
	 WebElement conti;
     public void Baddress(String a,String b,String c,String d,String e,String f,String g)
	{
		comp.sendKeys(a);
	WebElement dp=dropdown;
		Select s=new Select(dp);
	       s.selectByVisibleText("India");
		city.sendKeys(b);
		addr1.sendKeys(c);
		addr2.sendKeys(d);
		zip.sendKeys(e);
		phone.sendKeys(f);
		fax.sendKeys(g);
		conti.click();
}
}
