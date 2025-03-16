@tag
Feature: xyz bank application login

  @tag1
  Scenario: verify Home Page Loads Successfully
    Given the user navigates to https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account
    Then the "Banking app" title should be displayed
    And the user should see "Customer login" and " Bank manager Login"
   
   @tag2

  Scenario: Bank Manager login successfully 
    Given the user is on the bank manager login page
    When the user click on bank manager login
    Then the "Add Customer" button should be visible
 
    

	@tag3

  Scenario: Bank Manager Adds a new Customer
    Given the bank manager is logged in
    When the manager navigates to "Add Customer" page
    And enter first name "chitturi"
    And enter Last name "keerthi"
    And enter post code "2413"
    And Click the "Add Customer" Button
    Then an alert should appear with the message " Customer added Successfully"


  @tag4

  Scenario: Bank Manager verifie the customer List
    Given the user click on "Customers" page
    And search the "chitturi"
    And click on delete the  search customer "keerthi"
    Then the user switch on home page

 