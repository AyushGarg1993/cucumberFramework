@super
Feature: I want to login in webdriveruniverist website

@important
Scenario Outline:  I am trying to automate username password login feature

Given I navigate to webdriveruniversity website
And I click on contact button 
And I enter "<username>" as username
And I enter "<password>" as password
Then I click on login button
And I verify the "<message>"

Examples: 
|username |password    |message               |
|webdriver|webdriver1234|validation succeeded  |
|ayush    |ayush123    |validation failed     | 


#@login
#Scenario: Login to account with correct credentails 
#
#Given User navigates to stack over flow website   
#And User enters clicks on the login button    
#And user enters a valid username
#And user enters a valid password
#When user clicks on login button
#Then user should be taken to successfully login page