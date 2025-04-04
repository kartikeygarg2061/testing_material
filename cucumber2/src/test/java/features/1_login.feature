Feature: Login feature

Scenario: Verify login is succesful with valid login credentials
Given Login page is displayed

When enter the username and password
When click on the login button
When get text data
Then product page is displayed