package com.crm.ListenerCode;

import java.io.File;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportListener implements ITestListener {
   public ExtentReports reports;
   public ExtentSparkReporter spark;
  public  ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getMethod().getMethodName();
		
		test=reports.createTest(name);
		
		System.out.println("ONTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.PASS,name+ "test is execute successfully");
		System.out.println("on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getMethod().getMethodName();
		test.log(Status.FAIL, name+"test failed");
		System.out.println("on test failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		String name = result.getMethod().getMethodName();
		test.log(Status.SKIP,name+"test is skipped" );
		System.out.println("on test skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("on test fail with timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		 
		File path = new File("./Extent_Report/sample.html");
		 spark = new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("M3&A5 batch");
		spark.config().setReportName("manikandan sir");
		spark.config().setTheme(Theme.STANDARD);
		reports = new ExtentReports();
		reports.setSystemInfo("OS", "Window 12");
		reports.setSystemInfo("Browser", "Chrome");
		//attach spark report to extent report
		reports.attachReporter(spark);
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.flush();
		System.out.println("on test finish");
	}
	

}
