package Listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class netWorkFailure {

	@Test(retryAnalyzer = com.crm.ListenerCode.ListenersRetry.class)
	public void main() {
		WebDriver driver = new ChromeDriver();
		assertEquals("shubham", "Swapnil");
		
	}
}
