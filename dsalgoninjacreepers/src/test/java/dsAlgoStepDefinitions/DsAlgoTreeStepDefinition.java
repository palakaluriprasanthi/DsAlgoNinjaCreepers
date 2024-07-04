package dsAlgoStepDefinitions;


import org.openqa.selenium.By;

import dsAlgoPages.DsAlgoTreePage;
import dsAlgoPages.DsAlgoTryEditorPage;
import dsalgo_hooks.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsAlgoTreeStepDefinition {

	DsAlgoTreePage dsAlgoTreePage = new DsAlgoTreePage(DriverFactory.getDriver());
	DsAlgoTryEditorPage dsAlgoTryEditorPage = new DsAlgoTryEditorPage(DriverFactory.getDriver());

	@When("click on get started of Tree")
	public void click_on_get_started_of_tree() {
		DriverFactory.getDriver().findElement(By.xpath("//a[@href='tree']")).click(); 
	}

	@Then("user should navigate to Tree implementation page")
	public void user_should_navigate_to_tree_implementation_page() {
		dsAlgoTreePage.TreeHeader.isDisplayed();
	}

	@When("click on the Overview of Tree")
	public void click_on_the_overview_of_tree() {
		dsAlgoTreePage.OverviewOfTrees.click();
	}

	@Then("User should navigate to Overview of Tree page")
	public void user_should_navigate_to_overview_of_tree_page() {
		 dsAlgoTreePage.OverviewOfTreesHeader.isDisplayed();
	}

	@When("click on the Terminologies")
	public void click_on_the_terminologies() {
		dsAlgoTreePage.Terminologies.click();
	}

	@Then("User should navigate to Terminologies page")
	public void user_should_navigate_to_terminologies_page() {
		dsAlgoTreePage.TerminologiesHeader.isDisplayed();
	}

	@When("click on the Types of Trees")
	public void click_on_the_types_of_trees() {
		dsAlgoTreePage.TypesOfTrees.click();
	}

	@Then("User should navigate to Types of Trees page")
	public void user_should_navigate_to_types_of_trees_page() {
		dsAlgoTreePage.TypesOfTreesHeader.isDisplayed();
	}

	@When("click on the Tree Traversals")
	public void click_on_the_tree_traversals() {
		dsAlgoTreePage.TreeTraversals.click();
	}

	@Then("User should navigate to Tree Traversals page")
	public void user_should_navigate_to_tree_traversals_page() {
		 dsAlgoTreePage.TreeTraversalsHeader.isDisplayed();
	}

	@When("click on the Traversals-Illustration")
	public void click_on_the_traversals_illustration() {
		dsAlgoTreePage.TraversalsIllustration.click();
	}

	@Then("User should navigate to Traversals-Illustration page")
	public void user_should_navigate_to_traversals_illustration_page() {
		dsAlgoTreePage.TraversalsIllustrationHeader.isDisplayed();
	}

	@When("click on the Binary Trees")
	public void click_on_the_binary_trees() {
		dsAlgoTreePage.BinaryTrees.click();
	}

	@Then("User should navigate to Binary Trees page")
	public void user_should_navigate_to_binary_trees_page() {
		dsAlgoTreePage.BinaryTreesHeader.isDisplayed();
	}

	@When("click on the Types of Binary Trees")
	public void click_on_the_types_of_binary_trees() {
		dsAlgoTreePage.TypesOfBinaryTrees.click();
	}

	@Then("User should navigate to Types of Binary Trees page")
	public void user_should_navigate_to_types_of_binary_trees_page() {
		dsAlgoTreePage.TypesOfBinaryTreesHeader.isDisplayed();
	}

	@When("click on the Binary Tree Traversals")
	public void click_on_the_binary_tree_traversals() {
		dsAlgoTreePage.BinaryTreeTraversals.click();
	}

	@Then("User should navigate to Binary Tree Traversals page")
	public void user_should_navigate_to_binary_tree_traversals_page() {
		dsAlgoTreePage.BinaryTreeTraversalsHeader.isDisplayed();
	}

	@When("click on the Binary Search Trees")
	public void click_on_the_binary_search_trees() {
		dsAlgoTreePage.BinarySearchTrees.click();
	}

	@Then("User should navigate to Binary Search Trees page")
	public void user_should_navigate_to_binary_search_trees_page() {
		dsAlgoTreePage.BinarySearchTrees.isDisplayed();
	}

	@When("click on the Implementation Of BST")
	public void click_on_the_implementation_of_bst() {
		dsAlgoTreePage.ImplementationOfBST.click();
	}

	@Then("User should navigate to Implementation Of BST page")
	public void user_should_navigate_to_implementation_of_bst_page() {
		dsAlgoTreePage.ImplementationOfBSTHeader.isDisplayed();
	 }
	 @When("User enters the invalid code and click on run button")
	 public void invalid_code() {
		 dsAlgoTryEditorPage.enterValidCode();
			dsAlgoTryEditorPage.Runtab.click();
	 }
}

