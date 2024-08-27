Feature: Paramertization Nopcommerce application

  Scenario Outline: Login Data Driven Testing
    Given User Launch Chrome browser
    When User opens URL "<url>"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "Your store. Login"
    And close browser

    Examples: 
      | url                                     | email               | password |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
      | http://admin-demo.nopcommerce.com/login | admin@yourstore.com | admin    |
