@SignIn
Feature: Oscommerce sign in

Scenario: Oscommerce sign in page.

Given Iam on the webpage
When I click username and password page
And I sign in
Then I am in account page