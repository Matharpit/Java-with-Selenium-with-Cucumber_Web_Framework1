Feature: Feature to test login functionality
  @samplelogin
  Scenario: Login to Online Shoe Portal
    Given User Navigate to shoe portal application
    When User Navigate to login page
    And Provide the credentials
    Then User should successfully loggedIn
