
package dsalgo_hooks;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import dsalgo_hooks.LoginDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import dsUtilities.ConfigReader;
import dsUtilities.LoaderLoad;

public class Hooks {
	private static WebDriver driver;
	private static LoginDriverManager driverManager;

	/*@BeforeAll
	public static void before() throws Throwable {
		// Get browser Type from config file
		 LoaderLoad.info("Loading Config file");
		//ConfigReader.init_prop();
		//String browser = ConfigReader.getBrowserType();

		// Initialize driver from driver factory
		driverManager = new LoginDriverManager();
		driver = driverManager.getDriver();
		DriverFactory.setDriver(driver);
		// LoaderLoad.info("Initializing driver for : "+browser);

	}*/
	@BeforeAll()
	public static void before() {
		  
		  
		  DriverFactory.launchBrowser();
			/*
			 * DriverFactory.getDriver().findElement(By.xpath("//a[@href='/home']")).click()
			 * ; DriverFactory.getDriver().findElement(By.linkText("Sign in")).click();
			 * DriverFactory.getDriver().findElement(By.id("id_username")).sendKeys(
			 * "pam2024");
			 * DriverFactory.getDriver().findElement(By.id("id_password")).sendKeys(
			 * "pwd@2024");
			 * DriverFactory.getDriver().findElement(By.xpath("//input[@value='Login']")).
			 * click();
			 */
		  
	}
	
	@After
	public void tearDown(Scenario sc) {
		//DriverFactory.getDriver().navigate().back();
		if(sc.isFailed()) {
			 if (DriverFactory.getDriver() != null) {
	                byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
	                sc.attach(screenshot, "image/png", "Screenshot on failure");
	            }
		}
		//DriverFactory.getDriver().findElement(By.linkText("Signout")).click();
		//System.out.println("Logged out from the application");	
		//DriverFactory.getDriver().quit();
	}
	
	@AfterAll
	public static void after() {
		DriverFactory.getDriver().findElement(By.linkText("Sign out")).click();
		System.out.println("Logged out from the application");	
		DriverFactory.getDriver().quit();
		
	}
	
	/*
	 * @BeforeAll public static void before_or_after_all() {
	 * System.out.println("Setup before all class"); }
	 */
	
	
	
}
 

