@Assignment
  Feature: Home page elements and show case play
  Scenario: TC_001 Buttons clickable and texts visible on the home page


    Given user is on the home page
    Then user verifies Get availibility button is clickable
    Then user verifies Save button is clickable
    When user clicks show more, the page scrolls downs
    Then user verifies we guarantiee text is visible
    Then user verifies Industrial Event text is visible
    Then user verifies Montreal, $$ and star rate is visible




