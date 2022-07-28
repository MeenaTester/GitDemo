Feature: Search and place order for the products
@OfferTest
Scenario Outline: Search experience for product should be same in both home page and offer page
Given User is on Greencart landing page
When User search with shortname <Name> and actual name of product should be extracted
Then User search for same shortname in offer page to check if product exist
And validate product name in offer page matches with landing page

Examples:
|Name|
|Beet|
