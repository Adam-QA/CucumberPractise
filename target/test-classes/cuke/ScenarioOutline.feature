@ignore
@Test4
Feature: Login to the site

  Scenario Outline: Login to site with correct username and password
    Given I navigate to demosite
    And I navigate to add a user
    And I create a username as "<UserName>" and password as "<Password>" and click save
    And I navigate to the login page
    When I input my username as "<UserName>" and password as "<Password>" and click login
    Then I should see a successful login

    Examples: 
      | UserName | Password |
      | admin    | admin    |
      | chicken  | chicken  |
