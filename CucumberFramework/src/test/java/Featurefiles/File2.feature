Feature: Login to the account

@ayush
Scenario: Login to account with correct credentails 


Given I navigate to webdriveruniversity website2
And I click on contact button2
And I enter "ayush" as username2
And I enter "ayush123" as password2
Then I click on login button2
And I verify thee "validation failed"