@customer_login
Feature: customer_login

  Scenario Outline: US167854_customer_login_test

    Given user navigates to "https://www.bluerentalcars.com/"
    When user clicks on login button
    And user enters "<username>" and "<password>"
    And user clicks on login submit button
    Then verify the login is successful
    When capture screenshot
    And user logs out the application
    And close the application

    Examples:
      | username                       | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |