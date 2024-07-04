package dsAlgoPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import dsUtilities.LoggerLoad;
import dsUtilities.PropertyReader;
import io.cucumber.datatable.DataTable;

public class DsAlgoRegisterPage {

	public static WebDriver driver;
	String register = PropertyReader.getProperty("appURL");

	@FindBy(xpath = "//[@href='/register']")
	public WebElement registerButton;
	@FindBy(xpath = "//*[@id=\"id_username\"]")
	public WebElement user;
	@FindBy(xpath = "//*[@id=\"id_password1\"]")
	public WebElement pwd;
	@FindBy(xpath = "//*[@id=\"id_password2\"]")
	public WebElement confirmpwd;
	@FindBy(xpath = "/html/body/div[3]")
	WebElement errorMsg;

	public DsAlgoRegisterPage(WebDriver driver) {
		DsAlgoRegisterPage.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void navigatetoRegisterPage() {
		driver.get(register);
	}

	public void clickOnRegisterButton() {
		LoggerLoad.info("The user clicks on Register button");
		registerButton.click();
	}

	public Boolean getEmptyRequiredUser() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (user.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", user);
		}
		return isRequired;
	}

	public Boolean EmptyRequiredUser() {
		boolean isRequired = true;
		// To check empty fields , we need to check "required" field is on an attribute
		String text = user.getAttribute("value");
		if (text.isEmpty()) {
			isRequired = true;
		}
		return isRequired;
	}

	public Boolean EmptyRequiredPswd() {
		boolean isRequired = true;
		// To check empty fields , we need to check "required" field is on an attribute
		String text = pwd.getAttribute("value");
		if (text.isEmpty()) {
			isRequired = true;
		}
		return isRequired;
	}

	public Boolean getEmptyRequiredPswd() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (pwd.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", pwd);
		}
		return isRequired;
	}

	public Boolean getEmptyRequiredCofmPswd() {
		boolean isRequired = false;
		// To check empty fields , we need to check "required" field is on an attribute
		if (confirmpwd.getText().isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", confirmpwd);
		}
		return isRequired;
	}

	public String getEmptyfieldErrormsgUser() {
		return user.getAttribute("validationMessage");
	}

	public String getEmptyfieldErrormsgPswd() {
		return pwd.getAttribute("validationMessage");
	}

	public String getEmptyfieldErrormsgCofmPswd() {
		return confirmpwd.getAttribute("validationMessage");
	}

	public void enterUsername(String username) {
		user.clear();
		user.sendKeys(username);

	}

	public void enterPassword(String password) {
		pwd.clear();
		pwd.sendKeys(password);

	}

	public String getErrormsg() {
		String msg = null;
		try {
			msg = errorMsg.getText();
		} catch (NoSuchElementException e) {
			LoggerLoad.info("No such element");
		}
		return msg;

	}

	public void enterCofmPassword(String cpassword) {
		confirmpwd.clear();
		confirmpwd.sendKeys(cpassword);

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public void entervalidUsername(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {

			String userName = form.get("username");
			LoggerLoad.info("The user enter username as : " + userName);
			if (userName != null && !userName.isEmpty())
				user.sendKeys(userName);

		}

	}

	public void entervalidPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {

			String passwd = form.get("password");
			LoggerLoad.info("The user enter password as : " + passwd);
			if (passwd != null && !passwd.isEmpty())
				pwd.sendKeys(passwd);

		}

	}

	public void entervalidConfmPassword(DataTable dataTable) {
		List<Map<String, String>> userdetail = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> form : userdetail) {

			String cpasswd = form.get("password confirmation");
			LoggerLoad.info("The user enter confirm password as : " + cpasswd);
			if (cpasswd != null && !cpasswd.isEmpty())
				confirmpwd.sendKeys(cpasswd);

		}

	}

}
