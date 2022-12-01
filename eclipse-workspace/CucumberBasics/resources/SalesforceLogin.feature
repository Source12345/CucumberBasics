Feature: Login Scenarions of Saleforce Application

Scenario: Login into saleforce with error message1
Given User Launch the saleforce application
When user enter username
Then Click on login button 
Then error message should be displayed "please enter your password"

Scenario: Login into saleforce with valid username and password
Given User Launch the saleforce application
When user enter username
When user enter password
Then Click on login button
