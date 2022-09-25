Feature: Regestration
  This feature allow user to create an account on TruskX using his phone number or email

  Background: 
    Given I am on the connexion page
    And I should see the email or phone number filed
    And I should see the password field
    And I should see connection button
    When I click on registration 
    Then The registration page should be open
	   * I should see the email or phone number filed on registration page
	   * I should see the password field on registration page
	   * I should see the password confirmation field on registration page
	   * I should see the register button
	   * I should see GCU checkbox 
 
  
  @invalidPhoneNumber
  Scenario: Register with invalid phone number
  When I enter an invalid phone number
  * I enter a password that meets the requirements
  * I click on registration
  Then I should see a popup indicating that the phone number is invalid
  
  @invalidPasswordRequirements
  Scenario: Register with invalid password 
  When I enter an existing phone number
  * I enter a password that does not meet the requirements
  * I click on registration
  Then I should see a popup indicating that the password entered does not meet the requirements
 
	@validPhoneNumberANDPassword
	Scenario: Register with valid phone number and password 
  When I enter an existing phone number
  * I enter a password that meets the requirements
  * I click on registration
  Then I should see a popup to confirm that registration is with success
  * I must be logged into my account

