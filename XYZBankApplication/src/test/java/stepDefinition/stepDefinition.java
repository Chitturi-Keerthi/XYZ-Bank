package stepDefinition;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class stepDefinition {
WebDriver driver;
	@Given("User should navigate to {string}")
	public void User_should_navigate_to(String string) throws Exception{
	    driver=new ChromeDriver();
	    driver.get(string);
	    Thread.sleep(5000);
	}
	@Then("The title of the page should be {string}")
	public void the_title_of_the_page_should_be(String string) {
	   Assert.assertEquals(driver.getTitle(),string);
	}
	@Then("Customer Login button is displayed")
	public void customer_login_button_is_displayed() {
		WebElement CustomerLoginButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button"));
	    Assert.assertEquals(true,CustomerLoginButton.isDisplayed());
	}
	@Then("Bank Manager Login button is displayed")
	public void bank_manager_login_button_is_displayed() {
	    WebElement ManagerLoginButton=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button"));
	    Assert.assertEquals(true,ManagerLoginButton.isDisplayed());
	}
	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}