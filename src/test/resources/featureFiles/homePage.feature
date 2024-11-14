
Feature: Login to flipkart

  @tag1
  Scenario: User navigates to watches page
    Given user is on home page
    When user move to fashion icon
    And clicks on watches and accessories
    Then user moves to page with title that contains "Wrist Watches"