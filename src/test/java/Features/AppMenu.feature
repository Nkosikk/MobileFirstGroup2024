@App @Regression
Feature: App Menu

  Scenario: Verify that alarm is displayed when the app menu is clicked
    Given The app is launched
    And I verify the heading
    When I click app
    Then The alarm text is displayed
    And I click Alarm

