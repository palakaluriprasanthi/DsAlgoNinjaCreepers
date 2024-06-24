@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
 Given User is Logged into DSAlgo Portal

 @tag1
  Scenario: Stack Operation
    Given click stacks GetStarted
    And click operations in stack
    When click try here
    Then Write and execute code
  
  @tag2
  Scenario: Stack Implementation
    Given click stacks GetStarted
    And click Implementation
    When click try here
    Then Write and execute code
   
  @tag3
  Scenario: Stack Application
    Given click stacks GetStarted
    And click Application
    When click try here 
    Then Write and execute code
    
    @tag4
     Scenario: Stack Operation negative testcase
    Given click stacks GetStarted
    And click operations in stack
    When click try here
    Then Try invalid code
    
    @tag5
     Scenario: Stack Implementation negative testcase
    Given click stacks GetStarted
    And click Implementation
    When click try here
    Then Try invalid code
    
    @tag6
    Scenario: Stack Application negative testcase
    Given click stacks GetStarted
    And click Application
    When click try here 
    Then Try invalid code