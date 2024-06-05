package com.crm.ListenerCode;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class screenshotBaseClass {
	 public static WebDriver driver;
	@BeforeClass
    public void beforeClass() 
    {
   	 
   	    driver = new ChromeDriver();//to open the browser
		driver.manage().window().maximize();//to maximize the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//to give implicit wait
		
    }
    @BeforeMethod
    public void beforeMethod() {
   	 System.out.println("thanks for comming");
    }
    @AfterMethod
    public void afterMethod() 
    {  
   	    System.out.println("after method");
    }
    
    @AfterClass
    public void afterClass()
    {
   	 driver.quit();
   	 System.out.println("post-condition for the test runner");
 	 
    }
	
}