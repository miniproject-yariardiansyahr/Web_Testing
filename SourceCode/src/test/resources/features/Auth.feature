Feature: AltaShop Web Authentications Function

  @AltaStoreWeb @AltaAuth @AltaPositiveLogin
  Scenario: User login with given identity
    Given User is on login page
    When User input correct credentials
    And User click login button
    Then User redirected to AltaShop homepage

  @AltaStoreWeb @AltaAuth @AltaPositiveLogout
  Scenario: User loging out account
    Given User on Altashop Homepage
    And User click on profile icon
    And User click on log out icon
    Then User redirected to login page

  @AltaStoreWeb @AltaAuth @AltaNegativeLogin
  Scenario: User login with incorrect email
    Given User is on login page
    When User input incorrect email
    And User click login button
    Then User should see pop up error

  @AltaStoreWeb @AltaAuth @AltaNegativeLogin
  Scenario: User login with incorrect password
    Given User is on login page
    When User input incorrect password
    And User click login button
    Then User should see pop up invalid error

  @AltaStoreWeb @AltaAuth @AltaNegativeLogin
  Scenario: User login with incorrect credentials
    Given User is on login page
    When User input incorrect credentials
    And User click login button
    Then User should see pop up error

  @AltaStoreWeb @AltaAuth @AltaNegativeLogin
  Scenario: User login with incorrect email
    Given User is on login page
    When User input blank email
    And User click login button
    Then User should see pop up blank error

  @AltaStoreWeb @AltaAuth @AltaNegativeLogin
  Scenario: User login with incorrect email
    Given User is on login page
    When User input blank password
    And User click login button
    Then User should see pop up blank password error

  @AltaStoreWeb @AltaAuth @AltaNegativeLogin
  Scenario: User login with incorrect credentials
    Given User is on login page
    When User input blank credentials
    And User click login button
    Then User should see pop up blank error

