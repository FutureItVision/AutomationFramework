package com.framework.automation.framework.homePage;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.Iterator;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.automation.framework.applicationAction.HomePage;
import com.framework.automation.framework.testBase.TestBase;
import com.framework.automation.framework.testngreport.TestNgEmailReport;

public class HomePageDisplayVerification extends TestBase {
	public static final Logger log = Logger.getLogger(HomePageDisplayVerification.class.getName());
	HomePage homepage;

	@BeforeTest
	public void setup() throws IOException {
		init();
		
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

	public void verifywomencategories() {
		log.info("***********womencategoriesTest************");
		homepage = new HomePage(driver);
		homepage.womenCategories();
		log.info("***********Finish womencategories Test************");
	}

	@Test
	public void verifyNewsLetterInvitation() {
		log.info("***********verifyNewsLetterInvitation************");
		homepage = new HomePage(driver);
		homepage.NewsLetterInvitation("kamaluddinitqa@gmail.com");
		AssertJUnit.assertEquals(homepage.HomePageNewsLetterInvitaionResult(),
				"Newsletter : This email address is already registered.");
		log.info("***********Finish verifyNewsLetterInvitation Test************");

	}

	@Test
	public void verifyInformationSpecialsTopSeller() {
		log.info("***********verifyInformationSpecialsTopSeller************");
		homepage = new HomePage(driver);
		homepage.InformationSpecialsTopSeller();
		log.info("***********Finish verifyInformationSpecialsTopSeller Test************");

	}

	@Test
	public void VerifyTShirtSearch() {
		log.info("***********tShirtSearch************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("T-SHIRT");
		Assert.assertEquals(homepage.validsearchresult(), "\"T-SHIRT\"");
		log.info("***********Finish tShirtSearch Test************");

	}

	@Test
	public void VerifyToptSearch() {
		log.info("***********VerifyToptSearch************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("Top");
		AssertJUnit.assertEquals(homepage.topSearch(), "\"TOP\"");
		log.info("***********Finish VerifyToptSearch Test************");

	}

	@Test
	public void VerifyPrintedDressSearch() {
		log.info("***********VerifyPrintedDressSearch************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("Printed Dress");
		Assert.assertEquals(homepage.printedDressSearch(), "\"PRINTED DRESS\"");
		log.info("***********Finish VerifyPrintedDressSearch Test************");

	}

	@Test
	public void Verifyemaillink() {
		log.info("***********Verifyemaillink************");
		homepage = new HomePage(driver);
		homepage.homepageEmaillink();
		log.info("***********Finish Verifyemaillink Test************");
	}

	@Test
	public void homepagetwitterlink() {
		log.info("***********Verifytwitterlink************");
		homepage = new HomePage(driver);
		homepage.homepagetwitterlink();
		AssertJUnit.assertEquals("Twitter", "Twitter");
		log.info("***********Finish Verifytwitterlink Test************");
	}

	public void followUs() {
		log.info("***********FollowUs************");
		homepage = new HomePage(driver);
		homepage.FollowUs();
		log.info("***********Finish FollowUS Test************");
	}

	@Test
	public void facebookLogo() {
		log.info("***********FacebookLogo************");
		homepage = new HomePage(driver);
		homepage.FacebookLogo();
		AssertJUnit.assertEquals("Facebook", "Facebook");
		log.info("***********Finish FacebookLogo************");
	}

	@Test
	public void homePageYoutubeLogo() {
		log.info("***********YoutubeLogo************");
		homepage = new HomePage(driver);
		homepage.youtubeLogoForHomePage();
		log.info("***********Finish YoutubeLogo************");
	}

	@Test
	public void homePageYourLogo() {
		log.info("***********YourLogo************");
		homepage = new HomePage(driver);
		homepage.yourLogoForHomePage();
		log.info("***********Finish YourLogo************");
	}

	@Test
	public void VerifyCart() {
		log.info("***********CartLogo************");
		homepage = new HomePage(driver);
		homepage.VerifiedCartButton();
		log.info("***********Finish CartLogo************");
	}

	@Test
	public void VerifyChiffonDress() {
		log.info("***********ChiffonDress************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("ChiffonDress");
		homepage.ChiffonDressAddCart();
		log.info("***********Finish ChiffonDress************");
	}

	@Test
	public void Verifywatch() {
		log.info("***********watch************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("searchWatch");
		homepage.verifywatch();
		log.info("***********Finish searchwatch************");
	}

@Test
	public void Verifysunglass() {
		log.info("***********sunglass************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("sunglass");
		homepage.sunglass();
		log.info("***********Finish sunglass************");
	}
	@Test
	public void Verifysearchjewelary() {
		log.info("***********searchjewelary************");
		homepage = new HomePage(driver);
		homepage.homePageSearch("jewelary");
		homepage.searchjewelary();
		log.info("***********Finish searchjewelary************");
	}
	
	@Test
	public void VerifyHomepageWomenFilterButtonWork() throws InterruptedException{
		log.info("*********** homepage women filter button work test start***********");
		homepage = new HomePage(driver);
		homepage.homepageFilterButton(driver, "Women").click();
		Thread.sleep(5000);
		takeScreenShot("VerifyHomepageWomenFilterButtonWork");
		log.info("*********homepage women filter button work test finish*********");
	}
	
	 @Test
	 public void VerifyFaded_T_shirt() throws InterruptedException {
	 log.info("***********Faded T_shirt************");
	 homepage = new HomePage(driver);
	 homepage.homePageSearch("Faded_T_shirt");
	 homepage.FadedT_ShirtAddToCart(driver );
	 Iterator<String> itr=getAllWindows();
	 String parentWindow=itr.next();
	 String childWindow=itr.next();
	 driver.switchTo().window(childWindow);
	 homepage.FadedT_ShirtAddToCart(driver );
	 driver.switchTo().window(parentWindow);
	// homepage.state(driver, "M");;
	 takeScreenShot("validParameterDressSizeTest ");
	 log.info("***********Finish Faded_T_shirt test************");
	 }
	
	 
	 
	 
	 
	@AfterTest
	public void end() {
		
			try {
				TestNgEmailReport.execute("./test-output/emailable-report.html");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		driver.close();

	}
	
}
