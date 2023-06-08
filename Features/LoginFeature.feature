Feature: Login

Scenario: Succesful Login with valid credentials
	Given User Launch Edge browser
	When User open URL "https://admin-demo.nopcommerce.com/login"
	And User enter email as "admin@yourstore.com" and the password as "admin"
	And Click on login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User click on logout link
	Then Page title should be "Your store. Login"
	And close Browser
	