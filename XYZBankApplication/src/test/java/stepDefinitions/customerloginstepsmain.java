package stepDefinitions;

import Utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.customerloginpp;

public class customerloginstepsmain extends BaseTest{
	
	customerloginpp customerpage1=new customerloginpp(driver);
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		BaseTest.initializeDriver();

	    
	}

	@When("User click on customer login")
	public void user_click_on_customer_login() {
		customerpage1.customerLogin();
	}

	@When("User clicks on Your Name drop down")
	public void user_clicks_on_your_name_drop_down() {
		customerpage1.userselect();
	    
	}

	@When("user selects existing name from the drop down")
	public void user_selects_existing_name_from_the_drop_down() {
		customerpage1.yourname();
	}

	@When("user click on login")
	public void user_click_on_login() {
		customerpage1.loginbutton();
	    
	}

	@When("user go to deposit")
	public void user_go_to_deposit() {
		customerpage1.deposit();
	    
	}

	@When("user enters amount to deposit")
	public void user_enters_amount_to_deposit() {
		customerpage1.amount();
	    
	}

	@When("user click on deposit to deposit the money into account")
	public void user_click_on_deposit_to_deposit_the_money_into_account() {
		customerpage1.depositmoney();
	    
	}

	@When("check deposit is success full or not from the alert message after clicking deposit")
	public void check_deposit_is_success_full_or_not_from_the_alert_message_after_clicking_deposit() {
		customerpage1.depositsuccessful();
	    
	}

	@When("user go to with drawl")
	public void user_go_to_with_drawl() throws InterruptedException {
		customerpage1.withdraw();
	}

	@When("user enters amount to be withdrawn from account")
	public void user_enters_amount_to_be_withdrawn_from_account() throws InterruptedException {
		customerpage1.withdrawamount();
	    
	}

	@When("user clicks on with drawl to withdraw the money from account")
	public void user_clicks_on_with_drawl_to_withdraw_the_money_from_account() throws InterruptedException {
		customerpage1.withdrawbutton();
	   
	}

	@When("check withdraw is success full or not from the alert message after clicking withdraw")
	public void check_withdraw_is_success_full_or_not_from_the_alert_message_after_clicking_withdraw() {
		customerpage1.transactionsuccessfull();
	    
	}

	@When("check the error message like transaction failed when user enters money which is greater than deposit")
	public void check_the_error_message_like_transaction_failed_when_user_enters_money_which_is_greater_than_deposit() {
		customerpage1.withdrawamountmore();
		customerpage1.withdrawbuttonmore();
		customerpage1.transactionfailed();
	}

	@When("user go to transactions")
	public void user_go_to_transactions() {
		customerpage1.transactions();
	    	}

	@When("user clicks on reset")
	public void user_clicks_on_reset() {
		customerpage1.reset();
	    
	}

	@When("user clicks on back button")
	public void user_clicks_on_back_button() {
		customerpage1.back();
	    
	}

	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		customerpage1.logout();
	    
	}
	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		customerpage1.home();
		
	}




}
