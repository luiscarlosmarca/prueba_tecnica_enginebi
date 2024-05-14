Feature: Subscription to plans in EngineBI Free Trial

  Background:
    Given the user navigates to the plans page

 @TC01
  Scenario: Subscription to the Free Trial Plan
    When he select the Free Trial plan
    And he enter their basic information with the following details:
      | First Name  | John                   |
      | Last Name   | Doe                    |
      | Email       | john.doded13d2221@example.com  |
      | Phone       | 1234567890             |
    And he complete the company information
    Then he confirm the subscription Free Trial plan
