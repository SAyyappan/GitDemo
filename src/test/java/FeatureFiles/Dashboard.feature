Feature: Verify Sharetask.eu is working E2E

  Scenario: Verify sharetask.eu is working end to end
  	Given Login page is displayed
    When User logged in into sharetask
    Then click on Dashboard menu
    Then Verify Dashboard page is displayed
    When click on Account link
    Then Account Page should be displayed
    When click on Profile link 
    Then Profile page should be displayed
    When click on Skills link 
    Then Skills page should be displayed
    When click on Verification link 
    Then Verification page should be displayed
    When click on Payment link 
    Then Payment page should be displayed
    When click on logout button on the dashboardpage
    Then perform VAT calculations
    When Close the current browser session
    