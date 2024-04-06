Feature: AutoRegister Page Functionality

  Scenario: log in to facebook
    Given User navigates to login page "https://www.facebook.com/login"
    When User enters username "hjhj"
    And User enters password ""
    And User clicks login button
    Then System redirects to dashboard page "Dashboard"
    Then System redirects to dashboard pages "Failed"
