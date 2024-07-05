@tag1
Feature: Graph

  Background: 
    Given User is Logged into DSAlgo Portal

  @tag1
  Scenario: User tests the invalid code in Graph
    Given User is on Graph Module page
    When User goes to Graph link down the page and  enters invalid code
    Then User gets pop-up error message

  @tag2
  Scenario: User tests the valid code in Graph
    Given User is on Graph Module page
    When User goes to Graph link down the page and  enters valid code
    Then User is able to get the result

  @tag3
  Scenario: : User tests the invalid code in Graph Representations
    Given User is on Graph Representations Module page
    When User goes to Graph Representations link down the page and enters invalid code
    Then User gets pop-up error message

  @tag4
  Scenario: : User tests the valid code in Graph Representations
    Given User is on Graph Representations Module page
    When User goes to Graph Representations link down the page and enters invalid code
    Then User is able to get the result
