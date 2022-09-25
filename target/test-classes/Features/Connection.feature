Feature: Connection
  This feature allow user to connect to his account using phone number or email
  
  Background: 
    Given I am on the connexion page
    And I should see the email or phone number filed
    And I should see the password field
    And I should see connection button
  
  Scenario: Connect to TruskX account using an existing account
  	When I enter a phone number associated to an account
  	* I enter a password associated to an account
  	* I click on connection
  	Then The connection is successful
		* I should see my first and last name at the top of the page 
  
  Scenario: Connect to TruskX account using an existing account with invalid password
  	When I enter a phone number associated to an account
  	* I enter an invalid password
  	* I click on connection
  	Then  I should see a popup indicating that the password associated with this account is invalid
	
  