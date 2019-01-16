Feature: Login to the account

@ankan
Scenario: Login to account with correct credentails 


Given I navigate to webdriveruniversity website
And I click on contact button 
And I enter "ayush" as username
And I enter "ayush123" as password
Then I click on login button
And I verify the "validation failed "

#Examples: 
#|username |password    |message               |
#|webdriver|webdriver123|validation succeeded  |
#|ayush    |ayush123    |validation failed     | 


#Scenario: Submit information in contact us form 
#Given I access webdriveruniversity 
#Then I click on contact us button
#Then I enter username
#Then I enter password
#Then I enter email address
#And I enter commenets
#Then I click on submoit button 
#Then I verify that information is submitted via form 
#
#
#Scenario: I reset the form and fill the info again
#Given I access webdriveruniversity 
#Then I click on contact us button
#Then I enter username
#Then I enter password
#Then I enter email address
#And I enter commenets
#When I click on reset button then all info should be now removed
#Then I enter 

