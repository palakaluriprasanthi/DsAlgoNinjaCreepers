package dsAlgoPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsUtilities.ConfigReader;
import dsUtilities.PropertyReader;
import dsalgo_hooks.DriverFactory;
import dsalgo_hooks.LoginDriverManager;

public class DsAlgoHomepage {
	
	public  WebDriver driver = DriverFactory.getDriver();
	String url = ConfigReader.getApplicationUrl();
	//String DsAlgoHomepage =ConfigReader.getHomePage();

	//GetStarted Page
		private @FindBy(xpath = "/html/body/div[1]/div/div/a/button") WebElement getstartedBtn;

		// Alert Message
		private @FindBy(xpath = "/html/body/div[2]") WebElement alert_msg;

		// Home Page..GetStartedBtn
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/a")
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement getstart_datastructures;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/a[1]")
		WebElement getstart_array;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]")
		WebElement getstart_linkedlist;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]")
		WebElement getstart_stack;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]")
		WebElement getstart_queue;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]")
		WebElement getstart_tree;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]")
		WebElement getstart_graph;

		// DropDown options

		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/a")
		WebElement dropdown;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div[1]")
		WebElement dropdown_array;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]")
		WebElement dropdown_linkedlist;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[3]")
		WebElement dropdown_stack;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]")
		WebElement dropdown_queue;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[5]")
		WebElement dropdown_tree;
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]")
		WebElement dropdown_graph;

		// sigin
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
		WebElement signin;
		// register
		private @FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
		WebElement register;
		
	public 	DsAlgoHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void dsalgopage() {
		driver.get(url);
	}

	public void getStartedButton() {
		//driver.findElement(By.xpath("//a[@href='/home']")).click();
		getstartedBtn.click();
		PageFactory.initElements(driver, this);

	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public String alert() {
		String msg = alert_msg.getText();
		return msg;
	}
	public void homepage() {
		PageFactory.initElements(driver, this);
	}

	public void getStarted_home(String string) throws InterruptedException {
		Thread.sleep(2000);

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


