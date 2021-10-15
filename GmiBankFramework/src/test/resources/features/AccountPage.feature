#authorBurcu
Feature: Create new account as an Employee

  Background:
    Given Go to GMIBank home page
    Given click to login module and sign in
    Given employee enter "employee_username" and "employee_password"
    Given click to the sign in button
    Given Click on My Operations
    Given Click on Manage Accounts
    Given Click on Create a new Account

  @Regression @Smoke
  Scenario:US_13 TC_01 Create description for the new account
    When provide description
    And enter Balance
    And click on Save button
    Then account created toast message display

  @Regression @Smoke
  Scenario:US_13 TC_02 Create description for the new account
    When enter Balance
    And click on Save button
    Then 'This field is required'  feedback is appeared

  @Regression
  Scenario:US_13 TC_04 Select account type
    When click on Account Type
    Then Account Type options displayed

      | CHECKING    |
      | SAVING      |
      | CREDIT_CARD |
      | INVESTING   |

  @Regression @Smoke
  Scenario:US_13 TC_05 Select account type
    When click on Account Type
    Then Account Type options selectable

      | CHECKING    |
      | SAVING      |
      | CREDIT_CARD |
      | INVESTING   |