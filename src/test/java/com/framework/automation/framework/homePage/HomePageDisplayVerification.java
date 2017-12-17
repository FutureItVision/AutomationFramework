package com.framework.automation.framework.homePage;

import java.io.IOException;

import org.apache.log4j.Logger;
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
 	public void WomendressButton(){
 	 log.info("***********Verified WomendressButton Test************");
 	 homepage = new HomePage(driver);
  homepage.VerifiedWomenButton();
  log.info("***********Finish WomendressButton Test************");
	
	
	}

}
