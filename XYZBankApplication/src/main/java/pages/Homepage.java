package pages;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.*;


public class Homepage {
	
	WebDriver driver;
	
		
	 @FindBy(tagName="title")
	WebElement pagetitle;
	 
	 @FindBy(css="button[ng-click='customer()']")
	 WebElement cutomerloginbtn;
	 
	 @FindBy(css="button[ng-click='manager()']")
	 WebElement bankmanagerloginbtn;
	 
	
	 public Homepage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		 }
	 
	 
	public boolean isTitleDisplayed() {
		
		return pagetitle.isDisplayed();
		
	}
	
	public boolean isCutomerloginbtn() {
		return cutomerloginbtn.isDisplayed();
	}
	
	public boolean isBankmanagerloginbtn() {
		return bankmanagerloginbtn.isDisplayed();
	
	}
	
	 }

