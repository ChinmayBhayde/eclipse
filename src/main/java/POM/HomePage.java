package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import driverFactory.browserFactory;

public class HomePage extends browserFactory {
	
	WebDriver driver = getDriver();
	WebDriverWait wait;
	
	@FindBy(xpath = "//span[text()='Fashion']/ancestor::div[@class='YBLJE4']") private WebElement fashion;
	@FindBy(xpath = "//a[text()='Watches and Accessories']") private WebElement watches;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnFashion() {
		fashion.click();
	}
	
	public void clickOnWatches() {
		watches.click();
	}
	
	public boolean checkTitle(String string) {
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Wrist Watches"));
	    boolean b = driver.getTitle().contains(string);
	    return b;
	}
}
