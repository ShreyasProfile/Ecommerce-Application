  
Feature: Opencart Search Functionality
         Visitor of the Opencart website,
	       user want to search for products,
	       So that they can quickly find what they are looking for
    
 @Regression 
 Scenario Outline: srch01- Verify search functionality with valid keyword
      Given User is on Home Page
      When the User enter "<ProductName>" in the search bar
	    And click the search button
	    Then "<ProductName>" should be display in the results
	   Examples:
	   | ProductName |
	   |   Macbook   |
	   |   iPhone    |
	   
	    
 @Regression
 Scenario: srch03- Verify search functionality with Invalid keyword
    Given User is on Home Page
    When the User enter "Mobiles" in the search bar
    And click the search button
    Then the user should see a message "There is no product that matches the search criteria"

  