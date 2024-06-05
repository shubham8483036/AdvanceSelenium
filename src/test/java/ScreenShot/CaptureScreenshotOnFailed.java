package ScreenShot;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ListenerCode.DWSBaseClass;

import com.crm.ListenerCode.DWSListernersClass;

@Listeners(com.crm.ListenerCode.DWSListernersClass.class)
public class CaptureScreenshotOnFailed extends DWSBaseClass{
	
	@Test
	public void dwsLoginCorrect() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
 		driver.findElement(By.name("Password")).sendKeys("admin01");
 		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
 		driver.findElement(By.xpath("//a[@class='ico-logout']")).click() ;
		
	}
	
	@Test
	public void dwsLoginWrong() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.name("Email")).sendKeys("admin01@gmail.com");
		Thread.sleep(2000);
 		driver.findElement(By.name("Password")).sendKeys("admin02");
 		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
 		driver.findElement(By.xpath("//a[@class='ico-logout']")).click() ;
	}
	
	@Test
	public void redbus() throws InterruptedException {
		Thread.sleep(4000);
		driver.get("https://www.redbus.in/");
		assertEquals("Shubham", "Shubh");
		
	}

}