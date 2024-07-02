@array
Feature: User launch dsalgo application and test Array page
	
  @Before(@TS_array_02)
  Scenario: The user is logged in to DS1 Algo portal1
    Given The user is on signin page
    When The user enter sheet "Sheet1" and 2
    #When The user is logged in with valid username "pam2024" and password "pwd@2024"
    #Then The user is on "homepage" 
    Then click login button to verify
  @TS_array_02
  Scenario: The user is able to navigate to "Array" Data Structure Page
    Given The user is on the "homepage" after logged in
    When The user select Array item from the drop down menu
    Then The user be directed to "Arraypage" Data Structure Page

  @TS_array_03
  Scenario: The user is able to navigate to Arrays in Python page
    Given The user is on the "Arraypage" after logged in
    When The user clicks Arrays in Python link
    Then The user should be redirected to "Arrays in Python" page

  @TS_array_04
  Scenario: The user is able to navigate to a page having an tryEditor from Arrays in Python page
    Given The user is on the "ArraysinPythonpage" after logged in
    When The user clicks "TryHere" button on "Arrays in Python" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test

  @TS_array_05
  Scenario Outline: The user is able run code in tryEditor for Arrays in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |

  @TS_array_06
  Scenario Outline: The user is presented with error message for code with invalid syntax in tryEditor for Arrays in Python page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter python code with invalid syntax in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with error message as "NameError: name 'hello' is not defined on line 1"

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         1 |
      
      
      
     @TS_array_07
  Scenario: The user is able to navigate to a page having an tryEditor from Arrays Using List page
    Given The user is on the "ArraysUsingList" after logged in
    When The user clicks "TryHere" button on "Arrays Using List" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
      
    @TS_array_08
    Scenario Outline: The user is able run code in tryEditor for Arrays Using List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
        
     @TS_array_09
  Scenario: The user is able to navigate to a page having an tryEditor from Basic Operations in List page
    Given The user is on the "BasicOperationsinLists" after logged in
    When The user clicks "TryHere" button on "Basic Operations in List" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
      
    @TS_array_10
    Scenario Outline: The user is able run code in tryEditor for Basic Operations in List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 |
      
      
     @TS_array_11
  Scenario: The user is able to navigate to a page having an tryEditor from Applications of Array page
    Given The user is on the "ApplicationsofArray" after logged in
    When The user clicks "TryHere" button on "Applications of Array" page
    Then The user should be redirected to a page having an tryEditor with a Run button to test
      
    @TS_array_12
    Scenario Outline: The user is able run code in tryEditor for Basic Operations in List page
    Given The user is in a page having an tryEditor with a Run button to test
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And The user clicks on run button
    Then The user should be presented with Run result
    Then The user clicks on back button
    Then The user is on the "Arraypage" page

    Examples: 
      | Sheetname  | RowNumber |
      | pythonCode |         0 | 