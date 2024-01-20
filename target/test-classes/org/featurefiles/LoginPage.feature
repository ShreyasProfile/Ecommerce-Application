  
Feature: Opencart Login Functionality 
         As a User of opencart
         User wants to able login there Account and manage the activity 

 Background:
     Given User is on Home Page
     When User clicks on MyAccount dropdown will be open
     And User clicks on Login
     Then Login page is displayed
     
 @Regression     
 Scenario: Successful Login with valid credentials
    Given User is on Login Page
    When User enters E-Mail address
    And User enters password
    And clicks on login button
    Then User is Login successfully
      
 @Regression  
 Scenario Outline: Unsuccessful Login with invalid credentials or empty credentials    
    Given User is on Login Page
    When User enters Username "<Username>" 
    And User enters Password "<Password>"
    And clicks on login button
    Then User should see an error message indicating <error_message>
    Examples:
    | Username     | Password | error_message                                        |
    | abcdef       |  1234    | Warning: No match for E-Mail Address and/or Password |
    | ab@gmail.com |  xyz     | Warning: No match for E-Mail Address and/or Password |
    
 @Regression
 Scenario: Navigate to forgot password page
    Given User is on Login Page
    When User clicks on "Forgotten Password" link
    Then User will redirected to forgot password page 
    
    