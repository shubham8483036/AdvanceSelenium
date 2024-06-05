package Listener;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ProductExData.DWSExcelUtility;
import com.crm.listenersCode.DWSBaseClass;
@Listeners(com.crm.listenersCode.DWSListener.class)
public class DWSGiftCart extends com.crm.ListenerCode.DWSBaseClass{
	@Test
	public void giftCart() throws InterruptedException, EncryptedDocumentException, IOException
	{
	    
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Card')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='item-box'])[1]")).click();;
		DWSExcelUtility eutil = new DWSExcelUtility();
		String name = eutil.efUtil(0, 0);
		String email = eutil.efUtil(0, 1);
		String quantity = eutil.efUtil(0, 2);
			Thread.sleep(2000);
			driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys(name);
			Thread.sleep(1000);
			driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys(email);
			 WebElement quant = driver.findElement(By.className("qty-input"));
			  quant.clear();
			  Thread.sleep(5000);
			  quant.sendKeys(quantity);
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			  Thread.sleep(5000);
			  driver.navigate().back();
			
			
		
	}

}