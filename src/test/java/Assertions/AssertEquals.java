package Assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEquals  {

	@Test
	public void hardAssert() {
		String Expected_result = "https://demowebshop.tricentis.com/";
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		String Actual_result = driver.getCurrentUrl();
		 boolean result = Expected_result.equals(Actual_result);

		
		//assertEquals(Expected_result, Actual_result);
		
		//assertNotEquals(Expected_result, Actual_result);
		
		//assertTrue(result);
		
		assertFalse(result);
		
		driver.findElement(By.id("small-searchterms")).sendKeys("shubham");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		//driver.quit();
		
		
	}
}
