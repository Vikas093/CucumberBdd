@FunctionalTest
Feature: ECommerce Application
 
@SmokeTest @RegressionTest
Scenario: Successful Login
Given This is a blank test1
 
@RegressionTest
Scenario: UnSuccessful Login
Given This is a blank test2
 
@SmokeTest 
Scenario: Add a product to bag
Given This is a blank test3
 
Scenario: Add multiple product to bag
Given This is a blank test4
 
@SmokeTest @RegressionTest
Scenario: Remove a product from bag
Given This is a blank test5
 
@RegressionTest
Scenario: Remove all products from bag
Given This is a blank test6
 
@SmokeTest
Scenario: Increase product quantity from bag page
Given This is a blank test7
 
Scenario: Decrease product quantity from bag page
Given This is a blank test8
 
@SmokeTest @End2End
Scenario: Buy a product with cash payment
Given This is a blank test9
 
@SmokeTest @End2End
Scenario: Buy a product with CC payment
Given This is a blank test10
 
@End2End
Scenario Outline: Payment declined
Given This is a blank test11

Examples:
|PaymentMethod|
|CC Card|
|DD Card|
|Bank Transfer|
|PayPal|
|Cash|
