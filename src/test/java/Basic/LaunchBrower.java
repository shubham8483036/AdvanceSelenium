package Basic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LaunchBrower {

	@Test
	public  void add (){
		// TODO Auto-generated method stub
    
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

}
