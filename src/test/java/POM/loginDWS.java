package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DWSLogIn;

public class loginDWS {
	@Test
	public void login() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		
		Thread.sleep(2000);
		DWSLogIn dws = new DWSLogIn(driver);
		
		Thread.sleep(2000);
//		dws.username.sendKeys("admin01@gmail.com");
//		dws.password.sendKeys("admin01");
//	    dws.login_bt.click();
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.loginBt();
	}

}
