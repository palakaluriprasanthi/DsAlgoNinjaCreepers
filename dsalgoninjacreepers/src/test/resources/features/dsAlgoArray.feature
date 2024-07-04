@tag
Feature: Arrays
   Background:
	Given User is Logged into DSAlgo Portal

  @tag1
  Scenario: Arrays in Python
    Given User clicks on Arrays Get Started
    And User clicks on Arrays in Python
    When Press tab try here
    Then Enter the  valid code and run
    
    @tag2
  Scenario: Arrays using List
    Given User clicks on Arrays Get Started
    And User clicks on Arrays using list
    When Press tab try here
    Then Enter the  valid code and run
    
    @tag3
  Scenario: Basic Operation in list
    Given User clicks on Arrays Get Started
    And User clicks on basic operation in list
    When Press tab try here
    Then Enter the  valid code and run
    
    
    @tag4
  Scenario: Application of Array
    Given User clicks on Arrays Get Started
    And User clicks on Applications of array
    When Press tab try here
    Then Enter the  valid code and run
    
   
 @tag5
  Scenario: Arrays in Python-negative case
    Given User clicks on Arrays Get Started
    And User clicks on Arrays in Python
    When Press tab try here
    Then Enter the invalid code and run
    
    @tag6
  Scenario: Arrays using List-negative case
    Given User clicks on Arrays Get Started
    And User clicks on Arrays using list
    When Press tab try here
    Then Enter the invalid code and run
    
    @tag7
  Scenario: Basic Operation in list-negative case
    Given User clicks on Arrays Get Started
    And User clicks on basic operation in list
    When Press tab try here
    Then Enter the invalid code and run
    
    
    @tag8
  Scenario: Application of Array-negative case
    Given User clicks on Arrays Get Started
    And User clicks on Applications of array
    When Press tab try here
    Then Enter the invalid code and run
   