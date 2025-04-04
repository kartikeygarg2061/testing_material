
Feature: user login
@set11
Scenario Outline: for valid input session must be visible
When user enters "<username>" and "<password>"
Then user session should be available

Examples:
|username|password|
|standard_user|secret_sauce|
