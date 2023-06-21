Feature: Login

Scenario: Succesful Login with valid credentials
	Given User Launch Edge browser
	When User open URL "https://admin-demo.nopcommerce.com/login"
	And User enter email as "admin@yourstore.com" and password as "admin"
#	And User enter email as "<email>" and password as "<Password>"
	And Click on login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User click on logout link
	Then Page title should be "Your store. Login"
	And close Browser
	
		

#-----------------Verify Dashboard----------------------------

#Feature: Dashboard

Scenario Outline: Successful Login with valid Credentials DDT 	
  Given User Launch Edge browser
	When User open URL "https://admin-demo.nopcommerce.com/login"
#	And User enter email as "admin@yourstore.com" and password as "admin"
	And User enter email as "<email>" and password as "<Password>"
	And Click on login
	Then Page title should be "Dashboard / nopCommerce administration"
	When User click on logout link
	Then Page title should be "Your store. Login"
	And close Browser
	
Examples: 
		|email|Password|
		|admin@yourstore.com|admin|
		|atest@yourstore.com|admin|