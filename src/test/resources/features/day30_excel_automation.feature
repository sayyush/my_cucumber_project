@excel_automation
Feature: excel_automation
  Scenario: TC01_login_customer
#    logs in
#    verify default page is visible
#    log out
#    closes the driver
    Given user tries to login as "customer_info"
    Then close the application
  @excel_admin
  Scenario: TC02_login_admin
#    logs in
#    verify default page is visible
#    log out
#    closes the driver
    Given user tries to login as "admin_info"
    Then close the application
