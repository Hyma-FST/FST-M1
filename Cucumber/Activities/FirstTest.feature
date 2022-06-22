Feature: Basic syntax
  Scenario: Scenario 1
    Given User is on Ts page
    When user clicks on about us button
    Then User is redirected to the about us page
    Then Close the browser