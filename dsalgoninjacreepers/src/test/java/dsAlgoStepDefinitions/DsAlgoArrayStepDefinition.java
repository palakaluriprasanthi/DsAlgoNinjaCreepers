package dsAlgoStepDefinitions;
import static org.testng.Assert.assertEquals;


import dsAlgoPages.DsAlgoArrayPage;
import dsAlgoPages.DsAlgoTryEditorPage;
import dsalgo_hooks.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoArrayStepDefinition {

	DsAlgoArrayPage dsAlgoArrayPage = new DsAlgoArrayPage(DriverFactory.getDriver());  
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());


	@Given("User clicks on Arrays Get Started")
	public void user_clicks_on_arrays_get_started() {
		
		dsAlgoArrayPage.arraygetstarted();
	}

	@And("User clicks on Arrays in Python")
	public void user_clicks_on_arrays_in_python() {
		
		dsAlgoArrayPage.arrayinpython();
	}

	@When("Press tab try here")
	public void click_try_here() {
		dsAlgoArrayPage.TryMethod();
	}
	

	@Then("Enter the  valid code and run")
	public void execute() {
		dsAlgoTryEditorPage.enterValidCode();
		dsAlgoTryEditorPage.Runtab.click();
		String outPut = dsAlgoTryEditorPage.getOutputValue();
		assertEquals(outPut, "hello");
	}

	@And("User clicks on Arrays using list")
	public void user_clicks_on_arrays_using_list() {
		dsAlgoArrayPage.arrayusinglist();
	}

	@And("User clicks on basic operation in list")
	public void user_clicks_on_basic_operation_in_list() {
		dsAlgoArrayPage.basicoperation();
	}

	@And("User clicks on Applications of array")
	public void user_clicks_on_applications_of_array() {
		dsAlgoArrayPage.application();
	}

	@Then("Enter the invalid code and run")
	public void execute_invalid_code() {
		dsAlgoTryEditorPage.enterInvalidCode();
		dsAlgoTryEditorPage.Runtab.click();
		boolean isAlertPresent = dsAlgoTryEditorPage.checkAlertPresentAndAccept();
		assertEquals(isAlertPresent, true);


	}

}


