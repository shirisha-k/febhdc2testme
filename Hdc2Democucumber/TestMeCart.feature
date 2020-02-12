Feature: TestMe validation for the cart
@Sanity
Scenario: User cross check for adding item in cart
Given Application launched by registered user for cart
Then User verifying add item
@Regression
Scenario: User cross chexk for removing item in cart
Given Application launched by registered user for cart
Then User verifying remove item
@Sanity @Regression
Scenario: User cross check for max count in cart
Given Application launched by registered user for cart
And User verifies the max count of items in cart