package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import POM.HomePage;
import driverFactory.browserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends browserFactory{
	
	WebDriver driver;
	HomePage hp;
	WebDriverWait wait;

	@Given("user is on home page")
	public void user_is_on_home_page() {
	    driver = openBrowser();
	}

	@When("user move to fashion icon")
	public void user_move_to_fashion_icon() {
	    hp = new HomePage(driver);
		hp.clickOnFashion();
	}

	@When("clicks on watches and accessories")
	public void clicks_on_watches_and_accessories() {
		hp = new HomePage(driver);
		hp.clickOnWatches();
	}
//	@Test
	@Then("user moves to page with title that contains {string}")
	public void user_moves_to_page_with_title(String string) {
		hp = new HomePage(driver);
		hp.checkTitle(string);
	}

	
}
