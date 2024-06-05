package parameterAnnotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class task1 extends base {
	
	@Test
	public void giftcard() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();//to click on gift cards
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();//to click on add to cart
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Swapnil");//to send value at recipient name
		Thread.sleep(1000);
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("admin01@gmail.com");//to send value at recipent email
		Thread.sleep(1000);
		WebElement quantity = driver.findElement(By.name("addtocart_1.EnteredQuantity"));//to locate quntity field
		quantity.clear();//to clear quantity field
		Thread.sleep(1000);
		quantity.sendKeys("5");//to send value in quantity feild
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();//to click on add to cart
	}

}