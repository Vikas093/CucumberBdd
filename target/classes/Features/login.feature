Feature: Free CRM Login Feature

Scenario Outline: Free CRM Login Test Scenario


# ------------------------------In the simple case used without Parameterizing--------------------------------------------------

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters username and password
#Then user clicks on login button
#Then user is on home page
#Then Close the browser


#-----------------------------With Parameterizing without example keyword----------------------------------------------
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "vikaspaliwal524@gmail.com" and "Tushar123$"
#Then user clicks on login button
#Then user is on home page
#Then Close the browser
#




-----------------------------With Parameterizing with example keyword----------------------------------------------
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<userName>" and "<password>"
Then user clicks on login button
Then user is on home page
Then Close the browser


Examples:
	| userName | password |
	| vikaspaliwal524@gmail.com | Tushar123$|

#---------------------------- With dataTable class method of cucumber method name is aslist()-----------------------------------

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters username and password
# |vikaspaliwal524@gmail.com|Tushar123$|
# |tom|jerry|
#Then user clicks on login button
#Then user is on home page
#Then Close the browser

#---------------------------- With dataTable class method of cucumber method name is asmap()-----------------------------------

#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters username and password
#|username|password|
# |vikaspaliwal524@gmail.com|Tushar123$|
#Then user clicks on login button
#Then user is on home page
#Then Close the browser