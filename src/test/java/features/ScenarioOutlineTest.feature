@RUN-IT2
Feature: Creating a simple scenario outline test

  Scenario Outline: creating a simple scenario outline test with BDD structure
    Given The user go to the shop
    When The user buy an <animal>
    Then the user visualize the <animal>
    Examples:
      | animal |
      | "cat"  |
      | "dog"  |