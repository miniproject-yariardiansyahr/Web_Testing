Feature: AltaShop Web Register Function

  @AltaStoreWeb @AltaAuth @AltaPositiveReg
  Scenario: User register with correct identity
    Given User is on register page
    When User input correct identity
    And User click register button
    Then User redirected to login page

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank name
    Given User is on register page
    When User input blank name on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank email
    Given User is on register page
    When User input blank email on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank password
    Given User is on register page
    When User input blank password on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank name and email
    Given User is on register page
    When User input blank name and email on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank name and password
    Given User is on register page
    When User input blank name and password on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank email
    Given User is on register page
    When User input blank email on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank email and password
    Given User is on register page
    When User input blank email and password on form
    And User click register button
    Then User should see pop up blank register error

  @AltaStoreWeb @AltaAuth @AltaNegativeReg
  Scenario: User register with blank password
    Given User is on register page
    When User input blank password on form
    And User click register button
    Then User should see pop up blank register error