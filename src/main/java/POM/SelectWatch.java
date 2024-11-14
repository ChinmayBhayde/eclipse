package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import driverFactory.browserFactory;

public class SelectWatch extends browserFactory {
	
	WebDriver driver = getDriver();
	
	@FindBy(xpath="//div[text()='FOSSIL']/preceding-sibling::input[@type='checkbox']") private WebElement checkBox;
	
	@FindBys(@FindBy(xpath ="//div[@class='hCKiGj']/a[@class='WKTcLC']")) private List<WebElement> watches;
	
	public SelectWatch(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	
	public void checkWatch() {
		
	}

}
