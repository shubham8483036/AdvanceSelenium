package Practices;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import shopperstack.shopperData;

public class shopper1 {

	@Test
	public void shop(String USERNAME,String PASSWORD) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/user-signin");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(USERNAME);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
//	@org.testng.annotations.DataProvider(name="login")
//	public Object[][]sender() throws EncryptedDocumentException, IOException, InterruptedException{
//		Thread.sleep(2000);
//		return shopper1_Data.log();
//		
	//}
}
