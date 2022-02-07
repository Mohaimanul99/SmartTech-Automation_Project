Feature: User is able to login with valid username & password
  
  Description: "User login to Hotwire wbsite and verify login"

  Scenario: User login with valid username and verify page title
   
    Given User can open any browser
    And User is able to enter url
    When User clicks on the Login in button
    And User enters email and password
    And User clicks on Sign in button
    Then User is able to verify successful login & verify page title
