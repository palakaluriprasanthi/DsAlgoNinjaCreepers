package dsAlgoPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoDataStructurePage {
	public WebDriver driver;

	public @FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement DSGetStarted;

	public @FindBy(linkText = "Time Complexity")
	WebElement TimeComplexity;

	public @FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;

	public @FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	WebElement TextEditor;

	public @FindBy(xpath = "//*[@id=\"answer_form\"]/button")
	WebElement Runtab;
	
	public @FindBy(xpath="//*[@id=\"output\"]")
	WebElement Output;

	public DsAlgoDataStructurePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * public void Datagetstarted() { DSGetStarted.click(); }
	 * 
	 * public void Time() { TimeComplexity.click(); }
	 * 
	 * public void TryMethod() { Tryhere.click(); }
	 */

	public void enterValidCode() {

		/* getting codemirror element */
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

		/*
		 * getting the first line of code inside codemirror and clicking it to bring it
		 * in focus
		 */
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();

		/* sending keystokes to textarea once codemirror is in focus */
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print \"hello\"");
	}

	public void enterInvalidCode() {

		/* getting codemirror element */
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));

		/*
		 * getting the first line of code inside codemirror and clicking it to bring it
		 * in focus
		 */
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();

		/* sending keystokes to textarea once codemirror is in focus */
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("abcdefg");
	}

	/*
	 * public void RunMethod() { Runtab.click(); }
	 */
	public String getOutputValue() {
		 String message=Output.getText();
		return message;
	}
	/*
	 * public void acceptAlert() { Alert myalert=driver.switchTo().alert();
	 * System.out.println(myalert.getText()); myalert.accept(); }
	 */
	
	public boolean checkAlertPresentAndAccept() 
	{ 
	    try 
	    { 
	        Alert alert = driver.switchTo().alert(); 
	        alert.accept();
	        return true; 
	    }  
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   
	} 

}