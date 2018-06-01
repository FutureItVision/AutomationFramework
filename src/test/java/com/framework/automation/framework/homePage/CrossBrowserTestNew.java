package com.framework.automation.framework.homePage;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.CrossBrowserTestBase;

public class CrossBrowserTestNew  extends CrossBrowserTestBase{

HomePage homepage;
	@Test
	public void verifyLoginWithInvalidCredentails() {
		
		homepage = new HomePage(driver);
		homepage.logInToApplication("test@gmail.com", "test123");

		Assert.assertEquals(homepage.getInvalidLogInText(), "Authentication failed.");
		

	}
	@Test
	public void VerifyProductring() {
		
		homepage = new HomePage(driver);
		homepage.homePageSearch("ring");
		homepage.SearchProductRing();
		
	
	
	}
	

}
