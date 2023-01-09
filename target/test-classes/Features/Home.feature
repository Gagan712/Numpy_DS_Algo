Feature: To verify the Home Page Functionality

  Scenario: To validate DS Portal
    When The user opens DS Algo portal link
    Then The user get tittle of page "Numpy Ninja"

  Scenario: To verify DS Portal
    Given The user opens DS Algo portal 
    When The user clicks the Get Started button
    Then The user should be redirected to homepage as "NumpyNinja"

  Scenario: To Validate Homepage
    Given The user opens Home Page
    When The user clicks Data Structures drop down
    Then See 6 different Data structures 
    When The user clicks any of the Get Started buttons below the data structures
    Then It should alert the user with a message "You are not logged in"
    When The user selects any data structures item from the drop down without Sign in.
    Then It should alert the user with a message "You are not logged in"
    When The user clicks Sign in link
    Then The user should be redirected to Sign in page as "Login"
    When The user clicks Register link
    Then The user should be redirected to Register form as "Registration"
