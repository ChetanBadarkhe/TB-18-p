package com.cjc.dws.webapp.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cjc.dws.webapps.pages.Addtocart;
import com.cjc.dws.webapps.pages.Billingaddress;
import com.cjc.dws.webapps.pages.Login;
import com.cjc.dws.webapps.pages.Orderconfirm;
import com.cjc.dws.webapps.pages.Paymentmethod;
import com.cjc.dws.webapps.pages.Register;
import com.cjc.dws.webapps.pages.Shippingaddress;
import com.cjc.dws.webapps.pages.logoutmethod;



public class DWSTest 
{
	static Logger log=Logger.getLogger(Test.class.getName());
	    WebDriver driver;
		@BeforeSuite()
		public void Openbrowser() throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "src//test//resources//Browserexe//chromedriver.exe");
			 driver=new ChromeDriver();
		  
		}
	    @BeforeTest
	    public void openurl()
	    {
		driver.get("https://demowebshop.tricentis.com/register");
	    }
	    @BeforeClass
	    public void windowshandle()
	    {
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    }
	    @Test(priority=0,dataProvider ="regData")
	    public void registrationTest(String a,String b,String c,String d,String e) throws Exception
	   {
	    	  Register rg=PageFactory.initElements(driver,Register.class); 
	 	        rg.registercheck(a, b, c, d, e);
	 }
	    @Test(priority=1)
	    public void Logintest() throws IOException, InterruptedException
	    {
	 	 Login rg=PageFactory.initElements(driver,Login.class); 
	 	        rg.logincheck();
	  }
	    @Test(priority=2)
	    public void addtocart() throws Exception
	   {
		 Addtocart rg=PageFactory.initElements(driver, Addtocart.class); 
		        rg.cartcheck();
	 }
	    @Test(priority=3,dataProvider ="addrData")
	    public void baddress(String a,String b,String c,String d,String e,String f,String g) throws Exception
	   {
		 Billingaddress rg=PageFactory.initElements(driver, Billingaddress.class); 
		        rg.Baddress(a, b, c, d, e,f,g);
	 }
	    @Test(priority=4)
	    public void saddress() throws Exception
	   {
		 Shippingaddress rg=PageFactory.initElements(driver, Shippingaddress.class); 
		        rg.shippingcheck();
	 }
	    @Test(priority=5)
	    public void paymentmethod() throws Exception
	   {
		 Paymentmethod rg=PageFactory.initElements(driver, Paymentmethod.class); 
		        rg.paymentcheck();
	 }
	    @Test(priority=6)
	    public void orderconfirn() throws Exception
	   {
		 Orderconfirm rg=PageFactory.initElements(driver, Orderconfirm.class); 
		        rg.orderconf();
	 }
	    @Test(priority=7)
	    public void Logoutmethod() throws Exception
	   {
		logoutmethod rg=PageFactory.initElements(driver, logoutmethod.class); 
		        rg.logoutcheck();
	 }
	    @DataProvider
	    public Object[][] regData()
	    {
	    return new Object[][]
	    		{
	    	new Object[] {"chetan","badarkhe","badarkhechetan@gmail.com","abc@123","abc@123"},
	    		};	
	    		}
	    @DataProvider
	    public Object[][] addrData()
	    {
	    return new Object[][]
	    		{
	    	new Object[] {"abc","pune","karvenagar","pune","222000","8888444422","23156587"},
	    		};	
	    		}
	    @AfterSuite()
	    public void browserclose()
	    {
	    	driver.close();
	    }
}
