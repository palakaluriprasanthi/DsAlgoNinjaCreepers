package dsAlgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoLinkedListPage {

	public WebDriver driver;

	public @FindBy(xpath="/html/body/div[3]/div[3]/div/div/a")
	WebElement Linkedlist_GetStarted;

	public @FindBy(xpath="//a[@href='introduction']")
	WebElement Linkedlist_Introduction;

	public @FindBy(linkText = "Creating Linked LIst")
	WebElement CreatingLinkedList;

	public @FindBy(linkText = "Types of Linked List")
	WebElement TypesOfLinkedList;

	public @FindBy(linkText = "Implement Linked List in Python")
	WebElement ImplementLinkedListInPython;

	public @FindBy(linkText = "Traversal")
	WebElement Traversal;

	public @FindBy(linkText = "Insertion")
	WebElement Insertion;

	public @FindBy(linkText = "Deletion")
	WebElement Deletion;

	public @FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;

	public DsAlgoLinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
