package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browserFactory {
	
	static WebDriver driver;
	
	public WebDriver openBrowser() {
		
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		return driver;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}