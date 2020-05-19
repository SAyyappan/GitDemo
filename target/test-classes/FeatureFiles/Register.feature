Feature: Verify user is able to register on sharetask.eu

  Scenario: Validate user registration
    Given Open the browser and enter url
    When click on register link
    Then New page is dispalyed for registration
    Then Enter the details of user
    And Click on Register button
    When Successfull registration message displayed
    Then Click on OK button
    And user should be able to see HomePage
    Then click on logout button
    And Close the browser window