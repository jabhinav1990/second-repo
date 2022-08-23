package Pilot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class Tester {

	WebDriver driver;
	@Test(priority=2, groups="regression")
	public void launchBrowser() {
		System.out.println("launch browser started");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sjyani\\Downloads\\chromedriver.exe");
		System.out.println("Property set");
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("Browser launched");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
	@Test(priority=1)
	public void priority()
	{
		System.out.println("Priority test case");
	}

	@Test(priority=1, groups="regression")
	public void regression()
	{
		System.out.println("Regression test case");
	}
	
}
