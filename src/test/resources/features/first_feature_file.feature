Feature: google search feature - this describe the name of this feature file

  Scenario:TC_01_iphone_search - Scenario is to create test cases

    Given user is on the google home page
    And user search for iPhone
    Then verify the page title contains iPhone

    # All feature files must begin with "Feature" keyword
    #  We use "Scenario":to create test cases/test scenarios
    # Each line under Scenario : is called as STEP
    # Each step must begin with GHERKIN language - Given , And,  When, Then , But, *
    # Technically we can use any of these keyword in any step, but we should follow the best practice.
    # eger de then o, then bu, then su diye art arda yazarsak technically sorun degil ama anlamsiz.
    # BEST PRACTICE : "Given" for pre conditions in the first steps.
    #                 "And" and "When" in the middle.
    #                 "Then" in the verifications.
    #                  "But" and "*" is not used a lot
    #                  "*" : ANY
  # STEPS FOR CUCUMBER AUTOMATION :
  # 1. CREATE FEATURE FILE AND ADD TEST STEPS
  # 2. CREATE STEP DEFINITIONS AND ADD JAVA CODE

