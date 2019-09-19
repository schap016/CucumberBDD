Feature:  PHP Travels Home Page Navigation

@SmokeTest
Scenario: Navigate to PHPTravels
	Given I opened "https://phptravels.net" page 
	Then should be redirected to "PHPTRAVELS | Travel Technology Partner" page


@RegressionTest
Scenario: Navigate to phpTravels, sign up and login
	Given I opened "https://www.phptravels.net/register" page
	Then should be redirected to "Register" page
	When I entered registration details
	| Samantha Sree | Chapa | 9876543210 | samanthatestchapa@gmail.com | Pass1234 |
	When I clicked signup 
	Then should be redirected to "My Account" page


@RegressionTest
Scenario Outline: Navigate to phpTravels, create users
	Given I opened "https://www.phptravels.net/register" page
	Then should be redirected to "Register" page
	When I entered "<firstname>" as "firstname"
	When I entered "<lastname>" as "lastname"
	When I entered "<phone>" as "phone"
	When I entered "<email>" as "email"
	When I entered "<password>" as "password"
	When I entered "<password>" as "confirmpassword"
	When I clicked signup 
	Then should be redirected to "My Account" page


Examples:
	| firstname | lastname | phone | email | password |
	| Samantha Sree | Chapa | 9876543210 | samantha.chapa@gmail.com | Pass1234 |
	| Samantha Sree | Chapa | 9876543210 | samanthachapa31990@gmail.com | Pass1234 |
	
	
	 	

