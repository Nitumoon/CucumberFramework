package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomerPage {
	public WebDriver driver;

	// cunstroctor
	public AddNewCustomerPage(WebDriver driver) {
		driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Find web Element on the web page

	@FindBy(xpath = "//p[text()[normalize-space()='Customers']]")
	WebElement customersTab;

	@FindBy(xpath = "//p[text()=' Customers']")
	WebElement customersItem;

	@FindBy(linkText = "Add new")
	WebElement addNewBtn;

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement pass;

	@FindBy(id = "FirstName")
	WebElement fName;

	@FindBy(id = "LastName")
	WebElement lName;

	@FindBy(id = "Gender_Male")
	WebElement genderMale;

	@FindBy(id = "Gender_Female")
	WebElement genderFemale;

	@FindBy(id = "DateOfBirth")
	WebElement dob;

	@FindBy(id = "Company")
	WebElement cName;

	@FindBy(id = "IsTaxExempt")
	WebElement cBox;

	@FindBy(xpath = "(//div[@role='listbox'])[1]")
	WebElement newsLetter;

	@FindBy(xpath = "(//div[@role='listbox'])[2]")
	WebElement cRoll;

	@FindBy(id = "VendorId")
	WebElement cVendor;

	@FindBy(id = "Active")
	WebElement active;

	@FindBy(id = "AdminComment")
	WebElement aComment;

	@FindBy(name = "save")
	WebElement saveBtn;

	// implementation methods
	// page title
	public String getTitle() {
		return driver.getTitle();
	}

	// click on ustomers tab
	public void clickOnCustomersTab() {
		customersTab.click();
	}

	// click on ustomers item
	public void clickOnCustomersItem() {
		customersItem.click();
	}

	// click on ustomers item
	public void clickOnAddNewBtn() {
		addNewBtn.click();
	}

	// enter emil
	public void enterEmail(String emailId) {
		email.sendKeys(emailId);
	}

	// enter password
	public void enterPasswprd(String Password) {

		pass.sendKeys(Password);
	}

	// enter First name
	public void enterFirstName(String Fname) {
		fName.sendKeys(Fname);
	}

	// enter last name
	public void enterLastName(String Lname) {
		lName.sendKeys(Lname);
	}

	// select Male gender
	public void selectMaleGender() {
		genderMale.click();
	}

	// select Female gender
	public void selectFemaleGender() {
		genderFemale.click();
	}

	// select Date of Birth
	public void selectDateOfBirth(String DOB) {
		dob.sendKeys(DOB);
	}

	// eneter company name
	public void enterCompanyName(String coName) {
		cName.sendKeys(coName);
	}

	// select check box
	public void selectCheckBox() {
		cBox.click();
	}

	// select news letter
	public void selectNewsLetter() {
		Select sel = new Select(newsLetter);
		sel.selectByVisibleText("Test store 2");

	}

	// select customer role
	public void selectCustomerRole() {
		Select sel = new Select(cRoll);
		sel.selectByIndex(3);

	}

	// select manager of vender
	public void enterManagerOfVendor(String value) {
		Select sel = new Select(cVendor);
		sel.selectByVisibleText("vendor 2");
	}

	// select active checkbox
	public void clickOnActiveCheckBox() {
		active.click();
	}

	// enter some comment
	public void enterAdminCommentBox(String adminComment) {
		aComment.sendKeys(adminComment);
	}

	// click on save button
	public void clickOnSaveBtn() {
		saveBtn.click();
	}
}
