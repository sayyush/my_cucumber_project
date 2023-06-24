@failed_test_case
Feature: failed_test_case

  Scenario: TC_01_customer_login_test_negative

    Given user navigates to "https://www.bluerentalcars.com/"
    When user clicks on login button
    And user enters username and password
      | username                      | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
    And user clicks on login submit button
    And test fails
    Then verify the login is successful
    When capture screenshot
    And user logs out the application
    And close the application

  Scenario: TC_02_customer_login_test_positive

    Given user navigates to "https://www.bluerentalcars.com/"
    When user clicks on login button
    And user enters username and password
      | username                      | password  |
      | sam.walker@bluerentalcars.com | c!fas_art |
    And user clicks on login submit button
    Then verify the login is successful
    When capture screenshot
    And user logs out the application
    And close the application


