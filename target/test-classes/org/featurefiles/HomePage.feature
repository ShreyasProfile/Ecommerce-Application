  
Feature: Opencart Home Page feature

 @Smoke
 Scenario: Verify Home page
    Given User is on Home Page 
    Then App Logo is displayed
    And Search box is displayed
    And Product catagories bar is displayed
    And Currency btn is displayed
    And Helpline No is displayed
    And MyAccount field is displayed
    And WishList field with quantity is displayed
    And ShoppingCart field is displayed
    And Checkout field is displayed

 @Regression 
  Scenario: Verify Register functionality 
     Given User is on Home Page
     When User clicks on MyAccount dropdown will be open
     And User clicks on register
     Then Register page is displayed
  
  @Regression 
  Scenario: Verify login functionality
     Given User is on Home Page
     When User clicks on MyAccount dropdown will be open
     And User clicks on Login
     Then Login page is displayed