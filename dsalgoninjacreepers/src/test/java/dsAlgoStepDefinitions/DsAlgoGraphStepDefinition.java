package dsAlgoStepDefinitions;
import dsalgo_hooks.DriverFactory;


import static org.testng.Assert.assertEquals;

import dsAlgoPages.DsAlgoGraphPage;
import dsAlgoPages.DsAlgoTryEditorPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoGraphStepDefinition {
	
	DsAlgoGraphPage dsAlgoGraphPage = new DsAlgoGraphPage(DriverFactory.getDriver());
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());

	@Given("Go to Graph,click on get started")
	public void go_to_graph_click_on_get_started() {
		dsAlgoGraphPage.GraphGetstarted.click();
	}
	@And("click on Graph")
	public void click_on_graph() {
		dsAlgoGraphPage.Graphlink();
	}
	@When("click tryhere")
	public void click_tryhere() {
		dsAlgoGraphPage.Tryhere.click();
	}

	@Then("Execute the valid code")
	public void execute_the_valid_code() {
		dsAlgoTryEditorPage.enterValidCode();
		dsAlgoTryEditorPage.Runtab.click();
		String outPut = dsAlgoTryEditorPage.getOutputValue();
		assertEquals(outPut, "hello");
	}

	@Then("Execute the invalid code")
	public void execute_the_invalid_code() {
		dsAlgoTryEditorPage.enterInvalidCode();
		dsAlgoTryEditorPage.Runtab.click();
		boolean isAlertPresent = dsAlgoTryEditorPage.checkAlertPresentAndAccept();
		assertEquals(isAlertPresent, true);
	}

	@And ("click on Graph Representation")
	public void click_on_graph_representation() {
		dsAlgoGraphPage.GraphRepresentation.click();
	}

}

