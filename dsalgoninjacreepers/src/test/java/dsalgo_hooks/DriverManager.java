package dsalgo_hooks;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager {
	
	private static WebDriver driver;

	public static WebDriver launchBrowser(String browserName, String siteUrl) {

		if (browserName.equalsIgnoreCase("Firefox")) {
			System.out.println("Browser name is" + browserName);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Chrome")) {
			System.out.println("Browser name is" + browserName);
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.out.println("Browser name is" + browserName);
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("Safari")) {
			System.out.println("Browser name is" + browserName);
			driver = new SafariDriver();
		} else {
			System.out.println("Please give a valid browser name");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(siteUrl);
		System.out.println("Loaded the page sucessfully");
		
		return driver;
	}
	
	public static WebDriver getDriver() {
		if(driver == null) {
			throw new IllegalArgumentException("WebDriver is not initialized.");
		}
		return driver;
	} 

}
