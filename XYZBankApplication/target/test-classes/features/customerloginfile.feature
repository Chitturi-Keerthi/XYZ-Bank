
  
  Feature: CustomerLogin
  Scenario: User is able to log in to the application
 
  Given User is on the Home page
  When User click on customer login
  And User clicks on Your Name drop down
  And user selects existing name from the drop down
  And user click on login
  And user go to deposit
  And user enters amount to deposit
  And user click on deposit to deposit the money into account
  And check deposit is success full or not from the alert message after clicking deposit
  And user go to with drawl
  And user enters amount to be withdrawn from account
  And user clicks on with drawl to withdraw the money from account
  And check withdraw is success full or not from the alert message after clicking withdraw
  And check the error message like transaction failed when user enters money which is greater than deposit
  And user go to transactions
  And user clicks on reset
  And user clicks on back button
  Then user clicks on logout button
  Then user navigates to home page
  
 