package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;

public class VerifyloginWithInvalidCredentails extends TestBase {
	public static final Logger log = Logger.getLogger(VerifyloginWithInvalidCredentails.class.getName());
	HomePage homepage;

	@BeforeTest
	public void setup() throws IOException {
		init();
	}

	@Test
	public void verifyLoginWithInvalidCredentails() {
		log.info("***********Starting VerifyloginWithInvalidCredentails Test************");
		homepage = new HomePage(driver);
		homepage.logInToApplication("test@gmail.com", "test123");

		Assert.assertEquals(homepage.getInvalidLogInText(), "Authentication failed.");
		log.info("***********Finish VerifyloginWithInvalidCredentails Test************");

	}
	@Test
	public void VerifyProductring() {
		log.info("**********ring************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("ring");
		homepage.SearchProductRing();
		log.info("***********Finish ring***********");
	
	
	}
	@Test
	public void Verifypopular() {
		log.info("***********popular************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("search popular");
		homepage.verifypopular();
		log.info("***********Finish searchpopular************");
	}
	
	
	
	
	
	
	@AfterTest
	public void end() {
		driver.close();

	}
}
