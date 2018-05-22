package com.framework.automation.framework.applicationAction;

import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.framework.automation.framework.testBase.CrossBrowserTestBase;
import com.framework.automation.framework.testBase.TestBase;

public class HomePage extends CrossBrowserTestBase {
	public static final Logger log = Logger.getLogger(HomePage.class.getName());

	@FindBy(xpath = ".//nav/div[@class='header_user_info']/a['Sign in']")
	WebElement signIn;

	@FindBy(id = "email")
	WebElement logInemailAddress;

	@FindBy(id = "passwd")
	WebElement logInPassword;

	@FindBy(id = "SubmitLogin")
	WebElement submitLogInButton;

	@FindBy(xpath = ".//ol/li['Authentication failed.']")
	WebElement authenticationFailed;

	@FindBy(xpath = ".//nav/div[@class='header_user_info']/a[@title='View my customer account']/span['k u']")
	WebElement authenticationValidWithAccountName;

	@FindBy(id = "email_create")
	WebElement EmailAddressForCreateAccount;

	@FindBy(id = "SubmitCreate")
	WebElement SubmitCreatAnAccountbutton;

	@FindBy(xpath = ".//div[@class=\"col-sm-4 clearfix\"]/div[@class='shopping_cart']/a[@ title='View my shopping cart']")
	WebElement shoppingChartFromHomePage;

	@FindBy(id = "newsletter-input")
	WebElement EnterEmailAddressForEmailAddressForNewsLetter;

	@FindBy(xpath = ".//button[@name='submitNewsletter']")
	WebElement NewsLetterClickButton;

	@FindBy(xpath = ".//*[@id='columns']/p[@class='alert alert-danger']")
	WebElement NewsLetterInvitaionResult;

	@FindBy(xpath = ".//*[@id='block_various_links_footer']/ul/li[1]/a")
	WebElement SpecialsButton;

	@FindBy(xpath = ".//*[@id='best-sellers_block_right']/h4['title_block']/a['View a top sellers products']")
	WebElement InformationSpecialsTopSeller;

	@FindBy(xpath = ".//h1['Create an account']")
	WebElement validCreatedAccount;

	@FindBy(xpath = ".//*[@id='block_top_menu']/ul/li['Dresses']/a[@title='Dresses']")
	WebElement dressButtonFromHomepage;

	@FindBy(xpath = ".//*[@id='contact-link']/a['@ title=Contact Us']")
	WebElement ClickContactUsButton;

	@FindBy(xpath = ".//a[@title='Return to Home']/i['@class=\"icon-home\"']")
	WebElement VarifiedContactHomeLogo;

	@FindBy(xpath = ".//*[@id='home-page-tabs']/li[@class='active']/a['Best Sellers']")
	WebElement bestSellersButton;

	@FindBy(xpath = ".//section['Categories']/div/div/ul/li/a['Women']")
	WebElement wonemCategories;

	@FindBy(id = "search_query_top")
	WebElement homePageSearchButton;

	@FindBy(xpath = ".//*[@id='searchbox']/button[@type=\"submit\"]")
	WebElement homePageSearchButtonClick;

	@FindBy(xpath = ".//*[@id='center_column']/h1/span['T-Shirt']")
	WebElement searchResut;

	@FindBy(xpath = ".//*[@id='center_column']/h1/span['Top']")
	WebElement searchResultTop;

	@FindBy(xpath = ".//*[@id='center_column']/h1/span['Printed Dress']")
	WebElement searchResulPrintedDress;

	@FindBy(xpath = ".//*[@id='block_contact_infos']/div//li[3]")
	WebElement emaillink;

	@FindBy(xpath = ".//li[@class='twitter']/a['Twitter']")
	WebElement twitterlink;

	@FindBy(xpath = ".//*[@id='social_block']/h4['@Follow us']")
	WebElement FollowUs;

	@FindBy(xpath = ".//*[@id='social_block']//li[1]['@class=\"facebook\"']")
	WebElement FacebookLogo;

	@FindBy(xpath = ".//li[@class='youtube']/a['target=\"_blank\"']")
	WebElement YoutubeLogo;

	@FindBy(xpath = ".//*[@id='header_logo']//img[' @class=logo img-responsive']")
	WebElement YourLogo;

