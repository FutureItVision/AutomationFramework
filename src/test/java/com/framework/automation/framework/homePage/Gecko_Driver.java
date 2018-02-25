package com.framework.automation.framework.homePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gecko_Driver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yahoo.com");

		Thread.sleep(5000);
		driver.quit();
	}

}
