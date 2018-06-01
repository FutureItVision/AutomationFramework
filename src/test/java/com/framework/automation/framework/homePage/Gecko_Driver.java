package com.framework.automation.framework.homePage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.yahoo.com");
//
//		Thread.sleep(5000);
//		driver.quit();
//	}

	
	@Test
	public void  testn() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", " path of chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("http://stackoverflow.com");
		
	}
	
}
