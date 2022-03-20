Feature: Search goods
  Scenario: Search for goods when user enters correct data in the search field
    Given I am on home page
    When I search for “shirt”
    Then I see results contain “shirt” in descriptions

  Scenario: Search only searches for relevant products
    Given I am on the home page
    When I search for “shirt”
    Then I don't see results that don't contain “shirt” in the description

  Scenario: Search for goods when user enters the incorrect information in the search field
    Given I am on home page
    When I search for goods with field incorrect information
    Then I see warning message “NOTHING MATCHES YOUR SEARCH”

    Scenario: Case-Sensitive Search
      Given I am on home page
      When I search for "shirt"
      Then I must to get the same results as for "SHIRT"

      Scenario: Search with emoji
        Given I am on home page
        When I search for 💩 emoji
        Then I see warning message “NOTHING MATCHES YOUR SEARCH”