package dsAlgoPages;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsUtilities.ConfigReader;
import dsUtilities.PropertyReader;
import dsalgo_hooks.DriverFactory;
import dsalgo_hooks.LoginDriverManager;
import dsUtilities.commoncomponents;
public class DsAlgoArrayPage {
	public WebDriver driver = DriverFactory.getDriver();
	commoncomponents cc = new commoncomponents();
	
	//String tryEditorURL = ConfigReader.tryEditorURL();
	String url = ConfigReader.getApplicationUrl();
	
	@FindBy (xpath="//*[@id=\\\"navbarCollapse\\\"]/div[1]/div/a")WebElement getstart_datastructures;
	@FindBy (xpath="//*[@href='array']")WebElement getstart_array;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[contains(text(), 'Data Structures')]")WebElement dropdown;
	@FindBy (xpath="//*[@id='navbarCollapse']//a[contains(@href, '/array')]")WebElement dropdown_array;

	
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement TryHereLink;
	@FindBy (xpath="//*[@id='answer_form']")WebElement answerform;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy (xpath="//*[@id='answer_form']/button")WebElement runButton;
	@FindBy (xpath="//*[@class='button']")WebElement submitButton;
	@FindBy (id="output")WebElement output; 
	
	public DsAlgoArrayPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public  void dropdown_arrayClick()
	{
		dropdown.click();
		dropdown_array.click();
	}
	
	public void getStartedArray()
	{
		getstart_array.click();

	}
	
	public String ArrayPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}
	
	public void ClickOnArraysInPython()
	{
		arraysInPythonLink.click();
	}
	
	public void clickOnTryhereLink(String btname,String destname)
	{
		TryHereLink.click();
	}
	public void enterPythonCode(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		/*
		 * String code = cc.getCodefromExcel(sheetname, rownumber); cc.enterCode(code,
		 * editorInput);
		 */

}

/*
 * public String getExpectedResult(String sheetname, int rownumber) throws
 * InvalidFormatException, IOException { //String expectedResult =
 * cc.getResultfromExcel(sheetname, rownumber); return expectedResult; }
 */
	public String getActualResult() {
	//	cc.waitForElementToappear(output);
		return output.getText();

	}

	public void navigateTotryEditor() {

		driver.get(ConfigReader.tryEditorURL());
		PageFactory.initElements(driver, this);

	}
	public void clickOnRunButton() {
		runButton.click();

	}

	public String getErrorText() {
		
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;
	}
	public void navigateTo(String pagename) {
		
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);

		
	}
	public void backwindow() {
		DriverFactory.getDriver().navigate().back();
	}
}

