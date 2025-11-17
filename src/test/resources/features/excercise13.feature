Feature: Verify product quantity update in cart on Automation Exercise website

  Scenario: Exercise13 - Verify product quantity in cart
    Given I open the browser
    When I enter the Automation Exercise URL
    Then I verify that the home page is displayed correctly
    When I click on the "View Product" button of a product
    Then I verify that the product detail page is opened
    When I increase the quantity to 4
    And I click the "Add to Cart" button
    And I click the "View Cart" button
    Then I verify that the product is displayed in the cart page with the expected quantity