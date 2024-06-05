package DataDrivenTestng;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class instagramLogin {

	@Test(dataProvider = "login")
	public void reciever(String username,String password) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[aria-label='Password']")).sendKeys(password);
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	@org.testng.annotations.DataProvider(name = "login")
	public Object[][]sender() throws EncryptedDocumentException, IOException{
		return instagramDataProvider.insta();
	}
}
