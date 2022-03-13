Feature: User cannot create a doppelganger account and should login in with valid data and should sign out

  Scenario: Create new user with valid credentials
    Given I am on the join page
    When I try to create a lookalike user
    Then I should see "Warning message" with text "The email address has already been allocated to another customer"

  Scenario: User login in with valid credentials
    Given I am on sign-in page
    When I login with valid data
    Then I should see My account page

  Scenario: User Sign out
    Given I am login in with valid data
    When I press "Sign out"
    Then I should should be sign out and see "Join" button