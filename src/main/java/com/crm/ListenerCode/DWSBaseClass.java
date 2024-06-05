package com.crm.ListenerCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class DWSBaseClass {
	public static  WebDriver driver;
	String url;
	String email;
	String pass;
	
	 @BeforeSuite
	   public void beforeSuite()
	   {
		  System.out.println("before suite for connecting to the database"); 
	   }
	   
     
	   @BeforeTest
	   public void beforeTest()
	   {
		   System.out.println("pre-condition for the test runner"); 
	   }
	   
     @BeforeClass
     public void beforeClass() throws IOException
     {
    	 FileInputStream fis= new FileInputStream("D:\\java\\FastrackAdvanceSelenium\\src\\test\\resources\\DWS.propertie");
		 Properties p= new Properties();
		 p.load(fis);
		 url=p.getProperty("URL");
		 email=p.getProperty("EMAIL");
		pass=p.getProperty("PASSWORD");
    	  driver = new ChromeDriver();//to open the browser
 		driver.manage().window().maximize();//to maximize the browser
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//to give implicit wait
 		driver.get(url); //to enter in demowebshop
     }
     @BeforeMethod
     public void beforeMethod() throws InterruptedException 
     {
    	
		
    	 driver.findElement(By.xpath("//a[text()='Log in']")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.name("Email")).sendKeys(email);
 		Thread.sleep(1000);
 		driver.findElement(By.name("Password")).sendKeys(pass);
 		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
     }
     
     @AfterMethod
     public void afterMethod() 
     {  
    	 driver.findElement(By.xpath("//a[@class='ico-logout']")).click() ;
     }
     
     @AfterClass
     public void afterClass()
     {
    	 System.out.println("post-condition for the test runner");
  	 
     }  
     @AfterTest
     public void afterTest()
     {
    	 System.out.println("post-condition for the test runner");
     }
     
     @AfterSuite
     public void afterSuite()
     {
    	 System.out.println("after suite for dis-connect to the database");
     }

}