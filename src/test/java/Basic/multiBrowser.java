package Basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public  class multiBrowser {
  
	
	@Test(priority = 0)
	public void MUMBAI() throws InterruptedException {
		//Thread.sleep(1000);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mumbaiindians.com/");
		System.out.println("Mumbai");
	}
	
	@Test(priority = 1)
	public void CSK() throws InterruptedException {
		Thread.sleep(1000);
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("https://www.chennaisuperkings.com/");
		System.out.println("csk");	
	}
	@Test(enabled = false)
	public void DWS() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		System.out.println("DWS");
	}
	@Test(priority = 2)
	public void RCB() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/teams/royal-challengers-bangalore");
		System.out.println("RCB");
	}

}
