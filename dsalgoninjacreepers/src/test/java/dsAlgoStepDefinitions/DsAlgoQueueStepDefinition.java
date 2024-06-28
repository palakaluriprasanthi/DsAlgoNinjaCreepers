package dsAlgoStepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import com.aventstack.extentreports.util.Assert;

import dsAlgoPages.DsAlgoQueuePage;
import dsAlgoPages.DsAlgoTryEditorPage;
import dsAlgoPages.DsAlgoLoginPage;
import dsalgo_hooks.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsAlgoQueueStepDefinition {
	
	DsAlgoQueuePage dsAlgoQueuePage = new DsAlgoQueuePage(DriverFactory.getDriver());
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());
	DsAlgoLoginPage loginPage = new DsAlgoLoginPage(DriverFactory.getDriver());
	
	@Given("User is Logged into DSAlgo Portal")
	public void User_is_Logged_into_DSAlgo_Portal() {
		loginPage.getStarted.click();
		loginPage.signIn.click();
		//loginPage.user.sendKeys("pam2024");
		//loginPage.pwd.sendKeys("pwd@2024");
		loginPage.login_button();
	}
	
	@When("click on get started of Queue")
	public void click_on_get_started_of_queue() {
		DriverFactory.getDriver().findElement(By.xpath("//a[@href='queue']")).click(); 
	}

	@Then("user should navigate to Queue implementation page")
	public void user_should_navigate_to_queue_implementation_page() {
		String Header = dsAlgoQueuePage.QueueHeader.getText();
	    assertEquals(Header, "Queue");
	}

	@When("click on the Implementation of Queue in Python")
	public void click_on_the_implementation_of_queue_in_python(){
		dsAlgoQueuePage.ImplementationofQueueInPython.click();
	}

	@Then("User should navigate to Implementation of Queue in Python page")
	public void user_should_navigate_to_implementation_of_queue_in_python_page(){
		 dsAlgoQueuePage.ImplementationofQueueInPythonHeader.isDisplayed();
	}

	@When("Click on Try here")
	public void click_on_try_here() {
	  dsAlgoQueuePage.TryHere.click();
	  
	}

	@Then("User should navigate to Try Editor page")
	public void user_should_navigate_to_try_editor_page() {
		dsAlgoTryEditorPage.TextEditor.isDisplayed();
	}

	@When("User enters the code and click on run button")
	public void user_enters_the_code_and_click_on_run_button() {
		dsAlgoTryEditorPage.enterInvalidCode();
		dsAlgoTryEditorPage.Runtab.click();
	}

	@Then("verify the output")
	public void verify_the_output() {
		boolean isAlertPresent = dsAlgoTryEditorPage.checkAlertPresentAndAccept();
		assertEquals(isAlertPresent, true);
	}

	@When("click on the Implementation of Collection deque")
	public void click_on_the_implementation_of_collection_deque() {
	    dsAlgoQueuePage.ImplementationCollectionDeque.click();
	}

	@Then("User should navigate to Implementation of Collection deque page")
	public void user_should_navigate_to_implementation_of_collection_deque_page() {
		String Header = dsAlgoQueuePage.ImplementationCollectionDequeHeader.getText();
		assertEquals(Header, "Implementation using collections.deque");
	}

	@When("click on the Implementation using array")
	public void click_on_the_implementation_using_array() {
		dsAlgoQueuePage.ImplementationUsingArray.click();
	}

	@Then("User should navigate to Implementation Using array page")
	public void user_should_navigate_to_implementation_using_array_page() {
		String Header = dsAlgoQueuePage.ImplementationUsingArrayHeader.getText();
		assertEquals(Header, "Implementation using array");
	}

	@When("click on the Queue Operations")
	public void click_on_the_queue_operations() {
		dsAlgoQueuePage.QueueOperations.click();
	}

	@Then("User should navigate to Queue Operations")
	public void user_should_navigate_to_queue_operations() {
		String Header = dsAlgoQueuePage.QueueOperationsHeader.getText();
		assertEquals(Header, "Queue Operations");
	}

}
