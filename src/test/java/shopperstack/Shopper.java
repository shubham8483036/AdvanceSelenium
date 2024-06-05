package shopperstack;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import action.Wait;

public class Shopper {
  @Parameters({"URL","USERNAME","PASSWORD"})
	@Test
	public void shopperlogin(String URL,String USERNAME,String PASSWORD) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("loginBtn")));
		WebElement login_but = driver.findElement(By.id("loginBtn"));
	  if (login_but.isEnabled()) {
		login_but.click();
		driver.findElement(By.id("Email")).sendKeys(USERNAME);
		driver.findElement(By.id("Password")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	} else {
  JavascriptExecutor js= (JavascriptExecutor) driver;
  js.executeScript("arguments(0).click()",login_but);
	}
		
	}
	
}
