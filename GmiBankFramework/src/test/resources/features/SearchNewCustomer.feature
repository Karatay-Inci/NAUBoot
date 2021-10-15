Feature: Go To Home Page
  Scenario:As an Employee User valid login
    Given Go to GMIBank home page
    And click to login module and sign in
    When employee enter "employee_username" and "employee_password"
    And click to the sign in button
    And Employee clicks My operations module and Manage customers
    And Employee clicks on Create a new Customer button
    When Employee Search a new applicant by their SSN
    Then Verify user information populated
      | firstname     | asli             |
      | lastname      | tn               |
      | middleInitial |                  |
      | email         | t@gmail.com      |
      | mobilePhone   | 987-383-2736     |
      | phoneNumber   |                  |
      | zipCode       |                  |
      | address       | 222 large        |
      | city          |                  |
      | ssn           | 394-82-4784      |
      | create date   | 2021-10-09T00:00 |
      | country       |                  |
      | state         |                  |
      | user          |                  |
      | account       |                  |
