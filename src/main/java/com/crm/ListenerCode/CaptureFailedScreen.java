package com.crm.ListenerCode;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.crm.ListenerCode.DWSBaseClass;



public class CaptureFailedScreen extends DWSBaseClass implements ITestListener{
 
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	 LocalDateTime date = LocalDateTime.now();
	 String time = date.toString().replace(":", "-");
	 TakesScreenshot ts= (TakesScreenshot) driver;
	 File from = ts.getScreenshotAs(OutputType.FILE);
	 File to = new File("./dwsScreenshot/DWS"+time+".png");
	
	try {
		org.openqa.selenium.io.FileHandler.copy(from, to);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
