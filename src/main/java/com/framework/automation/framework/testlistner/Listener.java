package com.framework.automation.framework.testlistner;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.Utils;

import com.framework.automation.framework.testBase.TestBase;

public class Listener extends TestBase implements ITestListener{
//    WebDriver driver;
//    public Listener( WebDriver driver){
//    	
//    	this.driver=driver;
//    }
	public void onTestStart(ITestResult result) {
		Reporter.log("Test started running:"+result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName=result.getName();
		if(result.isSuccess()){
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		
		
				try{
			String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/com/AutomationFramework/test/";
			File destFile=new File((String) reportDirectory+"success_screenshots/"+methodName+"_"+formater.format(calendar.getTime())+".png");
		   Utils.copyFile(scrFile, destFile);
		   Reporter.log("<a href='" +destFile.getAbsolutePath()+ "'> <image src='" +destFile.getAbsolutePath()+ "' height='100' width='100'/> </a>");
				
				}catch (Exception e) {
			
			e.printStackTrace();
		
		}
	}
	
		
	}

	public void onTestFailure(ITestResult result) {
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		String methodName=result.getName();
		if(!result.isSuccess()){
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		
		
				try{
			String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/com/AutomationFramework/test/";
			File destFile=new File((String) reportDirectory+"failure_screenshots/"+methodName+"_"+formater.format(calendar.getTime())+".png");
		   Utils.copyFile(scrFile, destFile);
		   Reporter.log("<a href='" +destFile.getAbsolutePath()+ "'> <image src='" +destFile.getAbsolutePath()+ "' height='100' width='100'/> </a>");
				
				}catch (Exception e) {
			
			e.printStackTrace();
		
		}
	}
	
}
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test skipped :"+result.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
