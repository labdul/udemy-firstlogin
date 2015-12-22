Feature: Login to Udemy.com

In order to have access to My courses
As a User
I want to be able to login to Udemy site




@Login

Scenario: I want to login to Udemy site with my email

Given  I am on the Udemy site
When i click on Login link
And enter valid email address 
And enter valid password
And click on Login button
Then i am logged in


