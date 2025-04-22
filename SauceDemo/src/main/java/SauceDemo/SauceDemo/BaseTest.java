package SauceDemo.SauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	static WebDriver driver;
	
	@BeforeSuite
	public void launchUrl()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Desktop\\Vijaya Bhaskar\\SauceDemo\\Drivers\\msedgedriver.exe");
		
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
			
	}
	
	
	
}
