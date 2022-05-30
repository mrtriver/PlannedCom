@Assignment
Feature: iframe search

  Background: goes page/plays button
    Given user goes to "base_url"
    Then user closes alerts on the bottom
    Then user clicks on play button
    And user clicks on fullscreen
    Then user clicks on the search icon

  Scenario Outline: Search visibility
    When user verifies "<tag_id>" is visible
    Then user closes the browser
    Examples:
      | tag_id |
      | [1]    |
      | [2]    |
#      | [3]    |
#      | [4]    |
#      | [5]    |
#      | [6]    |
#      | [7]    |
#      | [8]    |
#      | [9]    |
#      | [10]   |
#      | [11]   |
#      | [12]   |
#      | [13]   |
#      | [14]   |
#      | [15]   |

  Scenario: Search click-ability
    When user verifies "[1]" is enabled
    When user verifies "[2]" is enabled
    When user verifies "[3]" is enabled
    When user verifies "[4]" is enabled
    When user verifies "[5]" is enabled
#    When user verifies "[6]" is enabled
#    When user verifies "[7]" is enabled
#    When user verifies "[8]" is enabled
#    When user verifies "[9]" is enabled
#    When user verifies "[10]" is enabled
#    When user verifies "[11]" is enabled
#    When user verifies "[12]" is enabled
#    When user verifies "[13]" is enabled
#    When user verifies "[14]" is enabled
#    When user verifies "[15]" is enabled



  Scenario Outline: dropdown option click-ability in the search
    When user clicks dropdown
    And user clicks on "<text>" option
    Examples:
      | text  |
      | floor |
      | type  |

  Scenario: user closes search
    And user verifies close button is visible
    Then user verifies close button is enabled
    Then user closes search field
  Scenario Outline: search
    When user clicks on searchbar
    And user enters "<searchWord>" and result number is "<num>"
    Examples:
      | searchWord | num |
      | Mur        | 8   |
      | Exposed    | 1   |
      | Painting   | 1   |
      | bar        | 1   |
#      | new        | 1   |
#      | our        | 3   |
#      | like       | 5   |
#      | up         | 2   |
#      | none       | 0   |

  Scenario: user verifies searchbar is visible and enabled
    And user verifies searchbar is visible
    Then user verifies searchbar is enabled