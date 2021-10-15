Feature: Login

  @Login
  Scenario: Successful Login with Valid Credentials
    Given User launch chrome browser
    When User opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and  password as "admin"
    And User clicks on login
    Then Page title should be "Dashboard / nopCommerce administration"
    When User clicks on logout link
    Then Page title should be "Your store. Login"
    And Close the browser