package dsAlgoPages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DsAlgoLoginPage {

	public WebDriver driver;
	public static WebDriverWait wait;
	boolean isRequired;
	
	@FindBy(xpath = "//a[@href='/home']")
	public WebElement getStarted;
	
	@FindBy(linkText = "Sign in")
	public WebElement signIn;
	
	@FindBy(xpath = "//input[@id='id_username']")
	public WebElement user;
	
	@FindBy(xpath = "//input[@id='id_password']")
	public WebElement pwd;
	
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement login_button;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	public WebElement alert;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	public WebElement register;
	
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	public WebElement signout;

	public  DsAlgoLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public Boolean Login(String username, String password) {
		waitForElementToappear(user);
		user.clear();
		user.sendKeys(username);
		pwd.clear();
		pwd.sendKeys(password);

		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", user);
			return isRequired;
		} else if (password.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", pwd);
			return isRequired;
		}
		return isRequired;
	}

	public void login_button() {
		login_button.click();
	}

	public String click_login() {
		login_button.click();
		String msg = alert.getText();
		return msg;
	}

	public void register_link() {
		register.click();
	}

	public String getTitle() {
		String Title = driver.getTitle();
		return Title;
	}

	public void signout() {
		signout.click();
	}

	public void waitForElementToappear(WebElement user) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.visibilityOf(user));
	}

}