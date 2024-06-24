package dsAlgoStepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import dsalgo_hooks.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dsAlgoPages.DsAlgoStackPage;
import dsAlgoPages.DsAlgoTryEditorPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoStackStepDefinition {

	DsAlgoStackPage dsAlgoStackPage = new DsAlgoStackPage(DriverFactory.getDriver());
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());

	@Given("click stacks GetStarted")
	public void click_stacks_get_started() {
		dsAlgoStackPage.StackGetStarted.click();
	}

	@And("click operations in stack")
	public void click_operations_in_stack() {
		dsAlgoStackPage.Operationsinstack.click();
	}

	@When("click try here")
	public void click_try_here() {
		dsAlgoStackPage.Tryhere.click();
	}

	@Then("Write and execute code")
	public void write_and_execute_code() {
		dsAlgoTryEditorPage.enterValidCode();
		dsAlgoTryEditorPage.Runtab.click();
		String outPut = dsAlgoTryEditorPage.getOutputValue();
		assertEquals(outPut, "hello");
	}
	
	@Then("Try invalid code")
	public void try_invalid_code() {
		dsAlgoTryEditorPage.enterInvalidCode();
		dsAlgoTryEditorPage.Runtab.click();
		boolean isAlertPresent = dsAlgoTryEditorPage.checkAlertPresentAndAccept();
		assertEquals(isAlertPresent, true);
	}

	@And("click Implementation")
	public void click_implementation() {
		dsAlgoStackPage.Implementation.click();
	}

	@And("click Application")
	public void click_application() {
		dsAlgoStackPage.Application.click();
	}

}
