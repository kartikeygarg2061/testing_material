@set10
Feature: login feature
Scenario: Verify the successful login
Given login page displayed
When user enter userid and password
When user click on the login button
When click on the books link
When click on add to cart button for items
When click on the shopping link
When update for quantity
#When check for value
When delete from cart
#When check product
When filling shipping details
When click on the termsNconditions checkbox
When click the checkout button
When enter the billing address
When enter the shipping address
When enter the payment method
When enter the payment information
When confirm order
Then order confirmed