# language: en
Feature: User register

  Background:
    Given I am on the register page

  Scenario: User register new account
    When I submit the following user data to register
      | email           | password |
      | rex@mail.com    | 12345678 |
      | tester@mail.com | 1111111  |
    Then show me a message
    """
    恭喜~
    註冊成功
    """