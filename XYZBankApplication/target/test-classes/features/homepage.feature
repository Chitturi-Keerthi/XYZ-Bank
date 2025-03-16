Feature: xyz home page
 
Scenario: verify xyz home page
Given User should navigate to "https://globalsqa.com/angularJs-protractor/BankingProject/#/login"
Then The title of the page should be "XYZ Bank"
And Customer Login button is displayed
And Bank Manager Login button is displayed
And close the browser