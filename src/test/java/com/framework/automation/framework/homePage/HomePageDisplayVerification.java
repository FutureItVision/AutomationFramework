package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;

public class HomePageDisplayVerification extends TestBase {
	public static final Logger log=Logger.getLogger(HomePageDisplayVerification.class.getName());
	HomePage homepage;
	@BeforeTest
	public void setup() throws IOException{
		init();	
	}
	
	 @Test
		public void verifyHomePageWomenButton(){
		 log.info("***********Starting verifyHomePageWomenButton Test************");
		 homepage = new HomePage(driver);
		 homepage.homePageWomenButton();
	    log.info("***********Finish verifyHomePageWomenButton Test************");

		}

		@AfterTest 
		public void end(){
		driver.close();
			
		}
	}
	
	
	
	
	


