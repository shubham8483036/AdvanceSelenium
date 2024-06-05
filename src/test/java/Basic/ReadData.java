package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadData {

	@Test
	public void readdatafromprop() throws IOException, InterruptedException {
		Properties prop = new Properties();
		FileInputStream fls = new FileInputStream("./ConfigrationFile\\DWS.properties");
		prop.load(fls);
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		String username = prop.getProperty("USERNAME");
		String password = prop.getProperty("PASSWORD");
		
		WebDriver driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get(url);
		
	    driver.findElement(By.cssSelector("a[class='ico-login']")).click();
	    
	    driver.findElement(By.id("Email")).sendKeys(username);
	    driver.findElement(By.id("Password")).sendKeys(password);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector("input[value='Log in']")).click();
	}

 
	

}
