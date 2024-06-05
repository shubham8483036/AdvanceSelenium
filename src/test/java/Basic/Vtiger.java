package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vtiger {

	@Test
	public void login() throws IOException {
	 Properties pr = new Properties();
	 FileInputStream fl= new FileInputStream("./vtiger\\enterData.properties");
	 pr.load(fl);
	 
	String url = pr.getProperty("URL");
	 System.out.println(url);
	String username = pr.getProperty("USERNAME");
	 String password = pr.getProperty("PASSWORD");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 
	 driver.get(url);
	 driver.findElement(By.cssSelector("input[name='user_name']")).sendKeys(username);
	 driver.findElement(By.cssSelector("input[name='user_password']")).sendKeys(password);
	 driver.findElement(By.id("submitButton")).click();
	}
}

