Feature: BellyFeature

  Scenario: eaten many cukes
    Given I have eaten 42 cukes
    When I wait 2 hour
    Then my Belly should growl