	@FindBy(xpath = ".//div[ @class='shopping_cart']")
	WebElement ShoppingCart;

	@FindBy(xpath = ".//*[@id='order_step']/li[1]/span")
	WebElement Summary;

	@FindBy(xpath = ".//li[@class='step_todo second']/span")
	WebElement SignIn;

	@FindBy(xpath = ".//li[@class='step_todo third']/span")
	WebElement Address;

	@FindBy(xpath = ".//li[@class='step_todo third']/span")
	WebElement Shipping;

	@FindBy(xpath = ".//*[@id='step_end']/span")
	WebElement Payment;

	@FindBy(xpath = ".//*[@id='center_column']/h1/span['Printed Dress']")
	WebElement ChiffonDress;

	@FindBy(xpath = ".//*[@id='center_column']/ul/li[1]/div/div/div[3]/div/div[2]/a[1]/span")
	WebElement PrintedChiffonDressAddToCart;

	@FindBy(xpath = ".//*[@id='columns']/div[@class=\'breadcrumb clearfix\']")
	WebElement WomenButton;
	@FindBy(xpath = ".//*[@id='layer_cart']/div[1]/div[1]/h2")
	WebElement ProductSuccessfullyAddedToCart;
	@FindBy(xpath = ".//*[@id='center_column']/p[\"alert alert-warning\']")
	WebElement searchWatch;
	@FindBy(xpath = ".//*[@id='center_column']/p['alert alert-warning']")
	WebElement sunglass;
   @FindBy(xpath="//div/a[@title='View my shopping cart']")
   WebElement CartButton;
   @FindBy(xpath="//li[2]//div[@class='right-block']//a[@title='Blouse' ]")
   WebElement addCartBlouse;
   @FindBy(xpath=".//span[@class='cross']")
   WebElement addCartWindowCloseButton;
   @FindBy(xpath=" .//*[@id='homefeatured']/li[2]/div[@class='product-container']")
   WebElement addCartWindow;
   @FindBy(xpath = ".//*[@class='button lnk_view btn btn-default'][@title='View']")
   WebElement MoreButton;
   @FindBy(xpath = ".//*[@id='center_column']/ul/li//div[@class='product-image-container']")
   WebElement MoreButton1;
   @FindBy(xpath="//*[@id='attributes']/fieldset[1]/div[@class='attribute_list']")
   WebElement Addcartsize;
	@FindBy(xpath = ".//*[@id='center_column']/p")
	WebElement searchRing;
	@FindBy(xpath = ".//*[@id='center_column']/p[\"alert alert-warning\"]")
	WebElement searchjewelary;
	@FindBy(xpath = ".//*[@id='center_column']/p[\"alert alert-warning\']")
	WebElement  searchpopular ; 
   @FindBy(xpath=".//*[@id='uniform-selectProductSort']")
   WebElement sortBy;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
//###########################Parameterize xpath#############################################################
	
	
//	public void homepageFilterButton(String filetrName){
//		
//		driver.findElement(By.xpath(".//*[@id='block_top_menu']//a[contains(text(),'"+filetrName+"')]")).click();
//		Assert.assertEquals(filetrName, true);
//		log.info("Clicked on hompage filter button  "+filetrName+"displayed");
//		
//	}
	
	
	public WebElement homepageFilterButton(WebDriver driver, String filetrName) {
	    String homepageFilterButtonXpath = ".//*[@id='block_top_menu']//a[contains(text(),'White')]";
	    return driver.findElement(By.xpath(homepageFilterButtonXpath.replace("White", filetrName)));
	}
	
	
	public WebElement chooseDresses(WebDriver driver,String dressType){
		String chooseDressesXpath=".//*[@id='categories_block_left']//a[contains(text(),'Evening Dresses')]";
		return driver.findElement(By.xpath(chooseDressesXpath.replace("Evening Dresses",dressType)));
		
	}
	public void logInToApplication(String emailAddress, String password) {
		signIn.click();
		log.info("Click signIn and object is : " + signIn.toString());
		logInemailAddress.sendKeys(emailAddress);
		log.info("Enterd login and object is : " + logInemailAddress.toString());
		logInPassword.sendKeys(password);
		log.info("Enterd password and object is : " + logInPassword.toString());
		submitLogInButton.click();
		log.info("Click submitButton and object is : " + submitLogInButton.toString());
	}

