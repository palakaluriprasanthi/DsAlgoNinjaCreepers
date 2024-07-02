package dsUtilities;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsUtilities.ExcelReader;
import dsUtilities.ConfigReader;
import dsalgo_hooks.DriverFactory;
import dsalgo_hooks.DriverManager;


public class commoncomponents {
	//public static WebDriver driver;
	public static WebDriver wait;
	public static WebDriver driver = DriverFactory.getDriver();
	String Excelpath = ConfigReader.getexcelfilepath();
	String code;
	String result;
	
	public commoncomponents() {
		
		this.wait = wait;
		
	}
	
	public void waitForElementToappear(WebElement user){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(user));
	}
	public void ActionClass(WebElement e, String s) {	
	
		Actions a = new Actions(driver);
		//WebElement e =null;
		//CharSequence s= null;
		a.sendKeys(e, s).build().perform();
		}
	
	
	public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		dsUtilities.ExcelReader reader = new dsUtilities.ExcelReader();
		List<Map<String, String>> testData = reader.getData(Excelpath, sheetname);
		code = testData.get(rownumber).get("pythonCode");
		result = testData.get(rownumber).get("Result");
		return code;
	}

	public void enterCode(String code, WebElement element) {

		new Actions(driver).sendKeys(element, code).perform();
	}

	public void enterCodePractice(String code, WebElement element) {
		new Actions(driver).keyDown(Keys.COMMAND).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.COMMAND).perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i <= str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
	}

	public String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData(Excelpath, sheetname);
		result = testData.get(rownumber).get("Result");

		return result;
	}

	//public void backwindow() {
	//	DriverManager.getDriver().navigate().back();
	}
	


