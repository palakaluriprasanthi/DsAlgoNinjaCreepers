@Register
Feature: User validates Register page

#Background:
#Given User is Logged into DSAlgo Portal
  @Testcase01
  Scenario: User launch home page of an dsalgo
     Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage

  @Testcase02
  Scenario: User is presented with error message for empty fields below Username textbox
    Given The user opens Register Page
    When The user clicks "Register" button with all fields empty
    Then It should display an error message "Please fill out this field." below Username textbox

    @Testcase03
    Scenario: User is presented with error message for empty fields below Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering username with other fields empty
      | username| password|
      | pam2024  ||
     
    Then It should display an error message "Please fill out this field." below Password textbox
    
    @Testcase04
  Scenario: The user is presented with error message for empty fields below confirm Password textbox
    Given The user opens Register Page
    When The user clicks "Register" button after entering "username" and "password" with Password Confirmation field empty
      | username| password|
      | pam2024 | pwd@2024|
    Then It should display an error message "Please fill out this field." below Password Confirmation textbox


 @Testcase05
  Scenario: The user enters valid username and password 
    Given The user is on Register Page
    When The user clicks "Register" button after entering "username" and "password" and "confirmpassword"
      | username| password|confirmpassword|
      | pam2024 | pwd@2024|pwd@2024|
    Then It should display success message
    