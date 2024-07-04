@tag1
  Feature: Dsportal App DataStructure

  Background:
	Given User is Logged into DSAlgo Portal

  Scenario: DataStructure
    Given Go to DataStructure ,click on get started
    And click on TimeComplexity 
    When click try here tab
    Then Execute

  @tag2
  Scenario: DataStructure negative testcase
    Given Go to DataStructure ,click on get started
    And click on TimeComplexity 
    When click try here tab
    Then Execute invalid code
 
