@Medunna
Feature: Medunna Sign In

  Scenario Outline: TC01_Sign_In

    Given user navigates to "https://www.medunna.com/"
    When user clicks on icon
    And user clicks on sign in link
    And capture screenshot
    And user enters username "<username>" and "<password>"
    And user clicks on sign in  submit button
    Then close the application

    Examples:
      | username   | password |
      | mark_twain | Mark.123 |
      | john_doe   | John.123 |