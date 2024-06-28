@signin
Feature: Validating Login page

Background:
#Given User is Logged into DSAlgo Portal
  @TS_signin_01
  Scenario: Verifying Register link
    Given The user is on signin page
    When The user clicks on register link on signin page
    Then The user redirected to Registration page from signin page

#  @TS_signin_02
 
# Scenario Outline: User on login page and login with invalid inputs "<username>" and "<password>"
 #   Given The user is on signin page
  #  When The user enter invalid "<username>" and "<password>"
   # Then click login button to verify

    #Examples: 
     # | username | password |
      #| user     | 111      |
      #| 111      | passowrd |
      #| 222      | 444      |

  @TS_signin_03
  Scenario Outline: User on login page and login with invalid and valid inputs from Excel "<SheetName>" and <RowNumber>
    Given The user is on signin page
    When The user enter sheet "<SheetName>" and <RowNumber>
    Then click login button

    Examples: 
      | SheetName | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |

  @TS_signin_04
  Scenario: Verifying signout link
    Given The user is on home page 
    When The user click signout button
    Then The user redirected to homepage
    
    
    
    