  
Feature: Opencart Add To Cart Functionality

 Background:
     Given User is on Home Page
     Then User clicks on MyAccount dropdown will be open
     And User clicks on Login
     Then Login page is displayed
     And User enters E-Mail address
     And User enters password
     And clicks on login button
     #And Account page is displayed 
     And the user clicks on homeicon user should be redirected to homepage

 @Regression 
 Scenario: User adds a product to the cart 
    When the user clicks on the "Add to Cart" button for a product
    Then the product should be added to the cart
    And the user should see a msg " Success: You have added iPhone to your shopping cart!"
    And the home page cartbutton should display the quantity of items and total amount of all items
    When the use clicks on Shopping cartLink
    Then the user should be redirected to the Shopping Cart page
    And the user should see the added product with image, quantity, unit price, total price 
    
@Regression 
 Scenario: User remove product from cart 
    Given User is on Home Page
    Then User go to Cart page
    When User click on the "Remove" button for item 
    Then the item should be removed from my cart
    
