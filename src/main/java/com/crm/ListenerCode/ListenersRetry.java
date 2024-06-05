package com.crm.ListenerCode;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;


public class ListenersRetry implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		int start= 0; int end= 5;
		while (start<end) {
			start++;
			return true;
			}
		return false;
	}

}
