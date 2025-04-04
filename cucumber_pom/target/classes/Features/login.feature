Feature: Login feature

@set1
Scenario: Verify login is succesful with valid login credentials
Given Login page is displayed
When enter the username and password
When click on the login button
When get text data
Then product page is displayed


 @set2
 Scenario Outline: Login with valid and invalid login credentials
 Given The login page is displayed
 When user enters "<username>" and "<password>"
 When user clicks on login button
 Then The application should display the "<message>"
 
 Examples: 
|username			|password		  |message																																	 |
|standard_user|secret_sauce |Products																																	 |
|standard_user|secret_sauce1|Epic sadface: Username and password do not match any user in this service | 