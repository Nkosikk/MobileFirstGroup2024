@Alarm @Regression
Feature: Alarm Menu

  Scenario: Verify that when alarm is clicked, the alarm service is displayed
    Given The app is launched
    And I verify the heading
    When I click app
    Then The alarm text is displayed
    And I click Alarm
    And The alarm menu is displayed



