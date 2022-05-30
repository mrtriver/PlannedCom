@Assignment
Feature: show case play

  Background:
    Given user is on the home page
    Then user closes alerts on the bottom
    When user clicks on the Show case play button
    Then user verifies if the Show case plays
    And user clicks on fullscreen

#  Scenario:TC _003
#    And user clicks on floor icon
#    Then user clicks on "Floor 1"
#    And user clicks on floor icon
#    Then user clicks on "Floor 2"
#    And user clicks on floor icon
#    Then user clicks on "Floor 3"

  Scenario: TC_001
    When user clicks on exploreThreeD_Out icon
    Then user verifies if exploreThreeD_In icon is clickable

  Scenario: TC_002
    When user clicks on View Floor Plan_In_button
    Then user verifies if the View Floor_Out button is clickable



    Scenario: TC_004

    Then user verifies floor icon is visible
    And user verifies floor icon is click-able