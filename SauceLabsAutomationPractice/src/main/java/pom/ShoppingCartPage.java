package pom;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ShoppingCartPage {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	 @CacheLookup
	 @FindBy(className="app_logo")
	 WebElement appLogo;  
	 
	 @CacheLookup
	 @FindBy(className="title")
	 WebElement title; 
	 
	 @CacheLookup
	 @FindBy(name ="checkout")
	 WebElement checkoutBtn; 
	 
	 public ShoppingCartPage(WebDriver driver) {
		 
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
	 
	 public void title() {
		 
		 
		 String  titleText= title.getText();
		 Reporter.log("Title text is " + titleText);
		 boolean yourCart = title.isDisplayed();
		 Reporter.log("Title is displayed " + yourCart);
	 }
	 
	public CheckoutPage checkoutButton() {
		
		 String btnColor = checkoutBtn.getCssValue("color");
		 Reporter.log("Checkout button color is " + btnColor);
		 
		 Dimension btnSize = checkoutBtn.getSize();
		 Reporter.log("Checkout button size is  " + btnSize);
		 
		 String btnText = checkoutBtn.getText();
		 Reporter.log("Checkout button text is " + btnText);
		 
		 boolean btn = checkoutBtn.isDisplayed();
		 Reporter.log("Checkout button is displayed  " + btn);
		 
		 checkoutBtn.click();
		 return new CheckoutPage(driver);
		 
	}
	

}
