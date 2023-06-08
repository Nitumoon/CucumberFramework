package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	// constructor
	public LoginPage(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement pass;

	@FindBy(tagName = "button")
	WebElement loginBtn;

	@FindBy(linkText = "Logout")
	WebElement logout;

	// implementation methods
	// enter emil
	public void enterEmail(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}

	// enter password
	public void enterPasswprd(String pwd) {
		pass.clear();
		pass.sendKeys(pwd);
	}

	// click on login button
	public void clickOnLoginButton() {
		loginBtn.click();
	}

	// click on logout button
	public void clickOnLogoutButton() {
		logout.click();
	}

}
