package com.framework.automation.framework.testlistner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry  implements IRetryAnalyzer{

	private int retryCount=0;
	private int maxretryCount=3;
	
	public boolean retry(ITestResult result) {
		if(retryCount<maxretryCount){
			System.out.println("Retrying test"+result.getName()+"With status"+ getResultStatusName(result.getStatus())+"for the"+(retryCount+1)+"time(s).");
		retryCount++;
		return true;
		}
		
		return false;
	}
	
	public String getResultStatusName(int status){
		String resultName=null;
		if(status==1)
			resultName="Success";
		if(status==2)
			resultName="Failure";
		if(status==3)
			resultName="skip";
		return resultName;
		
	}

}
