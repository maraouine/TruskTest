Feature: Posts creation
  This feature allow user to publish a post 
  
    Scenario: Create a post using Truskx account

	 	Given I am connected to my Trusk space
	 	When I click on publish a post
	 	Then I should see a text field is displayed allowing you to fill in the details of the post
	 	When I enter the content of the post
	 	* I click on publish post
	 	Then  I should see a popup indicating that the post has been published
	 	