package Assertions;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1  {

	@Test
	public void hardAssert() {
		String Expected_result = "https://demowebshop.tricentis.com/";
		String a = "shubham";
	    String b = null;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		SoftAssert ass = new SoftAssert();
		String Actual_result = driver.getCurrentUrl();
		 boolean result = Expected_result.equals(Actual_result);
         ass.assertTrue(result);
         driver.findElement(By.id("small-searchterms")).sendKeys("shubham");
         ass.assertNotNull(a);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		ass.assertAll();
//	driver.close();
		
		
	}
}
