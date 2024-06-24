 @tag1
  Feature: Graph
  
  Background:
  Given User is Logged into DSAlgo Portal

  Scenario: Graph
    Given Go to Graph,click on get started
    And click on Graph 
    When click tryhere
    Then Execute the valid code
    
    
    @tag2
  Scenario: Graph negative testcase
    Given Go to Graph,click on get started
    And click on Graph 
    When click tryhere
    Then Execute the invalid code
    
    
     @tag3
  Scenario: Graph Representation
    Given Go to Graph,click on get started
    And click on Graph Representation
    When click tryhere
    Then Execute the valid code
    
    
    
     @tag4
  Scenario: Graph Representation negative testcase
    Given Go to Graph,click on get started
    And click on Graph Representation
    When click tryhere
    Then Execute the invalid code