	public void correctCreateAccount(String emailAddress) {
		signIn.click();
		log.info("Click signIn and object is : " + signIn.toString());
		EmailAddressForCreateAccount.sendKeys(emailAddress);
		log.info("Enter valid EmailAddress : " + EmailAddressForCreateAccount.toString());
		SubmitCreatAnAccountbutton.click();
		log.info("Click submitCreateButton and object is : " + SubmitCreatAnAccountbutton.toString());
	}

	public boolean vrifiedHomePageshoppingchart() {
		try {
			shoppingChartFromHomePage.isDisplayed();
			log.info(" shoppingchart object is : " + shoppingChartFromHomePage.toString());
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String HomePageNewsLetterInvitaionResult() {
		log.info("Error message is : " + NewsLetterInvitaionResult.getText());
		return NewsLetterInvitaionResult.getText();
	}

	public boolean vrifybestSellersButtonInHomepgae() {

		try {
			bestSellersButton.isDisplayed();
			log.info("bestSellersButton");
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public String getInvalidLogInText() {
		log.info("Error message is : " + authenticationFailed.getText());
		return authenticationFailed.getText();
	}

	public String getValidLogInText() {
		log.info("Valid message is : " + authenticationValidWithAccountName.getText());
		return authenticationValidWithAccountName.getText();
	}

	public String validCreateAccount() {
		log.info("Valid message is : " + validCreatedAccount.getText());
		return validCreatedAccount.getText();
	}

	public String validsearchresult() {
		log.info("Valid message is : " + searchResut.getText());
		return searchResut.getText();
	}

	public boolean VerifiedWomenButton() {
		try {
			dressButtonFromHomepage.click();
			WomenButton.isDisplayed();
			Assert.assertEquals(WomenButton, WomenButton);
			log.info(WomenButton);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean verifyContactHomeLogo() {
		try {
			ClickContactUsButton.click();
			VarifiedContactHomeLogo.isDisplayed();
			Assert.assertEquals(VarifiedContactHomeLogo, VarifiedContactHomeLogo);
			log.info(VarifiedContactHomeLogo);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean womenCategories() {
		try {
			wonemCategories.click();
			WomenButton.isDisplayed();
			log.info(WomenButton);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void NewsLetterInvitation(String Email) {
		EnterEmailAddressForEmailAddressForNewsLetter.sendKeys(Email);
		NewsLetterClickButton.click();
		log.info(NewsLetterClickButton);

	}

	public void InformationSpecialsTopSeller() {
		SpecialsButton.click();
		InformationSpecialsTopSeller.isDisplayed();
		log.info(InformationSpecialsTopSeller);

	}

	public void homePageSearch(String search) {
		homePageSearchButton.sendKeys(search);
		homePageSearchButtonClick.click();
	}

	public String topSearch() {
		log.info("Valid message is : " + searchResultTop.getText());
		return searchResultTop.getText();
	}

	public String printedDressSearch() {
		log.info("Valid message is : " + searchResulPrintedDress.getText());
		return searchResulPrintedDress.getText();
	}

	public boolean homepageEmaillink() {
		try {
			emaillink.isDisplayed();
			Assert.assertEquals(emaillink, emaillink);
			log.info(emaillink);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean homepagetwitterlink() {
		try {
			twitterlink.isDisplayed();
			log.info(twitterlink);
			return true;
		} catch (Exception e) {
			return false;

		}

	}

	public boolean FollowUs() {
		try {
			//waitForElement(300, FollowUs);
			FollowUs.isDisplayed();
			log.info(FollowUs);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean FacebookLogo() {
		try {
			FacebookLogo.isDisplayed();
			log.info(FacebookLogo);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean youtubeLogoForHomePage() {
		try {
			YoutubeLogo.isDisplayed();
			log.info(YoutubeLogo);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean yourLogoForHomePage() {
		try {
			YourLogo.isDisplayed();
			log.info(YourLogo);
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean VerifiedCartButton() {
		try {
			ShoppingCart.click();
			Summary.isDisplayed();
			Assert.assertEquals(Summary, "Summary");
			log.info(Summary);
			SignIn.isDisplayed();
			Assert.assertEquals(SignIn, "Sign in");
			log.info(SignIn);
			Address.isDisplayed();
			Assert.assertEquals(Address, "Address");
			log.info(Address);
			Shipping.isDisplayed();
			Assert.assertEquals(Shipping, "Shipping");
			log.info(Shipping);
			Payment.isDisplayed();
			Assert.assertEquals(Payment, "Payment");
			log.info(Payment);

			return true;

		} catch (Exception e) {
			return false;
		}
	}

	public boolean ChiffonDressAddCart() {
		try {
			PrintedChiffonDressAddToCart.click();
			ProductSuccessfullyAddedToCart.isDisplayed();
			Assert.assertEquals("Product successfully added to your shopping cart ", ProductSuccessfullyAddedToCart);
			log.info("Valid message is : " + ProductSuccessfullyAddedToCart.getText());
			return true;

		} catch (Exception e) {
			return false;
		}

	}

	public boolean verifywatch() {
		try {
			searchWatch.isDisplayed();
			Assert.assertEquals("No results were found for your search", searchWatch);
			log.info(searchWatch.getText());
			return true;

		} catch (Exception e) {
			return false;

		}
	}

	public boolean sunglass() {
		try {

			sunglass.isDisplayed();
			Assert.assertEquals(sunglass, sunglass);
			log.info("Valid message is : " + sunglass.getText());
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean adcartBlouse() {
		try {
			Thread.sleep(1000);
			addCartWindow.isDisplayed();
	        Actions action = new Actions(driver);
           action.moveToElement(addCartWindow).moveToElement(addCartBlouse).click().build().perform();
			return true;

		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	public boolean FadedT_ShirtAddToCart() {
		try {
		
			MoreButton1.click();
			WebDriverWait wait = new WebDriverWait(driver, 100);
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='attributes']/fieldset[1]/div[@class='attribute_list'")));
		    element.click();
			
//			WebDriverWait wait = new WebDriverWait(driver, 100);
//			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='attributes']/fieldset[1]/div[@class='attribute_list'")));
//			driver.findElement(By.xpath(".//*[@id='group_1']/option[contains(text(),'L')]")).click();
			
		return true;

		} catch (Exception e) {
		return false;
		}
		}
	
	
	
	public void FadedT_ShirtAddToCart(WebDriver driver) {
		
		
			MoreButton1.click();
			String mainWindow = driver.getWindowHandle();

			//when click the below its opened in new tab
			//driver.findElement(By.cssSelector("span.slds-align-middle")).click();
			Set<String> handles = driver.getWindowHandles();
			for (String handle : handles) {
			    if (!handle.equals(mainWindow)) {
			        driver.switchTo().window(handle);
			        System.out.println(driver.getWindowHandles().size());
			        break;
			    }
			}
			WebDriverWait wait = new WebDriverWait(driver,10);
		    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("group_1")));
		    element.click();
			
//			WebDriverWait wait = new WebDriverWait(driver, 100);
//			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='attributes']/fieldset[1]/div[@class='attribute_list'")));
//			driver.findElement(By.xpath(".//*[@id='group_1']/option[contains(text(),'L')]")).click();
			
		
		}
		
	
		
		public boolean searchjewelary() {
			try {

				searchjewelary.isDisplayed();
				Assert.assertEquals(searchjewelary, searchjewelary);
				log.info("Valid message is : " + searchjewelary.getText());
				return true;

			} catch (Exception e) {
				return false;
			}
		}
			public boolean verifypopular () {
				try {
					searchpopular.isDisplayed();
					Assert.assertEquals("No results were found for your search",searchpopular );
					log.info(searchpopular.getText());
					return true;

				} catch (Exception e) {
					return false;		
		
		
				}	
		
		
		
		
		
		}
			public boolean SearchProductRing() {
				try {

                      searchRing.isDisplayed();
					Assert.assertEquals(searchRing, searchRing);
					log.info("Valid message is : " +searchRing.getText());
					return true;

				} catch (Exception e) {
					return false;
				}
			}
				
			public void testn(){
				sortBy.click();
			}
			
			
				
			
				

}


