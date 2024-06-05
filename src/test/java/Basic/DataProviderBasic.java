package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProviderBasic {
	@Test(dataProvider="login")
	public void reciever( String username,String password) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
 		Thread.sleep(1000);
 		driver.findElement(By.name("Email")).sendKeys(username);
 		Thread.sleep(1000);
 		driver.findElement(By.name("Password")).sendKeys(password);
 		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
 		Thread.sleep(2000);
 		driver.close();
	}
	
	@org.testng.annotations.DataProvider(name="login")
	public Object[][]sender(){
		return DataProviderUtility.dwsLogin();
	}
	

}