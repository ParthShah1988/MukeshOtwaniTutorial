Feature: Smoke testing of NOC Portal

  Scenario Outline: Login with valid credential
    Given Open chrome and start application
    When Enter valid "<username>" and valid "<password>"
    Then User should be able to login successfully
    Then Logout of the portal

    Examples: 
      | username  | password      |
      | nwr_sdm   | Sdm@12345     |
      | parth_tl  | Sdm@12345     |
      | user_eops | Eops@11cont17 |
