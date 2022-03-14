Feature: Cart page

  Scenario: User can add to cart item
    Given I am on home page
    When I add item to cart
    Then I should see pop-up window informs My bag consists of "1 item"

  Scenario: User can remove item form "My bag"
    Given I am on home page
    When I add item to cart
    Then I go to My Bag
    And I remove item from My Bag
    And I should see message "Your bag is empty"