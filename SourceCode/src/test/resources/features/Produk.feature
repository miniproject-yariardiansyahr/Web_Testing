Feature: AltaShop Web Produk related function

  @AltaStoreWeb @AltaProduk @AltaAddCart
  Scenario: User add produk to cart
    Given User on Altashop Homepage
    And User click Beli on M61 Shell
    And User click on cart logo

  @AltaStoreWeb @AltaProduk @AltaDeleteProduk
  Scenario: User delete produk on cart
    Given User on Altashop Homepage
    And User click Beli on M61 Shell
    And User click on cart logo
    And User click on decrease icon produk
    Then User will see pop up indicated no produk on cart

  @AltaStoreWeb @AltaProduk @AltaBuyProduk
  Scenario: User buy product
    Given User on Altashop Homepage
    And User click Beli on M62 Shell
    And User click on cart logo
    And User on Bayar button
    Then User redirected to AltaShop Transaction page

  @AltaStoreWeb @AltaProduk @AltaRatingProduk
  Scenario: User give rating to a produk
    Given User on Altashop Homepage
    And User click Detail on M62 Shell
    Then User give rating 4 on M62 Shell

  @AltaStoreWeb @AltaProduk @AltaHistoryProduk
  Scenario: User view their produk transaction history
    Given User on Altashop Homepage
    And User click on profile icon
    And User click on transaction menu
    Then User redirected to transaction history page

  @AltaStoreWeb @AltaProduk @AltaCategoryProduk
  Scenario: User view filtered produk by its category
    Given User on Altashop Homepage
    And User click on category field
    And User click on 76mm Shell category
    Then User should the filtered produk by its category

  @AltaStoreWeb @AltaProduk @AltaBuyProduk
  Scenario: User buy product with more than 1 quantity
    Given User on Altashop Homepage
    And User click Beli on M62 Shell
    And User click on cart logo
    And User input amount of the produk
    And User on Bayar button
    Then User redirected to AltaShop Transaction page