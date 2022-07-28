Feature: Search the products and add to cart and check the cart page
@CartTest
Scenario Outline: Product is added corrctly in cart page
Given User is on Greencart landing page
When User search prouct <Name>
And Added "3" items of selected product to cart
Then In checkout page selected product is added and user can select apply and promocode
And validate selected product in landing page is added correctly in cart page

Examples:
|Name|
|Tom|
|Beet|

