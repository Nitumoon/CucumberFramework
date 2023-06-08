package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	public LoginPage lpage;

	@Given("User Launch Edge browser")
	public void user_launch_edge_browser() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(co);
		driver.manage().window().maximize();

		// create object of LoginPage class
		lpage = new LoginPage(driver);

	}

	@When("User open URL {string}")
	public void user_open_url(String url) {
		driver.get(url);

	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pass) {
		lpage.enterEmail(email);
		lpage.enterPasswprd(pass);
	}

	@When("Click on login")
	public void click_on_login() {
		lpage.clickOnLoginButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expTitle) {
		String actTitle = driver.getTitle();
		if (actTitle.equals(expTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
		lpage.clickOnLogoutButton();
	}

	@Then("close Browser")
	public void close_browser() {
		driver.close();
		driver.quit();
	}
}
