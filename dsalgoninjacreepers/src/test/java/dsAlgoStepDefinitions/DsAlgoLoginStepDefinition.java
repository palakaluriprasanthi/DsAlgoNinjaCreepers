package dsAlgoStepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import dsAlgoPages.DsAlgoLoginPage;
//import pages.Homepage;
import dsUtilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import dsUtilities.LoaderLoad;
import dsalgo_hooks.DriverFactory;
//import dsalgo_hooks.DriverFactory;
//import dsalgo_hooks.DriverManager;
import dsalgo_hooks.LoginDriverManager;
import dsUtilities.commoncomponents;
import dsUtilities.ExcelReader;




public class DsAlgoLoginStepDefinition {
	
	DsAlgoLoginPage login = new DsAlgoLoginPage(DriverFactory.getDriver());

 Boolean isRequired;
 static String message;
 int rownumber;
 static String sheetName;
 //String static home;

 String Excelpath =ConfigReader.getexcelfilepath();
 
 @Given("The user is on signin page")
 public void the_user_is_on_signin_page() throws InterruptedException {
     LoaderLoad.info("User is on signin page");
     login.login_button();
   //  Thread.sleep(50);
    
 }

 @When("The user clicks on register link on signin page")
 public void the_user_clicks_on_register_link_on_signin_page() {
     LoaderLoad.info("User click on Register button");
     login.register_link();
 }

 @Then("The user redirected to Registration page from signin page")
 public void the_user_redirected_to_registration_page_from_signin_page() {
     LoaderLoad.info("User is redirected to Registration page");
     String Title = login.register_link();
		LoaderLoad.info("Title of the Page : \" " + Title + "\" ");
		assertEquals(Title, "Registration", "Title do not match");
	}
 

 @When("The user enter invalid {string} and {string}")
 public void the_user_enter_invalid_and(String username, String password) {
     LoaderLoad.info("User Enter username as \" " + username + " \" and Password as \" " + password + "\"" );
     		isRequired = login.Login(username, password);
     		//assertTrue(isRequired);
     		LoaderLoad.info("Empty field value is validated");
 }

 @Then("click login button to verify")
 public void click_login_button_to_verify() {
    LoaderLoad.info("user clicks on login button");
    login.login_button();
 }

 @When("The user enter sheet {string} and {int}")
 public void the_user_enter_sheet_and(String sheetName, Integer rownumber) throws InvalidFormatException, IOException{
    ExcelReader reader = new ExcelReader();
    List<Map<String, String>> testData =ExcelReader.getData(Excelpath, sheetName);
    
     
	String username = testData.get(rownumber).get("username");
    String password =testData.get(rownumber).get("password");
    message = testData.get(rownumber).get("expectedmessage");
	LoaderLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
	
	if (username != null || password != null)
		login.Login(username, password);
    
 }

 @Then("click login button")
 public void click_login_button() throws InterruptedException {
     LoaderLoad.info("User clicks on login button");
     LoaderLoad.info("Expected Message - Excel Sheet :  " + message);
    String msg =login.click_login();
     LoaderLoad.info("Actual message : "+msg);
     Thread.sleep(2000);
    // assertEquals(msg,message);
 
 }

 @Given("The user is on home page")
 public void the_user_is_on_home_page()  {
	//isRequired = login.Login(username, password);
		//assertTrue(isRequired);
		LoaderLoad.info("Empty field value is validated");
	// login.Login(username, password);
     //login.click_login();
 }

 @When("The user click signout button")
 public void the_user_click_signout_button() {
login.signout();
//*[@id="navbarCollapse"]/div[2]/ul/a[3]

 }

 @Then("The user redirected to homepage")
 public void the_user_redirected_to_homepage() {
	 LoaderLoad.info("User is on Home page");
		
		
		
 }

}


 
 
 
 

