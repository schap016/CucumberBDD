Feature: Login - Navigate to Gmail page And be able to login using account credentials

Scenario Outline: Navigate to Gmail and login
Given I opened "https://www.gmail.com" page 
Then username field should be visible
When "<username>" is entered in username field
And next is clicked
Then password field should be visible
When "<password>" is entered in password field
And next is clicked
Then close browser



Examples:
	| username | password | 
	| samanthatestchapa@gmail.com  | Pass@1234 |
	 	
