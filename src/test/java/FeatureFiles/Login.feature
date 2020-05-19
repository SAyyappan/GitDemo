Feature: To Verify user is able to login to website with valid credentials
  
  Scenario: Validate login pgae is displayed on clicking login link
    Given Open chrome browser
    When click on LOGIN link 
    Then New login page should be displayed
    Given Enter username and password
    When click on Login button
    Then User should face home page
    Then click on logout
    And Close the browser