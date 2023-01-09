Feature: To verify and validate  User  Register Form

  Scenario: To verify Register Form with Empty fields
    Given The user opens Register Page
    When User click Register with all empty field
    Then User verify the message at username as "Please fill out this field."

  Scenario: To verify Register Form with username only
    Given The user opens Register Page
    When User click Register with username as "numpy" only
    Then User verify the message at password as "Please fill out this field."

  Scenario: To verify Register Form with username and password only
    Given The user opens Register Page
    When User click Register with username as "numpy" and password as "ninja" only
    Then User verify the message at confirmpassword as "Please fill out this field."

  Scenario Outline: To verify Register Form with invalid credentials
    Given The user opens Register Page
    When User enter "<username>" ,"<password>" and "<confirmpass>"
    Then User click Register and verify the "<message>"

    Examples: 
      | username  | password   | confirmpass  | message                                                 |
      | numpy84$3 | ninja      | ninja        | password_mismatch:The two password fields didn’t match. |
      | numpy     | automation | automation84 | password_mismatch:The two password fields didn’t match. |
      | numpy     |  123456789 |    123456789 | password_mismatch:The two password fields didn’t match. |
      | numpy     | ninja5     | ninja5       | password_mismatch:The two password fields didn’t match. |

  Scenario Outline: to register with all the data
    Given The user opens Register Page
    When user enter the sheetname "<sheetname>" and row number <rownum>
    Then user click on Register button and verify message

    Examples: 
      | sheetname | rownum |
      | registr   |      0 |
      | registr   |      1 |
      | registr   |      2 |
      | registr   |      3 |
