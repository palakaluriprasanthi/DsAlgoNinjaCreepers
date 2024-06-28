package dsalgo_hooks;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import dsUtilities.ConfigReader;
import dsalgo_hooks.Hooks;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	
	public  static WebDriver driver;

	public static WebDriver launchBrowser() {
		ConfigReader.init_prop();
		String browserName = ConfigReader.getBrowserType();

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Browser name is" + browserName);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser name is" + browserName);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.out.println("Browser name is" + browserName);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			System.out.println("Browser name is" + browserName);
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
		} else {
			System.out.println("Please give a valid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(ConfigReader.getApplicationUrl());
		System.out.println("Loaded the page sucessfully");
		
		return driver;
	}
	
	public static void setDriver(WebDriver driver1) {
		driver = driver1;
	}
	
	public  static WebDriver getDriver() {
		
		 if(driver == null){ 
			 throw new IllegalArgumentException("WebDriver is not initialized."); }
		 return driver;
		 
	} 

}
