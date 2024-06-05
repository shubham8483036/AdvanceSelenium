package Extent_Report;

import java.io.File;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class sampleReport {
     @Test
	public void LaunchTheReport() {
		ExtentReports report= new ExtentReports();
		File path = new File("./Extent_Report/samle.html");
		ExtentSparkReporter spark= new ExtentSparkReporter(path);
		spark.config().setDocumentTitle("m3&a5 batch");
		spark.config().setReportName("manikandan");
		spark.config().setTheme(Theme.DARK);
		
		//attach the spark to extent report
		report.attachReporter(spark);
		report.setSystemInfo("os", "windows");
		
		
		
		//attach the report
		report.attachReporter(spark);
		
		//create the test case
		ExtentTest test1 = report.createTest("test1");
		test1.log(Status.FAIL, "login function error");
		report.flush();
		
	}
}

