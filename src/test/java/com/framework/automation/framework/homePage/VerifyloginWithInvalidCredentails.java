package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;


public class VerifyloginWithInvalidCredentails extends TestBase{
	public static final Logger log=Logger.getLogger(VerifyloginWithInvalidCredentails.class.getName());
	HomePage homepage;
	@BeforeTest
	public void setup() throws IOException{
		init();	
	}
 @Test
	public void verifyLoginWithInvalidCredentails(){
	 log.info("***********Starting VerifyloginWithInvalidCredentails Test************");
	 homepage = new HomePage(driver);
	 homepage.logInToApplication("test@gmail.com", "test123");
    Assert.assertEquals(homepage.getInvalidLogInText(),"Authentication failed.");
    log.info("***********Finish VerifyloginWithInvalidCredentails Test************");
	}
	
 @Test
	public void verifysearchshirt(){
	 log.info("***********Starting Verifysearchshirt Test************");
	 homepage = new HomePage(driver);
	 homepage.homepageSearchButton("shirt");
 Assert.assertEquals(homepage.getSearchShirt(),"shirt");
 log.info("***********Finish Verifysearchshirt Test************");
	}
 @Test
	public void verifyHomePagePhoneNumber(){
	 log.info("***********Starting verifyHomePagePhoneNumber Test************");
	 homepage = new HomePage(driver);
	 homepage.vrifiedHomePagephonenumber();
 log.info("***********Finish verifyHomePagePhoneNumber Test************");
	}

 @Test
	public void vrifiedHomePageshoppingchart(){
	 log.info("***********Starting vrifiedHomePageshoppingchart Test************");
	 homepage = new HomePage(driver);
	 homepage.vrifiedHomePageshoppingchart();
	 log.info("***********Finish verifyHomePageShoppingChart Test************");
	}
 @Test
	public void vrifiedHomePagesearchbutton(){
	 log.info("***********Starting vrifiedHomePagesearchbutton Test************");
	 homepage = new HomePage(driver);
	 homepage.vrifiedHomePagesearchbutton();
	 log.info("***********Finish verifyHomePagesearchbutton Test************");
	}
	@AfterTest 
	public void end(){
	driver.close();
		
	}
}
