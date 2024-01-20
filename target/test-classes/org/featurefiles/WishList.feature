
Feature: Verify WishList functionality
         Wishlist Only Works After Login Functionality 
         User wants to add the products in wishlist

 Background:
         Given User is on Home Page
  @Regression
  Scenario: Do not Add item to wishlist, If User is not Login
     When the user selects a product from the search results
     And the user clicks on "Add to Wishlist" button
     Then the product should not added to the wishlist
     And the user should see a error msg "You must login or create an account to save ProductName to your wish list!"

  @Regression
  Scenario: Add item to wishlist, If User is Login 
    Then User clicks on MyAccount dropdown will be open
    And User clicks on Login
    And User enters E-Mail address
    And User enters password
    And clicks on login button
    And Account page is displayed 
    And the user clicks on homeicon user should be redirected to homepage
    When the user selects a product from the search results
    And the user clicks on "Add to Wishlist" button
    Then the product should be added to the wishlist
    And the user should see a success msg "Success: You have added ProductName to your wish list!"
    When the user clicks on the "Wishlist" link
   Then the user should be redirected to the wishlist page
   And the user should see the added product in the wishlist
   
 