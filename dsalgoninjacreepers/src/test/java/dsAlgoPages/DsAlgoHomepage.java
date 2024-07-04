package dsAlgoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import dsUtilities.PropertyReader;
import dsalgo_hooks.DriverFactory;

public class DsAlgoHomepage {
	
	public  WebDriver driver = DriverFactory.getDriver();
	String url = PropertyReader.getProperty("appURL");

	private @FindBy(xpath = "//a[@href='/home']")
	WebElement getstartedBtn;

	private @FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alert_msg;

	private @FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getstart_datastructures;
	
	private @FindBy(xpath = "//*[@href='array")
	WebElement getstart_array;
	
	private @FindBy(xpath = "//a[@href='linked-list']")
	WebElement getstart_linkedlist;
	
	private @FindBy(xpath = "//a[@href='stack']")
	WebElement getstart_stack;
	
	private @FindBy(xpath = "//a[@href='queue']")
	WebElement getstart_queue;
	
	private @FindBy(xpath = "//a[@href='tree']")
	WebElement getstart_tree;
	
	private @FindBy(xpath = "//a[@href='graph']")
	WebElement getstart_graph;

	private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div")
	WebElement dropdown;
	private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div")
	WebElement dropdown_array;
	private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[1]")
	WebElement dropdown_linkedlist;
	private @FindBy(xpath = "//*[@id='navbarCollapse']//a[3]")
	WebElement dropdown_stack;
	private @FindBy(xpath = "//*[@id='navbarCollapse']//a[4]")
	WebElement dropdown_queue;
	private @FindBy(xpath = "//*[@id='navbarCollapse']//a[5]")
	WebElement dropdown_tree;
	private @FindBy(xpath = "//*[@id='navbarCollapse']//a[6]")
	WebElement dropdown_graph;
	
	private @FindBy(xpath = "//a[@href='/login']")
	WebElement signin;
	
	private @FindBy(xpath = "//a[@href='/register']")
	WebElement register;
	
	public 	DsAlgoHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void dsalgopage() {
		driver.get(url);
	}

	public void getStartedButton() {
		driver.findElement(By.xpath("//a[@href='/home']")).click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String alert() {
		String msg = alert_msg.getText();
		return msg;
	}

	public void getStarted_home(String string) {

		switch (string) {
		case "Datastructures":

			getstart_datastructures.click();
			break;
		case "Arrays":
			getstart_array.click();
			break;
		case "Linkedlist":
			getstart_linkedlist.click();
			break;
		case "Stack":
			getstart_stack.click();
			break;
		case "Queue":
			getstart_queue.click();
			break;
		case "Tree":

			getstart_tree.click();
			break;
		case "Graph":

			getstart_graph.click();
			break;
		}
	}

	public void dropdown(String string) {

		dropdown.click();
		switch (string) {
		case "Arrays":

			dropdown_array.click();
			break;
		case "Linkedlist":

			dropdown_linkedlist.click();
			break;
		case "Stack":

			dropdown_stack.click();
			break;
		case "Queue":

			dropdown_queue.click();
			break;
		case "Tree":

			dropdown_tree.click();
			break;
		case "Graph":

			dropdown_graph.click();
			break;
		}

	}

	public void clickOnSignIn() {
		signin.click();
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	
	public void clickOnRegister() {
		register.click();
	}

	public String register_page() {
		String title = driver.getTitle();
		return title;
	}

}