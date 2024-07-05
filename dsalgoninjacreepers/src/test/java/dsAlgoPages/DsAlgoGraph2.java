package dsAlgoPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoGraph2 {

	WebDriver driver;

	private @FindBy(xpath = "/html/body/div[2]/ul[2]/a") WebElement Graphlink;
	private @FindBy(xpath = "/html/body/div[2]/ul[3]/a") WebElement GraphRepresentationlink;
	private @FindBy(xpath = "/html/body/div[2]/div/div[2]/a") WebElement TryHere;
	private @FindBy(xpath = "//*[@id=\"answer_form\"]/button") WebElement Run;
	private @FindBy(xpath = "//*[@id=\"output\"]") WebElement Output;
	private @FindBy(xpath = "\"//pre[@class='CodeMirror-line']/span/span\"") WebElement TextBox;
	private @FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]") WebElement TextEditor;

	public DsAlgoGraph2(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login() {
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"id_username\"]")).sendKeys("pam2024");
		driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("pwd@2024");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/input[4]")).click();

	}

	public void click_graph() {
		Graphlink.click();
	}

	public void click_graph_representation() {
		GraphRepresentationlink.click();
	}

	public void maximize_window() {
		driver.manage().window().maximize();

	}

	public String get_output() {

		return Output.getText();
	}

	public void test_valid_code() throws InterruptedException {
		TryHere.click();
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print \"hello\"");
		Run.click();
		System.out.print(Output.getText());
	}

	public void test_invalid_code() throws InterruptedException

	{
		TryHere.click();
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("abcdef");
		Run.click();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
	}

}