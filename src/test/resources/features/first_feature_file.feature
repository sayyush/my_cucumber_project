@google_search
Feature: google search feature - this describe the name of this feature file

#  BACKGROUND : used to run before each Scenario or Scenario Outline (like @Before )
  Background: navigation_google
    Given user is on the google home page

  Scenario: TC_01_iphone_search - Scenario is used to create test cases. Scenario daki yazilan seyin anlami yok sadece o bir baslik, isimlendirme.
    And user search for iPhone
    Then verify the page title contains iPhone
    Then close the application
#  Then close the application => bu durumda ustteki ve alttaki senaryoyu ayri sayfa acarak yapiyor,
#  egerde close stepini kapatirsan ayni sayfadan 2. urunu arar.

  @porcelain_tea_pot
  Scenario: TC_02_porcelain_tea_pot_search
    And user search for porcelain_tea_pot
    Then verify the page title contains porcelain_tea_pot
    Then close the application


#    All feature files must begin with Feature: KEYWORD
#    Her bir file da, yanliz bir " Feature" kullanilabilir.
#    Feature SDLC'de ozellik demek, Cucumber da ise "test dosyasi" demektir.  Feature = Epic
#    We use Scenario: to create test cases/test scenarios . Her bir file da birden fazla Scenario olusturulabilir.
#    Each line under Scenario: is called as STEP
#    Each step must begin with GHERKIN language - Given, And, When, Then, But, *
#    Technically we can use any of these keyword in and step, but we should follow the best practice
#    BEST PRACTICE : Given for pre conditions in the first steps.
#                    And and When in them middle.
#                    Then in the verification
#                    But and * is not used a lot
#                    * = ANY

#  STEPS FOR CUCUMBER AUTOMATION :
#  1. create feature file and add test steps
#  2. create step definitions and add java code


#  NOTES: When creating new Scenarios, try using existing reusable steps