
Feature:Update account settings

  Background: User is Logged In
    Given I navigate to the login page
    When I submit username and password
      | seconduser.test@yandex.com | secondusertest |

  Scenario: Update username field information
    Given User is on Deezer Home Page
    When User clicks on Topbar-profile button
    And User clicks on Account settings
    And User Edits Username field with updateUsername
    And Clicks on Save button
    Then Confirmation message Your data has been updated id displayed
    When User refreshes the page
    And User Clicks on user account
    Then User account is updated with new username

#
#  Scenario: Update profile language
#    Given User is on Deezer Home Page
#    When User clicks on Topbar-profile button
#    And User clicks on Account settings
#    And Romanian language is selected from Language drop-down list
#    And User Clicks on Save button
#    Then Confirmation message Your data has been updated is displayed
#    And Language profile has been change
#
#
#  Scenario: Update Privacy settings
#    Given User is on Deezer Home Page
#    When User clicks on Topbar-profile button
#    And User clicks on Account settings
#    And Clicks on Privacy settings
#    Then Cookie and tracking technology policy window is displayed
#    When User uncheck Mesurement and Ad selection, delivery, reporting check-boxes
#    And Presses on I agree button
#    Then User is return on Account Settings
#    When User clicks on Privacy settings
#    Then Privacy settings is displayed
#    And Check-boxes Mesurement and Ad selection, delivery, reporting are unchecked
#
#  Scenario: User is able to add an artist to Albums
#    Given User is on Deezer Home page
#    When User clicks on Albums sidebar
#    And User clicks on the search field
#    And User fill in Albums name
#    And User clicks on the search button
#    Then Albums name is displayed in Top Result
#    When User clicks on Albums name albums
#    And User clicks on Add button
#    And User clicks on Albums sidebar
#    Then Added album is displayed on Albums page
#
#  Scenario: User is able to delete an existing artist from Albums page
#    Given User is on Deezer Home page
#    When User clicks on Albums sidebar
#    And User clicks on Album name icon
#    And User clicks on Remove button
#    And User clicks on Albums sidebar
#    Then Albums name is not displayed on Albums page