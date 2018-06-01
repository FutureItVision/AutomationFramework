package com.framework.automation.framework.homePage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.HeadLessBrowserBase;

public class HeadlessBrowserTest  extends HeadLessBrowserBase{
	
	WebDriver driver;
	HomePage homepage;
	
	@Test
	public void vrifiedHomePageshoppingChartButtonDisplayed() {
		log.info("***********Starting vrifiedHomePageshoppingChartButtonDisplayed Test************");
		homepage = new HomePage(driver);
		homepage.vrifiedHomePageshoppingchart();
		log.info("***********Finish vrifiedHomePageshoppingChartButtonDisplayed Test************");
	}
	
	@Test
	public void WomenDressButton() {
		log.info("***********Verified WomendressButton Test************");
		homepage = new HomePage(driver);
		homepage.VerifiedWomenButton();
		log.info("***********Finish WomendressButton Test************");

	}
	
	@Test
	public void verifyContactPageHomeLogo() {
		log.info("***********HomePageDisplayVerificationTest************");
		homepage = new HomePage(driver);
		homepage.verifyContactHomeLogo();
		log.info("***********Finish vrifiedHomePageshoppingChartButtonDisplayed Test************");
	}
	
	@Test
	public void vrifybestSellersButtonInHomepgae() {
		log.info("**********bestSellersButtonTest************");
		homepage = new HomePage(driver);
		homepage.vrifybestSellersButtonInHomepgae();
		log.info("*********** vrifybestSellersButtonInHomepgaeTest************");
	}
	@Test
	public void verifywomencategories() {
		log.info("***********womencategoriesTest************");
		homepage = new HomePage(driver);
		homepage.womenCategories();
		log.info("***********Finish womencategories Test************");
	}

}
