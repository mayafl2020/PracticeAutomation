package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class InventoryPage {
	
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(id="react-burger-menu-btn")
	WebElement menu;
	
	  
    @CacheLookup
    @FindBy(xpath=("//a[contains(text(),'About')]"))
    WebElement about;
    
    @CacheLookup
    @FindBy(xpath=("//a[contains(text(),'Logout')]"))
    WebElement logout;
    
    @CacheLookup
    @FindBy(xpath=("//a[contains(text(),'Reset app state')]"))
    WebElement reset;
    
    @CacheLookup
    @FindBy(xpath=("//a[contains(text(),'All Items')]"))
    WebElement allItems;
    
    
    @CacheLookup
    @FindBy(xpath=("//button[contains(text(),'Close Menu')]"))
    WebElement closeMenu;
    
    
    @CacheLookup
    @FindBy(xpath=("//div[contains(text(),'Sauce Labs Backpack')]"))
    WebElement sauceLabsBackpack;
    
    
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}

   public void openMenu() {
	   
	   menu.click();
	   System.out.println(driver.getTitle());
	   }
   
   public void allItems() {
	   
	   System.out.println("All Items button is displayed  = " + allItems.isDisplayed());
   }
   
  public void about() {
	   
	   System.out.println("About button is diplayed  = " + allItems.isDisplayed());
   }
  public void logout() {
	   
	   System.out.println("Logout button is displayed  = " + allItems.isDisplayed());
  }
  
  public void reset() {
	   
	   System.out.println("Reset button is displayed  = " + allItems.isDisplayed());
	   
  }
  
  public AboutPage clickAbout() {
	  
	  about.click();
	  
	  return new AboutPage();
  }
  
  public void closeMenu() {
	  
	  closeMenu.click();
  }
  
  public SauceLabsBackpackPage sauceLabsBackpack() {
	  
	  sauceLabsBackpack.click();
	  return new SauceLabsBackpackPage(driver);
  }
}
