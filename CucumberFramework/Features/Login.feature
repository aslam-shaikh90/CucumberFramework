Feature: Login

 

  Scenario: Successful login with valid credentials
    Given User Launch Chrome browser
    When  User Open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User Enter Email as "admin@yourstore.com" and password as "admin"
    And I click on the Login
    Then Page title should be "Dashboard /nopcommerce administration"
		When User click out link
		Then Page title should be "Your store. Login"
		And close browser
		  