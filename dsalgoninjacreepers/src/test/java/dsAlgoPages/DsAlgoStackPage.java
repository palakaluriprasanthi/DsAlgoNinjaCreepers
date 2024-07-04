package dsAlgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoStackPage {

	public WebDriver driver;

	public @FindBy(xpath="//a[@href='stack']")
	WebElement StackGetStarted;

	public @FindBy(xpath="//a[@href='operations-in-stack']")
	WebElement Operationsinstack;

	public @FindBy(linkText = "Implementation")
	WebElement Implementation;

	public @FindBy(linkText = "Applications")
	WebElement Application;

	public @FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;

	public DsAlgoStackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}