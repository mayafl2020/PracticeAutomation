package pom;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage {
	
	    private WebDriver driver;
	
	    @CacheLookup
	    @FindBy(name="user-name")
	    WebElement userName;
	    
	    
	    @CacheLookup
	    @FindBy(name="password")
	    WebElement pswrd;
	    
	    
	    @CacheLookup
	    @FindBy(name="login-button")
	    WebElement loginBttn;
	    
	    @CacheLookup
	    @FindBy(className="login_logo")
	    WebElement loginLogo;
	  
	    
	 
 
 
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginButton() {
		
		Dimension size = loginBttn.getSize();
		Reporter.log("Login button size is = " + size);
		
		String color = loginBttn.getCssValue("color");
		Reporter.log("Login button color is = " + color);
		
		String font = loginBttn.getCssValue("font-family");
		Reporter.log("Font is = " + font);
		
		String fontSize = loginBttn.getCssValue("font-size");
		Reporter.log("Font size is = " + fontSize);
		
		Point location = loginBttn.getLocation();
		Reporter.log("Login logo location is = " + location);
	}
	
	
	public void loginLogo() {
		
		
		Dimension size = loginLogo.getSize();
		Reporter.log("Login logo size = " + size);
		
		String color = loginLogo.getCssValue("color");
		Reporter.log("Login logo color is = " + color);
		
		Point location = loginLogo.getLocation();
		Reporter.log("Login logo location is = " + location);
		
		String font = loginLogo.getCssValue("font-family");
		Reporter.log("Font is = " + font);
		
		String fontSize = loginLogo.getCssValue("font-size");
		Reporter.log("Font size is = " + fontSize);
	}
	
	
	public void enterUsername(String username) {

		Dimension size = userName.getSize();
		Reporter.log("username size = " + size);
		
		String color = userName.getCssValue("color");
		Reporter.log("username color is = " + color);
		
		Point location = userName.getLocation();
		Reporter.log("username location is = " + location);
		
		String font = userName.getCssValue("font-family");
		Reporter.log("username font is = " + font);
		
		String fontSize = userName.getCssValue("font-size");
		Reporter.log("username font size is = " + fontSize);
	     userName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		Dimension size = pswrd.getSize();
		Reporter.log("Password size = " + size);
		
		String color = pswrd.getCssValue("color");
		Reporter.log("password color is = " + color);
		
		Point location = pswrd.getLocation();
		Reporter.log("password location is = " + location);
		
		String font = pswrd.getCssValue("font-family");
		Reporter.log("password font is = " + font);
		
		String fontSize = pswrd.getCssValue("font-size");
		Reporter.log("password font size is = " + fontSize);
		
	     
		 pswrd.sendKeys(password);
	}
	
	public InventoryPage submit() {
		
		loginBttn.click();
		
		return new InventoryPage(driver);
	
	}
	
	

}
