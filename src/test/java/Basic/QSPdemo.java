package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QSPdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		driver.findElement(By.cssSelector("input[name='requiredfield']")).sendKeys("JOB");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Shubham@123");
		driver.findElement(By.cssSelector("input[placeholder='Re-Type Password']")).sendKeys("Shubham@123");
		driver.findElement(By.cssSelector("input[placeholder='placeholder']")).sendKeys("Shubhampatil@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='URL']")).sendKeys("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
		driver.findElement(By.cssSelector("input[placeholder='Enter only digits']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[placeholder='Enter only numbers']")).sendKeys("0123");
		driver.findElement(By.cssSelector("input[placeholder='Enter only numbers']")).sendKeys("0123");
		driver.findElement(By.cssSelector("input[placeholder='Enter only numbers']")).sendKeys("0123");
		driver.findElement(By.cssSelector("input[placeholder='Enter only numbers']")).sendKeys("0123");

		

	}

}
