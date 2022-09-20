package com.kitap.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.kitap.base.BaseTest;

public class listener extends BaseTest implements ITestListener {
	
	public  void onTestStart(ITestResult result) {
	    System.out.println("test execution started");
	  }

	 
	  public  void onTestSuccess(ITestResult result) {
		  System.out.println("test step success");
	  }

	  
	  public  void onTestFailure(ITestResult result) {
		  System.out.println("test step failure");
	  }

	  
	  public  void onTestSkipped(ITestResult result) {
		  System.out.println("test step skipped");
	  }

	  
	  public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	  
	  public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	  
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	  
	  public void onFinish(ITestContext context) {
	    // not implemented
	  }
	}



