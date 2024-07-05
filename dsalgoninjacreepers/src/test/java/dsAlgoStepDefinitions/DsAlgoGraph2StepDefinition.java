package dsAlgoStepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

import dsAlgoPages.DsAlgoGraph2;
//import dsAlgoPages.DsAlgoTryEditorPage;
import dsUtilities.LoggerLoad;
import dsalgo_hooks.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsAlgoGraph2StepDefinition {

	DsAlgoGraph2 dsAlgoGraph2 = new DsAlgoGraph2(DriverFactory.getDriver());
	// DsAlgoTryEditorPage dsAlgoTryEditorPage = new
	// DsAlgoTryEditorPage(DriverFactory.getDriver());

	@Given("User is on Graph Module page")
	public void user_is_on_graph_module_page() throws InterruptedException {
		dsAlgoGraph2.maximize_window();
		DriverFactory.getDriver().findElement(By.xpath("//a[@href='graph']")).click();
		dsAlgoGraph2.click_graph();
		System.out.println("You are on Graph Page Module");

	}

	@When("User goes to Graph link down the page and  enters invalid code")
	public void user_goes_to_graph_link_down_the_page_and_enters_invalid_code() throws InterruptedException {
		dsAlgoGraph2.test_invalid_code();
		LoggerLoad.error("invalid python code");
		LoggerLoad.error("User gets pop-up message because of error ");

	}

	@Then("User gets pop-up error message")
	public void user_gets_pop_up_error_message() throws InterruptedException {
		String ans = dsAlgoGraph2.get_output();
		System.out.println("You get Error Pop_Up message" + ans);

	}

	@When("User goes to Graph link down the page and  enters valid code")
	public void user_goes_to_graph_link_down_the_page_and_enters_valid_code() throws InterruptedException {
		dsAlgoGraph2.maximize_window();
		dsAlgoGraph2.test_valid_code();
		LoggerLoad.error("valid python code");
		System.out.println("You entered valid code ");

	}

	@Then("User is able to get the result")
	public void user_is_able_to_get_the_result() throws InterruptedException {
		String output = dsAlgoGraph2.get_output();
		System.out.println("You are able to print the output  : " + output);
		LoggerLoad.error("valid python code");
		LoggerLoad.error("User is able to run the Python Code successfully ");

	}

	@Given("User is on Graph Representations Module page")
	public void user_is_on_graph_representations_module_page() throws InterruptedException {
		dsAlgoGraph2.maximize_window();
		DriverFactory.getDriver().findElement(By.xpath("//a[@href='graph']")).click();
		dsAlgoGraph2.click_graph_representation();
		System.out.println("You are on Graph Representations Module");

	}

	@When("User goes to Graph Representations link down the page and enters invalid code")
	public void user_goes_to_graph_representations_link_down_the_page_and_enters_invalid_code()
			throws InterruptedException {
		dsAlgoGraph2.maximize_window();
		dsAlgoGraph2.test_invalid_code();
		LoggerLoad.error("invalid python code");
		LoggerLoad.error("User gets pop-up message because of error ");

	}

}
