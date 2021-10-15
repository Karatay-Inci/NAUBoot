@gmibankhomepage
Feature: Go to Home Page
  Scenario: User go to GmiBank home page
    Given user go to "https://www.gmibank.com/"
    And   user go to sign in
    And   use valid employee user name
    Then  use valid employee user password
    Then  select My Operations Menu
    And   click Management Customers
    When  click Create New Customer
    And   Fill out valid SSN
    And   Fill out valid middle initial
    And   Fill out valid phone number
    And   Fill out valid zip code
    And   Fill out valid city
    And   choose an account
    Then  save it