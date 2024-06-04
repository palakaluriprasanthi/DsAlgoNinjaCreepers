package DSHooks;

import org.openqa.selenium.By;

import DSWebDriver.DriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.After;

public class TestHooks {
	
	@Before("Setup browser")
	public void setUp() {
		String browser = null;
		String url = null;
		DriverManager.launchBrowser(browser, url);
	}

	@Given("user navigates to dsportal/heroku.com")
	public void gotoportal() {
		DriverManager.getDriver().navigate().to("https://www.dsportalapp.herokuapp.com");
	}

	@When("Testing for username and password")
	public void TestingForUsernameAndPassword(String arg1, String arg2) {
		DriverManager.getDriver().findElement(By.linkText("Get Started")).click();
		DriverManager.getDriver().findElement(By.linkText("Sign in")).click();
		DriverManager.getDriver().findElement(By.id("id_username")).sendKeys("pam2024");
		DriverManager.getDriver().findElement(By.id("id_password")).sendKeys("pwd@2024");
		DriverManager.getDriver().findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();
	}

	@Then("if login is successful then navigating to homepage")
	public void validatelogin() {
		if (DriverManager.getDriver().getCurrentUrl().equalsIgnoreCase("https://dsportalapp.herokuapp.com/home")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Failed");
		}
		
		DriverManager.getDriver().close();
	}

	@After
	public void tearDown() {
		DriverManager.getDriver().findElement(By.linkText("Logout")).click();
		System.out.println("Logged out from the application");
		System.out.println("Clearing browser cookies");
		System.out.println("Close the browser");
		
		if (DriverManager.getDriver() != null) {
			DriverManager.getDriver().quit();
			System.out.println("Print the Reports");

		}
	}
}
