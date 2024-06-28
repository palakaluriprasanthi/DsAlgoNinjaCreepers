package dsAlgoStepDefinitions;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import dsAlgoPages.DsAlgoArrayPage;
import dsUtilities.LoaderLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DsAlgoArrayStepDefinition {
	
DsAlgoArrayPage arraypage = new DsAlgoArrayPage();
//String Excelpath = ConfigReader.getexcelfilepath();
String Excelpath = System.getProperty("user.dir")+"/src/test/resources/TestData/Demo.xlsx";
static String expectedMsg;

@Given("The user is on Signin page of DS Algo portal")
public void the_user_is_on_signin_page_of_ds_algo_portal() {
    
}
@When("The user is logged in with valid username {string} and password {string}")
public void the_user_is_logged_in_with_valid_username_and_password(String string, String string2) {
}

@Then("The user is on {string}")
public void the_user_is_on(String string) {
    
}

@Given("The user is on the {string} after logged in")
public void the_user_is_on_the_after_logged_in(String pagename) {
	arraypage.navigateTo(pagename);
    
}

@When("The user select Array item from the drop down menu")
public void the_user_select_array_item_from_the_drop_down_menu()throws TimeoutException, InterruptedException {
	LoaderLoad.info("The user select Array item from the drop down menu");
	arraypage.dropdown_arrayClick();
	Thread.sleep(2000);
}

@Then("The user be directed to {string} Data Structure Page")
public void the_user_be_directed_to_data_structure_page(String  pagename)throws TimeoutException {
	
	LoaderLoad.info("User redirected to " + pagename + " Page ");

	String Title = arraypage.ArrayPageTitle();
	LoaderLoad.info("Title of current page is : " + Title);

	//assertEquals(Title, pagename, "Title do not match");
//Thread.sleep(200);
}

@When("The user clicks Arrays in Python link")
public void the_user_clicks_arrays_in_python_link() {
    
	
	arraypage.ClickOnArraysInPython();
}

@Then("The user should be redirected to {string} page")
public void the_user_should_be_redirected_to_page(String pagename) {
	
	LoaderLoad.info("User redirected to " + pagename + " Page ");
	String Title = arraypage.ArrayPageTitle();
	LoaderLoad.info("Title of current page is : " + Title);
	//assertEquals(Title, pagename, "Title do not match");
}
// @TS_array_04
@When("The user clicks {string} button on {string} page")
public void the_user_clicks_button_on_page(String btname, String destname) throws InvalidFormatException, IOException {
	
 arraypage.clickOnTryhereLink(btname,destname);

}

@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	
	
	LoaderLoad.info("User redirected to a page having an tryEditor with a Run button to test");
	String Title = arraypage.ArrayPageTitle();
	LoaderLoad.info("Title of current page is : " + Title);
	assertEquals(Title, "Assessment", "Title do not match");
   
}
// @TS_array_05

@Given("The user is in a page having an tryEditor with a Run button to test")
public void the_user_is_in_a_page_having_an_try_editor_with_a_run_button_to_test() {
   
	LoaderLoad.info("The user is in a page having an tryEditor with a Run button to test");
	arraypage.navigateTotryEditor();
	String Title = arraypage.ArrayPageTitle();
	LoaderLoad.info("Title of current page is : " + Title);
	

	
}

@When("The user enter valid python code in tryEditor from sheet {string} and {int}")
public void the_user_enter_valid_python_code_in_try_editor_from_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	
	LoaderLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetname
			+ " and row number : " + rownumber);
	arraypage.enterPythonCode(sheetname, rownumber);
	//expectedMsg = arraypage.getExpectedResult(sheetname, rownumber);

}

@When("The user clicks on run button")
public void the_user_clicks_on_run_button() {
    arraypage.clickOnRunButton();
}

@Then("The user should be presented with Run result")
public void the_user_should_be_presented_with_run_result() {
	String actualMsg = arraypage.getActualResult();
	LoaderLoad.info("Actual result  : " + actualMsg);
	assertEquals(actualMsg, expectedMsg, "Result do not match");
    
}
// @TS_array_06

@When("The user enter python code with invalid syntax in tryEditor from sheet {string} and {int}")
public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_from_sheet_and(String  sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	
	LoaderLoad.info("The user enter valid python code in tryEditor from sheetname :" + sheetname
			+ " and row number : " + rownumber);
	arraypage.enterPythonCode(sheetname, rownumber);

}

@Then("The user should be presented with error message as {string}")
public void the_user_should_be_presented_with_error_message_as(String string) {
	String actualMsg = arraypage.getErrorText();
	LoaderLoad.info("Actual Error message is  : " + actualMsg);
	assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
}
@Then("The user clicks on back button")
public void the_user_clicks_on_back_button() {
 arraypage.backwindow();

}
@Then("The user is on the {string} page")
public void the_user_is_on_the_page(String string) {
    arraypage.navigateTo(string);
}



}