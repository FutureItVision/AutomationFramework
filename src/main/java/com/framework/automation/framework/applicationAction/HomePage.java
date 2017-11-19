package com.framework.automation.framework.applicationAction;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.automation.framework.homePage.VerifyloginWithInvalidCredentails;

public class HomePage {
	public static final Logger log=Logger.getLogger(HomePage.class.getName());

	WebDriver driver;
	
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signIn;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement logInemailAddress;
	
	@FindBy(xpath=".//*[@id='passwd']")
	WebElement logInPassword;
	
	@FindBy(xpath=".//*[@id='SubmitLogin']")
	WebElement submitButton;

	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")
	WebElement authenticationFailed;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement authenticationValid;
	
	@FindBy(xpath=".//*[@id='header']/div[2]/div/div/nav/span/strong")
	WebElement validphonenumber;
	
	@FindBy(xpath=".//*[@id='header']/div[3]/div/div/div[3]/div/a")
	WebElement shoppingchart;
	
	@FindBy(xpath=".//*[@id='search_query_top']")
	WebElement searchbutton;

	@FindBy(xpath=".//*[@id='center_column']/h1/span[1]")
	WebElement searchshirt;
	
	@FindBy(xpath=".//*[@id='search_query_top']")
	WebElement homepageSearchbutton;
	
	@FindBy(xpath=".//*[@id='center_column']/h1/span[1]")
	WebElement searchhat;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}

	public void logInToApplication(String emailAddress, String password){
		signIn.click();
		log.info("Click signIn and object is : "+signIn.toString());
		logInemailAddress.sendKeys(emailAddress);
		log.info("Enterd login and object is : "+logInemailAddress.toString());
		logInPassword.sendKeys(password);
		log.info("Enterd password and object is : "+logInPassword.toString());
		submitButton.click();
		log.info("Click submitButton and object is : "+submitButton.toString());
	}
	
	public void vrifiedHomePagephonenumber(){
		validphonenumber.isDisplayed();
		log.info("validphonenumber object is : "+validphonenumber.toString());
	}
	
	public void homepageSearchButton(String cloth){
		homepageSearchbutton.sendKeys(cloth);
		homepageSearchbutton.click();
		log.info("homepageSearchbutton object is : "+validphonenumber.toString());
	}
	 String getSearchShirt(){
		log.info("Valid message is : "+searchshirt.getText());
				return searchshirt.getText();
			
			}

	public void vrifiedHomePageshoppingchart(){
		shoppingchart.isDisplayed();
		log.info(" shoppingchart object is : "+shoppingchart.toString());
	}
	public void vrifiedHomePagesearchbutton(){
		searchbutton.isDisplayed();
		log.info(" searchbutton object is : "+searchbutton.toString());
	}
	
	
	public String getInvalidLogInText(){
log.info("Error message is : "+authenticationFailed.getText());
		return authenticationFailed.getText();
	}
	
	public String getValidLogInText(){
		log.info("Valid message is : "+authenticationValid.getText());
				return authenticationValid.getText();
			
			}

	
	
}
