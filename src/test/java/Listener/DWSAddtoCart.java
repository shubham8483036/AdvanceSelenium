package Listener;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.ListenerCode.DWSBaseClass;
import com.crm.productExternalData.DWSPropertiesUtility;

@Listeners(com.crm.ListenerCode.DWSLogin.class)
public class DWSAddtoCart extends DWSBaseClass{
	 @Test
	public void addToCart() {
		DWSPropertiesUtility excel = new DWSPropertiesUtility();
		
		
		
	}

	
}
