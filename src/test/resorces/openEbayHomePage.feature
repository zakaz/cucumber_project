Feature: EbayTest
  Scenario: Home-page successfully open
    Given Getting driver and open the browser
    When I open Ebay website
    Then Ebay logo should exits

    Given I set search request "iphone 4s"
    When I perform search
    Then the term query "iphone 4s" should be the first in the Search Result grid
    And I click on the link of first item
    Then Add To Card button should exist

    Given I push add to card button
    When cart page opened
    Then the quantity of items in cart should be "Оформить покупку"