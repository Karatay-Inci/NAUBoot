Feature: US_011 Date should be created on the time of customer creation

  @US-011
  Scenario: TC_0005_08 User cannot choose an account and cannot select Zelle Enrolled optionally and save it
    Given Go to GMIBank page
    And   Sign in with valid employee user name and password
    And   Select My Operations Menu
    And   Management Customers
    And   Create New Customer
    And   Fill out valid SSN
    #And   Click search button
    And   Fill out valid firstname
    And   Fill out valid surname
    And   Fill out valid middle initial
    And   Fill out valid email
    And   Fill out valid mobile number
    And   Fill out valid phone number
    And   Fill out valid zip code
    And   Fill out valid address
    And   Fill out valid city
    And   Fill out valid ssn
    And   Fill out valid country
    And   Fill out valid state
    Then  Not choose any account
    Then  Not Select Zelle Enrolled
    Then  Save it
    Then  Tests that you are saved