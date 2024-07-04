package dsAlgoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class DsAlgoArrayPage {
	public WebDriver driver;
	 

	public @FindBy(xpath="//*[@href='array']") WebElement ArrayGetStarted;

	public @FindBy(linkText = "Arrays in Python") WebElement ArrayInPython;

	public @FindBy(linkText = "Arrays Using List") WebElement ArrayUsingList;

	public @FindBy(linkText = "Basic Operations in Lists") WebElement BasicOperationInList;
	
	public @FindBy(linkText = "Applications of Array") WebElement ApplicationsOfArray;

	public @FindBy(xpath = "/html/body/div[2]/div/div[2]/a") WebElement Tryhere;

//	private @FindBy(xpath="//div[@class='CodeMirror-scroll']") WebElement TextEditor;
	public @FindBy(xpath = "//*[@id=\"editor\"]") WebElement TextEditor;

	// private @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]") WebElement
	// TextEditor;

	public @FindBy(xpath = "//*[@id=\"answer_form\"]/button") WebElement Runtab;
	
	public @FindBy(xpath="//*[@id=\"output\"]") WebElement Output;



public DsAlgoArrayPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}




public void arraygetstarted() {
	driver.navigate().refresh();
	ArrayGetStarted.click();
}

public void arrayinpython() {
	ArrayInPython.click();
}
public void arrayusinglist() {
	ArrayUsingList.click();
}
public void basicoperation() {
   BasicOperationInList.click();
}
public void application() {
   ApplicationsOfArray.click();
}
public void TryMethod() {
	Tryhere.click();
}

public void TextMethod() {
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
}}