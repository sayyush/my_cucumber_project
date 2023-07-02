@GridTest
Feature: grid_feature

  @GridChrome
  Scenario: TC01_running_on_chrome
    Given user is on the "https://www.bluerentalcars.com" with "chrome"
    Then verify the title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    And close the remote driver

  @GridFireFox
  Scenario: TC02_running_on_firefox
    Given user is on the "https://www.bluerentalcars.com" with "firefox"
    Then verify the title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    And close the remote driver

  @GridEdge
  Scenario: TC03_running_on_edge
    Given user is on the "https://www.bluerentalcars.com" with "edge"
    Then verify the title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    And close the remote driver

