
Feature: Customer
 
Scenario: Add New Customer
  Given User Launch Edge browser
	When User open URL "https://admin-demo.nopcommerce.com/login"
#	And User enter email as "admin@yourstore.com" and password as "admin"
	And User enter email as "<emailId>" and password as "<Password>"
	And Click on login
	Then User can view Dashboard
	When User click on customers Menu Item
	And click on customer menu Item
	And click on Add new button
	Then User enter customer info
	And click on save button
	Then User can view confirmation message "The new customer has been added Successfully."
	And close Browser
	
  Examples: 
		|emailId|Password|
		|admin@yourstore.com|admin|


#Feature: Customers
#
#Background: Steps common for all scenrios
#Given User Launch Chrome browser 
#	When User opens URL "http://admin-demo.nopcommerce.com/login" 
#	And User enters Email as "admin@yourstore.com" and Password as "admin" 
#	And Click on Login 
#	Then User can view Dashboad 
#	
#@regression
#Scenario: Add New Customer
#
#	When User click on customers Menu 
#	And click on customers Menu Item 
#	And click on Add new button 
#	Then User can view Add new customer page 
#	When User enter customer info 
#	And click on Save button 
#	Then User can view confirmation message "The new customer has been added successfully." 
#	And close browser
#
#@regression
#Scenario: Search Customer by Email
#	
#	When User click on customers Menu 
#	And click on customers Menu Item 
#	And Enter customer EMail
#	When Click on search button
#	Then User should found Email in the Search table
#	And close browser 
#	
#@Sanity
#Scenario: Search Customer by Name
#	
#	When User click on customers Menu 
#	And click on customers Menu Item 
#	And Enter customer FirstName
#	And Enter customer LastName
#	When Click on search button
#	Then User should found Name in the Search table
#	And close browser 