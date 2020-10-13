$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("tea.feature");
formatter.feature({
  "line": 3,
  "name": "Shopping on a website As a person I want to browse items on a website So that I can purchase the items I want",
  "description": "",
  "id": "shopping-on-a-website-as-a-person-i-want-to-browse-items-on-a-website-so-that-i-can-purchase-the-items-i-want",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Test3"
    }
  ]
});
formatter.before({
  "duration": 3679383700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Browse the items available on the website",
  "description": "",
  "id": "shopping-on-a-website-as-a-person-i-want-to-browse-items-on-a-website-so-that-i-can-purchase-the-items-i-want;browse-the-items-available-on-the-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to the \u0027Menu\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I can browse a list of the available products.",
  "keyword": "Then "
});
formatter.match({
  "location": "PractiseSelenium.we_can_open_website()"
});
formatter.result({
  "duration": 11553446300,
  "status": "passed"
});
formatter.match({
  "location": "PractiseSelenium.we_search_for_menu()"
});
formatter.result({
  "duration": 481556800,
  "status": "passed"
});
formatter.match({
  "location": "PractiseSelenium.website_will_return_list_of_products()"
});
formatter.result({
  "duration": 22524300,
  "status": "passed"
});
formatter.after({
  "duration": 620906000,
  "status": "passed"
});
formatter.before({
  "duration": 3118150800,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Add an item to the checkout",
  "description": "",
  "id": "shopping-on-a-website-as-a-person-i-want-to-browse-items-on-a-website-so-that-i-can-purchase-the-items-i-want;add-an-item-to-the-checkout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "the correct web address",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I navigate to the \u0027Menu\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the checkout button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I am taken to the checkout page",
  "keyword": "Then "
});
formatter.match({
  "location": "PractiseSelenium.we_can_open_website()"
});
formatter.result({
  "duration": 10812514300,
  "status": "passed"
});
formatter.match({
  "location": "PractiseSelenium.we_search_for_menu()"
});
formatter.result({
  "duration": 406325900,
  "status": "passed"
});
formatter.match({
  "location": "PractiseSelenium.i_click_the_checkout_button()"
});
formatter.result({
  "duration": 10513788200,
  "status": "passed"
});
formatter.match({
  "location": "PractiseSelenium.i_am_taken_to_the_checkout_page()"
});
formatter.result({
  "duration": 22002100,
  "status": "passed"
});
formatter.after({
  "duration": 607719800,
  "status": "passed"
});
});