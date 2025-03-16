package stepDefinitions;



import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.Bankmanagerloginpage;
import pages.Homepage;

public class Homepagesteps  extends BaseTest{
	
	Homepage homepage= new Homepage(driver);
	Bankmanagerloginpage bankmanagerloginpage = new Bankmanagerloginpage(driver);


	@Given("the user navigates to https:\\/\\/www.globalsqa.com\\/angularJs-protractor\\/BankingProject\\/#\\/account")
	public void the_user_navigates_to_https_www_globalsqa_com_angular_js_protractor_banking_project_account() throws IOException {
		BaseTest.initializeDriver();
		
	    
	}

	@Then("the {string} title should be displayed")
	public void the_title_should_be_displayed(String string) {
		
	    homepage.isTitleDisplayed();
	}

	@Then("the user should see {string} and {string}")
	public void the_user_should_see_and(String string, String string2) {
		homepage.isBankmanagerloginbtn();
		homepage.isCutomerloginbtn();
		
	}
	
	@Given("the user is on the bank manager login page")
	public void the_user_is_on_the_bank_manager_login_page() {		
		bankmanagerloginpage.TitleDisplayed();
	}
 
	@When("the user click on bank manager login")
	public void the_user_click_on_bank_manager_login() {
		bankmanagerloginpage.Clickbnkmng();

	}
 
	@Then("the {string} button should be visible")
	public void the_button_should_be_visible(String string) {
		bankmanagerloginpage.Titlesaddcust();
	}
 
	@Given("the bank manager is logged in")
	public void the_bank_manager_is_logged_in() {
		bankmanagerloginpage.Titlesaddcust();
	}
 
	@When("the manager navigates to {string} page")
	public void the_manager_navigates_to_page(String string) {
		bankmanagerloginpage.Clickaddcust();
	}
 
	@When("enter first name {string}")

	public void enter_first_name(String string) {
		bankmanagerloginpage.Enterfrstname("keerthi");
	}
 
	@When("enter Last name {string}")
	public void enter_last_name(String string) {
		bankmanagerloginpage.Enterlastname("chitturi");
	}
 
	@When("enter post code {string}")
	public void enter_post_code(String string) {
		bankmanagerloginpage.Enterpostcode("252000");

	}
 
	@When("Click the {string} Button")
	public void click_the_button(String string) {
		bankmanagerloginpage.Clickfinaladdcust();

	}
 
	@Then("an alert should appear with the message {string}")
	public void an_alert_should_appear_with_the_message(String string) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text1= alert.getText();
        System.out.println(text1);
        alert.accept();
        
	}
 
	@Given("the user is on the bankmanagerlogin")
	public void the_user_is_on_the_bankmanagerlogin() throws InterruptedException {
		bankmanagerloginpage.Clickopenaccount();
		Thread.sleep(2000);
	 
	}
 
	@When("select customer from dropdown")
	public void select_customer_from_dropdown() throws InterruptedException {
		bankmanagerloginpage.Customerdropdown1();
		bankmanagerloginpage.cutomername1();
	}
 
	@When("select currency from dropdown")
	public void select_currency_from_dropdown() throws InterruptedException {
		
		bankmanagerloginpage.Customerdropdown2();
		
		bankmanagerloginpage.Clickprocessbtn();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert1 = driver.switchTo().alert();
        String text2= alert1.getText();
        System.out.println(text2);
        alert1.accept();
		bankmanagerloginpage.Cutomerhistory();
	}
	
	
	
	@Given("the user click on {string} page")
	public void the_user_click_on_page(String string) {
		bankmanagerloginpage.Cutomerhistory();
	}

	@When("search the {string}")
	public void search_the(String string) {
		bankmanagerloginpage.Searchcustomer();
		
	}
	
	
	@Given("click on delete the  search customer {string}")
	public void click_on_delete_the_search_customer(String string) throws InterruptedException {
		Thread.sleep(10);
		bankmanagerloginpage.DeleteCustomer();
	}
	
 

	@Then("the user switch on home page")
	public void the_user_switch_on_home_page() {
	bankmanagerloginpage.Navigatehome();
	    
	}

	}
 
 
	

 





