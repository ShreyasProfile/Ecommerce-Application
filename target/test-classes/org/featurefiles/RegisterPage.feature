  
Feature: Opencart User Registration Funcitionality

Background:
    Given User is on Home Page 
    When User clicks on MyAccount dropdown will be open
    And User clicks on register
    Then Register page is displayed
  
  @Regression 
  Scenario Outline: Verify Registeration functionality for New User
    Given the User is on Register Page
    When User enters FirstName "<FirstName>"
    And User enters LastName "<LastName>"
    And User enters E-mailId "<E-mailId>"
    And User enters TelephoneNo "<TelephoneNo>"  
    And User enters newPassword "<Password>"
    And User ReEnterPassword "<ReEnterPassword>" 
    And Clicks on Subscribe"<Subscribe>"
    And User ticks the Privacy Policy
    And Click on continue button
    Then the message "Your Account Has Been Created!" is displayed
     Examples:
   |FirstName|LastName | E-mailId     |TelephoneNo|Password|ReEnterPassword|Subscribe|
   | Akshay  | Kumar   |ak@example.com| 741852963 |ak001   | ak001         |   Yes   |
   
