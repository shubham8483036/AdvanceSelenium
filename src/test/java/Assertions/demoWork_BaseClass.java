package Assertions;

import java.io.FileInputStream;
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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoWork_BaseClass {
   WebDriver driver;
	 
	  @BeforeSuite
	   public void beforeSuite()
	   {
		  System.out.println("before suite"); 
	   }
	   
       
	  @BeforeTest
	   public void beforeTest()
	   {
		   System.out.println("before test"); 
	   }
	   @Parameters("url")
      @BeforeClass
       public void beforeClass(String url)
       {
    	 
    	  driver = new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  driver.get(url);
    	   System.out.println("before class"); 
       }
//      @Parameters({"username","password"})
//      @BeforeMethod
//       public void beforeMethod(String username,String password) throws IOException, InterruptedException
//
//       {
//    	    
//    	   driver.findElement(By.xpath("//a[text()='Log in']")).click();
//    		Thread.sleep(1000);
//    		driver.findElement(By.name("Email")).sendKeys(username);
//    		Thread.sleep(1000);
//    		driver.findElement(By.name("Password")).sendKeys(password);
//    		driver.findElement(By.xpath("//input[@value='Log in']")).click();
//    		System.out.println("before method");
//       }
//       
  
       
      @AfterMethod
       public void afterMethod() 
       {
    	  driver.findElement(By.xpath("//a[text()='Log out']")).click();
    	   System.out.println("after method");
       }
       
       
      @AfterClass
       public void afterClass()
       {
    	  driver.close();
    	   System.out.println("after class");
       }
       
       
       
      @AfterTest
       public void afterTest()
       {
    	   System.out.println("after test");
       }
       
      @AfterSuite
       public void afterSuite()
       {
    	   System.out.println("after suite");
       }
}