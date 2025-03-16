package pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customerloginpp {
	
	@FindBy(xpath="//button[text()='Customer Login']")
	WebElement customerlogin;
	
	@FindBy(xpath="//select[@id='userSelect']")
	WebElement userSelect;
	
	@FindBy(xpath="//option[contains(text(),'Harry Potter')]")
	WebElement yourname;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement Login;
	
	@FindBy(xpath="//button[@ng-click=\"deposit()\"]")
	WebElement Deposit;
	
	@FindBy(xpath="//input[@placeholder=\"amount\"]")
	WebElement Amount;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement depositmoney;
	
	@FindBy(xpath="//span[@class='error ng-binding']")
	WebElement depositsuccessfull;
	
	@FindBy(xpath="//button[normalize-space()='Withdrawl']")
	WebElement withdraw;
	
	@FindBy(xpath="//input[@type='number']")
	WebElement withdrawnamount;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement withdrawbutton;
	
	@FindBy(xpath="//span[@class='error ng-binding']")
	WebElement transactionsuccessfull;
	
	@FindBy(xpath="//input[@placeholder='amount']")
	WebElement withdrawnamountmore;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement withdrawbuttonmore;
	
	@FindBy(xpath="//span[@class='error ng-binding']")
	WebElement transactionfailed;
	
	@FindBy(xpath="//button[normalize-space()='Transactions']")
	WebElement transactions;
	
	@FindBy(xpath="//button[normalize-space()='Reset']")
	WebElement reset;
	
	@FindBy(xpath="//button[normalize-space()='Back']")
	WebElement back;
	
	@FindBy(xpath="//button[normalize-space()='Logout']")
	WebElement logout;
	
	@FindBy(xpath=" //button[normalize-space()='Home']")
	WebElement home;

	private WebDriver driver;
	
	
	public customerloginpp(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void customerLogin() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(customerlogin));
		customerlogin.click();;
	}
	
	public void userselect() {
		userSelect.click();
	}
	
	public void yourname() {
		yourname.click();;
	}
	
	public void loginbutton() {
		Login.click();;
	}
	
	public void deposit() {
		Deposit.click();;
	}
	
	public void amount() {
		Amount.click();;
		Amount.sendKeys("500");
	}
	
	public void depositmoney() {
		depositmoney.click();
	}
	
	public void depositsuccessful() {
		String actualtext=depositsuccessfull.getText();
		String expectedtext="Deposit Successful";
		Assert.assertEquals(actualtext,expectedtext,"Deposit Successful");
		System.out.println(actualtext);
	}

	public void withdraw() throws InterruptedException {
		withdraw.click();;
		Thread.sleep(1000);
		
	}
	
	public void withdrawamount() throws InterruptedException {
		withdrawnamount.click();;
		Thread.sleep(1000);
		withdrawnamount.sendKeys("500");
		Thread.sleep(1000);
		}
	
	public void withdrawbutton() throws InterruptedException {
		withdrawbutton.click();;
		Thread.sleep(1000);
		
		
	}
	
	public void transactionsuccessfull() {
		String actualtext=transactionsuccessfull.getText();
		String expectedtext="Transaction successful";
	    Assert.assertEquals(actualtext,expectedtext);
		System.out.println("actual and expected are same");
	}
	
	public void withdrawamountmore()  {
		withdrawnamount.click();;
		withdrawnamount.sendKeys("10000");
		
	}
	
	public void withdrawbuttonmore() {
		withdrawbutton.click();
		
	}
	
	public void transactionfailed() {
		String actualtext=transactionfailed.getText();
		String expectedtext="Transaction Failed. You can not withdraw amount more than the balance.";
		Assert.assertEquals(actualtext,expectedtext);
		System.out.println("Transaction Failed. You can not withdraw amount more than the balance");
	}
	
	public void transactions()  {
		transactions.click();
	}
	
	public void reset()  {
		reset.click();
	}
	
	public void back()  {
		back.click();
	}
	
	public void logout() {
		logout.click();
	}
	
	public void home() {
	home.click();
	
}


}
