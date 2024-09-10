
Feature: Add multiple product items to the cart
  
    Background: User launch amazon application
    Given user launch chrome browser 
    And user launch application "https://www.amazon.com/"
    Given user clicks on All
    
    Then user validate the home page
    
    
    @Electronics
    Scenario: user selects Shop by department
    When user selects Electronics
    And user selects Accessories and supplies
    And user clicks on any of the product
    
    
    @Smarthome
    Scenario: user selects shop by department-Smart home
    When user clicks on smart home
    And user selects smart home lighting
    And user selects smart home by category strip lighting
    And user clicks on item
    
  
    @computers
    Scenario: user selects shop by department-Computers
    When user clicks on computers
    And user selects laptop accessories
    And user clicks on products
    
    @seeall
    Scenario: user selects any of the item
    When user clicks on see all
    And user selects movies and television
    And user selects tv shows
    And user clicks on shows
    And user selects any of the show
    
    @Programs
    Scenario: user selects shop by department-Programs and features
    When user clicks on gift cards
    And user selects all gift cards
    And user clicks on random card
    
