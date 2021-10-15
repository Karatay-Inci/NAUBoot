@user_info
Feature: There_should_be_user_info_being_populated_in_user_info_segment

  #Background: user_goes_to_application_home_page
   # Given user is on the application_home page
    #And user navigates to user_icon
    #And user clicks on sign_in button

  Scenario Outline: TC_01_login_with_user_profile_to_see_all_available_user_information
    Given user is on the application_home page
    And user navigates to user_icon
    And user clicks on sign_in button
    And user enters username "<username>"
    And user enters password "<password>"
    And clicks on sign_in button
    And user clicks on user_icon
    And user clicks on user_info
    Then user verifies first_name has "<first_name>"
    Then user verifies last_name has "<last_name>"
    Then user verifies email has "<email>"
    Then close the application

    Examples: test_data

      |username|password|first_name|last_name|email           |
      |gulnur  |Gulnur1!|Gulnur    |Gul      |gulnur@gmail.com|

  Scenario Outline: TC_02_login_with_user_profile_to_see_all_updated_user_information
    Given user is on the application_home page
    And user navigates to user_icon
    And user clicks on sign_in button
    And user enters username "<username>"
    And user enters password "<password>"
    And clicks on sign_in button
    And user clicks on user_icon
    And user clicks on user_info
    Then user verify if firstname is updatable with "<new_first_name>"
    Then user verify if lastname is updatable with "<new_last_name>"
    Then user verify if email is updatable by adding "<new_sign_extention>"
    Then user verifies languages are available
    Then close the application

    Examples: test_data
      |username|password|new_first_name|new_last_name|new_sign_extention|
      |gulnur  |Gulnur1!|Gulnura       |Guler        |gulnura@gmail.com|