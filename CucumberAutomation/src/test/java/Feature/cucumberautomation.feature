Feature: Functionalities of thedemosite.co.uk

  Scenario Outline: Validate login functionalities
    Given I launch thedemosite
    When I want to create user and login with <username> and <password> in step
    Then I verify the <status> in step

    Examples: 
      | username      | password      | status  |
      | "testuser123" | "testuser123" | success |
      | "testuser345" | "testpass343" | Fail    |
