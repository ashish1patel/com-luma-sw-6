Feature: Gear Test

As a user verify the product added successfully to shopping cart

  @smoke @regression
  Scenario: I Should add product successfully to shopping cart
    Given I am on homepage
    When I Mouse Hover on Gear Menu
    And I Click on Bags
    And I Click on Product Name Overnight Duffle
    And I Verify the text "Overnight Duffle"
    And I Change Qty "3"
    And I Click on Add to Cart Button.
    And I Verify the text of "You added Overnight Duffle to your shopping cart."
    And I Click on shopping cart Link into message
    And I Verify the product name "Overnight Duffle"
    And I Verify the Qty is "3"
    And I Verify the product price "$135.00"
    And I Change Qty to "5"
    And I Click on Update Shopping Cart button
    Then I Verify the product price "$225.00"