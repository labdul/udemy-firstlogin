$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/featurefiles/Udemylogin.feature");
formatter.feature({
  "id": "login-to-udemy.com",
  "description": "\r\nIn order to have access to My courses\r\nAs a User\r\nI want to be able to login to Udemy site",
  "name": "Login to Udemy.com",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 8302631701,
  "status": "passed"
});
formatter.scenario({
  "id": "login-to-udemy.com;i-want-to-login-to-udemy-site-with-my-email",
  "tags": [
    {
      "name": "@Login",
      "line": 10
    }
  ],
  "description": "",
  "name": "I want to login to Udemy site with my email",
  "keyword": "Scenario",
  "line": 12,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the Udemy site",
  "keyword": "Given ",
  "line": 14
});
formatter.step({
  "name": "i click on Login link",
  "keyword": "When ",
  "line": 15
});
formatter.step({
  "name": "enter valid email address",
  "keyword": "And ",
  "line": 16
});
formatter.step({
  "name": "enter valid password",
  "keyword": "And ",
  "line": 17
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And ",
  "line": 18
});
formatter.step({
  "name": "i am logged in",
  "keyword": "Then ",
  "line": 19
});
formatter.match({
  "location": "UdemyStartingSteps.i_am_on_the_Udemy_site()"
});
formatter.result({
  "duration": 9561457377,
  "status": "passed"
});
formatter.match({
  "location": "UdemyHomePageSteps.i_click_on_Login_link()"
});
formatter.result({
  "duration": 1307778574,
  "status": "passed"
});
formatter.match({
  "location": "UdemyHomePageSteps.enter_valid_email_address()"
});
formatter.result({
  "duration": 936109836,
  "status": "passed"
});
formatter.match({
  "location": "UdemyHomePageSteps.enter_valid_password()"
});
formatter.result({
  "duration": 485778809,
  "status": "passed"
});
formatter.match({
  "location": "UdemyHomePageSteps.click_on_Login_button()"
});
formatter.result({
  "duration": 233506497,
  "status": "passed"
});
formatter.match({
  "location": "UdemyCoursePageSteps.i_am_logged_in()"
});
formatter.result({
  "duration": 14464627324,
  "status": "passed"
});
formatter.after({
  "duration": 1954565896,
  "status": "passed"
});
});