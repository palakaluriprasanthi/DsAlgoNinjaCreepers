package dsAlgoStepDefinitions;
import static org.testng.Assert.assertEquals;

import dsAlgoPages.DsAlgoDataStructurePage;
import dsAlgoPages.DsAlgoTryEditorPage;
import dsalgo_hooks.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoDataStructuresStepDefinition {

	DsAlgoDataStructurePage dsAlgoDataStructurePage = new DsAlgoDataStructurePage(DriverFactory.getDriver());  
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());

	@Given("Go to DataStructure ,click on get started")
	public void go_to_data_structure_click_on_get_started() {
		dsAlgoDataStructurePage.DSGetStarted.click();
	}

	@And("click on TimeComplexity")
	public void click_on_time_complexity() {
		dsAlgoDataStructurePage.TimeComplexity.click();
	}

	@When("click try here tab")
	public void click_try_here() {
		dsAlgoDataStructurePage.Tryhere.click();
	}

	@Then("Execute")
	public void execute() {
		dsAlgoTryEditorPage.enterValidCode();
		dsAlgoTryEditorPage.Runtab.click();
		String outPut = dsAlgoTryEditorPage.getOutputValue();
		assertEquals(outPut, "hello");
	}

	@Then("Execute invalid code")
	public void execute_invalid_code() {
		dsAlgoTryEditorPage.enterInvalidCode();
		dsAlgoTryEditorPage.Runtab.click();
		boolean isAlertPresent = dsAlgoTryEditorPage.checkAlertPresentAndAccept();
		assertEquals(isAlertPresent, true);

	}

}
