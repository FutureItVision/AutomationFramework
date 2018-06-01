package com.framework.automation.framework.homePage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.AutomationFramework.db.DbConnection;
import com.AutomationFramework.db.Queries_Class;
import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;

public class VerifyloginWithInvalidCredentails extends TestBase {
	
	public DbConnection dbConnections;
	Queries_Class queries_Class;
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
	
	
	
	
	
	
	@AfterTest
	public void end() {
		driver.close();

	}
}
