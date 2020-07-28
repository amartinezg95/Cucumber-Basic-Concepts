@RUN-IT2
Feature: Example with the simplest scenario outline

  Scenario Outline: creating a simple scenario outline test with BDD structure
    Given The user go to the shop
    When The user buy an <animal>
    Then the user visualize the <animal>
    Examples:
      | animal |
      | "cat"  |
      | "dog"  |