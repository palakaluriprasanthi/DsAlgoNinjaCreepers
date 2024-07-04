package dsAlgoPages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoTryEditorPage {
	public WebDriver driver;

	public @FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]") 
	WebElement TextEditor;

	public @FindBy(xpath = "//*[@id=\"answer_form\"]/button") 
	WebElement Runtab;

	public @FindBy(xpath="//*[@id=\"output\"]") 
	WebElement Output;

	public DsAlgoTryEditorPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterValidCode() {
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print \"hello\"");
	}

	public void enterInvalidCode() {
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("hello");
	}

	public String getOutputValue() {
		 String message=Output.getText();
		return message;
	}

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
