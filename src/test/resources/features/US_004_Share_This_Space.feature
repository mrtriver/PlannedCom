Feature: share in iFrame

  Background:
    Given user goes to "base_url"
    Then user closes alerts on the bottom
    Then user clicks on play button
    And user clicks on share icon

  Scenario: TC_001 share icon visibility/click-ability
    When user verifies share icon is visible
    Then user verifies share icon is clickable

  Scenario: TC_002 share close visibility click-ability
    When user verifies close button in share is visible
    Then user verifies close button in share is enabled

  Scenario: TC_003 texts visibility
    When user verifies Share text is visible
    Then user verifies link text is visible
    And user verifies copy text is visible
    And user verifies checkbox text is visible

  Scenario Outline:TC_004 social media icon visibility
    Then user checks visibility of "<text>" social media icon
    Examples:
      | text                |
      | icon icon-facebook  |
      | icon icon-twitter   |
      | icon icon-linkedin  |
      | icon icon-pinterest |
      | icon icon-email     |

  Scenario Outline: TC_005 social media icon click-ability
    Then user checks click-ability of "<text>" social media icon
    Examples:
      | text                |
      | icon icon-facebook  |
      | icon icon-twitter   |
      | icon icon-linkedin  |
      | icon icon-pinterest |
      | icon icon-email     |

  Scenario Outline: TC_006 click on social media icons
    When user clicks on "<social_media>" icon
    Then user closes popup
    Examples:
      | social_media        |
      | icon icon-facebook  |
      | icon icon-twitter   |
      | icon icon-linkedin  |
      | icon icon-pinterest |
      | icon icon-email     |

  Scenario: TC_007 checks if copy works
    When user clicks on the copy button
    Then user verifies copy button works