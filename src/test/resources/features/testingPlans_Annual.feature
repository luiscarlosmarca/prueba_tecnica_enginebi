Feature: Subscription to plans in EngineBI  Plan Annual

  Background:
    Given the user navigates to the plans page

  Scenario: Subscription to the Annual with a Valid Credit Card
    When he select the Annual plan
    And he enter their basic information with the following details:
      | First Name  | John                   |
      | Last Name   | Doe                    |
      | Email       | Piter.doe@example.com  |
      | Phone       | 1234567890             |
    And he complete the company information
    And he provide the credit card details with a valid card
    And he confirm the subscription Annual plan

