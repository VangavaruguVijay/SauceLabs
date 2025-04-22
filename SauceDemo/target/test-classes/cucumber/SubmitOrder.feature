@tag
Feature: Add products to the cart and submit the order from Swag Labs website
@tag2
Scenario Outline: Login to Sauce Demo website and submit the order of the products
Given URL is launched and tittle of the website is verified
When User logged in with valid username and password
Then User is on the products page and Add products to the cart
And Move to cart and checkout
And Add <firstName> <lastName> <Pincode> information
Then Finish the order and verify <message> on the confirmation page 

Examples: 
| firstName  | lastName | Pincode  | message                  |
| Vijaya     |Bhaskar   |560066    | THANK YOU FOR YOUR ORDER |