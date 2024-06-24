package dsAlgoStepDefinitions;

import org.openqa.selenium.By;
import dsalgo_hooks.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsAlgoLoginStepDefinition extends DriverFactory{
	
	@Given("user clicks on GetStarted")
	public void user_clicks_on_get_started() {
	    getDriver().findElement(By.xpath("//button[text()='Get Started']")).click();
	}

	@Given("clicks on Signin")
	public void clicks_on_signin() {
	    getDriver().findElement(By.linkText("Sign in")).click();
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		 getDriver().findElement(By.id("id_username")).sendKeys("pam2024");
		 getDriver().findElement(By.id("id_password")).sendKeys("pwd@2024");
	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println("4 nd step");
		getDriver().findElement(By.linkText("Get Started")).click();
		getDriver().findElement(By.linkText("Time Complexity")).click();
		getDriver().findElement(By.linkText("Try here>>>")).click();
		getDriver().findElement(By.xpath("//textarea[@tabindex='0']")).sendKeys("hello");
		Thread.sleep(5000);
		getDriver().navigate().back();
	}


	/*
	 * @Given("Go to linkled list box ,click on get started") public void
	 * go_to_linkled_list_box_click_on_get_started() {
	 * 
	 * obj.LinkedListIntro(); }
	 * 
	 * @And("click on Introduction") public void click_on_introduction() {
	 * obj.IntroductionMethod();
	 * 
	 * }
	 * 
	 * @When("click on the tab try here") public void TryHere() { obj.TryMethod(); }
	 * 
	 * @Then("Write and Run the code") public void WriteAndExecute() {
	 * obj.TextMethod(); obj.RunMethod(); }
	 * 
	 * @Given("click on creating linked list") public void
	 * click_on_creating_linked_list() { obj.CreatingLinkedlistMethod();
	 * obj.TryMethod(); obj.TextMethod(); obj.RunMethod(); }
	 * 
	 * 
	 * 
	 * 
	 * @Given("click on Types of linked list") public void
	 * click_on_types_of_linked_list() { obj.TypesMethod(); obj.TryMethod();
	 * obj.TextMethod(); obj.RunMethod(); }
	 * 
	 * @And("click on Implement") public void click_on_implement() {
	 * obj.ImplementLinkedlistMethod(); obj.TryMethod(); obj.TextMethod();
	 * obj.RunMethod(); }
	 * 
	 * @Given("click on Traversal") public void click_on_traversal() {
	 * obj.TraverseMethod(); obj.TryMethod(); obj.TextMethod(); obj.RunMethod(); }
	 * 
	 * @Given("click on Insertion") public void click_on_insertion() {
	 * obj.InsertMethod(); obj.TryMethod(); obj.TextMethod(); obj.RunMethod(); }
	 * 
	 * @Given("click on Deletion") public void click_on_deletion() {
	 * obj.DeleteMethod(); obj.TryMethod(); obj.TextMethod(); obj.RunMethod(); }
	 */


}
