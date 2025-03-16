package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bankmanagerloginpage {

	WebDriver driver;
	//Locators
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement titledisplayed;
	
	@FindBy(xpath="//button[@ng-click='manager()']")
	WebElement clickbnkmng;
	
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement titlesaddcust;
	
	//Add Customer
	@FindBy(xpath="//button[@ng-click='addCust()']")
	WebElement clickaddcust;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement enterfrstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement enterlastname;
	
	@FindBy(css="input[placeholder='Post Code']")
	WebElement enterpostcode;
	
	@FindBy(css="button[type='submit']")
	WebElement clickfinaladdcust;
	
	
	@FindBy(xpath="//button[@ng-click='openAccount()']")
	WebElement clickopenaccount;
	

	@FindBy(xpath="(//select[@id='userSelect'])[1]")
	WebElement customerdropdown;
	
	@FindBy(xpath="//option[contains(text(),'chitturi keerthi')]")
	WebElement customername ;
	
	@FindBy(xpath="//select[@id='currency']")
	WebElement clickcurrency;
	
	
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement clickprocessbtn;
	
	@FindBy(xpath="//button[@ng-class='btnClass3']")
	WebElement cutomerhistory;
	
	@FindBy(xpath="//input[@placeholder='Search Customer']")
	WebElement searchcustomer;
	
	@FindBy(xpath="(//button[normalize-space()='Delete'])[1]")
	WebElement deleteCustomer;
	
	@FindBy(xpath="(//button[normalize-space()='Home'])[1]")
	WebElement navigatehome;
	
	public Bankmanagerloginpage(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);

		
	}
		
	public  void TitleDisplayed() {
		titledisplayed.isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       }
	
       public  void Clickbnkmng() {
	          clickbnkmng.click();
       }
       public  void Titlesaddcust() {
    	   titlesaddcust.isDisplayed();
       }
    
       public void Clickaddcust() {
    	   clickaddcust.click();
       }
       
       public void Enterfrstname(String firstname) {
    	   enterfrstname.sendKeys(firstname);
    	   
       }
       public void Enterlastname(String lastname) {
    	   enterlastname.sendKeys(lastname);
       }
       
       public void  Clickfinaladdcust()    {
    	   clickfinaladdcust.click();
       }
       
       
       public void Clickopenaccount() throws InterruptedException {
    	   clickopenaccount.click();
    	   Thread.sleep(10);
       }
       
       
       public void Customerdropdown1() {
    	  
    	   customerdropdown.click();
    	 
       }
       
       
       public void cutomername1() throws InterruptedException{
    	   customername.click();
    	   Thread.sleep(10);
       }
       
       
       
 
       
       public void Customerdropdown2() {
    	   clickcurrency.click();
    	   Select currencydropdown1 =new Select(clickcurrency);
   		currencydropdown1.selectByVisibleText("Dollar");
       }
       
       public void Clickprocessbtn(){
    	   clickprocessbtn.click();
       }
       
       public void Cutomerhistory() {
    	   cutomerhistory.click();
       }
       
       public void Searchcustomer() {
    	   searchcustomer.click();
    	   searchcustomer.sendKeys("keerthi");
       }
       public void DeleteCustomer() {
    	   deleteCustomer.click();
       }
       
       
       public void Navigatehome() {
    	   navigatehome.click();
       }

	   public void Enterpostcode(String postcode) {
		enterpostcode.sendKeys(postcode);
		
	}

	
       
       
	
	

}
