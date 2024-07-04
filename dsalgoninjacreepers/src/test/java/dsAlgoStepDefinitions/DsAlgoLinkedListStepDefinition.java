package dsAlgoStepDefinitions;

import static org.testng.Assert.assertEquals;



import dsAlgoPages.DsAlgoLinkedListPage;
import dsAlgoPages.DsAlgoTryEditorPage;
import dsalgo_hooks.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoLinkedListStepDefinition {
	

	DsAlgoLinkedListPage dsAlgoLinkedListPage = new DsAlgoLinkedListPage(DriverFactory.getDriver());
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());

	@Given("Go to linkled list box ,click on get started")
	public void go_to_linkled_list_box_click_on_get_started() {
		dsAlgoLinkedListPage.Linkedlist_GetStarted.click();
	}

	@And("click on Introduction")
	public void click_on_introduction() {
		dsAlgoLinkedListPage.Linkedlist_Introduction.click();
	}

	@When("click on the tab try here")
	public void TryHere() {
		dsAlgoLinkedListPage.Tryhere.click();
	}

	@Then("Write and Run the code")
	public void WriteAndExecute() {
		dsAlgoTryEditorPage.enterValidCode();
		dsAlgoTryEditorPage.Runtab.click();
		String outPut = dsAlgoTryEditorPage.getOutputValue();
		assertEquals(outPut, "hello");
	}
	@Then("Run invalid code")
	public void run_invalid_code() {
		dsAlgoTryEditorPage.enterInvalidCode();
		dsAlgoTryEditorPage.Runtab.click();
		boolean isAlertPresent = dsAlgoTryEditorPage.checkAlertPresentAndAccept();
		assertEquals(isAlertPresent, true);
	}

	@And("click on creating linked list")
	public void click_on_creating_linked_list() {
		dsAlgoLinkedListPage.CreatingLinkedList.click();
	}

	@And("click on Types of linked list")
	public void click_on_types_of_linked_list() {
		dsAlgoLinkedListPage.TypesOfLinkedList.click();
	}

	@And("click on Implement")
	public void click_on_implement() {
		dsAlgoLinkedListPage.ImplementLinkedListInPython.click();
	}

	@And("click on Traversal")
	public void click_on_traversal() {
		dsAlgoLinkedListPage.Traversal.click();
	}

	@And("click on Insertion")
	public void click_on_insertion() {
		dsAlgoLinkedListPage.Insertion.click();
	}

	@And("click on Deletion")
	public void click_on_deletion() {
		dsAlgoLinkedListPage.Deletion.click();
	}
}