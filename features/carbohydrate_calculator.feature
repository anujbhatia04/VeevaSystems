Feature: Calculator Functionality

  Scenario: Calculate with age, height, weight, gender, and activity
    Given I am on the carbohydrate calculator page
    When I enter age as "25"
    And I enter height as "170"
    And I enter weight as "70"
    And I select gender as "Male"
    And I click on the "Calculate" button
   
