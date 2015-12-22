Feature: Checking account balance on Bovada site 

In order to Know my Balance
As a User
I want to be able to login to the website and  check my account balance




Background:
Given I am in a Bovada Lint site

@Homepagetest

Scenario Outline: I want to login to the website with di accounts and check the account balance

When I Login with "<accountNo>"
Then I should see "<accountBalance>" on the home page
When I click on the account profile
Then I should see "<accountBalance>" on the Dashboard
And I log out




Examples:
| accountNo | accountBalance |
| 10729358 	| $99933.82 	 |
| 10846359 	| $1.00      |