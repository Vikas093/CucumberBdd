$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/vikas/eclipse-workspace/MavenDemoTest/src/main/java/Features/background.feature");
formatter.feature({
  "name": "Test Background Feature",
  "description": "Description: The purpose of this feature is to test the Background keyword",
  "keyword": "Feature"
});
formatter.background({
  "name": "User is Logged In",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.i_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit username and password",
  "keyword": "When "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.i_submit_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.i_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search a product and add the first product to the User basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User search for Lenovo Laptop",
  "keyword": "Given "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.user_searched_for_Lenovo_Laptop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add the first laptop that appears in the search result to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.add_the_first_laptop_that_appears_in_the_search_result_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User basket should display with added item",
  "keyword": "Then "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.user_basket_should_display_with_item()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "User is Logged In",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.i_navigate_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I submit username and password",
  "keyword": "When "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.i_submit_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.i_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to a product and add the same to the User basket",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User navigate for Lenovo Laptop",
  "keyword": "Given "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.user_navigate_for_Lenovo_Laptop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add the laptop to the basket",
  "keyword": "When "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.add_the_laptop_to_the_basket()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User basket should display with added item",
  "keyword": "Then "
});
formatter.match({
  "location": "BackGroundStepDefinaationFile.user_basket_should_display_with_item()"
});
formatter.result({
  "status": "passed"
});
});