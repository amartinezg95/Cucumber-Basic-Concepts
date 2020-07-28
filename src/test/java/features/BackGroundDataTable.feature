@IN-PROGRESS
Feature: This will integrate an scenario with background step and data tables

  Also we can add some comments here with different steps that could give more info about the scenario

  Info:
  * This scenario is about a controller
  * Endpoint: GET /api/v1/sku
  * Pages: Sí

  The data base table: data_base_table

  SQL sentence:
  * select * from data_base_table.table_one

  prerequisites needed to perform the request...

  Background:
    Given Headers used in the request
      | accept   | application/json |
      | language | english          |
    Given authentication

  Scenario Outline: get request /api/v1/someEndpoint
    When The get request is apply with the <user>
    Then Validate that the <user> has the animal <animal>
    And The http code return 200
    Examples:

      | user      | animal    |
      | "Paquito" | "hamster" |