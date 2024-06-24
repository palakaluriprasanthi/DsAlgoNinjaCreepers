  @tag1
  Feature: Dsportal App LinkedList
  
  Background:
  Given User is Logged into DSAlgo Portal

  Scenario: LinkedList Introduction
    Given Go to linkled list box ,click on get started
    And click on Introduction 
    When click on the tab try here
   Then Write and Run the code
  
  @tag2
  Scenario: Creating Linkedlist
    Given Go to linkled list box ,click on get started
    And click on creating linked list
    When click on the tab try here 
    Then  Write and Run the code
   
  @tag3
  Scenario: Types of Linked list
    Given Go to linkled list box ,click on get started
    And click on Types of linked list
    When click on the tab try here 
    Then Write and Run the code
    
  @tag4
  Scenario:  Implement in python
    Given Go to linkled list box ,click on get started
    And  click on Implement 
    When click on the tab try here 
    Then Write and Run the code
    
  @tag5
  Scenario: Traverse Method
    Given Go to linkled list box ,click on get started
    And click on Traversal
    When click on the tab try here 
    Then  Write and Run the code
    
  @tag6
  Scenario: Insert Method
    Given Go to linkled list box ,click on get started
    And click on Insertion
    When click on the tab try here
    Then  Write and Run the code
    
  @tag7
  Scenario: Delete Method
    Given Go to linkled list box ,click on get started
    And click on Deletion
    When click on the tab try here
    Then Write and Run the code
    
    @tag8
    Scenario: LinkedList Introduction negative testcase
    Given Go to linkled list box ,click on get started
    And click on Introduction 
    When click on the tab try here
    Then Run invalid code
   
   @tag9
   Scenario: Creating Linkedlist negative testcase
    Given Go to linkled list box ,click on get started
    And click on creating linked list
    When click on the tab try here 
    Then Run invalid code
    
    @tag10
    Scenario: Types of Linked list negative testcase
    Given Go to linkled list box ,click on get started
    And click on Types of linked list
    When click on the tab try here 
    Then Run invalid code
    
    @tag11
     Scenario:  Implement in python negative testcase
    Given Go to linkled list box ,click on get started
    And  click on Implement 
    When click on the tab try here 
    Then Run invalid code
    
    @tag12
    Scenario: Traverse Method negative testcase
    Given Go to linkled list box ,click on get started
    And click on Traversal
    When click on the tab try here
    Then Run invalid code
    
    @tag13
     Scenario: Insert Method negative testcase
    Given Go to linkled list box ,click on get started
    And click on Insertion
    When click on the tab try here
    Then Run invalid code
    
    @tag14
     Scenario: Delete Method negative testcase
    Given Go to linkled list box ,click on get started
    And click on Deletion
    When click on the tab try here
    Then Run invalid code
  