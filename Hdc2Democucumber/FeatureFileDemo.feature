Feature: user validations on TESTME Application

Scenario: user verification for the registration in TESTME 
Given TESTME app is launched
And user accessing registartion link in TESTME app
When user providing valid data for all the required fields
Then user verifying registration status

Scenario: user verification for the login process
Given TESTME is launched and accessible
Then user click on the login link is available in homepage
And provides the valid credentials
Then user checks the login status