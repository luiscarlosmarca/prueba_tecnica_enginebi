Feature: Subscription to plans in EngineBI Plan Platinum

  Background:
    Given the user navigates to the plans page

   @TC01
   Scenario: Subscription to the Platinum paid up front
    When he select the Platinium plan
    And  he chosen paid up front
    And he enter their basic information with the following details:
      | First Name  | Joel                   |
      | Last Name   | Doe                    |
      | Email       | Joel.doe@example.com  |
      | Phone       | 1234567890             |
    And he complete the company information
    And he provide the credit card details with a valid card
    And he confirm the subscription Platinum plan

  @TC02
  Scenario: Subscription to the Platinum per month
    When he select the Platinium plan
    And  he chosen per month
    And he enter their basic information with the following details:
      | First Name  | Joel                 |
      | Last Name   | Doe                    |
      | Email       | Joel.doe@example.com  |
      | Phone       | 1234567890             |
    And he complete the company information
    And he provide the credit card details with a valid card
    And he confirm the subscription Platinum plan
