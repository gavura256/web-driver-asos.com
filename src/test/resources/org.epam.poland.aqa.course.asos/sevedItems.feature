Feature: Saved item for buying later
  Scenario: Add item to "Saved Items"
    Given I am on the home page
    When I add item to "Saved Items"
    Then I see 1 item in my wishing list

    Scenario:  Remove item from "Saved Items"
      Given I add 1 item to "Saved Items"
      When I remove good from "Saved Items"
      Then I should see message "You have no Saved Items"