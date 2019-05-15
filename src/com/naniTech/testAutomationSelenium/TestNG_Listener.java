package com.naniTech.testAutomationSelenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNG_Listener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TestCase started and details are :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCases Success and details are :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCases Failed and details are :"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("TestCase Skipped and details are :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

	
	
}
