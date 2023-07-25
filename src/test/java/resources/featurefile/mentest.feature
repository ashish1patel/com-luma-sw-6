Feature: MenTest

  As a User I want to verify add product successfully to shopping cart

@smoke @regression
Scenario: User should add product successfully to shopping cart
  Given I am on homepage
When Mouse Hover on Men Menu
  And Mouse Hover on Bottoms
  And Click on Pants
  And  Mouse Hover on product name Cronus Yoga Pant and click on size 32.
  And Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
  And Mouse Hover on product name Cronus Yoga Pant and click on Add To Cart Button.
  And Verify the text "You added Cronus Yoga Pant to your shopping cart."
  And Click on shopping cart Link into message
  And Verify the text of "Shopping Cart."
  And Verify the product name "Cronus Yoga Pant"
  And Verify the product size ‘32’
  Then Verify the product colour "Black"
