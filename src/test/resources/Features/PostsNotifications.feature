Feature: Posts notifications
  This feature allow user to verify if she/he can receive notification by phone
  
 	Scenario: Receive SMS notifications
	Given I am registered with my phone number
	When a Trusk member published a post
	Then I should  receive an SMS notification with get the following message: Hello First name, you have a new post to read on TruskX. To view it, click on this link xxxxx/truskX.com.
	When I click on the link indicated on message
	Then I should be directed to the Posts page
	
