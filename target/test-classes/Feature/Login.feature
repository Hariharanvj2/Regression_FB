Feature: To validate login functionality

Background:
Given Launch a chrome browser hit a FB url

Scenario: To verify the login functionality with invalid username and password

When User enter a Username and Password
|Hari|hari@234|

And Click the login button

Then User unable to login and close the browser

Scenario: To verify the forget password link for invalid user

When user has to click the forget password link

And user has to enter the Invalid mobnum and click the search button
|12345|

Then Read the error message and Close the browser