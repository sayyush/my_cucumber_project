@data_tables
Feature: data_tables

  Scenario: TC_01_customer_login_test

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