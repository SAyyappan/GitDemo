Feature: To Verify user is able to complete his account details
  
  Scenario: Validate account page is displayed and user able to fill in the details
    Given Account page should be displayed
    Then Enter details
    Then click on save button
    Then User should see the update message