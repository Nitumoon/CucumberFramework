package StepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;

import PageObject.AddNewCustomerPage;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	public LoginPage lpage;
	public AddNewCustomerPage ancp;

	@Given("User Launch Edge browser")
	public void user_launch_edge_browser() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions co = new EdgeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver = new EdgeDriver(co);
		driver.manage().window().maximize();

		// create object of LoginPage class
		lpage = new LoginPage(driver);
		ancp = new AddNewCustomerPage(driver);
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

	/*
	 * Login Feature
	 */

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

	///////////////////// Add new Customer //////////////////////

	@Then("User can view Dashboard")
	public void user_can_view_dashboard() {
		String actTitle = ancp.getTitle();
		String expTitle = "Dashboard / nopCommerce administration";
		if (actTitle.equals(expTitle)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@When("User click on customers Menu Item")
	public void user_click_on_customers_menu_item() {
		ancp.clickOnCustomersTab();
	}

	@When("click on customer menu Item")
	public void click_on_customer_menu_item() {
		ancp.clickOnCustomersItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
		ancp.clickOnAddNewBtn();
	}

	@Then("User enter customer info")
	public void user_enter_customer_info() {

	}

	@Then("click on save button")
	public void click_on_save_button() {
		ancp.clickOnSaveBtn();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {

	}

}
