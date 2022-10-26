package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CheckoutPage {

	private WebDriver driver;
	
	@CacheLookup
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	 @CacheLookup
	 @FindBy(className="app_logo")
	 WebElement appLogo;  
	
	 @CacheLookup
	 @FindBy(id="first-name")
	 WebElement firstName;  
	 
	 @CacheLookup
	 @FindBy(id="last-name")
	 WebElement lastName;  
	
	 @CacheLookup
	 @FindBy(id="postal-code")
	 WebElement zipCode;  
	 
	 @CacheLookup
	 @FindBy(id="continue")
	 WebElement continueBtn; 
	
	
	public CheckoutPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	 public void menuButton() {
		 
		 boolean menuBtn = menu.isDisplayed();
		 Reporter.log("Menu button is displayed " + menuBtn);
	 }
	 
	 public void appLogo() {
		 
		 boolean logo = appLogo.isDisplayed();
		 Reporter.log("Logo is displayed " + logo);
		 String logoColor= appLogo.getCssValue("color");
		 Reporter.log("Logo color is " + logoColor);
		 
	 }
	 
	 public void checkoutForm() {
		 
		 
		 boolean fn = firstName.isDisplayed();
		 Reporter.log("First name is displayed " + fn);
		 
		 boolean ln = lastName.isDisplayed();
		 Reporter.log("Last name is displayed " + ln);
		
		 boolean zc = zipCode.isDisplayed();
		 Reporter.log("ZipCode is displayed " + zc);
		 
	 }
	 
	 public CheckoutOverviewPage validCheckoutInfo(String validFirstName ,String validLastName ,String validZipCode) {
		 
		 firstName.sendKeys(validFirstName);
		 lastName.sendKeys(validLastName);
		 zipCode.sendKeys(validZipCode);
		 continueBtn.click();
		 return new CheckoutOverviewPage(driver);
		 
	 }
	 
     public void validCheckoutInfo() {
		 
		 
	 }
}

