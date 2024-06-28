package dsalgo_hooks;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import dsUtilities.*;
import org.openqa.selenium.WebDriver;


public class LoginDriverManager {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebDriverManager WebDriverManager;
	
		@SuppressWarnings("deprecation")
		public static WebDriver init_driver(String browser) {

			System.out.println("browser value is: " + browser);

			if (browser.equals("chrome")) {
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				option.addArguments("--disable-dev-shm-usage");
				option.addArguments("--ignore-ssl-errors=yes");
				option.addArguments("--ignore-certificate-errors");
				WebDriverManager.chromedriver().setup();//112.0.5615.49
				driver = new ChromeDriver(option);
			
			} else if (browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

				//tlDriver.set(new FirefoxDriver());
			} else if (browser.equals("safari")) {
				//tlDriver.set(new SafariDriver());
			} else {
				System.out.println("Please pass the correct browser value: " + browser);
			}

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			 //Set Page load timeout
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

			return driver;

		}
		/*public static WebDriver getDriver() {
			if (driver ==null) {
				ConfigReader.init_prop();
				driver = LoginDriverManager.init_driver(ConfigReader.getBrowserType());
			}
				
			return driver;
			

		}*/

	//private static WebDriver driver = new ChromeDriver();
	   
	//public static WebDriver launchBrowser(String browserName, String siteUrl) {

		//if (browserName.equalsIgnoreCase("Firefox")) {
			//System.out.println("Browser name is" + browserName);
			//driver = new FirefoxDriver();
		//} else if (browserName.equalsIgnoreCase("Chrome")) {
			//System.out.println("Browser name is" + browserName);
			//driver = new ChromeDriver();
		//} else if (browserName.equalsIgnoreCase("Edge")) {
			//System.out.println("Browser name is" + browserName);
			//driver = new EdgeDriver();
		//} else if (browserName.equalsIgnoreCase("Safari")) {
			//System.out.println("Browser name is" + browserName);
			//driver = new SafariDriver();
		//} else {
			//System.out.println("Please give a valid browser name");
		//}
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.get(siteUrl);
		//System.out.println("Loaded the page sucessfully");
		
		//return driver;
	//}
	
//	public static WebDriver getDriver() {
		//if(driver == null) {
    		//throw new IllegalArgumentException("WebDriver is not initialized.");
		//}
		
		//return driver;
	//} 
}