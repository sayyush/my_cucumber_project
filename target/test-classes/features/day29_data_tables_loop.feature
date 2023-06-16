@data_tables_loop
Feature: data_tables

  Scenario: TC_01_customer_login_test

    Given user navigates to "https://www.bluerentalcars.com/"
    And user enters username and password loop
      | username                       | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |

    And close the application