Feature: Cart page

  Scenario: User can add to cart item
    Given I am on home page
    When I add item to cart
    Then I should see pop-up what informs "My bag" consists "1" item

  Scenario: User can remove item form "My bag"
    Given I add item to cart
    When I remove item from cart
    Then I should see "Your bag is empty"