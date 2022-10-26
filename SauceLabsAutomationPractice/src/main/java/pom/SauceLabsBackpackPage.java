package pom;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SauceLabsBackpackPage {
	
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(xpath=("//div[contains(text(),'Sauce Labs Backpack')]"))
	WebElement sauceLabs;
	
	@CacheLookup
	@FindBy(xpath=("//div[contains(text(),'carry')]"))
	WebElement itemDescription;
	
	@CacheLookup
	@FindBy(xpath=("//div[@class='inventory_details_price']"))
	WebElement itemPrice;
	
	@CacheLookup
	@FindBy(name="add-to-cart-sauce-labs-backpack")
	WebElement addToCart;
	
	@CacheLookup
	@FindBy(xpath=("//a[contains(text(),'Twitter')]"))
	WebElement twitter;
	
	@CacheLookup
	@FindBy(xpath=("//a[contains(text(),'Facebook')]"))
	WebElement facebook;
	
	@CacheLookup
	@FindBy(xpath=("//a[contains(text(),'LinkedIn')]"))
	WebElement linkedIn;
	
	@CacheLookup
	@FindBy(xpath=("//button[contains(text(),'Remove')]"))
	WebElement remove;
	
	@CacheLookup
	@FindBy(className ="shopping_cart_badge")
	WebElement shoppingCartLink;
	
	
	public SauceLabsBackpackPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyText() {
		
		String expectedText = "Sauce Labs Backpack";
		String actualText = sauceLabs.getText();
		Reporter.log("Expected text = " + expectedText);
		Reporter.log("Actual text = " + actualText);
		
		assertTrue(expectedText.equals(actualText));
		
	}
	
	public void verifyDescription() {
		
		String expectedDescription = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds "
				+ "uncompromising style with unequaled laptop and tablet protection.";
		String actualDescription = itemDescription.getText();
		
		Reporter.log("Expected description = " + expectedDescription);
		Reporter.log("Actual description = " + actualDescription);
		
		assertTrue(expectedDescription.equals(actualDescription));
	}
	
	public void itemPrice() {
		
		boolean isDisplayed = itemPrice.isDisplayed();
		String itemsPrice = itemPrice.getText();
		
		Reporter.log("Item's price is displayed " + isDisplayed);
		Reporter.log("Item's price is " + itemsPrice);
		
		
	}
	
	public void addToCart() {
		
		boolean isDisplayed = addToCart.isDisplayed();
		String cart = addToCart.getText();
		
		Reporter.log("Add to cart is displayed " + isDisplayed);
		Reporter.log("Add to cart text is " + cart);
		
		addToCart.click();
		Reporter.log("Add to cart button was clicked");
		
		String shpLink = shoppingCartLink.getText();
		Reporter.log("Items in cart after one click = " + shpLink);
		
		
		
	}
	
	public void remove() {
		
		boolean isDisplayed = remove.isDisplayed();
		String cart = remove.getText();
		
		Reporter.log("Remove is displayed " + isDisplayed);
		Reporter.log("Remove button text is " + cart);
		
	    remove.click();
	    Reporter.log("Remove button was clicked");
	    
	    addToCart.click();
	    Reporter.log("Add to Cart button was clicked");
		
		
	}
	
	public void linkedIn() {
		
		boolean linkedInBtn = linkedIn.isDisplayed();
		Reporter.log("LinkedIn button is displayed " + linkedInBtn);
		
		linkedIn.click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		
	    
		}
	
    public void facebook() {
    	
    	boolean facebookBtn = facebook.isDisplayed();
		Reporter.log("Facebook button is displayed " + facebookBtn);
        facebook.click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
	
		
	    
    }
    
  public void twitter() {
    	
		boolean twitterBtn = facebook.isDisplayed();
		Reporter.log("Twitter button is displayed " + twitterBtn);
        twitter.click();
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		
		
		
	    
    }
  
  public ShoppingCartPage clickCartLink() {
	  
	  shoppingCartLink.click();
	  
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Reporter.log("Shopping cart link was clicked");
		
		return new ShoppingCartPage(driver);
	  
  }
  
 
}
