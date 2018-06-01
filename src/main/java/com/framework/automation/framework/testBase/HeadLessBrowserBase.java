package com.framework.automation.framework.testBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadLessBrowserBase {
	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	public void beforeTest(){
		HtmlUnitDriver unitDriver=new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
		unitDriver.setJavascriptEnabled(true);
		unitDriver.get("http://automationpractice.com/index.php");
		String dpmainName=(String)unitDriver.executeScript("return document.domian");
		System.out.println(dpmainName);
	}

}
