Feature: Login page automation
Tag1 s
Background:  we can specify our acction here which needs to be executed prior to every scenario...like brower should be open with url
Scenario: Check login is successful with creds
Given  User is on login page
When  User enters valid "<username>" and "<password>"
And  Click on login button
Then  User is navigated to home page
And Close the browser	



Examples: 
| username | password |
| standard_user | secret_sauce |

