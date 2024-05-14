Feature: Subscription to plans in EngineBI Monthly

  Background:
    Given the user navigates to the plans page

  @TC01  @Regression
  Scenario: Subscription to the Monthly Plan with a Valid Credit Card
    When he select the Monthly plan
    And he enter their basic information with the following details:
      | First Name  | John                   |
      | Last Name   | Doe                    |
      | Email       | john.doe@example.com  |
      | Phone       | 1234567890             |
    And he complete the company information
    And he provide the credit card details with a valid card
    And he confirm the subscription Monthly plan

  @TC02
  Scenario: Subscription to the Monthly Plan with a Valid Credit Card
    When he select the Monthly plan
    And he enter their basic information with the following details:
      | First Name  | John                   |
      | Last Name   | Doe                    |
      | Email       | john.doe@example.com  |
      | Phone       | 1234567890             |
    And he complete the company information
    And he provide the credit card details with a declined card
    Then he should see an error message indicating that the card was declined
