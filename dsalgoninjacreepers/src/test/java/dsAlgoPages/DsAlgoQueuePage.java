package dsAlgoPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoQueuePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//h4[text()='Queue']") 
	public WebElement QueueHeader;
	
	@FindBy(linkText="Implementation of Queue in Python") 
	public WebElement ImplementationofQueueInPython;
	
	@FindBy(linkText="Implementation using collections.deque") 
	public WebElement ImplementationCollectionDeque;
	
	@FindBy(linkText="Implementation using array") 
	public WebElement ImplementationUsingArray;
	
	@FindBy(linkText="Queue Operations") 
	public WebElement QueueOperations;
	
	@FindBy(xpath="//p[text()='Implementation of Queue in Python']") 
	public WebElement ImplementationofQueueInPythonHeader;
	
	@FindBy(xpath="//p[text()='Implementation using collections.deque']") 
	public WebElement ImplementationCollectionDequeHeader;
	
	@FindBy(xpath="//p[text()='Implementation using array']") 
	public WebElement ImplementationUsingArrayHeader;
	
	@FindBy(xpath="//p[text()='Queue Operations']") 
	public WebElement QueueOperationsHeader;
	
	@FindBy(xpath="//a[@href='/tryEditor']") 
	public WebElement TryHere;
	
	public DsAlgoQueuePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
