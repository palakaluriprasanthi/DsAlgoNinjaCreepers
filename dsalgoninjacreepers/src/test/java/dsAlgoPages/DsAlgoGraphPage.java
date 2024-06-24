package dsAlgoPages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoGraphPage {
	
	public WebDriver driver;
	
	public @FindBy(xpath="//a[@href='graph']")
	WebElement GraphGetstarted;
	
	public @FindBy(linkText="Graph")
	WebElement Graph;
	
	public @FindBy(linkText="Graph Representations")
	WebElement GraphRepresentation;

	public @FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;

	public 	DsAlgoGraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Graph_Getstarted() {
		GraphGetstarted.click();
	}
	public void Graphlink() {
		Graph.click();
	}
	public void Graph_Represent() {
		GraphRepresentation.click();
	}
	public void TryMethod() {
		Tryhere.click();
	}

}



