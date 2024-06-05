package parameterAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossBrowser {
	
	public WebDriver driver;
	@Parameters("Browser")
	@Test
	public void CrossBrowser(String browser) {
	 if (browser.equalsIgnoreCase("Chrome")) {
		driver= new ChromeDriver();
		
	} else if (browser.equalsIgnoreCase("edge")) {
		driver= new EdgeDriver();
	}
	else if (browser.equalsIgnoreCase("Firefox")) {
		driver= new FirefoxDriver();
	}
    driver.manage().window().maximize();
    driver.get("https://manis.in/");
	}
	}


