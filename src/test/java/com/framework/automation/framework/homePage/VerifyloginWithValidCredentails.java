package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;

public class VerifyloginWithValidCredentails extends TestBase {

	public static final Logger log = Logger.getLogger(VerifyloginWithValidCredentails.class.getName());
	HomePage homepage;
	
	@DataProvider(name="loginData")
	public String[][] getTestData(){
		String[][] testrecords = getData("TestData.xlsx", "LoginTestData");
		return testrecords;
	}

	@BeforeTest
	public void setup() throws IOException {
		init();
	}

	@Test
	public void verifyLoginWithValidCredentails() {
		log.info("***********Starting verifyLoginWithValidCredentails Test************");
		homepage = new HomePage(driver);
		homepage.logInToApplication("kagim2005@gmail.com", "uddin");
		Assert.assertEquals(homepage.getValidLogInText(), "k u");
		log.info("***********Finish verifyLoginWithValidCredentails Test************");
	}

	@Test
	public void vrifiedHomePageshoppingChartButtonDisplayed() {
		log.info("***********Starting vrifiedHomePageshoppingChartButtonDisplayed Test************");
		homepage = new HomePage(driver);
		homepage.vrifiedHomePageshoppingchart();
		log.info("***********Finish vrifiedHomePageshoppingChartButtonDisplayed Test************");
	}

	@Test
	public void validEmailforCreateAccount() {
		log.info("***********Starting validEmailforCreateAccount Test************");
		homepage = new HomePage(driver);
		homepage.correctCreateAccount("automation@gmil.com");
		Assert.assertEquals(homepage.validCreateAccount(), "AUTHENTICATION");
		log.info("***********Finish validEmailforCreateAccount Test************");
	}
	
	
	@Test(dataProvider="loginData")
	public void verifyLoginWithValidCredentails(String emailAddress,String password,String runMode) {
		if(runMode.equalsIgnoreCase("n")){
			throw new SkipException("Mark this record as no run");
		}
		log.info("***********Starting verifyLoginWithValidCredentails Test************");
		homepage = new HomePage(driver);
		homepage.logInToApplication(emailAddress, password);
		Assert.assertEquals(homepage.getValidLogInText(), "k u");
		log.info("***********Finish verifyLoginWithValidCredentails Test************");
	}
	

	@AfterTest
	public void end() {
		driver.close();

	}
}
