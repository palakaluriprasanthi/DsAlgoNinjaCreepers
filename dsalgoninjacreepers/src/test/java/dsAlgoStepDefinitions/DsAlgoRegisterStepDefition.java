package dsAlgoStepDefinitions;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import dsAlgoPages.DsAlgoRegisterPage;
import dsUtilities.LoggerLoad;
import dsalgo_hooks.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoRegisterStepDefition {
 DsAlgoRegisterPage register = new DsAlgoRegisterPage(DriverFactory.getDriver());
 //public static registerurl;
 static String expErrormsg;
	
	// @TS_register_02
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() throws InterruptedException {
		
		LoggerLoad.info("The user opens Register Page");
		
		register.navigatetoRegisterPage();
		//Thread.sleep(200);
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) throws InterruptedException {
		LoggerLoad.info("The user do not enter any values");
		register.clickOnRegisterButton();
		//Thread.sleep(200);
	}

	@Then("It should display an error message {string} below Username textbox")
	public void it_should_display_an_error_message_below_username_textbox(String string) {
		LoggerLoad.info("Error message is displayed " + register.getEmptyfieldErrormsgUser()
		+ " an error below Username textbox");
		//assertTrue(register.EmptyRequiredUser(), "Username Field is Empty - required attribute is validated");
		//assertEquals(register.getEmptyfieldErrormsgUser(), expErrormsg);
	}

	@When("The user clicks {string} button after entering username with other fields empty")
	public void the_user_clicks_button_after_entering_username_with_other_fields_empty(String string, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
LoggerLoad.info("The user enter valid username with other fields empty");
		
		register.entervalidUsername(dataTable);
		register.clickOnRegisterButton();
		//Thread.sleep(2000);
	}

	@Then("It should display an error message {string} below Password textbox")
	public void it_should_display_an_error_message_below_password_textbox(String string) {
		LoggerLoad.info("Error message is displayed " + register.getEmptyfieldErrormsgCofmPswd()
		+ " an error below Password textbox");
	//	assertTrue(register.EmptyRequiredPswd(), "Username Field is Empty - required attribute is validated");
		//assertEquals(register.getEmptyfieldErrormsgPswd(), expErrormsg);
	}

	@When("The user clicks {string} button after entering {string} and {string} with Password Confirmation field empty")
	public void the_user_clicks_button_after_entering_and_with_password_confirmation_field_empty(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.clickOnRegisterButton();
	}

	@Then("It should display an error message {string} below Password Confirmation textbox")
	public void it_should_display_an_error_message_below_password_confirmation_textbox(String string) {
		LoggerLoad.info("Error message is displayed " + register.getEmptyfieldErrormsgCofmPswd()
		+ " an error below Username textbox");
		//assertTrue(register.getEmptyRequiredCofmPswd(), "Username Field is Empty - required attribute is validated");
		//assertEquals(register.getEmptyfieldErrormsgCofmPswd(), expErrormsg);
	}

	@Given("The user is on Register Page")
	public void the_user_is_on_register_page() {
		register.navigatetoRegisterPage();
	}

	@When("The user clicks {string} button after entering {string} and {string} and {string}")
	public void the_user_clicks_button_after_entering_and_and(String string, String string2, String string3, String string4, io.cucumber.datatable.DataTable dataTable) {
		register.entervalidUsername(dataTable);
		register.entervalidPassword(dataTable);
		register.entervalidConfmPassword(dataTable);
	}

	@Then("It should display success message")
	public void it_should_display_success_message() {
	    
	}




}
