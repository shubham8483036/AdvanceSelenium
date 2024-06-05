package shopperstack;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import DataDrivenTestng.ShopperLogin;

public class baseClass {
	@Test  //(dataProvider="login")
	public void reciever( String USERNAME,String PASSWORD) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/user-signin");
		
		//Thread.sleep(2000);
 		driver.findElement(By.cssSelector("input[class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys(USERNAME);
 		//Thread.sleep(2000);
 		driver.findElement(By.cssSelector("input[class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd MuiOutlinedInput-inputAdornedEnd MuiInputBase-inputMarginDense MuiOutlinedInput-inputMarginDense']")).sendKeys(PASSWORD);
 		//Thread.sleep(2000);
 		driver.findElement(By.xpath("//span[text()='Login']")).click();
 		Thread.sleep(2000);
 		
 		
		
		
}
	@org.testng.annotations.DataProvider(name="login")
	public Object[][]sender() throws EncryptedDocumentException, IOException, InterruptedException{
		Thread.sleep(2000);
		return shopperData.ShopperLo();
}
}

	